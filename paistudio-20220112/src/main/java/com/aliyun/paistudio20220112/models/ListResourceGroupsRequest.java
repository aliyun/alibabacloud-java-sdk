// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListResourceGroupsRequest extends TeaModel {
    /**
     * <p>The provider of the compute resources.</p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("ComputingResourceProvider")
    public String computingResourceProvider;

    @NameInMap("HasResource")
    public Boolean hasResource;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rgf0zhfqn1d4ity2</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><code>desc</code>: descending.</p>
     * </li>
     * <li><p><code>asc</code>: ascending.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceGroupIDs")
    public String resourceGroupIDs;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p><code>ECS</code>: ECS.</p>
     * </li>
     * <li><p><code>Lingjun</code>: Lingjun intelligent computing resources.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Lingjun</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Specifies whether to return all results.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowAll")
    public Boolean showAll;

    /**
     * <p>The field to sort by. Valid values include: <code>DisplayName</code>, <code>GmtCreated</code>, <code>GmtModified</code>, <code>RegionID</code>, <code>Duration</code>, <code>PricingCycle</code>, and <code>PayType</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>DisplayName</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The status of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>Creating</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The version to filter by.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Versions")
    public String versions;

    public static ListResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsRequest self = new ListResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsRequest setComputingResourceProvider(String computingResourceProvider) {
        this.computingResourceProvider = computingResourceProvider;
        return this;
    }
    public String getComputingResourceProvider() {
        return this.computingResourceProvider;
    }

    public ListResourceGroupsRequest setHasResource(Boolean hasResource) {
        this.hasResource = hasResource;
        return this;
    }
    public Boolean getHasResource() {
        return this.hasResource;
    }

    public ListResourceGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListResourceGroupsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListResourceGroupsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListResourceGroupsRequest setResourceGroupIDs(String resourceGroupIDs) {
        this.resourceGroupIDs = resourceGroupIDs;
        return this;
    }
    public String getResourceGroupIDs() {
        return this.resourceGroupIDs;
    }

    public ListResourceGroupsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListResourceGroupsRequest setShowAll(Boolean showAll) {
        this.showAll = showAll;
        return this;
    }
    public Boolean getShowAll() {
        return this.showAll;
    }

    public ListResourceGroupsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListResourceGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListResourceGroupsRequest setVersions(String versions) {
        this.versions = versions;
        return this;
    }
    public String getVersions() {
        return this.versions;
    }

}
