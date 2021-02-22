package su.javamaster.Reflection.storage;

public interface UpdateData {
	
	String ver = "latest";
	String ext = ".jar";
	String server_protocol = "https";
	String c_protocol_sumbol = "://";
	String sep = "/";
	String user = "WINGS07";
	String server = server_protocol + c_protocol_sumbol + "github.com/" + user + sep + SSS.pl + "/releases/" + ver + "/download/" + SSS.pl + ext;
}
