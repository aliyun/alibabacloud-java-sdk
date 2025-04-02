// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListEcsSpecsRequest extends TeaModel {
    /**
     * <p>Filter by accelerator type. Valid values:</p>
     * <ul>
     * <li>CPU</li>
     * <li>GPU</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <p>The instance types to query. Separate the types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large,ecs.g6.xlarge</p>
     */
    @NameInMap("InstanceTypes")
    public String instanceTypes;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li>desc: descending order.</li>
     * <li>asc: ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of the page to query. The start value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li>ECS</li>
     * <li>Lingjun</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The field based on which the results are sorted. Valid values:</p>
     * <ul>
     * <li>CPU</li>
     * <li>GPU</li>
     * <li>Memory</li>
     * <li>GmtCreateTime</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Gpu</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListEcsSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEcsSpecsRequest self = new ListEcsSpecsRequest();
        return TeaModel.build(map, self);
    }

    public ListEcsSpecsRequest setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public ListEcsSpecsRequest setInstanceTypes(String instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public String getInstanceTypes() {
        return this.instanceTypes;
    }

    public ListEcsSpecsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListEcsSpecsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEcsSpecsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEcsSpecsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListEcsSpecsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
