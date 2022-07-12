// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryProduceListRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CreateTimeLeft")
    public Long createTimeLeft;

    @NameInMap("CreateTimeRight")
    public Long createTimeRight;

    @NameInMap("MaterialName")
    public String materialName;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("TmNumber")
    public String tmNumber;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("UserId")
    public String userId;

    public static QueryProduceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProduceListRequest self = new QueryProduceListRequest();
        return TeaModel.build(map, self);
    }

    public QueryProduceListRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryProduceListRequest setCreateTimeLeft(Long createTimeLeft) {
        this.createTimeLeft = createTimeLeft;
        return this;
    }
    public Long getCreateTimeLeft() {
        return this.createTimeLeft;
    }

    public QueryProduceListRequest setCreateTimeRight(Long createTimeRight) {
        this.createTimeRight = createTimeRight;
        return this;
    }
    public Long getCreateTimeRight() {
        return this.createTimeRight;
    }

    public QueryProduceListRequest setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public QueryProduceListRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryProduceListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryProduceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryProduceListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryProduceListRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public QueryProduceListRequest setTmNumber(String tmNumber) {
        this.tmNumber = tmNumber;
        return this;
    }
    public String getTmNumber() {
        return this.tmNumber;
    }

    public QueryProduceListRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public QueryProduceListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
