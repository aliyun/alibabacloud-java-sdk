// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListUserProducesRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>BizType</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ExtCondition")
    public String extCondition;

    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SolutionBizId")
    public String solutionBizId;

    @NameInMap("SortParam")
    public String sortParam;

    @NameInMap("Status")
    public Integer status;

    public static ListUserProducesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserProducesRequest self = new ListUserProducesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserProducesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListUserProducesRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListUserProducesRequest setExtCondition(String extCondition) {
        this.extCondition = extCondition;
        return this;
    }
    public String getExtCondition() {
        return this.extCondition;
    }

    public ListUserProducesRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public ListUserProducesRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ListUserProducesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserProducesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserProducesRequest setSolutionBizId(String solutionBizId) {
        this.solutionBizId = solutionBizId;
        return this;
    }
    public String getSolutionBizId() {
        return this.solutionBizId;
    }

    public ListUserProducesRequest setSortParam(String sortParam) {
        this.sortParam = sortParam;
        return this;
    }
    public String getSortParam() {
        return this.sortParam;
    }

    public ListUserProducesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
