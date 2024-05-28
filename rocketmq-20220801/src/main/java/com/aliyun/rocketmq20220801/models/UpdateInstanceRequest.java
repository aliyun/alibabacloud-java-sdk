// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <p>The access control list for the instance.</p>
     */
    @NameInMap("aclInfo")
    public UpdateInstanceRequestAclInfo aclInfo;

    /**
     * <p>The updated name of the instance.</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The updated network information about the instance.</p>
     */
    @NameInMap("networkInfo")
    public UpdateInstanceRequestNetworkInfo networkInfo;

    /**
     * <p>Additional configurations of the instance.</p>
     */
    @NameInMap("productInfo")
    public UpdateInstanceRequestProductInfo productInfo;

    /**
     * <p>The updated description of the instance.</p>
     */
    @NameInMap("remark")
    public String remark;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setAclInfo(UpdateInstanceRequestAclInfo aclInfo) {
        this.aclInfo = aclInfo;
        return this;
    }
    public UpdateInstanceRequestAclInfo getAclInfo() {
        return this.aclInfo;
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

    public static class UpdateInstanceRequestAclInfo extends TeaModel {
        /**
         * <p>The authentication type of the instance.</p>
         */
        @NameInMap("aclTypes")
        public java.util.List<String> aclTypes;

        /**
         * <p>Indicates whether the authentication-free in VPCs feature is enabled.</p>
         * <p>Indicates whether the authentication-free in VPCs feature is enabled.</p>
         * <p>Valid values:</p>
         * <p>- true</p>
         * <p>- false</p>
         */
        @NameInMap("defaultVpcAuthFree")
        public Boolean defaultVpcAuthFree;

        public static UpdateInstanceRequestAclInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestAclInfo self = new UpdateInstanceRequestAclInfo();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestAclInfo setAclTypes(java.util.List<String> aclTypes) {
            this.aclTypes = aclTypes;
            return this;
        }
        public java.util.List<String> getAclTypes() {
            return this.aclTypes;
        }

        public UpdateInstanceRequestAclInfo setDefaultVpcAuthFree(Boolean defaultVpcAuthFree) {
            this.defaultVpcAuthFree = defaultVpcAuthFree;
            return this;
        }
        public Boolean getDefaultVpcAuthFree() {
            return this.defaultVpcAuthFree;
        }

    }

    public static class UpdateInstanceRequestNetworkInfoInternetInfo extends TeaModel {
        /**
         * <p>The whitelist that includes the IP addresses that are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.</p>
         * <br>
         * <p>*   If you do not configure an IP address whitelist, all CIDR blocks are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.</p>
         * <p>*   If you configure an IP address whitelist, only the IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.</p>
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
         * <p>The information about the Internet over which the instance is accessed. This parameter takes effect only if the Internet access feature is enabled for the instance.</p>
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
         * <p>Specifies whether to enable the elastic transactions per second (TPS) feature for the instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>After you enable the elastic TPS feature for an ApsaraMQ for RocketMQ instance, you can use a specific number of TPS that exceeds the specification limit. You are charged for using the elastic TPS feature. For more information, see [Computing fees](https://help.aliyun.com/document_detail/427237.html).</p>
         * <br>
         * <p>>  The elastic TPS feature is supported only by specific instance editions. For more information, see [Instance editions](https://help.aliyun.com/document_detail/444715.html).</p>
         */
        @NameInMap("autoScaling")
        public Boolean autoScaling;

        /**
         * <p>The retention period of messages. Unit: hours.</p>
         * <br>
         * <p>For information about the valid values of this parameter, see the "Limits on resource quotas" section of the [Limits](https://help.aliyun.com/document_detail/440347.html) topic.</p>
         * <br>
         * <p>ApsaraMQ for RocketMQ supports serverless scaling of message storage. You are charged storage fees based on your actual storage usage. You can change the retention period of messages to manage storage capacity. For more information, see [Storage fees](https://help.aliyun.com/document_detail/427238.html).</p>
         */
        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        /**
         * <p>The ratio of the number of messages that you can send to the number of messages that you can receive on the instance.</p>
         * <br>
         * <p>Value values: 0.25 to 1.</p>
         */
        @NameInMap("sendReceiveRatio")
        public Float sendReceiveRatio;

        /**
         * <p>Specifies whether to enable the message trace feature.</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>This parameter is not in use. By default, the message trace feature is enabled for ApsaraMQ for RocketMQ instances, regardless of whether this parameter is configured.</p>
         */
        @NameInMap("traceOn")
        public Boolean traceOn;

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

        public UpdateInstanceRequestProductInfo setTraceOn(Boolean traceOn) {
            this.traceOn = traceOn;
            return this;
        }
        public Boolean getTraceOn() {
            return this.traceOn;
        }

    }

}
