// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListRecallManagementJobsRequest extends TeaModel {
    /**
     * <p><strong>The filter conditions.</strong> Currently, only filter conditions for the Table type are supported, such as <code>{&quot;RecallManagementTableId&quot;:&quot;1&quot;}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RecallManagementTableId&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("Condition")
    public java.util.Map<String, ?> condition;

    /**
     * <p><strong>The instance ID.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p><strong>The sorting order.</strong> <code>ASC</code>: ascending order. <code>DESC</code>: descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p><strong>The page number.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p><strong>The sorting criterion.</strong> <code>GmtCreateTime</code>: creation time. <code>GmtModifiedTime</code>: update time.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p><strong>The task type.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>Table</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListRecallManagementJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecallManagementJobsRequest self = new ListRecallManagementJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListRecallManagementJobsRequest setCondition(java.util.Map<String, ?> condition) {
        this.condition = condition;
        return this;
    }
    public java.util.Map<String, ?> getCondition() {
        return this.condition;
    }

    public ListRecallManagementJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRecallManagementJobsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRecallManagementJobsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecallManagementJobsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListRecallManagementJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecallManagementJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecallManagementJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListRecallManagementJobsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
