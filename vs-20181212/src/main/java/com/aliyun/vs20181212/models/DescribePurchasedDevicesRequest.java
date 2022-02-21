// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePurchasedDevicesRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("SortDirection")
    public String sortDirection;

    @NameInMap("SubType")
    public String subType;

    @NameInMap("Type")
    public String type;

    @NameInMap("Vendor")
    public String vendor;

    public static DescribePurchasedDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedDevicesRequest self = new DescribePurchasedDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedDevicesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribePurchasedDevicesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribePurchasedDevicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePurchasedDevicesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePurchasedDevicesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribePurchasedDevicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePurchasedDevicesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribePurchasedDevicesRequest setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }
    public String getSortDirection() {
        return this.sortDirection;
    }

    public DescribePurchasedDevicesRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public DescribePurchasedDevicesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribePurchasedDevicesRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
