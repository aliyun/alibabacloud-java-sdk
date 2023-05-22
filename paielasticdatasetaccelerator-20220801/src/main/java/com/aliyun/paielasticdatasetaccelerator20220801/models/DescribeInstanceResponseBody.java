// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("Capacity")
    public String capacity;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("MaxEndpoint")
    public Integer maxEndpoint;

    @NameInMap("MaxSlot")
    public Integer maxSlot;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("ProviderType")
    public String providerType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public InstanceStatus status;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("Tags")
    public java.util.List<DescribeInstanceResponseBodyTags> tags;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Uuid")
    public String uuid;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public DescribeInstanceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeInstanceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public DescribeInstanceResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public DescribeInstanceResponseBody setMaxEndpoint(Integer maxEndpoint) {
        this.maxEndpoint = maxEndpoint;
        return this;
    }
    public Integer getMaxEndpoint() {
        return this.maxEndpoint;
    }

    public DescribeInstanceResponseBody setMaxSlot(Integer maxSlot) {
        this.maxSlot = maxSlot;
        return this;
    }
    public Integer getMaxSlot() {
        return this.maxSlot;
    }

    public DescribeInstanceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeInstanceResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstanceResponseBody setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public DescribeInstanceResponseBody setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public DescribeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceResponseBody setStatus(InstanceStatus status) {
        this.status = status;
        return this;
    }
    public InstanceStatus getStatus() {
        return this.status;
    }

    public DescribeInstanceResponseBody setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeInstanceResponseBody setTags(java.util.List<DescribeInstanceResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeInstanceResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeInstanceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeInstanceResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DescribeInstanceResponseBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class DescribeInstanceResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeInstanceResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyTags self = new DescribeInstanceResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstanceResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
