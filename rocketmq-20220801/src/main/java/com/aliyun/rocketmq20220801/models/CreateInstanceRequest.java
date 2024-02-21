// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal for the instance. This parameter takes effect only if you set PaymentType to Subscription.</p>
     * <br>
     * <p>*   true: enable</p>
     * <p>*   false: disable</p>
     */
    @NameInMap("autoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal cycle of the instance. This parameter takes effect only if you set autoRenew to true. Unit: months.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Monthly renewal: 1, 2, 3, 6, and 12</p>
     */
    @NameInMap("autoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The commodity code.</p>
     * <br>
     * <p>*   ons_rmqpost_public_intl: pay-as-you-go</p>
     * <p>*   ons_rmqsub_public_intl: subscription</p>
     */
    @NameInMap("commodityCode")
    public String commodityCode;

    /**
     * <p>The name of the instance that you want to create.</p>
     * <br>
     * <p>If you do not configure this parameter, the instance ID is used as the instance name.</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The network configurations.</p>
     */
    @NameInMap("networkInfo")
    public CreateInstanceRequestNetworkInfo networkInfo;

    /**
     * <p>The billing method of the instance. ApsaraMQ for RocketMQ supports the subscription and pay-as-you-go billing methods.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   PayAsYouGo: This billing method allows you to use resources before you pay for the resources.</p>
     * <p>*   Subscription: This billing method allows you to use resources after you pay for the resources.</p>
     * <br>
     * <p>For more information, see [Billing methods](~~427234~~).</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The subscription duration of the instance. This parameter takes effect only if you set PaymentType to Subscription.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Monthly subscription: 1, 2, 3, 4, 5, and 6</p>
     * <p>*   Yearly subscription: 1, 2, and 3</p>
     */
    @NameInMap("period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Month</p>
     * <p>*   Year</p>
     */
    @NameInMap("periodUnit")
    public String periodUnit;

    /**
     * <p>The information about the instance specifications.</p>
     */
    @NameInMap("productInfo")
    public CreateInstanceRequestProductInfo productInfo;

    /**
     * <p>The instance description.</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The primary edition of the instance. For information about the differences between primary edition instances, see [Instance selection](~~444722~~).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   standard: Standard Edition</p>
     * <p>*   ultimate: Enterprise Platinum Edition</p>
     * <p>*   professional: Professional Edition</p>
     * <br>
     * <p>>  After an instance is created, you can only upgrade the primary edition of the instance. The following editions are sorted in ascending order: Standard Edition, Professional Edition, Enterprise Platinum Edition. For example, you can upgrade an instance of Standard Edition to Professional Edition, but cannot downgrade an instance of Professional Edition to Standard Edition.</p>
     */
    @NameInMap("seriesCode")
    public String seriesCode;

    /**
     * <p>The code of the service to which the instance belongs. The service code of ApsaraMQ for RocketMQ is rmq.</p>
     */
    @NameInMap("serviceCode")
    public String serviceCode;

    /**
     * <p>The sub-category edition of the instance. For information about the differences between sub-category edition instances, see [Instance selection](~~444722~~).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   cluster_ha: High-availability Cluster Edition</p>
     * <p>*   single_node: Standalone Edition</p>
     * <br>
     * <p>If you set seriesCode to ultimate, you can set this parameter to only cluster_ha.</p>
     * <br>
     * <p>>  After an instance is created, you cannot change the sub-category edition of the instance.</p>
     */
    @NameInMap("subSeriesCode")
    public String subSeriesCode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value of this parameter, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
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

    public CreateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateInstanceRequestNetworkInfoInternetInfo extends TeaModel {
        /**
         * <p>The Internet bandwidth. Unit: MB/s.</p>
         * <br>
         * <p>This parameter is required only if you set flowOutType to payByBandwidth.</p>
         * <br>
         * <p>Valid values: 1 to 1000.</p>
         */
        @NameInMap("flowOutBandwidth")
        public Integer flowOutBandwidth;

        /**
         * <p>The billing method of Internet usage.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   payByBandwidth: pay-by-bandwidth. If Internet access is enabled for an instance, specify this value for the parameter.</p>
         * <p>*   uninvolved: No billing method is involved. If Internet access is disabled for an instance, specify this value for the parameter.</p>
         */
        @NameInMap("flowOutType")
        public String flowOutType;

        /**
         * <p>Specifies whether to enable the Internet access feature.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   enable</p>
         * <p>*   disable</p>
         * <br>
         * <p>By default, ApsaraMQ for RocketMQ allows you to access instances in VPCs. If you enable Internet access for an instance, you can access the instance over the Internet. After you enable this feature, you are charged for outbound Internet traffic. For more information, see [Internet access fee](~~427240~~).</p>
         */
        @NameInMap("internetSpec")
        public String internetSpec;

        /**
         * <p>The whitelist that includes the IP addresses that are allowed to access the ApsaraMQ for RocketMQ broker over the Internet. This parameter can be configured only if you use a public endpoint to access the instance.</p>
         * <br>
         * <p>*   If you do not configure an IP address whitelist, all CIDR blocks are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.</p>
         * <p>*   If configure an IP address whitlist, only the IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.</p>
         */
        @NameInMap("ipWhitelist")
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

        public CreateInstanceRequestNetworkInfoInternetInfo setIpWhitelist(java.util.List<String> ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public java.util.List<String> getIpWhitelist() {
            return this.ipWhitelist;
        }

    }

    public static class CreateInstanceRequestNetworkInfoVpcInfo extends TeaModel {
        /**
         * <p>The ID of the security group to which the instance belongs.</p>
         */
        @NameInMap("securityGroupIds")
        public String securityGroupIds;

        /**
         * <p>The ID of the vSwitch with which you want to associate the instance.</p>
         * <br>
         * <p>>  After an ApsaraMQ for RocketMQ instance is created, you cannot change the vSwitch with which the instance is associated. If you want to change the vSwitch with which the instance is associated, you must release the instance and purchase a new instance.</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC in which you want to deploy the instance.</p>
         * <br>
         * <p>>  After an ApsaraMQ for RocketMQ instance is created, you cannot change the VPC in which the instance is deployed. If you want to change the VPC in which the instance is deployed, you must release the instance and create a new instance.</p>
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

        public CreateInstanceRequestNetworkInfoVpcInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
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
         * <p>The Internet-related configurations.</p>
         */
        @NameInMap("internetInfo")
        public CreateInstanceRequestNetworkInfoInternetInfo internetInfo;

        /**
         * <p>The virtual private cloud (VPC)-related configurations.</p>
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
         * <p>Specifies whether to enable the elastic TPS feature for the instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: enable</p>
         * <p>*   false: disable</p>
         * <br>
         * <p>After you enable the elastic TPS feature for an ApsaraMQ for RocketMQ instance, you can use a specific number of TPS that exceeds the specification limit. You are charged for using the elastic TPS feature. For more information, see [Computing fees](~~427237~~).</p>
         * <br>
         * <p>>  The elastic TPS feature is supported only by instances of specific editions. For more information, see [Instance editions](~~444715~~).</p>
         */
        @NameInMap("autoScaling")
        public Boolean autoScaling;

        /**
         * <p>The billing method.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   provisioned</p>
         * <p>*   ondemand</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>This parameter is no longer used. You do not need to configure this parameter.</p>
         */
        @NameInMap("intranetSpec")
        public String intranetSpec;

        /**
         * <p>The retention period of messages. Unit: hours.</p>
         * <br>
         * <p>For information about the valid values of this parameter, see the "Limits on resource quotas" section of the [Limits](~~440347~~) topic.</p>
         * <br>
         * <p>ApsaraMQ for RocketMQ supports serverless scaling of message storage. You are charged storage fees based on your actual storage usage. You can change the retention period of messages to manage storage capacity. For more information, see [Storage fees](~~427238~~).</p>
         */
        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        /**
         * <p>The computing specification that specifies the messaging transactions per second (TPS) of the instance. For information about computing specification limits, see [Instance specifications](~~444715~~).</p>
         */
        @NameInMap("msgProcessSpec")
        public String msgProcessSpec;

        /**
         * <p>The proportion of message sending TPS to the messaging TPS on the instance.</p>
         * <br>
         * <p>For example, you create an instance whose peak messaging TPS is specified as 1,000 and the proportion of message sending TPS is specified as 0.8. In this case, the peak message sending TPS is 800 and the peak message receiving TPS is 200 on the instance.</p>
         * <br>
         * <p>Valid values: 0 to 1. Default value: 0.5.</p>
         */
        @NameInMap("sendReceiveRatio")
        public Float sendReceiveRatio;

        public static CreateInstanceRequestProductInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestProductInfo self = new CreateInstanceRequestProductInfo();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestProductInfo setAutoScaling(Boolean autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }
        public Boolean getAutoScaling() {
            return this.autoScaling;
        }

        public CreateInstanceRequestProductInfo setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateInstanceRequestProductInfo setIntranetSpec(String intranetSpec) {
            this.intranetSpec = intranetSpec;
            return this;
        }
        public String getIntranetSpec() {
            return this.intranetSpec;
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

        public CreateInstanceRequestProductInfo setSendReceiveRatio(Float sendReceiveRatio) {
            this.sendReceiveRatio = sendReceiveRatio;
            return this;
        }
        public Float getSendReceiveRatio() {
            return this.sendReceiveRatio;
        }

    }

}
