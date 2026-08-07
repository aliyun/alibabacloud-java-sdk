// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateSystemConfigsRequest extends TeaModel {
    /**
     * <p>配置列表</p>
     */
    @NameInMap("Configs")
    public java.util.List<UpdateSystemConfigsRequestConfigs> configs;

    /**
     * <p>对象ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>外呼开发时补充参数限制</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    public static UpdateSystemConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSystemConfigsRequest self = new UpdateSystemConfigsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSystemConfigsRequest setConfigs(java.util.List<UpdateSystemConfigsRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<UpdateSystemConfigsRequestConfigs> getConfigs() {
        return this.configs;
    }

    public UpdateSystemConfigsRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public UpdateSystemConfigsRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public static class UpdateSystemConfigsRequestConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>callableTime</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateSystemConfigsRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateSystemConfigsRequestConfigs self = new UpdateSystemConfigsRequestConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateSystemConfigsRequestConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSystemConfigsRequestConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
