// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class CreateSlotsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Slots")
    public java.util.List<CreateSlotsRequestSlots> slots;

    public static CreateSlotsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlotsRequest self = new CreateSlotsRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlotsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateSlotsRequest setSlots(java.util.List<CreateSlotsRequestSlots> slots) {
        this.slots = slots;
        return this;
    }
    public java.util.List<CreateSlotsRequestSlots> getSlots() {
        return this.slots;
    }

    public static class CreateSlotsRequestSlotsTags extends TeaModel {
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

        public static CreateSlotsRequestSlotsTags build(java.util.Map<String, ?> map) throws Exception {
            CreateSlotsRequestSlotsTags self = new CreateSlotsRequestSlotsTags();
            return TeaModel.build(map, self);
        }

        public CreateSlotsRequestSlotsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSlotsRequestSlotsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateSlotsRequestSlots extends TeaModel {
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
         * <p>end-my1tk3jggooi5uwks5,end-n69468yvjz8d12as7d,end-tga4omjrepklkg1onn</p>
         */
        @NameInMap("EndpointIds")
        public String endpointIds;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inst-my1tk3jggooi5uwks5</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://pai-vision-data-hz2.oss-cn-hangzhou-internal.aliyuncs.com/data/VOCdevkit/VOC2007/ImageSets/Main/val.txt</p>
         */
        @NameInMap("StorageUri")
        public String storageUri;

        @NameInMap("Tags")
        public java.util.List<CreateSlotsRequestSlotsTags> tags;

        public static CreateSlotsRequestSlots build(java.util.Map<String, ?> map) throws Exception {
            CreateSlotsRequestSlots self = new CreateSlotsRequestSlots();
            return TeaModel.build(map, self);
        }

        public CreateSlotsRequestSlots setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public CreateSlotsRequestSlots setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSlotsRequestSlots setEndpointIds(String endpointIds) {
            this.endpointIds = endpointIds;
            return this;
        }
        public String getEndpointIds() {
            return this.endpointIds;
        }

        public CreateSlotsRequestSlots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateSlotsRequestSlots setIoType(String ioType) {
            this.ioType = ioType;
            return this;
        }
        public String getIoType() {
            return this.ioType;
        }

        public CreateSlotsRequestSlots setLifeCycle(SlotLifeCycle lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public SlotLifeCycle getLifeCycle() {
            return this.lifeCycle;
        }

        public CreateSlotsRequestSlots setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSlotsRequestSlots setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public CreateSlotsRequestSlots setStorageUri(String storageUri) {
            this.storageUri = storageUri;
            return this;
        }
        public String getStorageUri() {
            return this.storageUri;
        }

        public CreateSlotsRequestSlots setTags(java.util.List<CreateSlotsRequestSlotsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreateSlotsRequestSlotsTags> getTags() {
            return this.tags;
        }

    }

}
