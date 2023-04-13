package Base;


import utils.Config;
import utils.YamlReader;


public class commons {
	public static Config config;
	
	static {
		
		config = new YamlReader("config.yml").readConfig();	
	}
	public commons() {
		
	}
	
	

}
