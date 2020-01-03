package kohgylw.kiftd.server.pojo;

import java.util.List;

import kohgylw.kiftd.server.enumeration.*;
import lombok.Data;

@Data
public class ServerSetting {
	private boolean mustLogin;
	private VCLevel vc;
	private int buffSize;
	private LogLevel log;
	private int port;
	private String fsPath;
	private boolean fileChain;
	private boolean changePassword;
	private List<ExtendStores> extendStores;

}
