// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateSystemConfigsRequest extends TeaModel {
    /**
     * <p>The list of configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<UpdateSystemConfigsRequestConfigs> configs;

    /**
     * <p>The configuration type ID. If ObjectType is set to INSTANCE, this parameter specifies the instance ID. If ObjectType is set to TENANT, this parameter specifies the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The configuration type. Valid values:</p>
     * <ul>
     * <li>INSTANCE: instance level.</li>
     * <li>TENANT: tenant level.</li>
     * </ul>
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
         * <p>The system configuration name. Valid values:</p>
         * <ul>
         * <li>callableTime: the outbound job window.</li>
         * <li>calleeDailyAttemptLimit: the maximum number of daily calls to a single callee number.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>callableTime</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configuration value.</p>
         * <ul>
         * <li><p>If Name is set to callableTime, a sample Value is [{&quot;beginTime&quot;:&quot;09:00:00&quot;,&quot;endTime&quot;:&quot;12:00:00&quot;},{&quot;beginTime&quot;:&quot;14:00:00&quot;,&quot;endTime&quot;:&quot;18:00:00&quot;}].</p>
         * </li>
         * <li><p>If Name is set to calleeDailyAttemptLimit, the Value is an integer from 1 to 50.</p>
         * </li>
         * </ul>
         * 
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
