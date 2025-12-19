// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WS20250731233102000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>2025-12-18T14:30:00Z</p>
     */
    @NameInMap("EndTimeBegin")
    public String endTimeBegin;

    /**
     * <strong>example:</strong>
     * <p>2025-12-31T14:30:00Z</p>
     */
    @NameInMap("EndTimeEnd")
    public String endTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3BFw8paIJ7ylB6A7Qn9JjM</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>gmtCreated</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <strong>example:</strong>
     * <p>DOWNGRADE</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;RequestId\&quot;:\&quot;\&quot;}</p>
     */
    @NameInMap("Query")
    public String query;

    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    public static ListAppInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstancesRequest self = new ListAppInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListAppInstancesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListAppInstancesRequest setEndTimeBegin(String endTimeBegin) {
        this.endTimeBegin = endTimeBegin;
        return this;
    }
    public String getEndTimeBegin() {
        return this.endTimeBegin;
    }

    public ListAppInstancesRequest setEndTimeEnd(String endTimeEnd) {
        this.endTimeEnd = endTimeEnd;
        return this;
    }
    public String getEndTimeEnd() {
        return this.endTimeEnd;
    }

    public ListAppInstancesRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public ListAppInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppInstancesRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public ListAppInstancesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListAppInstancesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAppInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInstancesRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListAppInstancesRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}
