// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListQuotasRequest extends TeaModel {
    /**
     * <p>The cluster type.</p>
     * 
     * <strong>example:</strong>
     * <p>RayCluster</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The GPU type.</p>
     * 
     * <strong>example:</strong>
     * <p>V100</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <p>Specifies whether the quota contains resources.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasResource")
    public String hasResource;

    /**
     * <p>Filters the results by label keys and values. Separate multiple labels with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>official=true,gpu=false</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The display mode. Valid values: tree and list.</p>
     * 
     * <strong>example:</strong>
     * <p>Tree</p>
     */
    @NameInMap("LayoutMode")
    public String layoutMode;

    /**
     * <p>The sort order. Valid values: desc and asc.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of the page to return. Minimum value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Minimum value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filters the results by ParentQuotaId.</p>
     * <ul>
     * <li><p>If this parameter is not specified, all quotas under the tenant are listed, including root quotas and child quotas.</p>
     * </li>
     * <li><p>If this parameter is left empty, all root quotas are listed.</p>
     * </li>
     * <li><p>If this parameter is specified, all child quotas of the specified ParentQuotaId are listed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>quotajradxh43rgb</p>
     */
    @NameInMap("ParentQuotaId")
    public String parentQuotaId;

    /**
     * <p>Filters the results by QuotaIds. Separate multiple IDs with commas (,). Only exact matching is supported. A maximum of 100 IDs can be specified at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>quota1ci8g793pgm,quotajradxh43rgb</p>
     */
    @NameInMap("QuotaIds")
    public String quotaIds;

    /**
     * <p>Filters the results by QuotaName. Fuzzy matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>quotajradxh43rgb</p>
     */
    @NameInMap("QuotaName")
    public String quotaName;

    /**
     * <p>The resource type of the quota. Valid values: Lingjun, ECS, and ACS. Default value: ECS.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The field by which to sort the returned results. Valid values:</p>
     * <ul>
     * <li><p>QuotaName</p>
     * </li>
     * <li><p>Status</p>
     * </li>
     * <li><p>CPU</p>
     * </li>
     * <li><p>Memory</p>
     * </li>
     * <li><p>GPU</p>
     * </li>
     * <li><p>GmtCreatedTime</p>
     * </li>
     * <li><p>GmtModifiedTime</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>status</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Filters the results by quota statuses. Separate multiple statuses with commas (,). Only exact matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Creating</p>
     */
    @NameInMap("Statuses")
    public String statuses;

    /**
     * <p>Specifies whether to display details. Valid values:</p>
     * <ul>
     * <li>true: Displays details.</li>
     * <li>false: Does not display details.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <p>Filters the results by version information.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Versions")
    public String versions;

    /**
     * <p>Filters the results by WorkspaceIds. Separate multiple IDs with commas (,). Only exact matching is supported. A maximum of 10 IDs can be specified at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>21345,38727</p>
     */
    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    /**
     * <p>The name of the associated workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>myshellprod</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static ListQuotasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasRequest self = new ListQuotasRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotasRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListQuotasRequest setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public ListQuotasRequest setHasResource(String hasResource) {
        this.hasResource = hasResource;
        return this;
    }
    public String getHasResource() {
        return this.hasResource;
    }

    public ListQuotasRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ListQuotasRequest setLayoutMode(String layoutMode) {
        this.layoutMode = layoutMode;
        return this;
    }
    public String getLayoutMode() {
        return this.layoutMode;
    }

    public ListQuotasRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListQuotasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListQuotasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQuotasRequest setParentQuotaId(String parentQuotaId) {
        this.parentQuotaId = parentQuotaId;
        return this;
    }
    public String getParentQuotaId() {
        return this.parentQuotaId;
    }

    public ListQuotasRequest setQuotaIds(String quotaIds) {
        this.quotaIds = quotaIds;
        return this;
    }
    public String getQuotaIds() {
        return this.quotaIds;
    }

    public ListQuotasRequest setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public ListQuotasRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListQuotasRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListQuotasRequest setStatuses(String statuses) {
        this.statuses = statuses;
        return this;
    }
    public String getStatuses() {
        return this.statuses;
    }

    public ListQuotasRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

    public ListQuotasRequest setVersions(String versions) {
        this.versions = versions;
        return this;
    }
    public String getVersions() {
        return this.versions;
    }

    public ListQuotasRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

    public ListQuotasRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
