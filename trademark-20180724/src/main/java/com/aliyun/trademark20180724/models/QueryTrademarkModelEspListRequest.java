// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkModelEspListRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Env")
    public String env;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OrderIdsStr")
    public String orderIdsStr;

    @NameInMap("OrderInstanceId")
    public String orderInstanceId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrincipalKey")
    public String principalKey;

    @NameInMap("PrincipalName")
    public String principalName;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubmitStatus")
    public String submitStatus;

    @NameInMap("SubmitTime")
    public String submitTime;

    public static QueryTrademarkModelEspListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkModelEspListRequest self = new QueryTrademarkModelEspListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkModelEspListRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryTrademarkModelEspListRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryTrademarkModelEspListRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryTrademarkModelEspListRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryTrademarkModelEspListRequest setOrderIdsStr(String orderIdsStr) {
        this.orderIdsStr = orderIdsStr;
        return this;
    }
    public String getOrderIdsStr() {
        return this.orderIdsStr;
    }

    public QueryTrademarkModelEspListRequest setOrderInstanceId(String orderInstanceId) {
        this.orderInstanceId = orderInstanceId;
        return this;
    }
    public String getOrderInstanceId() {
        return this.orderInstanceId;
    }

    public QueryTrademarkModelEspListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTrademarkModelEspListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTrademarkModelEspListRequest setPrincipalKey(String principalKey) {
        this.principalKey = principalKey;
        return this;
    }
    public String getPrincipalKey() {
        return this.principalKey;
    }

    public QueryTrademarkModelEspListRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public QueryTrademarkModelEspListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryTrademarkModelEspListRequest setSubmitStatus(String submitStatus) {
        this.submitStatus = submitStatus;
        return this;
    }
    public String getSubmitStatus() {
        return this.submitStatus;
    }

    public QueryTrademarkModelEspListRequest setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

}
