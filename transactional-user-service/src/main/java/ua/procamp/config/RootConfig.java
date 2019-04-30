package ua.procamp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;

/**
 * This class provides root application configuration. It scans for all available beans and enables declarative
 * transaction management.
 * <p>
 * todo: 1. Mark this class as config
 * todo: 2. Enable component scanning for package "ua.procamp"
 * todo: 3. Configure JPA {@link PlatformTransactionManager} with bean name "transactionManager"
 * todo: 4. Enable declarative transaction management
 */

@Configuration
@ComponentScan("ua.procamp")
public class RootConfig {

    @Bean
    public PlatformTransactionManager platformTransactionManager(EntityManagerFactory entityManagerFactory){
        return new JpaTransactionManager(entityManagerFactory);
    }

}
