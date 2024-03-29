package kr.happyjob.study.cor.dao;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.cor.model.ProductInfoModel;
import kr.happyjob.study.system.model.comcombo;

public interface ProductListDAO {
	
	//제품목록 조회
	public List<ProductInfoModel> productList(Map<String, Object> paramMap) throws Exception;
	
	//제품목록 카운트
	public int productTotalCnt(Map<String, Object> paramMap) throws Exception;
	
	// 장바구니 담기
	public int insertBasket (Map<String, Object> map);
	
	// 주문하기
	public int insertJorderInfo (Map<String, Object> map);
	
	//제품상세정보
	public ProductInfoModel selecProductDetail(Map<String, Object> paramMap)  throws Exception;
	
	//기업_제품주문하기(윤지)
	public int insertOrder(Map<String, Object> paramMap) throws Exception;
	
	//기업_제품장바구니 담기(윤지)
	public int insertProductBasket(Map<String, Object> paramMap) throws Exception;
}
