// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30.0G</p>
     */
    @NameInMap("Capacity")
    public String capacity;

    /**
     * <strong>example:</strong>
     * <p>xgboost数据集加速实例</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2014-10-02T15:01:23Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2014-10-02T15:01:23Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>readonly</p>
     */
    @NameInMap("IoType")
    public String ioType;

    /**
     * <p>数据集加速实例的最大挂载点个数。</p>
     */
    @NameInMap("MaxEndpoint")
    public Integer maxEndpoint;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxSlot")
    public Integer maxSlot;

    /**
     * <strong>example:</strong>
     * <p>acc_instance_1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1557702098194904</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>数据集加速实例的资源提供者类型。</p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("ProviderType")
    public String providerType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A731A84D-55C9-44F7-99BB-E1CF0CF19197</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public InstanceStatus status;

    /**
     * <p>数据集加速实例的存储类型。</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("Tags")
    public java.util.List<DescribeInstanceResponseBodyTags> tags;

    /**
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>276065346797410278</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>inst-my1tk3jggooi5uwks5</p>
     */
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

    public DescribeInstanceResponseBody setIoType(String ioType) {
        this.ioType = ioType;
        return this;
    }
    public String getIoType() {
        return this.ioType;
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
        /**
         * <strong>example:</strong>
         * <p>dataset_version</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>v0.1.0</p>
         */
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
