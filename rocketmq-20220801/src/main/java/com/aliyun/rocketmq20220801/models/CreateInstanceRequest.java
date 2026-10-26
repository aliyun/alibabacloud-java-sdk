// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The access control information.</p>
     */
    @NameInMap("aclInfo")
    public CreateInstanceRequestAclInfo aclInfo;

    /**
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when the billing method of the instance is set to Subscription.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoRenew")
    public Boolean autoRenew;

    /**
     * <p>The Unified Auto Renewal Cycle. This parameter takes effect only when auto-renewal is enabled. Unit: months.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Monthly renewal: 1, 2, 3, 6, 12</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("autoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The commodity code.</p>
     * <p>&lt;props=&quot;china&quot;&gt;- ons_rmqsub_public_cn: subscription instance.</p>
     * <p>&lt;props=&quot;china&quot;&gt;- ons_rmqpost_public_cn: pay-as-you-go instance.</p>
     * <p>&lt;props=&quot;china&quot;&gt;- ons_rmqsrvlesspost_public_cn: serverless instance.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;- ons_rmqpost_public_intl: pay-as-you-go.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;- ons_rmqsub_public_intl: subscription.
     * &lt;props=&quot;intl&quot;&gt;- ons_rmqsrvlesspost_public_intl: serverless instance.
     * This parameter is required for serverless instances.</p>
     * 
     * <strong>example:</strong>
     * <p>ons_ rmqpost_public_cn</p>
     */
    @NameInMap("commodityCode")
    @Deprecated
    public String commodityCode;

    /**
     * <p>The name of the instance to be created.</p>
     * <p>If you do not specify this parameter, the instance ID is used as the instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-72u3048uxxx</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The network configuration information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("networkInfo")
    public CreateInstanceRequestNetworkInfo networkInfo;

    /**
     * <p>The billing method of the instance. ApsaraMQ for RocketMQ supports subscription and pay-as-you-go billing methods.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/427234.html">Billable methods</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The subscription duration. This parameter takes effect only when the billing method of the instance is set to Subscription.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Monthly subscription: 1, 2, 3, 4, 5, 6</p>
     * </li>
     * <li><p>Yearly subscription: 1, 2, 3</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("period")
    public Integer period;

    /**
     * <p>The minimum epoch unit of the subscription duration.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("periodUnit")
    public String periodUnit;

    /**
     * <p>The instance specification information.</p>
     */
    @NameInMap("productInfo")
    public CreateInstanceRequestProductInfo productInfo;

    /**
     * <p>The remarks of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>This is the remark for test.</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzy6pist7uuna</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The primary series encoding of the instance. For more information about the differences between primary series, see <a href="https://help.aliyun.com/document_detail/444722.html">Product selection</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("seriesCode")
    public String seriesCode;

    /**
     * <p>The service encoding of the instance. The service encoding for MSMQ for RocketMQ is rmq.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq</p>
     */
    @NameInMap("serviceCode")
    public String serviceCode;

    /**
     * <p>The sub-series encoding of the instance. For more information about the differences between sub-series, see <a href="https://help.aliyun.com/document_detail/444722.html">Product selection</a>.</p>
     * <p>If the primary series is set to ultimate (Platinum Edition), the sub-series can only be set to cluster_ha (Cluster High Availability Edition).</p>
     * <blockquote>
     * <p>Notice: After the instance is created, the sub-series cannot be changed.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster_ha</p>
     */
    @NameInMap("subSeriesCode")
    public String subSeriesCode;

    /**
     * <p>The list of resource tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<CreateInstanceRequestTags> tags;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. The client generates the value of this parameter, which must be unique among different requests. The token can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>c2c5d1274a8d4317a13bc5b0d4******</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAclInfo(CreateInstanceRequestAclInfo aclInfo) {
        this.aclInfo = aclInfo;
        return this;
    }
    public CreateInstanceRequestAclInfo getAclInfo() {
        return this.aclInfo;
    }

    public CreateInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    @Deprecated
    public CreateInstanceRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setNetworkInfo(CreateInstanceRequestNetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
        return this;
    }
    public CreateInstanceRequestNetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    public CreateInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateInstanceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateInstanceRequest setProductInfo(CreateInstanceRequestProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public CreateInstanceRequestProductInfo getProductInfo() {
        return this.productInfo;
    }

    public CreateInstanceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setSeriesCode(String seriesCode) {
        this.seriesCode = seriesCode;
        return this;
    }
    public String getSeriesCode() {
        return this.seriesCode;
    }

    public CreateInstanceRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CreateInstanceRequest setSubSeriesCode(String subSeriesCode) {
        this.subSeriesCode = subSeriesCode;
        return this;
    }
    public String getSubSeriesCode() {
        return this.subSeriesCode;
    }

    public CreateInstanceRequest setTags(java.util.List<CreateInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateInstanceRequestTags> getTags() {
        return this.tags;
    }

    public CreateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateInstanceRequestAclInfo extends TeaModel {
        /**
         * <p>Specifies whether to enable authentication-free access for VPC endpoints when the intelligent identity recognition type is used. Valid values:</p>
         * <ul>
         * <li>true: Enable authentication-free access.</li>
         * <li>false: Disable authentication-free access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("defaultVpcAuthFree")
        public Boolean defaultVpcAuthFree;

        public static CreateInstanceRequestAclInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestAclInfo self = new CreateInstanceRequestAclInfo();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestAclInfo setDefaultVpcAuthFree(Boolean defaultVpcAuthFree) {
            this.defaultVpcAuthFree = defaultVpcAuthFree;
            return this;
        }
        public Boolean getDefaultVpcAuthFree() {
            return this.defaultVpcAuthFree;
        }

    }

    public static class CreateInstanceRequestNetworkInfoInternetInfo extends TeaModel {
        /**
         * <p>The Internet bandwidth specification. Unit: Mb/s.</p>
         * <p>This parameter is required only when the Internet billing type is set to fixed bandwidth billing.</p>
         * <p>Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("flowOutBandwidth")
        public Integer flowOutBandwidth;

        /**
         * <p>The Internet billing type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uninvolved</p>
         */
        @NameInMap("flowOutType")
        public String flowOutType;

        /**
         * <p>Specifies whether to enable public network access.</p>
         * <p>By default, instances support VPC access. If you enable public network access, ApsaraMQ for RocketMQ charges fees for public network downstream bandwidth. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427240.html">Public network access fees</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        @NameInMap("internetSpec")
        public String internetSpec;

        /**
         * <p>The public network access IP whitelist. Only public endpoints support IP whitelist configuration. VPC endpoints do not support this feature.</p>
         * <ul>
         * <li>If no IP whitelist is configured, all IP address ranges are allowed to access the ApsaraMQ for RocketMQ server over the Internet by default.</li>
         * <li>If an IP whitelist is configured, only the IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ server over the Internet.</li>
         * </ul>
         */
        @NameInMap("ipWhitelist")
        @Deprecated
        public java.util.List<String> ipWhitelist;

        public static CreateInstanceRequestNetworkInfoInternetInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestNetworkInfoInternetInfo self = new CreateInstanceRequestNetworkInfoInternetInfo();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestNetworkInfoInternetInfo setFlowOutBandwidth(Integer flowOutBandwidth) {
            this.flowOutBandwidth = flowOutBandwidth;
            return this;
        }
        public Integer getFlowOutBandwidth() {
            return this.flowOutBandwidth;
        }

        public CreateInstanceRequestNetworkInfoInternetInfo setFlowOutType(String flowOutType) {
            this.flowOutType = flowOutType;
            return this;
        }
        public String getFlowOutType() {
            return this.flowOutType;
        }

        public CreateInstanceRequestNetworkInfoInternetInfo setInternetSpec(String internetSpec) {
            this.internetSpec = internetSpec;
            return this;
        }
        public String getInternetSpec() {
            return this.internetSpec;
        }

        @Deprecated
        public CreateInstanceRequestNetworkInfoInternetInfo setIpWhitelist(java.util.List<String> ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public java.util.List<String> getIpWhitelist() {
            return this.ipWhitelist;
        }

    }

    public static class CreateInstanceRequestNetworkInfoVpcInfoVSwitches extends TeaModel {
        /**
         * <p>The ID of the vSwitch associated with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6gwtbn6etadpv*******</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        public static CreateInstanceRequestNetworkInfoVpcInfoVSwitches build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestNetworkInfoVpcInfoVSwitches self = new CreateInstanceRequestNetworkInfoVpcInfoVSwitches();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestNetworkInfoVpcInfoVSwitches setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class CreateInstanceRequestNetworkInfoVpcInfo extends TeaModel {
        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp17hpmgz96tvnsdy6so</p>
         */
        @NameInMap("securityGroupIds")
        public String securityGroupIds;

        /**
         * <p>The ID of the vSwitch associated with the instance. If multiple vSwitches exist, separate them with vertical bars (|).</p>
         * <blockquote>
         * <p>After an ApsaraMQ for RocketMQ instance is created, the selected vSwitch cannot be changed. To modify the associated vSwitch, release the existing ApsaraMQ for RocketMQ instance and purchase a new one.</p>
         * </blockquote>
         * <p><notice>This field is not recommended. Use the vSwitches field instead.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6gwtbn6etadpv*******</p>
         */
        @NameInMap("vSwitchId")
        @Deprecated
        public String vSwitchId;

        /**
         * <p>The list of vSwitches.</p>
         * <blockquote>
         * <p>After an ApsaraMQ for RocketMQ instance is created, the selected vSwitch cannot be changed. To modify the associated vSwitch, release the existing ApsaraMQ for RocketMQ instance and purchase a new one.</p>
         * </blockquote>
         * <p><notice>This is a required field. Because the vSwitchId field is no longer recommended, use this field to configure vSwitches.</notice></p>
         */
        @NameInMap("vSwitches")
        public java.util.List<CreateInstanceRequestNetworkInfoVpcInfoVSwitches> vSwitches;

        /**
         * <p>The ID of the VPC to associate with the instance.</p>
         * <blockquote>
         * <p>After an ApsaraMQ for RocketMQ instance is created, the selected VPC cannot be changed. To modify the associated VPC, release the existing ApsaraMQ for RocketMQ instance and purchase a new one.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9qt50xhtj9krb******</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static CreateInstanceRequestNetworkInfoVpcInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestNetworkInfoVpcInfo self = new CreateInstanceRequestNetworkInfoVpcInfo();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestNetworkInfoVpcInfo setSecurityGroupIds(String securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public String getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        @Deprecated
        public CreateInstanceRequestNetworkInfoVpcInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateInstanceRequestNetworkInfoVpcInfo setVSwitches(java.util.List<CreateInstanceRequestNetworkInfoVpcInfoVSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<CreateInstanceRequestNetworkInfoVpcInfoVSwitches> getVSwitches() {
            return this.vSwitches;
        }

        public CreateInstanceRequestNetworkInfoVpcInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateInstanceRequestNetworkInfo extends TeaModel {
        /**
         * <p>The Internet configuration information.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("internetInfo")
        public CreateInstanceRequestNetworkInfoInternetInfo internetInfo;

        /**
         * <p>The VPC configuration information.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("vpcInfo")
        public CreateInstanceRequestNetworkInfoVpcInfo vpcInfo;

        public static CreateInstanceRequestNetworkInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestNetworkInfo self = new CreateInstanceRequestNetworkInfo();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestNetworkInfo setInternetInfo(CreateInstanceRequestNetworkInfoInternetInfo internetInfo) {
            this.internetInfo = internetInfo;
            return this;
        }
        public CreateInstanceRequestNetworkInfoInternetInfo getInternetInfo() {
            return this.internetInfo;
        }

        public CreateInstanceRequestNetworkInfo setVpcInfo(CreateInstanceRequestNetworkInfoVpcInfo vpcInfo) {
            this.vpcInfo = vpcInfo;
            return this;
        }
        public CreateInstanceRequestNetworkInfoVpcInfo getVpcInfo() {
            return this.vpcInfo;
        }

    }

    public static class CreateInstanceRequestProductInfo extends TeaModel {
        /**
         * <p>Specifies whether to enable adaptive elasticity. A value of true indicates that adaptive elasticity is enabled. A value of false indicates that adaptive elasticity is shutdown.</p>
         */
        @NameInMap("adaptiveElasticity")
        public Boolean adaptiveElasticity;

        /**
         * <p>Specifies whether to enable burstable elastic capacity beyond the specification.</p>
         * <p>After burstable elastic capacity is enabled, MSMQ for RocketMQ allows the instance to exceed the TPS limit of the base specification within a certain range. The portion that exceeds the base specification incurs additional elastic specification fees. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427237.html">Computing fees</a>.</p>
         * <blockquote>
         * <p>Only instances of certain specifications support burstable elastic capacity. For more information about supported instances, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoScaling")
        public Boolean autoScaling;

        /**
         * <p>The capacity pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>provisioned</p>
         */
        @NameInMap("capacityType")
        public String capacityType;

        /**
         * <p>The cross-region replication pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>async_cross_az</p>
         */
        @NameInMap("drReplicationMode")
        public String drReplicationMode;

        /**
         * <p>The message retention period. Unit: hours.</p>
         * <p>For the valid value range, see <a href="https://help.aliyun.com/document_detail/440347.html">Limits</a> &gt; Resource Quotas &gt; Message Retention Period.</p>
         * <p>The log broker in MSMQ for RocketMQ is fully serverless and elastic. Fees are charged based on the actual storage space used. You can control the storage capacity by adjusting the message retention period. For more information, see <a href="https://help.aliyun.com/document_detail/427238.html">Storage fees</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        /**
         * <p>The message sending and receiving computing specification. For more information about the TPS upper limit for message sending and receiving, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq.s2.2xlarge</p>
         */
        @NameInMap("msgProcessSpec")
        public String msgProcessSpec;

        /**
         * <p>The provisioned capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("provisionedCapacity")
        public Long provisionedCapacity;

        /**
         * <p>The ratio of message sending TPS to the total message sending and accepting TPS of the instance.</p>
         * <p>For example, if the TPS upper limit for message sending and accepting of the instance is 1000 per second and the message sending ratio is 0.8, the TPS upper limit for message sending is 800 per second and the TPS upper limit for message accepting is 200 per second.</p>
         * <p>Valid values: [0.05, 0.95]. Default value: 0.5.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("sendReceiveRatio")
        public Float sendReceiveRatio;

        /**
         * <p>Indicates whether storage encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("storageEncryption")
        public Boolean storageEncryption;

        /**
         * <p>The key for storage encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("storageSecretKey")
        public String storageSecretKey;

        /**
         * <p>Specifies whether to enable the message trace feature.</p>
         * <p>true: Enable the message trace feature.
         * false: Shutdown the message trace feature.
         * This parameter takes effect only for Serverless instances. If the message trace feature is enabled, message trace fees are incurred. For more information about billing, see the Serverless billing description. For pay-as-you-go and subscription instances, this parameter does not take effect. The message trace feature is supported by default regardless of whether this parameter is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("traceOn")
        public Boolean traceOn;

        public static CreateInstanceRequestProductInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestProductInfo self = new CreateInstanceRequestProductInfo();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestProductInfo setAdaptiveElasticity(Boolean adaptiveElasticity) {
            this.adaptiveElasticity = adaptiveElasticity;
            return this;
        }
        public Boolean getAdaptiveElasticity() {
            return this.adaptiveElasticity;
        }

        public CreateInstanceRequestProductInfo setAutoScaling(Boolean autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }
        public Boolean getAutoScaling() {
            return this.autoScaling;
        }

        public CreateInstanceRequestProductInfo setCapacityType(String capacityType) {
            this.capacityType = capacityType;
            return this;
        }
        public String getCapacityType() {
            return this.capacityType;
        }

        public CreateInstanceRequestProductInfo setDrReplicationMode(String drReplicationMode) {
            this.drReplicationMode = drReplicationMode;
            return this;
        }
        public String getDrReplicationMode() {
            return this.drReplicationMode;
        }

        public CreateInstanceRequestProductInfo setMessageRetentionTime(Integer messageRetentionTime) {
            this.messageRetentionTime = messageRetentionTime;
            return this;
        }
        public Integer getMessageRetentionTime() {
            return this.messageRetentionTime;
        }

        public CreateInstanceRequestProductInfo setMsgProcessSpec(String msgProcessSpec) {
            this.msgProcessSpec = msgProcessSpec;
            return this;
        }
        public String getMsgProcessSpec() {
            return this.msgProcessSpec;
        }

        public CreateInstanceRequestProductInfo setProvisionedCapacity(Long provisionedCapacity) {
            this.provisionedCapacity = provisionedCapacity;
            return this;
        }
        public Long getProvisionedCapacity() {
            return this.provisionedCapacity;
        }

        public CreateInstanceRequestProductInfo setSendReceiveRatio(Float sendReceiveRatio) {
            this.sendReceiveRatio = sendReceiveRatio;
            return this;
        }
        public Float getSendReceiveRatio() {
            return this.sendReceiveRatio;
        }

        public CreateInstanceRequestProductInfo setStorageEncryption(Boolean storageEncryption) {
            this.storageEncryption = storageEncryption;
            return this;
        }
        public Boolean getStorageEncryption() {
            return this.storageEncryption;
        }

        public CreateInstanceRequestProductInfo setStorageSecretKey(String storageSecretKey) {
            this.storageSecretKey = storageSecretKey;
            return this;
        }
        public String getStorageSecretKey() {
            return this.storageSecretKey;
        }

        public CreateInstanceRequestProductInfo setTraceOn(Boolean traceOn) {
            this.traceOn = traceOn;
            return this;
        }
        public Boolean getTraceOn() {
            return this.traceOn;
        }

    }

    public static class CreateInstanceRequestTags extends TeaModel {
        /**
         * <p>The key of the resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxKey</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxValue</p>
         */
        @NameInMap("value")
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
