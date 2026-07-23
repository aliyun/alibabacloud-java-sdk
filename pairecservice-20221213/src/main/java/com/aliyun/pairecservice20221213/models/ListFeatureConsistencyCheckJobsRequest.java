// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobsRequest extends TeaModel {
    /**
     * <p>The instance ID. To obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><code>ASC</code>: Ascending order.</p>
     * </li>
     * <li><p><code>DESC</code>: Descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The field to sort the results by. Valid values:</p>
     * <ul>
     * <li><p><code>GmtCreateTime</code>: Sorts by creation time.</p>
     * </li>
     * <li><p><code>GmtModifiedTime</code>: Sorts by modification time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The status of the job. Valid values:</p>
     * <ul>
     * <li><p><code>ToRun</code>: Waiting to run.</p>
     * </li>
     * <li><p><code>Running</code>: In progress.</p>
     * </li>
     * <li><p><code>Success</code>: Successful.</p>
     * </li>
     * <li><p><code>Failure</code>: Failed.</p>
     * </li>
     * <li><p><code>Stopped</code>: Stopped or canceled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListFeatureConsistencyCheckJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobsRequest self = new ListFeatureConsistencyCheckJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFeatureConsistencyCheckJobsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListFeatureConsistencyCheckJobsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListFeatureConsistencyCheckJobsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListFeatureConsistencyCheckJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListFeatureConsistencyCheckJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
