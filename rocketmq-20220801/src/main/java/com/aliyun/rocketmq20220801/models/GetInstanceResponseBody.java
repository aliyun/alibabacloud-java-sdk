// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetInstanceResponseBodyData data;

    @NameInMap("dynamicCode")
    public String dynamicCode;

    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("aclType")
        public String aclType;

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

    }

    public static class GetInstanceResponseBodyDataExtConfig extends TeaModel {
        @NameInMap("aclType")
        public String aclType;

        @NameInMap("autoScaling")
        public Boolean autoScaling;

        @NameInMap("flowOutBandwidth")
        public Integer flowOutBandwidth;

        @NameInMap("flowOutType")
        public String flowOutType;

        @NameInMap("internetSpec")
        public String internetSpec;

        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        @NameInMap("msgProcessSpec")
        public String msgProcessSpec;

        @NameInMap("sendReceiveRatio")
        public Float sendReceiveRatio;

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
        @NameInMap("freeCount")
        public Double freeCount;

        @NameInMap("quotaName")
        public String quotaName;

        @NameInMap("totalCount")
        public Double totalCount;

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
        @NameInMap("endpointType")
        public String endpointType;

        @NameInMap("endpointUrl")
        public String endpointUrl;

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
        @NameInMap("flowOutBandwidth")
        public Integer flowOutBandwidth;

        @NameInMap("flowOutType")
        public String flowOutType;

        @NameInMap("internetSpec")
        public String internetSpec;

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

    public static class GetInstanceResponseBodyDataNetworkInfoVpcInfo extends TeaModel {
        @NameInMap("vSwitchId")
        public String vSwitchId;

        @NameInMap("vpcId")
        public String vpcId;

        public static GetInstanceResponseBodyDataNetworkInfoVpcInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataNetworkInfoVpcInfo self = new GetInstanceResponseBodyDataNetworkInfoVpcInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataNetworkInfoVpcInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
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
        @NameInMap("endpoints")
        public java.util.List<GetInstanceResponseBodyDataNetworkInfoEndpoints> endpoints;

        @NameInMap("internetInfo")
        public GetInstanceResponseBodyDataNetworkInfoInternetInfo internetInfo;

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
        @NameInMap("autoScaling")
        public Boolean autoScaling;

        @NameInMap("messageRetentionTime")
        public Integer messageRetentionTime;

        @NameInMap("msgProcessSpec")
        public String msgProcessSpec;

        @NameInMap("sendReceiveRatio")
        public Float sendReceiveRatio;

        @NameInMap("supportAutoScaling")
        public Boolean supportAutoScaling;

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

    }

    public static class GetInstanceResponseBodyDataSoftware extends TeaModel {
        @NameInMap("maintainTime")
        public String maintainTime;

        @NameInMap("softwareVersion")
        public String softwareVersion;

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

    public static class GetInstanceResponseBodyData extends TeaModel {
        @NameInMap("accountInfo")
        public GetInstanceResponseBodyDataAccountInfo accountInfo;

        @NameInMap("aclInfo")
        public GetInstanceResponseBodyDataAclInfo aclInfo;

        @NameInMap("bid")
        public String bid;

        @NameInMap("commodityCode")
        public String commodityCode;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("expireTime")
        public String expireTime;

        @NameInMap("extConfig")
        public GetInstanceResponseBodyDataExtConfig extConfig;

        @NameInMap("groupCount")
        public Long groupCount;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("instanceName")
        public String instanceName;

        @NameInMap("instanceQuotas")
        public java.util.List<GetInstanceResponseBodyDataInstanceQuotas> instanceQuotas;

        @NameInMap("networkInfo")
        public GetInstanceResponseBodyDataNetworkInfo networkInfo;

        @NameInMap("paymentType")
        public String paymentType;

        @NameInMap("productInfo")
        public GetInstanceResponseBodyDataProductInfo productInfo;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("releaseTime")
        public String releaseTime;

        @NameInMap("remark")
        public String remark;

        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        @NameInMap("seriesCode")
        public String seriesCode;

        @NameInMap("serviceCode")
        public String serviceCode;

        @NameInMap("software")
        public GetInstanceResponseBodyDataSoftware software;

        @NameInMap("startTime")
        public String startTime;

        @NameInMap("status")
        public String status;

        @NameInMap("subSeriesCode")
        public String subSeriesCode;

        @NameInMap("topicCount")
        public Long topicCount;

        @NameInMap("updateTime")
        public String updateTime;

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
