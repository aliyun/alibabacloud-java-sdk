// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListRbacOrgTreeRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The maximum number of entries per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. This parameter is empty if no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3BFw8paIJ7ylB6A7Qn9JjM</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The field by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>gmtCreated</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>ASC: ascending order.</li>
     * <li>DESC: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListRbacOrgTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRbacOrgTreeRequest self = new ListRbacOrgTreeRequest();
        return TeaModel.build(map, self);
    }

    public ListRbacOrgTreeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListRbacOrgTreeRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRbacOrgTreeRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRbacOrgTreeRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public ListRbacOrgTreeRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListRbacOrgTreeRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListRbacOrgTreeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
