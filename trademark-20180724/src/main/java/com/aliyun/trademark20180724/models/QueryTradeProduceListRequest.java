// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeProduceListRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BuyerStatus")
    public Integer buyerStatus;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PreOrderId")
    public String preOrderId;

    @NameInMap("RegisterNumber")
    public String registerNumber;

    @NameInMap("SortFiled")
    public String sortFiled;

    @NameInMap("SortOrder")
    public String sortOrder;

    public static QueryTradeProduceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeProduceListRequest self = new QueryTradeProduceListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradeProduceListRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryTradeProduceListRequest setBuyerStatus(Integer buyerStatus) {
        this.buyerStatus = buyerStatus;
        return this;
    }
    public Integer getBuyerStatus() {
        return this.buyerStatus;
    }

    public QueryTradeProduceListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTradeProduceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTradeProduceListRequest setPreOrderId(String preOrderId) {
        this.preOrderId = preOrderId;
        return this;
    }
    public String getPreOrderId() {
        return this.preOrderId;
    }

    public QueryTradeProduceListRequest setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }
    public String getRegisterNumber() {
        return this.registerNumber;
    }

    public QueryTradeProduceListRequest setSortFiled(String sortFiled) {
        this.sortFiled = sortFiled;
        return this;
    }
    public String getSortFiled() {
        return this.sortFiled;
    }

    public QueryTradeProduceListRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
