package kohgylw.kiftd.server.pojo;

import lombok.Data;

/**
 * 
 * <h2>注册信息封装类</h2>
 * <p>该封装类用于封装前端发送的JSON注册信息。</p>
 * @author 青阳龙野(kohgylw)
 * @version 1.0
 */
@Data
public class SignUpInfoPojo {
	
	private String account;
	private String pwd;
	private String time;

}
