package nwdong.springbootcli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
 * to run it through spring-boot
 * 
 * mvn spring-boot:run -Dspring-boot.run.arguments="parameter1,parameter2"
 * 
 */

@Component
public class CliExample implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(CliExample.class);

	@Override
	public void run(String... args) throws Exception {
		
		log.info("=========== start =============");
		
		for(String arg : args)
			log.info("arg="+arg);
		
		log.info("=========== complete =============");
		
	}

}
