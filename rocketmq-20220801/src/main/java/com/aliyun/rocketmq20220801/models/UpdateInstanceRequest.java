// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    @NameInMap("extConfig")
    public UpdateInstanceRequestExtConfig extConfig;

    @NameInMap("instanceName")
    public String instanceName;

    @NameInMap("networkInfo")
    public UpdateInstanceRequestNetworkInfo networkInfo;

    @NameInMap("remark")
    public String remark;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setExtConfig(UpdateInstanceRequestExtConfig extConfig) {
        this.extConfig = extConfig;
        return this;
    }
    public UpdateInstanceRequestExtConfig getExtConfig() {
        return this.extConfig;
    }

    public UpdateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateInstanceRequest setNetworkInfo(UpdateInstanceRequestNetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
        return this;
    }
    public UpdateInstanceRequestNetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    public UpdateInstanceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class UpdateInstanceRequestExtConfig extends TeaModel {
        @NameInMap("autoScaling")
        public Boolean autoScaling;

        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        @NameInMap("sendReceiveRatio")
        public Float sendReceiveRatio;

        public static UpdateInstanceRequestExtConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestExtConfig self = new UpdateInstanceRequestExtConfig();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestExtConfig setAutoScaling(Boolean autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }
        public Boolean getAutoScaling() {
            return this.autoScaling;
        }

        public UpdateInstanceRequestExtConfig setMessageRetentionTime(Integer messageRetentionTime) {
            this.messageRetentionTime = messageRetentionTime;
            return this;
        }
        public Integer getMessageRetentionTime() {
            return this.messageRetentionTime;
        }

        public UpdateInstanceRequestExtConfig setSendReceiveRatio(Float sendReceiveRatio) {
            this.sendReceiveRatio = sendReceiveRatio;
            return this;
        }
        public Float getSendReceiveRatio() {
            return this.sendReceiveRatio;
        }

    }

    public static class UpdateInstanceRequestNetworkInfoEndpoints extends TeaModel {
        @NameInMap("endpointType")
        public String endpointType;

        @NameInMap("ipWhitelist")
        public String ipWhitelist;

        public static UpdateInstanceRequestNetworkInfoEndpoints build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestNetworkInfoEndpoints self = new UpdateInstanceRequestNetworkInfoEndpoints();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestNetworkInfoEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public UpdateInstanceRequestNetworkInfoEndpoints setIpWhitelist(String ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

    }

    public static class UpdateInstanceRequestNetworkInfo extends TeaModel {
        @NameInMap("endpoints")
        public java.util.List<UpdateInstanceRequestNetworkInfoEndpoints> endpoints;

        public static UpdateInstanceRequestNetworkInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestNetworkInfo self = new UpdateInstanceRequestNetworkInfo();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestNetworkInfo setEndpoints(java.util.List<UpdateInstanceRequestNetworkInfoEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<UpdateInstanceRequestNetworkInfoEndpoints> getEndpoints() {
            return this.endpoints;
        }

    }

}
