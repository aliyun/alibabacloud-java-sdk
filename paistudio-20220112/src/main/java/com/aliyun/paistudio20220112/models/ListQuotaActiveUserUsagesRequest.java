// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListQuotaActiveUserUsagesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>999</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SelfOnly")
    public Boolean selfOnly;

    /**
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>200xxxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    @NameInMap("WorkloadCount")
    public Integer workloadCount;

    /**
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
