// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingInstanceId</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
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
     * <p>The HTTP status code returned.</p>
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
     * <p>The ID of the request. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>05AB7FBD-F1D3-5D87-BF78-BD782249****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
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
         * <p>The username of the instance. If you access a ApsaraMQ for RocketMQ instance over the Internet, you must configure the username and password of the instance in the SDK code for authentication.</p>
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
         * <p>The authentication type of the instance. This parameter is no longer in use. We recommend that you configure aclTypes.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>default: intelligent identity authentication</p>
         * </li>
         * <li><p>apache_acl:access control list (ACL) identity authentication**</p>
         * </li>
         * </ul>
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
         * <p>Indicates whether the authentication-free in VPCs feature is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>default: intelligent authentication</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("aclType")
        public String aclType;

        /**
         * <p>Specifies whether to enable the elastic TPS feature for the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: enable</li>
         * <li>false: disable</li>
         * </ul>
         * <p>This parameter is valid only when the supportAutoScaling parameter is set to enable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoScaling")
        public Boolean autoScaling;

        /**
         * <p>The Internet bandwidth. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("flowOutBandwidth")
        public Integer flowOutBandwidth;

        /**
         * <p>The metering method for Internet usage.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PayByTraffic: pay-by-traffic</li>
         * <li>paybybandwidth: pay-by-bandwidth</li>
         * <li>uninvolved: N/A</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>payByBandwidth</p>
         */
        @NameInMap("flowOutType")
        public String flowOutType;

        /**
         * <p>Specifies whether to enable the Internet access feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>enable</li>
         * <li>disable</li>
         * </ul>
         * <p>By default, ApsaraMQ for RocketMQ instances are accessed in virtual private clouds (VPCs). If you enable the Internet access feature, you are charged for Internet outbound bandwidth. For more information, see <a href="https://help.aliyun.com/document_detail/427240.html">Internet access fee</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("internetSpec")
        public String internetSpec;

        /**
         * <p>The retention period of messages. Unit: hours.</p>
         * <p>For information about the valid values of this parameter, see the &quot;Limits on resource quotas&quot; section in <a href="https://help.aliyun.com/document_detail/440347.html">Usage limits</a>.</p>
         * <p>The storage of messages in ApsaraMQ for RocketMQ is serverless and scalable. You are charged for message storage based on your actual usage. You can change the retention period of messages to adjust storage capacity. For more information, see <a href="https://help.aliyun.com/document_detail/427238.html">Storage fee</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        /**
         * <p>The computing specification that is used to send and receive messages. For information about the upper limit of TPS, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq.s2.2xlarge</p>
         */
        @NameInMap("msgProcessSpec")
        public String msgProcessSpec;

        /**
         * <p>The ratio between sent messages and received messages in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("sendReceiveRatio")
        public Float sendReceiveRatio;

        /**
         * <p>Specifies whether the elastic TPS feature is supported by the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: enable</li>
         * <li>false: disable</li>
         * </ul>
         * <p>After you enable the elastic TPS feature for a ApsaraMQ for RocketMQ instance, you can use a specific amount of TPS that exceeds the specification limit. You are charged for the elastic TPS feature. For more information, see <a href="https://help.aliyun.com/document_detail/427237.html">Computing fee</a>.</p>
         * <blockquote>
         * <p>The elastic TPS feature is supported only by specific instance editions. For more information, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
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
         * <p>The number of topics that are free of charge on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("freeCount")
        public Double freeCount;

        /**
         * <p>The quota name.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>TOPIC_COUNT: the number of topics that can be created on the instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TOPIC_COUNT</p>
         */
        @NameInMap("quotaName")
        public String quotaName;

        /**
         * <p>The total number of topics on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalCount")
        public Double totalCount;

        /**
         * <p>The number of used topics on the instance.</p>
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
         * <p>The type of the endpoint that is used to access the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>TCP_VPC: VPC endpoint</li>
         * <li>TCP_INTERNET:public endpoint</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP_INTERNET</p>
         */
        @NameInMap("endpointType")
        public String endpointType;

        /**
         * <p>The endpoint that is used to access the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-c4d2tbk****-vpc.cn-hangzhou.rmq.aliyuncs.com:8080</p>
         */
        @NameInMap("endpointUrl")
        public String endpointUrl;

        /**
         * <p>The whitelist that includes the IP addresses that are allowed to access the ApsaraMQ for RocketMQ broker over the Internet. This parameter can be configured only if you use the public endpoint to access the instance.</p>
         * <ul>
         * <li>If you do not configure an IP address whitelist, all CIDR blocks are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.</li>
         * <li>If you configure an IP address whitelist, only the IP addresses in the whitelist are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.</li>
         * </ul>
         * <p>We recommend that you configure internetInfo.ipWhitelist instead of this parameter.</p>
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
         * <p>The Internet bandwidth. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("flowOutBandwidth")
        public Integer flowOutBandwidth;

        /**
         * <p>The metering method for Internet usage.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth. If the Internet access feature is enabled, specify this value for the parameter.</li>
         * <li>uninvolved: N/A. If the Internet access feature is not enabled, specify this value for the parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>payByBandwidth</p>
         */
        @NameInMap("flowOutType")
        public String flowOutType;

        /**
         * <p>Specifies whether to enable the Internet access feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>enable</li>
         * <li>disable</li>
         * </ul>
         * <p>By default, ApsaraMQ for RocketMQ instances are accessed in virtual private clouds (VPCs). If you enable the Internet access feature, you are charged for Internet outbound bandwidth. For more information, see <a href="https://help.aliyun.com/document_detail/427240.html">Internet access fee</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("internetSpec")
        public String internetSpec;

        /**
         * <p>The whitelist that includes the IP addresses that are allowed to access the ApsaraMQ for RocketMQ broker.</p>
         * <ul>
         * <li>If this parameter is not configured, all IP addresses are allowed to access the ApsaraMQ for RocketMQ broker over the Internet.</li>
         * <li>If this parameter is configured, only the IP addresses that are included in the whitelist can access the ApsaraMQ for RocketMQ broker over the Internet.</li>
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
        @NameInMap("vSwitchId")
        public String vSwitchId;

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
         * <p>The ID of the vSwitch with which the instance is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6gwtbn6etadpvz7****</p>
         */
        @NameInMap("vSwitchId")
        @Deprecated
        public String vSwitchId;

        @NameInMap("vSwitches")
        public java.util.List<GetInstanceResponseBodyDataNetworkInfoVpcInfoVSwitches> vSwitches;

        /**
         * <p>The ID of the VPC with which the instance is associated.</p>
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
         * <p>The information about endpoints.</p>
         */
        @NameInMap("endpoints")
        public java.util.List<GetInstanceResponseBodyDataNetworkInfoEndpoints> endpoints;

        /**
         * <p>The information about the Internet.</p>
         */
        @NameInMap("internetInfo")
        public GetInstanceResponseBodyDataNetworkInfoInternetInfo internetInfo;

        /**
         * <p>The virtual private cloud (VPC) information.</p>
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
         * <p>Specifies whether to enable the elastic TPS feature for the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: enable</li>
         * <li>false: disable</li>
         * </ul>
         * <p>This parameter is valid only when the supportAutoScaling parameter is set to enable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoScaling")
        public Boolean autoScaling;

        /**
         * <p>The retention period of messages. Unit: hours.</p>
         * <p>For information about the valid values of this parameter, see the &quot;Limits on resource quotas&quot; section in <a href="https://help.aliyun.com/document_detail/440347.html">Usage limits</a>.</p>
         * <p>The storage of messages in ApsaraMQ for RocketMQ is serverless and scalable. You are charged for message storage based on your actual usage. You can change the retention period of messages to adjust storage capacity. For more information, see <a href="https://help.aliyun.com/document_detail/427238.html">Storage fee</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        /**
         * <p>The computing specification that is used to send and receive messages. For information about the upper limit of TPS, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq.s2.2xlarge</p>
         */
        @NameInMap("msgProcessSpec")
        public String msgProcessSpec;

        /**
         * <p>The ratio between sent messages and received messages in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("sendReceiveRatio")
        public Float sendReceiveRatio;

        /**
         * <p>Specifies whether to enable the elastic TPS feature for the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: enable</li>
         * <li>false: disable</li>
         * </ul>
         * <p>After you enable the elastic TPS feature for a ApsaraMQ for RocketMQ instance, you can use a specific amount of TPS that exceeds the specification limit. You are charged for the elastic TPS feature. For more information, see <a href="https://help.aliyun.com/document_detail/427237.html">Computing fee</a>.</p>
         * <blockquote>
         * <p>The elastic TPS feature is supported by only specific instance editions. For more information, see <a href="https://help.aliyun.com/document_detail/444715.html">Instance specifications</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportAutoScaling")
        public Boolean supportAutoScaling;

        /**
         * <p>Indicates whether the message trace feature is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is not in use. By default, the message trace feature is enabled for ApsaraMQ for RocketMQ instances, regardless of whether this parameter is configured.</p>
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

        public GetInstanceResponseBodyDataProductInfo setAutoScaling(Boolean autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }
        public Boolean getAutoScaling() {
            return this.autoScaling;
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

        public GetInstanceResponseBodyDataProductInfo setSendReceiveRatio(Float sendReceiveRatio) {
            this.sendReceiveRatio = sendReceiveRatio;
            return this;
        }
        public Float getSendReceiveRatio() {
            return this.sendReceiveRatio;
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
         * <p>The period of upgrade time.</p>
         * 
         * <strong>example:</strong>
         * <p>02:00-06:00</p>
         */
        @NameInMap("maintainTime")
        public String maintainTime;

        /**
         * <p>The version of software.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0-rmq-20230619-1</p>
         */
        @NameInMap("softwareVersion")
        public String softwareVersion;

        /**
         * <p>The upgrade method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Auto: automatic upgrade</p>
         * </li>
         * <li><p>Manual: manual upgrade</p>
         * </li>
         * </ul>
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
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
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
         * <p>The information about access control.</p>
         */
        @NameInMap("aclInfo")
        public GetInstanceResponseBodyDataAclInfo aclInfo;

        /**
         * <p>The business ID (BID) of the commodity.</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("bid")
        public String bid;

        /**
         * <p>The commodity code of the instance. The commodity code of a ApsaraMQ for RocketMQ 5.0 instance has a similar format as ons_rmqsub_public_cn.</p>
         * 
         * <strong>example:</strong>
         * <p>ons_rmqsub_public_cn</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 00:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-01 00:00:00</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <p>The extended configurations. We recommend you configure productInfo, internetInfo, or aclInfo instead of this parameter.</p>
         */
        @NameInMap("extConfig")
        @Deprecated
        public GetInstanceResponseBodyDataExtConfig extConfig;

        /**
         * <p>The number of groups.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("groupCount")
        public Long groupCount;

        /**
         * <p>The ID of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test instance</p>
         */
        @NameInMap("instanceName")
        public String instanceName;

        /**
         * <p>The instance quotas.</p>
         */
        @NameInMap("instanceQuotas")
        public java.util.List<GetInstanceResponseBodyDataInstanceQuotas> instanceQuotas;

        /**
         * <p>The network information.</p>
         */
        @NameInMap("networkInfo")
        public GetInstanceResponseBodyDataNetworkInfo networkInfo;

        /**
         * <p>The billing method of the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PayAsYouGo: pay-as-you-go</li>
         * <li>Subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The extended configurations of the instance.</p>
         */
        @NameInMap("productInfo")
        public GetInstanceResponseBodyDataProductInfo productInfo;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The time when the instance was released.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-07 00:00:00</p>
         */
        @NameInMap("releaseTime")
        public String releaseTime;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>This is remark for instance.</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3tmjruyribi</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The primary edition of the instance. For information about the differences between primary edition instances, see <a href="https://help.aliyun.com/document_detail/444722.html">Instance selection</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard: Standard Edition</li>
         * <li>ultimate: Enterprise Platinum Edition</li>
         * <li>professional: Professional Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("seriesCode")
        public String seriesCode;

        /**
         * <p>The code of the service to which the instance belongs. The service code of ApsaraMQ for RocketMQ is rmq.</p>
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
         * <p>The time when the instance was started.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 00:00:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The status of the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RELEASED</li>
         * <li>RUNNING</li>
         * <li>STOPPED</li>
         * <li>CHANGING</li>
         * <li>CREATING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The sub-category edition of the instance. For information about the differences between sub-category edition instances, see <a href="https://help.aliyun.com/document_detail/444722.html">Instance selection</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cluster_ha: Cluster High-availability Edition</li>
         * <li>single_node: Standalone Edition</li>
         * </ul>
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
         * <p>The time when the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-02 00:00:00</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The ID of the user who owns the instance.</p>
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
