// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <p>The access control information.</p>
     */
    @NameInMap("aclInfo")
    public UpdateInstanceRequestAclInfo aclInfo;

    /**
     * <p>The updated instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_instance</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The updated network information of the instance.</p>
     */
    @NameInMap("networkInfo")
    public UpdateInstanceRequestNetworkInfo networkInfo;

    /**
     * <p>The extension configurations of the instance.</p>
     */
    @NameInMap("productInfo")
    public UpdateInstanceRequestProductInfo productInfo;

    /**
     * <p>The updated remarks for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>This is the remark for test.</p>
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
         * <p>Indicates whether password-free access is enabled for VPC connections under the intelligent identity recognition type.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The public network access IP whitelist.</p>
         * <ul>
         * <li>If no IP whitelist is configured, all IP address ranges are allowed to access the ApsaraMQ for RocketMQ server over the public network by default.</li>
         * <li>If an IP whitelist is configured, only the IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ server over the public network.</li>
         * </ul>
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
         * <p>The public network information. This parameter is valid only when the public network access feature is enabled for the instance.</p>
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
         * <p>Specifies whether to enable the adaptive elasticity capability. A value of true indicates enabled, and a value of false indicates shutdown.</p>
         */
        @NameInMap("adaptiveElasticity")
        public Boolean adaptiveElasticity;

        /**
         * <p>Specifies whether to enable the burstable elastic capacity beyond the specification.</p>
         * <p>After the burstable elastic capacity is enabled, ApsaraMQ for RocketMQ allows the instance to exceed the TPS limit of the base specification within a certain range. The portion that exceeds the base specification incurs additional elastic specification fees. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427237.html">Computing fee</a>.</p>
         * <blockquote>
         * <p>Only instances of specific specifications support the burstable elastic specification capability. For more information about supported instances, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoScaling")
        public Boolean autoScaling;

        /**
         * <p>The message retention period. Unit: hours.</p>
         * <p>For the valid values, see <a href="https://help.aliyun.com/document_detail/440347.html">Limits</a> &gt; Resource Quotas &gt; Message retention period limit.</p>
         * <p>The log broker in ApsaraMQ for RocketMQ is fully serverless and elastic. Fees are charged based on the actual storage space used. You can control the storage capacity of messages by adjusting the message retention period. For more information, see <a href="https://help.aliyun.com/document_detail/427238.html">Storage fee</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        /**
         * <p>The ratio of messages sent to messages accepted.</p>
         * <p>Valid values: [0.25, 1]</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("sendReceiveRatio")
        public Float sendReceiveRatio;

        /**
         * <p>Specifies whether to enable the message trace feature.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;This parameter does not take effect. Regardless of whether this parameter is enabled, the instance supports the message trace feature by default.
         * &lt;props=&quot;china&quot;&gt;This parameter takes effect only for Serverless instances. If the message trace feature is enabled, message trace fees are incurred. For more information about billing, see <a href="https://help.aliyun.com/document_detail/2586280.html">Serverless billing</a>.
         * &lt;props=&quot;china&quot;&gt;For pay-as-you-go and subscription instances, this parameter does not take effect. The message trace feature is supported by default regardless of whether this parameter is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("traceOn")
        public Boolean traceOn;

        public static UpdateInstanceRequestProductInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestProductInfo self = new UpdateInstanceRequestProductInfo();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestProductInfo setAdaptiveElasticity(Boolean adaptiveElasticity) {
            this.adaptiveElasticity = adaptiveElasticity;
            return this;
        }
        public Boolean getAdaptiveElasticity() {
            return this.adaptiveElasticity;
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
