// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class UpdateSlotRequest extends TeaModel {
    @NameInMap("Capacity")
    public String capacity;

    @NameInMap("Description")
    public String description;

    @NameInMap("LifeCycle")
    public SlotLifeCycle lifeCycle;

    @NameInMap("Name")
    public String name;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("StorageUri")
    public String storageUri;

    @NameInMap("Tags")
    public java.util.List<UpdateSlotRequestTags> tags;

    public static UpdateSlotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlotRequest self = new UpdateSlotRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSlotRequest setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public UpdateSlotRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSlotRequest setLifeCycle(SlotLifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }
    public SlotLifeCycle getLifeCycle() {
        return this.lifeCycle;
    }

    public UpdateSlotRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSlotRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public UpdateSlotRequest setStorageUri(String storageUri) {
        this.storageUri = storageUri;
        return this;
    }
    public String getStorageUri() {
        return this.storageUri;
    }

    public UpdateSlotRequest setTags(java.util.List<UpdateSlotRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateSlotRequestTags> getTags() {
        return this.tags;
    }

    public static class UpdateSlotRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateSlotRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateSlotRequestTags self = new UpdateSlotRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateSlotRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateSlotRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
