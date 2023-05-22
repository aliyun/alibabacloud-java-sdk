// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class ListSlotsRequest extends TeaModel {
    /**
     * <p>加速槽所对应的数据集加速挂载点的唯一标识符。</p>
     */
    @NameInMap("EndpointIds")
    public String endpointIds;

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

    @NameInMap("Phase")
    public String phase;

    @NameInMap("SlotIds")
    public String slotIds;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>数据集加速槽的数据存储路径（URI）。</p>
     */
    @NameInMap("StorageUri")
    public String storageUri;

    public static ListSlotsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSlotsRequest self = new ListSlotsRequest();
        return TeaModel.build(map, self);
    }

    public ListSlotsRequest setEndpointIds(String endpointIds) {
        this.endpointIds = endpointIds;
        return this;
    }
    public String getEndpointIds() {
        return this.endpointIds;
    }

    public ListSlotsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ListSlotsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSlotsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListSlotsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSlotsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSlotsRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public ListSlotsRequest setSlotIds(String slotIds) {
        this.slotIds = slotIds;
        return this;
    }
    public String getSlotIds() {
        return this.slotIds;
    }

    public ListSlotsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListSlotsRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public ListSlotsRequest setStorageUri(String storageUri) {
        this.storageUri = storageUri;
        return this;
    }
    public String getStorageUri() {
        return this.storageUri;
    }

}
