package seed.edu.dosirak.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import seed.edu.dosirak.vo.MemberVO;

@Repository("DosirakDAO")
public class DosirakDAO extends AbstractDAO {

	@SuppressWarnings("unchecked")
	public List<MemberVO> getList()throws Exception{
		return (List<MemberVO>)list("list");
	}

}
