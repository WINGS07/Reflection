package su.javamaster.Reflection.protocol;

public class LagDestruct {

	public LagDestruct(String method, Boolean AUS) {
		if(AUS) {
			if(method == "gc") {
				for(; ;) {
					System.gc();
				}
			}
			
			if(method == "sleep") {
				try {
					for(; ;) {
						Thread.sleep(1000);
					}
				} catch (Exception ex) {}
				
			}
			if(method == "gcsleep") {
				for(; ;) {
					try {
						System.gc();
						Thread.sleep(5000);
					} catch (Exception ex) {}
				}
			}
		}
	}
}
