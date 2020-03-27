package com.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity
public class MySecurityConfig  extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("zhangshan").password("123456").roles("VIP1","VIP2")
                .and()
                .withUser("zhangshan2").password("123456").roles("VIP1","VIP2");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        //定制请求的授权规则
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP3");

        //开启自动配置的登录功能
        http.formLogin().loginPage("/");
        //1 /login来到登录页面  没有权限跳转登录页面
        //2 重定向到/login?error表示登录失败
        //3 更多详细规定

        //开启自动配置的注销功能
        http.logout().logoutSuccessUrl("/");
        // 访问/logout表示用户注销，清空session


        //记住登录状态
        http.rememberMe();



    }
}
