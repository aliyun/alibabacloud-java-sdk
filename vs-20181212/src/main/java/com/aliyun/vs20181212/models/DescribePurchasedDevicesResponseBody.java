// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePurchasedDevicesResponseBody extends TeaModel {
    @NameInMap("Devices")
    public java.util.List<DescribePurchasedDevicesResponseBodyDevices> devices;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePurchasedDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedDevicesResponseBody self = new DescribePurchasedDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedDevicesResponseBody setDevices(java.util.List<DescribePurchasedDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<DescribePurchasedDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public DescribePurchasedDevicesResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribePurchasedDevicesResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribePurchasedDevicesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePurchasedDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePurchasedDevicesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePurchasedDevicesResponseBodyDevices extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("Region")
        public String region;

        @NameInMap("RegisterCode")
        public String registerCode;

        @NameInMap("SubType")
        public String subType;

        @NameInMap("Type")
        public String type;

        @NameInMap("Vendor")
        public String vendor;

        public static DescribePurchasedDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedDevicesResponseBodyDevices self = new DescribePurchasedDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedDevicesResponseBodyDevices setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribePurchasedDevicesResponseBodyDevices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePurchasedDevicesResponseBodyDevices setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribePurchasedDevicesResponseBodyDevices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribePurchasedDevicesResponseBodyDevices setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePurchasedDevicesResponseBodyDevices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePurchasedDevicesResponseBodyDevices setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public DescribePurchasedDevicesResponseBodyDevices setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribePurchasedDevicesResponseBodyDevices setRegisterCode(String registerCode) {
            this.registerCode = registerCode;
            return this;
        }
        public String getRegisterCode() {
            return this.registerCode;
        }

        public DescribePurchasedDevicesResponseBodyDevices setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public DescribePurchasedDevicesResponseBodyDevices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePurchasedDevicesResponseBodyDevices setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
