// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppInstancesShrinkRequest extends TeaModel {
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
    public String statusListShrink;

    public static ListAppInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstancesShrinkRequest self = new ListAppInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAppInstancesShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListAppInstancesShrinkRequest setEndTimeBegin(String endTimeBegin) {
        this.endTimeBegin = endTimeBegin;
        return this;
    }
    public String getEndTimeBegin() {
        return this.endTimeBegin;
    }

    public ListAppInstancesShrinkRequest setEndTimeEnd(String endTimeEnd) {
        this.endTimeEnd = endTimeEnd;
        return this;
    }
    public String getEndTimeEnd() {
        return this.endTimeEnd;
    }

    public ListAppInstancesShrinkRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public ListAppInstancesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppInstancesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppInstancesShrinkRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public ListAppInstancesShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListAppInstancesShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAppInstancesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInstancesShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListAppInstancesShrinkRequest setStatusListShrink(String statusListShrink) {
        this.statusListShrink = statusListShrink;
        return this;
    }
    public String getStatusListShrink() {
        return this.statusListShrink;
    }

}
