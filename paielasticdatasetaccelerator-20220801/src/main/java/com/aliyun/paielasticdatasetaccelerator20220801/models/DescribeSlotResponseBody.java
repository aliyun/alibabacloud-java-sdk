// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DescribeSlotResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30.0G</p>
     */
    @NameInMap("Capacity")
    public String capacity;

    /**
     * <strong>example:</strong>
     * <p>xgboost数据集加速槽</p>
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
     * <p>inst-my1tk3jggooi5uwks5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>数据集加速槽的读写类型。</p>
     * 
     * <strong>example:</strong>
     * <p>readonly</p>
     */
    @NameInMap("IoType")
    public String ioType;

    @NameInMap("LifeCycle")
    public SlotLifeCycle lifeCycle;

    /**
     * <strong>example:</strong>
     * <p>slot_1</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A731A84D-55C9-44F7-99BB-E1CF0CF19197</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public SlotStatus status;

    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <strong>example:</strong>
     * <p>oss://pai-vision-data-hz2.oss-cn-hangzhou-internal.aliyuncs.com/data/VOCdevkit/VOC2007/ImageSets/Main/val.txt</p>
     */
    @NameInMap("StorageUri")
    public String storageUri;

    @NameInMap("Tags")
    public java.util.List<DescribeSlotResponseBodyTags> tags;

    /**
     * <strong>example:</strong>
     * <p>276065346797410278</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>slot-5zk866779me51jgu3w</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeSlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlotResponseBody self = new DescribeSlotResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlotResponseBody setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public DescribeSlotResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeSlotResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public DescribeSlotResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public DescribeSlotResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSlotResponseBody setIoType(String ioType) {
        this.ioType = ioType;
        return this;
    }
    public String getIoType() {
        return this.ioType;
    }

    public DescribeSlotResponseBody setLifeCycle(SlotLifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }
    public SlotLifeCycle getLifeCycle() {
        return this.lifeCycle;
    }

    public DescribeSlotResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSlotResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeSlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlotResponseBody setStatus(SlotStatus status) {
        this.status = status;
        return this;
    }
    public SlotStatus getStatus() {
        return this.status;
    }

    public DescribeSlotResponseBody setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeSlotResponseBody setStorageUri(String storageUri) {
        this.storageUri = storageUri;
        return this;
    }
    public String getStorageUri() {
        return this.storageUri;
    }

    public DescribeSlotResponseBody setTags(java.util.List<DescribeSlotResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeSlotResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeSlotResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DescribeSlotResponseBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class DescribeSlotResponseBodyTags extends TeaModel {
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

        public static DescribeSlotResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlotResponseBodyTags self = new DescribeSlotResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeSlotResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSlotResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
