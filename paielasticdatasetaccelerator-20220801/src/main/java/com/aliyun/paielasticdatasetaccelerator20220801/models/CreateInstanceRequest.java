// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("Capacity")
    public String capacity;

    @NameInMap("Description")
    public String description;

    @NameInMap("MaxEndpoint")
    public String maxEndpoint;

    @NameInMap("MaxSlot")
    public String maxSlot;

    @NameInMap("Name")
    public String name;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("ProviderType")
    public String providerType;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("Tags")
    public java.util.List<CreateInstanceRequestTags> tags;

    @NameInMap("Type")
    public String type;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public CreateInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateInstanceRequest setMaxEndpoint(String maxEndpoint) {
        this.maxEndpoint = maxEndpoint;
        return this;
    }
    public String getMaxEndpoint() {
        return this.maxEndpoint;
    }

    public CreateInstanceRequest setMaxSlot(String maxSlot) {
        this.maxSlot = maxSlot;
        return this;
    }
    public String getMaxSlot() {
        return this.maxSlot;
    }

    public CreateInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateInstanceRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public CreateInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateInstanceRequest setTags(java.util.List<CreateInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateInstanceRequestTags> getTags() {
        return this.tags;
    }

    public CreateInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateInstanceRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateInstanceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTags self = new CreateInstanceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
