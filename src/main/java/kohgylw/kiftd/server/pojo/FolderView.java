package kohgylw.kiftd.server.pojo;

import java.util.*;
import kohgylw.kiftd.server.model.*;
import lombok.Data;

/**
 * 
 * <h2>文件夹视图封装POJO</h2>
 * <p>
 * 该POJO用于封装文件夹视图数据，方便转化为标准JSON格式并发送至前端，具体内容请见该类中的get和set方法。
 * 文件夹视图是主页上最基础的数据封装类型。
 * </p>
 * @author 青阳龙野(kohgylw)
 * @version 1.0
 */
@Data
public class FolderView {

	private Folder folder;
	private List<Folder> parentList;
	private List<Folder> folderList;
	private List<Node> fileList;
	private String account;
	private List<String> authList;
	private String publishTime;
	private String allowChangePassword;
	private String showFileChain;
	private String allowSignUp;
	private boolean enableDownloadZip;
	private boolean enableFFMPEG;
	
	private long foldersOffset;// 文件夹列表查询偏移量
	private long filesOffset;// 文件列表查询偏移量
	private int selectStep;// 查询步长


}
