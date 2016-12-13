package seed.edu.dosirak.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import seed.edu.dosirak.dao.DosirakDAO;
import seed.edu.dosirak.vo.MemberVO;



@Service("DosirakService")
public class DosirakServiceImpl implements DosirakService {

	@Override
	public int create(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int admin_search(String act) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MemberVO> getList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	


}