// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <p>The new name of the instance.</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The new network information about the instance.</p>
     */
    @NameInMap("networkInfo")
    public UpdateInstanceRequestNetworkInfo networkInfo;

    /**
     * <p>The extended configurations of the instance.</p>
     */
    @NameInMap("productInfo")
    public UpdateInstanceRequestProductInfo productInfo;

    /**
     * <p>The new remarks on the instance.</p>
     */
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
        /**
         * <p>The IP address whitelist that allows access to the instance over the Internet.</p>
         * <br>
         * <p>*   If you do not configure an IP address whitelist, all IP addresses are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.</p>
         * <p>*   If you configure an IP address whitelist, only IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.</p>
         */
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
        /**
         * <p>The Internet information about the instance. This parameter takes effect only when the Internet access feature is enabled for the instance.</p>
         */
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
        /**
         * <p>Specifies whether to enable burst scaling for the instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>After you enable burst scaling, the system allows the actual messaging transactions per second (TPS) of the ApsaraMQ for RocketMQ instance to exceed the upper limit of the basic computing specification. You are charged for the extra TPS. For more information, see [Computing fee](~~427237~~).</p>
         * <br>
         * <p>> Only specific types of instances support burst scaling. For more information, see [Instance specifications](~~444715~~).</p>
         */
        @NameInMap("autoScaling")
        public Boolean autoScaling;

        /**
         * <p>The retention period of messages. Unit: hours.</p>
         * <br>
         * <p>For more information about the valid values, see the "Limits on resource quotas" section of the [Usage limits](~~440347~~) topic.</p>
         * <br>
         * <p>The storage of ApsaraMQ for RocketMQ messages is in serverless scaling mode. You are charged based on the actual used storage. You can adjust the storage retention period to reduce storage usage and costs. For more information, see [Storage fees](~~427238~~).</p>
         */
        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        /**
         * <p>The ratio of the number of messages that you can send to the number of messages that you can receive in the instance.</p>
         * <br>
         * <p>Value values: 0.25 to 1.</p>
         */
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
