// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingInstanceId</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response result.</p>
     */
    @NameInMap("data")
    public GetInstanceResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter instanceId is mandatory for this action .</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID. Each request has a unique ID, which you can use to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>05AB7FBD-F1D3-5D87-BF78-BD782249****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceResponseBody setData(GetInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetInstanceResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceResponseBodyDataAccountInfo extends TeaModel {
        /**
         * <p>The username of the instance. When you use public network access, you must configure the username and password of the instance in the SDK code for identity verification.</p>
         * 
         * <strong>example:</strong>
         * <p>6W0xz2uPfiwp****</p>
         */
        @NameInMap("username")
        public String username;

        public static GetInstanceResponseBodyDataAccountInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataAccountInfo self = new GetInstanceResponseBodyDataAccountInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataAccountInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetInstanceResponseBodyDataAclInfo extends TeaModel {
        /**
         * <p>The authentication type of the instance. This parameter is deprecated. Use the aclTypes parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("aclType")
        @Deprecated
        public String aclType;

        /**
         * <p>The authentication types of the instance.</p>
         */
        @NameInMap("aclTypes")
        public java.util.List<String> aclTypes;

        /**
         * <p>Indicates whether the authentication-free in VPC feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("defaultVpcAuthFree")
        public Boolean defaultVpcAuthFree;

        public static GetInstanceResponseBodyDataAclInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataAclInfo self = new GetInstanceResponseBodyDataAclInfo();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public GetInstanceResponseBodyDataAclInfo setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public GetInstanceResponseBodyDataAclInfo setAclTypes(java.util.List<String> aclTypes) {
            this.aclTypes = aclTypes;
            return this;
        }
        public java.util.List<String> getAclTypes() {
            return this.aclTypes;
        }

        public GetInstanceResponseBodyDataAclInfo setDefaultVpcAuthFree(Boolean defaultVpcAuthFree) {
            this.defaultVpcAuthFree = defaultVpcAuthFree;
            return this;
        }
        public Boolean getDefaultVpcAuthFree() {
            return this.defaultVpcAuthFree;
        }

    }

    public static class GetInstanceResponseBodyDataExtConfig extends TeaModel {
        /**
         * <p>The authentication type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("aclType")
        public String aclType;

        /**
         * <p>Indicates whether burstable elastic capacity beyond the base specification is enabled.</p>
         * <p>This parameter takes effect only when the value of supportAutoScaling is enable, which means the instance supports enabling elastic capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoScaling")
        public Boolean autoScaling;

        /**
         * <p>The Internet bandwidth specification. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("flowOutBandwidth")
        public Integer flowOutBandwidth;

        /**
         * <p>The billing type for public network usage.</p>
         * 
         * <strong>example:</strong>
         * <p>payByBandwidth</p>
         */
        @NameInMap("flowOutType")
        public String flowOutType;

        /**
         * <p>Indicates whether public network access is enabled.</p>
         * <p>The instance supports VPC access by default. If public network access is enabled, ApsaraMQ for RocketMQ charges fees for public downstream bandwidth. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427240.html">Public network access fees</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("internetSpec")
        public String internetSpec;

        /**
         * <p>The message retention period. Unit: hours.</p>
         * <p>For the value range, see <a href="https://help.aliyun.com/document_detail/440347.html">Limits</a> &gt; Resource Quotas &gt; Message retention period.</p>
         * <p>The message storage of ApsaraMQ for RocketMQ is fully serverless and elastic. You are charged based on the actual storage space used. You can control the storage capacity by adjusting the message retention period. For more information, see <a href="https://help.aliyun.com/document_detail/427238.html">Storage fees</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        /**
         * <p>The message processing specification. For the TPS upper limit of message sending and receiving, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq.s2.2xlarge</p>
         */
        @NameInMap("msgProcessSpec")
        public String msgProcessSpec;

        /**
         * <p>The ratio of message sending to message receiving.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("sendReceiveRatio")
        public Float sendReceiveRatio;

        /**
         * <p>Indicates whether the instance supports enabling burstable elastic capacity beyond the base specification.</p>
         * <p>After burstable elastic capacity is enabled, ApsaraMQ for RocketMQ allows the instance to exceed the TPS limit of the base specification within a certain range. Additional elastic specification fees are charged for the portion that exceeds the base specification. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427237.html">Computing fees</a>.</p>
         * <blockquote>
         * <p>Only instances of specific specifications support burstable elastic capacity. For more information about supported instances, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportAutoScaling")
        public Boolean supportAutoScaling;

        public static GetInstanceResponseBodyDataExtConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataExtConfig self = new GetInstanceResponseBodyDataExtConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataExtConfig setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public GetInstanceResponseBodyDataExtConfig setAutoScaling(Boolean autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }
        public Boolean getAutoScaling() {
            return this.autoScaling;
        }

        public GetInstanceResponseBodyDataExtConfig setFlowOutBandwidth(Integer flowOutBandwidth) {
            this.flowOutBandwidth = flowOutBandwidth;
            return this;
        }
        public Integer getFlowOutBandwidth() {
            return this.flowOutBandwidth;
        }

        public GetInstanceResponseBodyDataExtConfig setFlowOutType(String flowOutType) {
            this.flowOutType = flowOutType;
            return this;
        }
        public String getFlowOutType() {
            return this.flowOutType;
        }

        public GetInstanceResponseBodyDataExtConfig setInternetSpec(String internetSpec) {
            this.internetSpec = internetSpec;
            return this;
        }
        public String getInternetSpec() {
            return this.internetSpec;
        }

        public GetInstanceResponseBodyDataExtConfig setMessageRetentionTime(Integer messageRetentionTime) {
            this.messageRetentionTime = messageRetentionTime;
            return this;
        }
        public Integer getMessageRetentionTime() {
            return this.messageRetentionTime;
        }

        public GetInstanceResponseBodyDataExtConfig setMsgProcessSpec(String msgProcessSpec) {
            this.msgProcessSpec = msgProcessSpec;
            return this;
        }
        public String getMsgProcessSpec() {
            return this.msgProcessSpec;
        }

        public GetInstanceResponseBodyDataExtConfig setSendReceiveRatio(Float sendReceiveRatio) {
            this.sendReceiveRatio = sendReceiveRatio;
            return this;
        }
        public Float getSendReceiveRatio() {
            return this.sendReceiveRatio;
        }

        public GetInstanceResponseBodyDataExtConfig setSupportAutoScaling(Boolean supportAutoScaling) {
            this.supportAutoScaling = supportAutoScaling;
            return this;
        }
        public Boolean getSupportAutoScaling() {
            return this.supportAutoScaling;
        }

    }

    public static class GetInstanceResponseBodyDataInstanceQuotas extends TeaModel {
        /**
         * <p>The free quota. Unit: count.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("freeCount")
        public Double freeCount;

        /**
         * <p>The quota name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TOPIC_COUNT</p>
         */
        @NameInMap("quotaName")
        public String quotaName;

        /**
         * <p>The total quota. Unit: count.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalCount")
        public Double totalCount;

        /**
         * <p>The used quota. Unit: count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("usedCount")
        public Double usedCount;

        public static GetInstanceResponseBodyDataInstanceQuotas build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataInstanceQuotas self = new GetInstanceResponseBodyDataInstanceQuotas();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataInstanceQuotas setFreeCount(Double freeCount) {
            this.freeCount = freeCount;
            return this;
        }
        public Double getFreeCount() {
            return this.freeCount;
        }

        public GetInstanceResponseBodyDataInstanceQuotas setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

        public GetInstanceResponseBodyDataInstanceQuotas setTotalCount(Double totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Double getTotalCount() {
            return this.totalCount;
        }

        public GetInstanceResponseBodyDataInstanceQuotas setUsedCount(Double usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Double getUsedCount() {
            return this.usedCount;
        }

    }

    public static class GetInstanceResponseBodyDataNetworkInfoEndpoints extends TeaModel {
        /**
         * <p>The associated PrivateLink endpoint instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bpxxx</p>
         */
        @NameInMap("endpointId")
        public String endpointId;

        /**
         * <p>The endpoint type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP_INTERNET</p>
         */
        @NameInMap("endpointType")
        public String endpointType;

        /**
         * <p>The endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-c4d2tbk****-vpc.cn-hangzhou.rmq.aliyuncs.com:8080</p>
         */
        @NameInMap("endpointUrl")
        public String endpointUrl;

        /**
         * <p>The IP whitelist for public network access. IP whitelists are supported only for Internet endpoints and are not supported for VPC endpoints.</p>
         * <ul>
         * <li>If no IP whitelist is configured, all IP address ranges are allowed to access the MSMQ for RocketMQ queue broker over the Internet by default.</li>
         * <li>If an IP whitelist is configured, only IP addresses in the whitelist are allowed to access the MSMQ for RocketMQ queue broker over the Internet.</li>
         * </ul>
         * <p>This field is no longer recommended. Use the internetInfo.ipWhitelist field instead.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.x.x/24</p>
         */
        @NameInMap("ipWhitelist")
        public java.util.List<String> ipWhitelist;

        public static GetInstanceResponseBodyDataNetworkInfoEndpoints build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataNetworkInfoEndpoints self = new GetInstanceResponseBodyDataNetworkInfoEndpoints();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataNetworkInfoEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public GetInstanceResponseBodyDataNetworkInfoEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public GetInstanceResponseBodyDataNetworkInfoEndpoints setEndpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        public GetInstanceResponseBodyDataNetworkInfoEndpoints setIpWhitelist(java.util.List<String> ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public java.util.List<String> getIpWhitelist() {
            return this.ipWhitelist;
        }

    }

    public static class GetInstanceResponseBodyDataNetworkInfoInternetInfo extends TeaModel {
        /**
         * <p>The Internet bandwidth specification. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("flowOutBandwidth")
        public Integer flowOutBandwidth;

        /**
         * <p>The billing type for public network usage.</p>
         * 
         * <strong>example:</strong>
         * <p>payByBandwidth</p>
         */
        @NameInMap("flowOutType")
        public String flowOutType;

        /**
         * <p>Indicates whether public network access is enabled.</p>
         * <p>The instance supports VPC access by default. If public network access is enabled, ApsaraMQ for RocketMQ charges fees for public downstream bandwidth. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427240.html">Public network access fees</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("internetSpec")
        public String internetSpec;

        /**
         * <p>The IP whitelist for public network access.</p>
         * <ul>
         * <li>If the IP whitelist is not configured, all IP address ranges are allowed to access the ApsaraMQ for RocketMQ broker over the public network by default.</li>
         * <li>If the IP whitelist is configured, only the IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ broker over the public network.</li>
         * </ul>
         */
        @NameInMap("ipWhitelist")
        public java.util.List<String> ipWhitelist;

        public static GetInstanceResponseBodyDataNetworkInfoInternetInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataNetworkInfoInternetInfo self = new GetInstanceResponseBodyDataNetworkInfoInternetInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataNetworkInfoInternetInfo setFlowOutBandwidth(Integer flowOutBandwidth) {
            this.flowOutBandwidth = flowOutBandwidth;
            return this;
        }
        public Integer getFlowOutBandwidth() {
            return this.flowOutBandwidth;
        }

        public GetInstanceResponseBodyDataNetworkInfoInternetInfo setFlowOutType(String flowOutType) {
            this.flowOutType = flowOutType;
            return this;
        }
        public String getFlowOutType() {
            return this.flowOutType;
        }

        public GetInstanceResponseBodyDataNetworkInfoInternetInfo setInternetSpec(String internetSpec) {
            this.internetSpec = internetSpec;
            return this;
        }
        public String getInternetSpec() {
            return this.internetSpec;
        }

        public GetInstanceResponseBodyDataNetworkInfoInternetInfo setIpWhitelist(java.util.List<String> ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public java.util.List<String> getIpWhitelist() {
            return this.ipWhitelist;
        }

    }

    public static class GetInstanceResponseBodyDataNetworkInfoVpcInfoVSwitches extends TeaModel {
        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6gwtbn6etadpvz7****</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static GetInstanceResponseBodyDataNetworkInfoVpcInfoVSwitches build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataNetworkInfoVpcInfoVSwitches self = new GetInstanceResponseBodyDataNetworkInfoVpcInfoVSwitches();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataNetworkInfoVpcInfoVSwitches setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetInstanceResponseBodyDataNetworkInfoVpcInfoVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetInstanceResponseBodyDataNetworkInfoVpcInfo extends TeaModel {
        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-hp35r2hc3a3sv8q2sb16</p>
         */
        @NameInMap("securityGroupIds")
        public String securityGroupIds;

        /**
         * <p>The ID of the vSwitch associated with the instance.</p>
         * <p><notice>This field is not recommended. Use the vSwitches field instead. For compatibility, this field currently returns only one vSwitch.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6gwtbn6etadpvz7****</p>
         */
        @NameInMap("vSwitchId")
        @Deprecated
        public String vSwitchId;

        /**
         * <p>The list of vSwitches.</p>
         */
        @NameInMap("vSwitches")
        public java.util.List<GetInstanceResponseBodyDataNetworkInfoVpcInfoVSwitches> vSwitches;

        /**
         * <p>The ID of the VPC associated with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6of9452b2pba82c****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static GetInstanceResponseBodyDataNetworkInfoVpcInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataNetworkInfoVpcInfo self = new GetInstanceResponseBodyDataNetworkInfoVpcInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataNetworkInfoVpcInfo setSecurityGroupIds(String securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public String getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        @Deprecated
        public GetInstanceResponseBodyDataNetworkInfoVpcInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetInstanceResponseBodyDataNetworkInfoVpcInfo setVSwitches(java.util.List<GetInstanceResponseBodyDataNetworkInfoVpcInfoVSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyDataNetworkInfoVpcInfoVSwitches> getVSwitches() {
            return this.vSwitches;
        }

        public GetInstanceResponseBodyDataNetworkInfoVpcInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetInstanceResponseBodyDataNetworkInfo extends TeaModel {
        /**
         * <p>The endpoint information.</p>
         */
        @NameInMap("endpoints")
        public java.util.List<GetInstanceResponseBodyDataNetworkInfoEndpoints> endpoints;

        /**
         * <p>The public network information of the instance.</p>
         */
        @NameInMap("internetInfo")
        public GetInstanceResponseBodyDataNetworkInfoInternetInfo internetInfo;

        /**
         * <p>The VPC information.</p>
         */
        @NameInMap("vpcInfo")
        public GetInstanceResponseBodyDataNetworkInfoVpcInfo vpcInfo;

        public static GetInstanceResponseBodyDataNetworkInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataNetworkInfo self = new GetInstanceResponseBodyDataNetworkInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataNetworkInfo setEndpoints(java.util.List<GetInstanceResponseBodyDataNetworkInfoEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyDataNetworkInfoEndpoints> getEndpoints() {
            return this.endpoints;
        }

        public GetInstanceResponseBodyDataNetworkInfo setInternetInfo(GetInstanceResponseBodyDataNetworkInfoInternetInfo internetInfo) {
            this.internetInfo = internetInfo;
            return this;
        }
        public GetInstanceResponseBodyDataNetworkInfoInternetInfo getInternetInfo() {
            return this.internetInfo;
        }

        public GetInstanceResponseBodyDataNetworkInfo setVpcInfo(GetInstanceResponseBodyDataNetworkInfoVpcInfo vpcInfo) {
            this.vpcInfo = vpcInfo;
            return this;
        }
        public GetInstanceResponseBodyDataNetworkInfoVpcInfo getVpcInfo() {
            return this.vpcInfo;
        }

    }

    public static class GetInstanceResponseBodyDataProductInfo extends TeaModel {
        /**
         * <p>The adaptive elasticity.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("adaptiveElasticity")
        public Boolean adaptiveElasticity;

        /**
         * <p>Indicates whether burstable elastic capacity beyond the base specification is enabled for seamless scaling.</p>
         * <p>This parameter takes effect only when the value of supportAutoScaling is enable, which means the instance supports enabling elastic capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoScaling")
        public Boolean autoScaling;

        /**
         * <p>The capacity mode.</p>
         * 
         * <strong>example:</strong>
         * <p>provisioned</p>
         */
        @NameInMap("capacityType")
        public String capacityType;

        /**
         * <p>The cross-region replication mode.</p>
         * 
         * <strong>example:</strong>
         * <p>async_cross_az</p>
         */
        @NameInMap("drReplicationMode")
        public String drReplicationMode;

        /**
         * <p>The maximum interval for scheduled messages. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3456000</p>
         */
        @NameInMap("maxDelayTime")
        public Integer maxDelayTime;

        /**
         * <p>The message retention period. Unit: hours.</p>
         * <p>For the value range, see <a href="https://help.aliyun.com/document_detail/440347.html">Limits</a> &gt; Resource Quotas &gt; Message retention period.</p>
         * <p>The message storage of ApsaraMQ for RocketMQ is fully serverless and elastic. You are charged based on the actual storage space used. You can control the storage capacity by adjusting the message retention period. For more information, see <a href="https://help.aliyun.com/document_detail/427238.html">Storage fees</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        /**
         * <p>The message processing specification. For the TPS upper limit of message sending and receiving, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
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
         * <p>3000</p>
         */
        @NameInMap("provisionedCapacity")
        public Long provisionedCapacity;

        /**
         * <p>The ratio of message sending to message receiving.</p>
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
         * <p>The storage encryption key.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("storageSecretKey")
        public String storageSecretKey;

        /**
         * <p>Indicates whether the burstable elastic capability beyond the base specification is enabled.</p>
         * <p>After the burstable elastic capability is enabled, ApsaraMQ for RocketMQ allows the instance to exceed the TPS limit of the base specification within a certain range. Additional elastic specification fees are charged for the portion that exceeds the base specification. For more information about billing, see <a href="https://help.aliyun.com/document_detail/427237.html">Computing capability fees</a>.</p>
         * <blockquote>
         * <p>Only instances of specific specifications support the burstable elastic capability. For more information about supported instances, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportAutoScaling")
        public Boolean supportAutoScaling;

        /**
         * <p>Indicates whether the message trace feature is enabled.</p>
         * <ul>
         * <li>true: The message trace feature is enabled.</li>
         * <li>false: The message trace feature is disabled.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;This parameter does not take effect. Instances support the message trace feature by default regardless of whether this parameter is enabled.
         * &lt;props=&quot;china&quot;&gt;This parameter takes effect only for Serverless instances. If the message trace feature is enabled, message trace fees are incurred. For more information about billing, see <a href="https://help.aliyun.com/document_detail/2586280.html">Serverless billing</a>.</p>
         * <p>&lt;props=&quot;china&quot;&gt;For pay-as-you-go and subscription instances, this parameter does not take effect. The message trace feature is supported by default regardless of whether this parameter is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("traceOn")
        public Boolean traceOn;

        public static GetInstanceResponseBodyDataProductInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataProductInfo self = new GetInstanceResponseBodyDataProductInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataProductInfo setAdaptiveElasticity(Boolean adaptiveElasticity) {
            this.adaptiveElasticity = adaptiveElasticity;
            return this;
        }
        public Boolean getAdaptiveElasticity() {
            return this.adaptiveElasticity;
        }

        public GetInstanceResponseBodyDataProductInfo setAutoScaling(Boolean autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }
        public Boolean getAutoScaling() {
            return this.autoScaling;
        }

        public GetInstanceResponseBodyDataProductInfo setCapacityType(String capacityType) {
            this.capacityType = capacityType;
            return this;
        }
        public String getCapacityType() {
            return this.capacityType;
        }

        public GetInstanceResponseBodyDataProductInfo setDrReplicationMode(String drReplicationMode) {
            this.drReplicationMode = drReplicationMode;
            return this;
        }
        public String getDrReplicationMode() {
            return this.drReplicationMode;
        }

        public GetInstanceResponseBodyDataProductInfo setMaxDelayTime(Integer maxDelayTime) {
            this.maxDelayTime = maxDelayTime;
            return this;
        }
        public Integer getMaxDelayTime() {
            return this.maxDelayTime;
        }

        public GetInstanceResponseBodyDataProductInfo setMessageRetentionTime(Integer messageRetentionTime) {
            this.messageRetentionTime = messageRetentionTime;
            return this;
        }
        public Integer getMessageRetentionTime() {
            return this.messageRetentionTime;
        }

        public GetInstanceResponseBodyDataProductInfo setMsgProcessSpec(String msgProcessSpec) {
            this.msgProcessSpec = msgProcessSpec;
            return this;
        }
        public String getMsgProcessSpec() {
            return this.msgProcessSpec;
        }

        public GetInstanceResponseBodyDataProductInfo setProvisionedCapacity(Long provisionedCapacity) {
            this.provisionedCapacity = provisionedCapacity;
            return this;
        }
        public Long getProvisionedCapacity() {
            return this.provisionedCapacity;
        }

        public GetInstanceResponseBodyDataProductInfo setSendReceiveRatio(Float sendReceiveRatio) {
            this.sendReceiveRatio = sendReceiveRatio;
            return this;
        }
        public Float getSendReceiveRatio() {
            return this.sendReceiveRatio;
        }

        public GetInstanceResponseBodyDataProductInfo setStorageEncryption(Boolean storageEncryption) {
            this.storageEncryption = storageEncryption;
            return this;
        }
        public Boolean getStorageEncryption() {
            return this.storageEncryption;
        }

        public GetInstanceResponseBodyDataProductInfo setStorageSecretKey(String storageSecretKey) {
            this.storageSecretKey = storageSecretKey;
            return this;
        }
        public String getStorageSecretKey() {
            return this.storageSecretKey;
        }

        public GetInstanceResponseBodyDataProductInfo setSupportAutoScaling(Boolean supportAutoScaling) {
            this.supportAutoScaling = supportAutoScaling;
            return this;
        }
        public Boolean getSupportAutoScaling() {
            return this.supportAutoScaling;
        }

        public GetInstanceResponseBodyDataProductInfo setTraceOn(Boolean traceOn) {
            this.traceOn = traceOn;
            return this;
        }
        public Boolean getTraceOn() {
            return this.traceOn;
        }

    }

    public static class GetInstanceResponseBodyDataSoftware extends TeaModel {
        /**
         * <p>The upgrade time window, in the format of HH:mm-HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>02:00-06:00</p>
         */
        @NameInMap("maintainTime")
        @Deprecated
        public String maintainTime;

        /**
         * <p>The software version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0-rmq-20230619-1</p>
         */
        @NameInMap("softwareVersion")
        public String softwareVersion;

        /**
         * <p>The upgrade method.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("upgradeMethod")
        public String upgradeMethod;

        public static GetInstanceResponseBodyDataSoftware build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataSoftware self = new GetInstanceResponseBodyDataSoftware();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public GetInstanceResponseBodyDataSoftware setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public GetInstanceResponseBodyDataSoftware setSoftwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }
        public String getSoftwareVersion() {
            return this.softwareVersion;
        }

        public GetInstanceResponseBodyDataSoftware setUpgradeMethod(String upgradeMethod) {
            this.upgradeMethod = upgradeMethod;
            return this;
        }
        public String getUpgradeMethod() {
            return this.upgradeMethod;
        }

    }

    public static class GetInstanceResponseBodyDataTags extends TeaModel {
        /**
         * <p>The key of the resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("value")
        public String value;

        public static GetInstanceResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataTags self = new GetInstanceResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The account information.</p>
         */
        @NameInMap("accountInfo")
        public GetInstanceResponseBodyDataAccountInfo accountInfo;

        /**
         * <p>The access control information.</p>
         */
        @NameInMap("aclInfo")
        public GetInstanceResponseBodyDataAclInfo aclInfo;

        /**
         * <p>Indicates whether auto-renewal is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("autoRenew")
        public Boolean autoRenew;

        /**
         * <p>Indicates whether auto-renewal is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("autoRenewPeriod")
        public Integer autoRenewPeriod;

        /**
         * <p>The BID of the sales channel for the commodity.</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("bid")
        public String bid;

        /**
         * <p>The commodity code of an MSMQ for RocketMQ 5.x series instance, such as ons_rmqsub_public_cn.</p>
         * 
         * <strong>example:</strong>
         * <p>ons_rmqsub_public_cn</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The time when the instance was created. The value is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 00:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The time when the instance expires. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-01 00:00:00</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <p><strong>[Deprecated]</strong> The extended configuration. This field is no longer recommended. Use the productInfo, internetInfo, and aclInfo fields instead.</p>
         */
        @NameInMap("extConfig")
        @Deprecated
        public GetInstanceResponseBodyDataExtConfig extConfig;

        /**
         * <p>The number of consumer groups.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("groupCount")
        public Long groupCount;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test instance</p>
         */
        @NameInMap("instanceName")
        public String instanceName;

        /**
         * <p>The capacity information.</p>
         */
        @NameInMap("instanceQuotas")
        public java.util.List<GetInstanceResponseBodyDataInstanceQuotas> instanceQuotas;

        /**
         * <p>The network information.</p>
         */
        @NameInMap("networkInfo")
        public GetInstanceResponseBodyDataNetworkInfo networkInfo;

        /**
         * <p>The payment type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The extended configuration of the instance.</p>
         */
        @NameInMap("productInfo")
        public GetInstanceResponseBodyDataProductInfo productInfo;

        /**
         * <p>The ID of the region where the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The time when the instance was released. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-07 00:00:00</p>
         */
        @NameInMap("releaseTime")
        public String releaseTime;

        /**
         * <p>The remarks for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>This is remark for instance.</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3tmjruyribi</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The primary series code of the instance. For differences between primary series, see <a href="https://help.aliyun.com/document_detail/444722.html">Product selection</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("seriesCode")
        public String seriesCode;

        /**
         * <p>The service code of the instance. The service code for MSMQ for RocketMQ is rmq.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq</p>
         */
        @NameInMap("serviceCode")
        public String serviceCode;

        /**
         * <p>The instance software information.</p>
         */
        @NameInMap("software")
        public GetInstanceResponseBodyDataSoftware software;

        /**
         * <p>The time when the instance was started. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 00:00:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The sub-series code of the instance. For differences between sub-series, see <a href="https://help.aliyun.com/document_detail/444722.html">Product selection</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster_ha</p>
         */
        @NameInMap("subSeriesCode")
        public String subSeriesCode;

        /**
         * <p>The resource tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<GetInstanceResponseBodyDataTags> tags;

        /**
         * <p>The number of topics.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("topicCount")
        public Long topicCount;

        /**
         * <p>The time when the instance was last modified. The value is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-02 00:00:00</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The ID of the user to whom the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111111111</p>
         */
        @NameInMap("userId")
        public String userId;

        public static GetInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyData self = new GetInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyData setAccountInfo(GetInstanceResponseBodyDataAccountInfo accountInfo) {
            this.accountInfo = accountInfo;
            return this;
        }
        public GetInstanceResponseBodyDataAccountInfo getAccountInfo() {
            return this.accountInfo;
        }

        public GetInstanceResponseBodyData setAclInfo(GetInstanceResponseBodyDataAclInfo aclInfo) {
            this.aclInfo = aclInfo;
            return this;
        }
        public GetInstanceResponseBodyDataAclInfo getAclInfo() {
            return this.aclInfo;
        }

        public GetInstanceResponseBodyData setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public GetInstanceResponseBodyData setAutoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public GetInstanceResponseBodyData setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public GetInstanceResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetInstanceResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetInstanceResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        @Deprecated
        public GetInstanceResponseBodyData setExtConfig(GetInstanceResponseBodyDataExtConfig extConfig) {
            this.extConfig = extConfig;
            return this;
        }
        public GetInstanceResponseBodyDataExtConfig getExtConfig() {
            return this.extConfig;
        }

        public GetInstanceResponseBodyData setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public GetInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetInstanceResponseBodyData setInstanceQuotas(java.util.List<GetInstanceResponseBodyDataInstanceQuotas> instanceQuotas) {
            this.instanceQuotas = instanceQuotas;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyDataInstanceQuotas> getInstanceQuotas() {
            return this.instanceQuotas;
        }

        public GetInstanceResponseBodyData setNetworkInfo(GetInstanceResponseBodyDataNetworkInfo networkInfo) {
            this.networkInfo = networkInfo;
            return this;
        }
        public GetInstanceResponseBodyDataNetworkInfo getNetworkInfo() {
            return this.networkInfo;
        }

        public GetInstanceResponseBodyData setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public GetInstanceResponseBodyData setProductInfo(GetInstanceResponseBodyDataProductInfo productInfo) {
            this.productInfo = productInfo;
            return this;
        }
        public GetInstanceResponseBodyDataProductInfo getProductInfo() {
            return this.productInfo;
        }

        public GetInstanceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceResponseBodyData setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public GetInstanceResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetInstanceResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetInstanceResponseBodyData setSeriesCode(String seriesCode) {
            this.seriesCode = seriesCode;
            return this;
        }
        public String getSeriesCode() {
            return this.seriesCode;
        }

        public GetInstanceResponseBodyData setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetInstanceResponseBodyData setSoftware(GetInstanceResponseBodyDataSoftware software) {
            this.software = software;
            return this;
        }
        public GetInstanceResponseBodyDataSoftware getSoftware() {
            return this.software;
        }

        public GetInstanceResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceResponseBodyData setSubSeriesCode(String subSeriesCode) {
            this.subSeriesCode = subSeriesCode;
            return this;
        }
        public String getSubSeriesCode() {
            return this.subSeriesCode;
        }

        public GetInstanceResponseBodyData setTags(java.util.List<GetInstanceResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public GetInstanceResponseBodyData setTopicCount(Long topicCount) {
            this.topicCount = topicCount;
            return this;
        }
        public Long getTopicCount() {
            return this.topicCount;
        }

        public GetInstanceResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetInstanceResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
