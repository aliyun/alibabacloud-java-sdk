// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListWorkflowInstancesRequest extends TeaModel {
    /**
     * <p>The exact requirement ID.</p>
     * 
     * <strong>example:</strong>
     * <p>REQ-1001</p>
     */
    @NameInMap("businessId")
    public String businessId;

    /**
     * <p>The collaboration space ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_20261016_abc123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The exact external initiator tag.</p>
     * 
     * <strong>example:</strong>
     * <p>External initiator Zhang San</p>
     */
    @NameInMap("initiator")
    public String initiator;

    /**
     * <p>The keyword for the title or requirement ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Quarterly report</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>GMT_CREATE</p>
     */
    @NameInMap("sortBy")
    public String sortBy;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("sortOrder")
    public String sortOrder;

    /**
     * <p>Filters the instances by status. Valid values: Running, Completed, Failed, and Terminated.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The tenant ID. This is a common parameter. If you use winnexo-cli, pass this parameter explicitly by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListWorkflowInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowInstancesRequest self = new ListWorkflowInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkflowInstancesRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public ListWorkflowInstancesRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ListWorkflowInstancesRequest setInitiator(String initiator) {
        this.initiator = initiator;
        return this;
    }
    public String getInitiator() {
        return this.initiator;
    }

    public ListWorkflowInstancesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListWorkflowInstancesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListWorkflowInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWorkflowInstancesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListWorkflowInstancesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListWorkflowInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListWorkflowInstancesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
