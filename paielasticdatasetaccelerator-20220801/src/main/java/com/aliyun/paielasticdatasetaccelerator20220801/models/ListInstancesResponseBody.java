// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstancesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListInstancesResponseBodyInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesTags self = new ListInstancesResponseBodyInstancesTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseBodyInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Capacity")
        public String capacity;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>数据集加速实例的最大挂载点个数。</p>
         */
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

        /**
         * <p>数据集加速实例的资源提供者类型。</p>
         */
        @NameInMap("ProviderType")
        public String providerType;

        @NameInMap("Status")
        public InstanceStatus status;

        /**
         * <p>数据集加速实例的存储类型。</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Tags")
        public java.util.List<ListInstancesResponseBodyInstancesTags> tags;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Uuid")
        public String uuid;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public ListInstancesResponseBodyInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstancesResponseBodyInstances setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstancesResponseBodyInstances setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstancesResponseBodyInstances setMaxEndpoint(Integer maxEndpoint) {
            this.maxEndpoint = maxEndpoint;
            return this;
        }
        public Integer getMaxEndpoint() {
            return this.maxEndpoint;
        }

        public ListInstancesResponseBodyInstances setMaxSlot(Integer maxSlot) {
            this.maxSlot = maxSlot;
            return this;
        }
        public Integer getMaxSlot() {
            return this.maxSlot;
        }

        public ListInstancesResponseBodyInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstancesResponseBodyInstances setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListInstancesResponseBodyInstances setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListInstancesResponseBodyInstances setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

        public ListInstancesResponseBodyInstances setStatus(InstanceStatus status) {
            this.status = status;
            return this;
        }
        public InstanceStatus getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyInstances setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListInstancesResponseBodyInstances setTags(java.util.List<ListInstancesResponseBodyInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesTags> getTags() {
            return this.tags;
        }

        public ListInstancesResponseBodyInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListInstancesResponseBodyInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListInstancesResponseBodyInstances setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
