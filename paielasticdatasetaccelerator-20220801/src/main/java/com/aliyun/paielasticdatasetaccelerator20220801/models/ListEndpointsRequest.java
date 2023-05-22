// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class ListEndpointsRequest extends TeaModel {
    @NameInMap("EndpointIds")
    public String endpointIds;

    /**
     * <p>所属加速实例的ID。</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Name")
    public String name;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SlotIds")
    public String slotIds;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Type")
    public String type;

    public static ListEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointsRequest self = new ListEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListEndpointsRequest setEndpointIds(String endpointIds) {
        this.endpointIds = endpointIds;
        return this;
    }
    public String getEndpointIds() {
        return this.endpointIds;
    }

    public ListEndpointsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ListEndpointsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListEndpointsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListEndpointsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEndpointsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEndpointsRequest setSlotIds(String slotIds) {
        this.slotIds = slotIds;
        return this;
    }
    public String getSlotIds() {
        return this.slotIds;
    }

    public ListEndpointsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListEndpointsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
