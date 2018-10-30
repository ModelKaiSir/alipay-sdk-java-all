package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板批量查询
 *
 * @author auto create
 * @since 1.0, 2018-07-16 15:34:04
 */
public class AlipayMarketingCardTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5564795474857161266L;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小，默认20条，最大支持20条
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}