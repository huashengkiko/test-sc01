package sdsd.dsdd.dwedwe.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import sdsd.dsdd.dwedwe.domain.ProductDO;
import sdsd.dsdd.dwedwe.domain.ProductQuery;

/**
 * Created by donh on 2018/7/24.
 */
public interface ProductMapper extends BaseMapper<ProductDO> {

	/**
	 * 分页查询产品信息
	 * @param productQuery
	 * @return
	 */
    List<ProductDO> listProducts(ProductQuery productQuery);
}
