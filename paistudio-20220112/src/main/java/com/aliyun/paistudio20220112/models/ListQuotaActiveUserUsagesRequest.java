// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListQuotaActiveUserUsagesRequest extends TeaModel {
    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><code>desc</code>: descending order.</p>
     * </li>
     * <li><p><code>asc</code>: ascending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>999</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>If true, retrieves resource usage from the current quota only.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SelfOnly")
    public Boolean selfOnly;

    /**
     * <p>The field to sort the results by. Valid values:</p>
     * <ul>
     * <li><p>QuotaId</p>
     * </li>
     * <li><p>SubmittedCPU</p>
     * </li>
     * <li><p>SubmittedMemory</p>
     * </li>
     * <li><p>SubmittedGPU</p>
     * </li>
     * <li><p>UsedCPU</p>
     * </li>
     * <li><p>UsedMemory</p>
     * </li>
     * <li><p>UsedGPU</p>
     * </li>
     * <li><p>WorkloadCount</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Filters the results by user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>200xxxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>Filters the results by username.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    @NameInMap("WorkloadCount")
    public Integer workloadCount;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListQuotaActiveUserUsagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaActiveUserUsagesRequest self = new ListQuotaActiveUserUsagesRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotaActiveUserUsagesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListQuotaActiveUserUsagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListQuotaActiveUserUsagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQuotaActiveUserUsagesRequest setSelfOnly(Boolean selfOnly) {
        this.selfOnly = selfOnly;
        return this;
    }
    public Boolean getSelfOnly() {
        return this.selfOnly;
    }

    public ListQuotaActiveUserUsagesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListQuotaActiveUserUsagesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListQuotaActiveUserUsagesRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ListQuotaActiveUserUsagesRequest setWorkloadCount(Integer workloadCount) {
        this.workloadCount = workloadCount;
        return this;
    }
    public Integer getWorkloadCount() {
        return this.workloadCount;
    }

    public ListQuotaActiveUserUsagesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
