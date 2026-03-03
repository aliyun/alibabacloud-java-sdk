// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpLanesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("companyId")
    public Long companyId;

    /**
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("inletServiceId")
    public Long inletServiceId;

    /**
     * <strong>example:</strong>
     * <p>yunmall</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>gmt_create</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1193</p>
     */
    @NameInMap("productId")
    public Long productId;

    public static ListPdpLanesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPdpLanesRequest self = new ListPdpLanesRequest();
        return TeaModel.build(map, self);
    }

    public ListPdpLanesRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ListPdpLanesRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListPdpLanesRequest setInletServiceId(Long inletServiceId) {
        this.inletServiceId = inletServiceId;
        return this;
    }
    public Long getInletServiceId() {
        return this.inletServiceId;
    }

    public ListPdpLanesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListPdpLanesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPdpLanesRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListPdpLanesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPdpLanesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPdpLanesRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

}
