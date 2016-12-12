package seed.edu.dosirak.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import seed.edu.dosirak.service.DosirakService;
import seed.edu.dosirak.vo.MemberVO;

@Repository("DosirakDAO")
public class DosirakDAO extends AbstractDAO {


	@SuppressWarnings("unchecked")
	public int create(MemberVO vo) {
		
		return insert("create", vo);
	}

	@Override
	public String admin_search(String act) {
		return (String) select("admin_search", act);
	}

}
