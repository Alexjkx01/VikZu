package dao;
import model.ProductBean;
public class ProductDAO {
	public ProductBean getProduct() {
		ProductBean p = new ProductBean();
		p.setId(1);
		p.setName("Portatile");
		p.setPrice(1000.22);
		return p;
	}
}
