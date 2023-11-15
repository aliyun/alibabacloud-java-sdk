// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkModelListRequest extends TeaModel {
    @NameInMap("Env")
    public String env;

    @NameInMap("OrderIdsStr")
    public String orderIdsStr;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrincipalKey")
    public String principalKey;

    @NameInMap("PrincipalName")
    public String principalName;

    @NameInMap("ProduceTypesStr")
    public String produceTypesStr;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubmitStart")
    public String submitStart;

    @NameInMap("SubmitStatus")
    public String submitStatus;

    @NameInMap("SubmitTime")
    public String submitTime;

    public static QueryTrademarkModelListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkModelListRequest self = new QueryTrademarkModelListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkModelListRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryTrademarkModelListRequest setOrderIdsStr(String orderIdsStr) {
        this.orderIdsStr = orderIdsStr;
        return this;
    }
    public String getOrderIdsStr() {
        return this.orderIdsStr;
    }

    public QueryTrademarkModelListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTrademarkModelListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTrademarkModelListRequest setPrincipalKey(String principalKey) {
        this.principalKey = principalKey;
        return this;
    }
    public String getPrincipalKey() {
        return this.principalKey;
    }

    public QueryTrademarkModelListRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public QueryTrademarkModelListRequest setProduceTypesStr(String produceTypesStr) {
        this.produceTypesStr = produceTypesStr;
        return this;
    }
    public String getProduceTypesStr() {
        return this.produceTypesStr;
    }

    public QueryTrademarkModelListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryTrademarkModelListRequest setSubmitStart(String submitStart) {
        this.submitStart = submitStart;
        return this;
    }
    public String getSubmitStart() {
        return this.submitStart;
    }

    public QueryTrademarkModelListRequest setSubmitStatus(String submitStatus) {
        this.submitStatus = submitStatus;
        return this;
    }
    public String getSubmitStatus() {
        return this.submitStatus;
    }

    public QueryTrademarkModelListRequest setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

}
