package seed.edu.dosirak.service;

import java.util.List;
import java.util.Map;

import seed.edu.dosirak.vo.MemberVO;

public interface DosirakService {

	
	
public int create(MemberVO vo);

public int admin_search(String act);

public List<MemberVO> getList()throws Exception;

}
