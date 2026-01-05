// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class ListSlotsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A731A84D-55C9-44F7-99BB-E1CF0CF19197</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Slots")
    public java.util.List<ListSlotsResponseBodySlots> slots;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSlotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSlotsResponseBody self = new ListSlotsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSlotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSlotsResponseBody setSlots(java.util.List<ListSlotsResponseBodySlots> slots) {
        this.slots = slots;
        return this;
    }
    public java.util.List<ListSlotsResponseBodySlots> getSlots() {
        return this.slots;
    }

    public ListSlotsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSlotsResponseBodySlotsEndpoints extends TeaModel {
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
         * <p>endpoint-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1557702098194904</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Status")
        public EndpointStatus status;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
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
         * <p>end-ivrq92qhbyrg4jctih</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <strong>example:</strong>
         * <p>vpc-j6co2fcdsl1q0gnuc3ym3</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vsw-j6cmr00qjyrft6jo2mg7g</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static ListSlotsResponseBodySlotsEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListSlotsResponseBodySlotsEndpoints self = new ListSlotsResponseBodySlotsEndpoints();
            return TeaModel.build(map, self);
        }

        public ListSlotsResponseBodySlotsEndpoints setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListSlotsResponseBodySlotsEndpoints setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListSlotsResponseBodySlotsEndpoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSlotsResponseBodySlotsEndpoints setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListSlotsResponseBodySlotsEndpoints setStatus(EndpointStatus status) {
            this.status = status;
            return this;
        }
        public EndpointStatus getStatus() {
            return this.status;
        }

        public ListSlotsResponseBodySlotsEndpoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSlotsResponseBodySlotsEndpoints setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListSlotsResponseBodySlotsEndpoints setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListSlotsResponseBodySlotsEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListSlotsResponseBodySlotsEndpoints setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class ListSlotsResponseBodySlotsTags extends TeaModel {
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

        public static ListSlotsResponseBodySlotsTags build(java.util.Map<String, ?> map) throws Exception {
            ListSlotsResponseBodySlotsTags self = new ListSlotsResponseBodySlotsTags();
            return TeaModel.build(map, self);
        }

        public ListSlotsResponseBodySlotsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSlotsResponseBodySlotsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSlotsResponseBodySlots extends TeaModel {
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

        @NameInMap("Endpoints")
        public java.util.List<ListSlotsResponseBodySlotsEndpoints> endpoints;

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
        public java.util.List<ListSlotsResponseBodySlotsTags> tags;

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

        public static ListSlotsResponseBodySlots build(java.util.Map<String, ?> map) throws Exception {
            ListSlotsResponseBodySlots self = new ListSlotsResponseBodySlots();
            return TeaModel.build(map, self);
        }

        public ListSlotsResponseBodySlots setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public ListSlotsResponseBodySlots setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSlotsResponseBodySlots setEndpoints(java.util.List<ListSlotsResponseBodySlotsEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<ListSlotsResponseBodySlotsEndpoints> getEndpoints() {
            return this.endpoints;
        }

        public ListSlotsResponseBodySlots setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListSlotsResponseBodySlots setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListSlotsResponseBodySlots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSlotsResponseBodySlots setIoType(String ioType) {
            this.ioType = ioType;
            return this;
        }
        public String getIoType() {
            return this.ioType;
        }

        public ListSlotsResponseBodySlots setLifeCycle(SlotLifeCycle lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public SlotLifeCycle getLifeCycle() {
            return this.lifeCycle;
        }

        public ListSlotsResponseBodySlots setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSlotsResponseBodySlots setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListSlotsResponseBodySlots setStatus(SlotStatus status) {
            this.status = status;
            return this;
        }
        public SlotStatus getStatus() {
            return this.status;
        }

        public ListSlotsResponseBodySlots setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListSlotsResponseBodySlots setStorageUri(String storageUri) {
            this.storageUri = storageUri;
            return this;
        }
        public String getStorageUri() {
            return this.storageUri;
        }

        public ListSlotsResponseBodySlots setTags(java.util.List<ListSlotsResponseBodySlotsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListSlotsResponseBodySlotsTags> getTags() {
            return this.tags;
        }

        public ListSlotsResponseBodySlots setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListSlotsResponseBodySlots setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
