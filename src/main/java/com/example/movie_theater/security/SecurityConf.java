package com.example.movie_theater.security;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConf extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                .antMatchers(HttpMethod.GET,"/").authenticated()
                .antMatchers(HttpMethod.GET, "/ping").permitAll()
//                .antMatchers(HttpMethod.GET, "/cocktails/**").permitAll()
                .antMatchers(HttpMethod.GET).authenticated()
                .antMatchers(HttpMethod.PUT).authenticated()
                .antMatchers(HttpMethod.DELETE).authenticated()
                .and()
                .cors()
                .and()
                .formLogin()
                .and()
                .logout().logoutUrl("/logout").permitAll()
                .and()
                .csrf().disable()
                .httpBasic();
    }

  /*@Bean
  public AuthenticationProvider getProvider() {
    AuthProvider provider = new AuthProvider(userDetailsService);
    return provider;
  }
  private class AuthentificationLoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response, Authentication authentication)
        throws IOException, ServletException {
      response.setStatus(HttpServletResponse.SC_OK);
    }
  }
  private class AuthentificationLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
                                Authentication authentication)
        throws IOException, ServletException {
      response.setStatus(HttpServletResponse.SC_OK);
    }
  }*/

}