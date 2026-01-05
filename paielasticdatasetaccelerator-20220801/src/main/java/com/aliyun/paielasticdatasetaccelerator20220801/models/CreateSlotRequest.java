// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class CreateSlotRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
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

    @NameInMap("Endpoints")
    public java.util.List<CreateSlotRequestEndpoints> endpoints;

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
    public java.util.List<CreateSlotRequestTags> tags;

    public static CreateSlotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlotRequest self = new CreateSlotRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlotRequest setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public CreateSlotRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSlotRequest setEndpointIds(String endpointIds) {
        this.endpointIds = endpointIds;
        return this;
    }
    public String getEndpointIds() {
        return this.endpointIds;
    }

    public CreateSlotRequest setEndpoints(java.util.List<CreateSlotRequestEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<CreateSlotRequestEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public CreateSlotRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSlotRequest setIoType(String ioType) {
        this.ioType = ioType;
        return this;
    }
    public String getIoType() {
        return this.ioType;
    }

    public CreateSlotRequest setLifeCycle(SlotLifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }
    public SlotLifeCycle getLifeCycle() {
        return this.lifeCycle;
    }

    public CreateSlotRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSlotRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateSlotRequest setStorageUri(String storageUri) {
        this.storageUri = storageUri;
        return this;
    }
    public String getStorageUri() {
        return this.storageUri;
    }

    public CreateSlotRequest setTags(java.util.List<CreateSlotRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateSlotRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateSlotRequestEndpoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>endpoint-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Type")
        public String type;

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

        public static CreateSlotRequestEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateSlotRequestEndpoints self = new CreateSlotRequestEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateSlotRequestEndpoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSlotRequestEndpoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateSlotRequestEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateSlotRequestEndpoints setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class CreateSlotRequestTags extends TeaModel {
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

        public static CreateSlotRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateSlotRequestTags self = new CreateSlotRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateSlotRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSlotRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
