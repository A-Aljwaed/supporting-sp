package security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@EnableWebSecurity
public class AuthenticationSecurity extends WebSecurityConfiguration
{





        @Autowired
        public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
                throws Exception {
            auth.inMemoryAuthentication().withUser("Ahmad").password("1234")
                    .roles("USER", "ADMIN");
        }
}
