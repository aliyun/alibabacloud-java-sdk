// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    @NameInMap("instanceName")
    public String instanceName;

    @NameInMap("networkInfo")
    public UpdateInstanceRequestNetworkInfo networkInfo;

    @NameInMap("productInfo")
    public UpdateInstanceRequestProductInfo productInfo;

    @NameInMap("remark")
    public String remark;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
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

    public UpdateInstanceRequest setProductInfo(UpdateInstanceRequestProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public UpdateInstanceRequestProductInfo getProductInfo() {
        return this.productInfo;
    }

    public UpdateInstanceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public static class UpdateInstanceRequestNetworkInfoInternetInfo extends TeaModel {
        @NameInMap("ipWhitelist")
        public java.util.List<String> ipWhitelist;

        public static UpdateInstanceRequestNetworkInfoInternetInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestNetworkInfoInternetInfo self = new UpdateInstanceRequestNetworkInfoInternetInfo();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestNetworkInfoInternetInfo setIpWhitelist(java.util.List<String> ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public java.util.List<String> getIpWhitelist() {
            return this.ipWhitelist;
        }

    }

    public static class UpdateInstanceRequestNetworkInfo extends TeaModel {
        @NameInMap("internetInfo")
        public UpdateInstanceRequestNetworkInfoInternetInfo internetInfo;

        public static UpdateInstanceRequestNetworkInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestNetworkInfo self = new UpdateInstanceRequestNetworkInfo();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestNetworkInfo setInternetInfo(UpdateInstanceRequestNetworkInfoInternetInfo internetInfo) {
            this.internetInfo = internetInfo;
            return this;
        }
        public UpdateInstanceRequestNetworkInfoInternetInfo getInternetInfo() {
            return this.internetInfo;
        }

    }

    public static class UpdateInstanceRequestProductInfo extends TeaModel {
        @NameInMap("autoScaling")
        public Boolean autoScaling;

        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        @NameInMap("sendReceiveRatio")
        public Float sendReceiveRatio;

        public static UpdateInstanceRequestProductInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestProductInfo self = new UpdateInstanceRequestProductInfo();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestProductInfo setAutoScaling(Boolean autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }
        public Boolean getAutoScaling() {
            return this.autoScaling;
        }

        public UpdateInstanceRequestProductInfo setMessageRetentionTime(Integer messageRetentionTime) {
            this.messageRetentionTime = messageRetentionTime;
            return this;
        }
        public Integer getMessageRetentionTime() {
            return this.messageRetentionTime;
        }

        public UpdateInstanceRequestProductInfo setSendReceiveRatio(Float sendReceiveRatio) {
            this.sendReceiveRatio = sendReceiveRatio;
            return this;
        }
        public Float getSendReceiveRatio() {
            return this.sendReceiveRatio;
        }

    }

}
