// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewaysResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("SmartAccessGateways")
    public DescribeSmartAccessGatewaysResponseBodySmartAccessGateways smartAccessGateways;

    public static DescribeSmartAccessGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewaysResponseBody self = new DescribeSmartAccessGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSmartAccessGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSmartAccessGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmartAccessGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSmartAccessGatewaysResponseBody setSmartAccessGateways(DescribeSmartAccessGatewaysResponseBodySmartAccessGateways smartAccessGateways) {
        this.smartAccessGateways = smartAccessGateways;
        return this;
    }
    public DescribeSmartAccessGatewaysResponseBodySmartAccessGateways getSmartAccessGateways() {
        return this.smartAccessGateways;
    }

    public static class DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("RelateInstanceRegionId")
        public String relateInstanceRegionId;

        @NameInMap("RelateInstanceId")
        public String relateInstanceId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("CommodityType")
        public String commodityType;

        public static DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink self = new DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setRelateInstanceRegionId(String relateInstanceRegionId) {
            this.relateInstanceRegionId = relateInstanceRegionId;
            return this;
        }
        public String getRelateInstanceRegionId() {
            return this.relateInstanceRegionId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setRelateInstanceId(String relateInstanceId) {
            this.relateInstanceId = relateInstanceId;
            return this;
        }
        public String getRelateInstanceId() {
            return this.relateInstanceId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setCommodityType(String commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public String getCommodityType() {
            return this.commodityType;
        }

    }

    public static class DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinks extends TeaModel {
        @NameInMap("Link")
        public java.util.List<DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink> link;

        public static DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinks self = new DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinks();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinks setLink(java.util.List<DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink> link) {
            this.link = link;
            return this;
        }
        public java.util.List<DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink> getLink() {
            return this.link;
        }

    }

    public static class DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpBandwidth4G")
        public Integer upBandwidth4G;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("IdaasApplicationId")
        public String idaasApplicationId;

        @NameInMap("SoftwareVersion")
        public String softwareVersion;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("SmartAGId")
        public String smartAGId;

        @NameInMap("UpBandwidthWan")
        public Integer upBandwidthWan;

        @NameInMap("City")
        public String city;

        @NameInMap("AclIds")
        public String aclIds;

        @NameInMap("QosIds")
        public String qosIds;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Description")
        public String description;

        @NameInMap("IpsecStatus")
        public String ipsecStatus;

        @NameInMap("EnterpriseCode")
        public String enterpriseCode;

        @NameInMap("DpiStatus")
        public String dpiStatus;

        @NameInMap("AssociatedCcnId")
        public String associatedCcnId;

        @NameInMap("Name")
        public String name;

        @NameInMap("HardwareVersion")
        public String hardwareVersion;

        @NameInMap("IdaasId")
        public String idaasId;

        @NameInMap("DataPlan")
        public Long dataPlan;

        @NameInMap("AssociatedCcnName")
        public String associatedCcnName;

        @NameInMap("ResellerUid")
        public String resellerUid;

        @NameInMap("DpiMonitorStatus")
        public String dpiMonitorStatus;

        @NameInMap("MaxBandwidth")
        public String maxBandwidth;

        @NameInMap("SmartAGUid")
        public Long smartAGUid;

        @NameInMap("BackupSoftwareVersion")
        public String backupSoftwareVersion;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ResellerInstanceId")
        public String resellerInstanceId;

        @NameInMap("VpnStatus")
        public String vpnStatus;

        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        @NameInMap("SecurityLockThreshold")
        public Integer securityLockThreshold;

        @NameInMap("Links")
        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinks links;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("UserCount")
        public Integer userCount;

        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("ApplicationBandwidthPackageId")
        public String applicationBandwidthPackageId;

        @NameInMap("AccelerateBandwidth")
        public Long accelerateBandwidth;

        public static DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway self = new DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setUpBandwidth4G(Integer upBandwidth4G) {
            this.upBandwidth4G = upBandwidth4G;
            return this;
        }
        public Integer getUpBandwidth4G() {
            return this.upBandwidth4G;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setIdaasApplicationId(String idaasApplicationId) {
            this.idaasApplicationId = idaasApplicationId;
            return this;
        }
        public String getIdaasApplicationId() {
            return this.idaasApplicationId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setSoftwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }
        public String getSoftwareVersion() {
            return this.softwareVersion;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setUpBandwidthWan(Integer upBandwidthWan) {
            this.upBandwidthWan = upBandwidthWan;
            return this;
        }
        public Integer getUpBandwidthWan() {
            return this.upBandwidthWan;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setAclIds(String aclIds) {
            this.aclIds = aclIds;
            return this;
        }
        public String getAclIds() {
            return this.aclIds;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setQosIds(String qosIds) {
            this.qosIds = qosIds;
            return this;
        }
        public String getQosIds() {
            return this.qosIds;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setIpsecStatus(String ipsecStatus) {
            this.ipsecStatus = ipsecStatus;
            return this;
        }
        public String getIpsecStatus() {
            return this.ipsecStatus;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setEnterpriseCode(String enterpriseCode) {
            this.enterpriseCode = enterpriseCode;
            return this;
        }
        public String getEnterpriseCode() {
            return this.enterpriseCode;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setDpiStatus(String dpiStatus) {
            this.dpiStatus = dpiStatus;
            return this;
        }
        public String getDpiStatus() {
            return this.dpiStatus;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setAssociatedCcnId(String associatedCcnId) {
            this.associatedCcnId = associatedCcnId;
            return this;
        }
        public String getAssociatedCcnId() {
            return this.associatedCcnId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setHardwareVersion(String hardwareVersion) {
            this.hardwareVersion = hardwareVersion;
            return this;
        }
        public String getHardwareVersion() {
            return this.hardwareVersion;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setIdaasId(String idaasId) {
            this.idaasId = idaasId;
            return this;
        }
        public String getIdaasId() {
            return this.idaasId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setDataPlan(Long dataPlan) {
            this.dataPlan = dataPlan;
            return this;
        }
        public Long getDataPlan() {
            return this.dataPlan;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setAssociatedCcnName(String associatedCcnName) {
            this.associatedCcnName = associatedCcnName;
            return this;
        }
        public String getAssociatedCcnName() {
            return this.associatedCcnName;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setResellerUid(String resellerUid) {
            this.resellerUid = resellerUid;
            return this;
        }
        public String getResellerUid() {
            return this.resellerUid;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setDpiMonitorStatus(String dpiMonitorStatus) {
            this.dpiMonitorStatus = dpiMonitorStatus;
            return this;
        }
        public String getDpiMonitorStatus() {
            return this.dpiMonitorStatus;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setMaxBandwidth(String maxBandwidth) {
            this.maxBandwidth = maxBandwidth;
            return this;
        }
        public String getMaxBandwidth() {
            return this.maxBandwidth;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setSmartAGUid(Long smartAGUid) {
            this.smartAGUid = smartAGUid;
            return this;
        }
        public Long getSmartAGUid() {
            return this.smartAGUid;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setBackupSoftwareVersion(String backupSoftwareVersion) {
            this.backupSoftwareVersion = backupSoftwareVersion;
            return this;
        }
        public String getBackupSoftwareVersion() {
            return this.backupSoftwareVersion;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setResellerInstanceId(String resellerInstanceId) {
            this.resellerInstanceId = resellerInstanceId;
            return this;
        }
        public String getResellerInstanceId() {
            return this.resellerInstanceId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setVpnStatus(String vpnStatus) {
            this.vpnStatus = vpnStatus;
            return this;
        }
        public String getVpnStatus() {
            return this.vpnStatus;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setSecurityLockThreshold(Integer securityLockThreshold) {
            this.securityLockThreshold = securityLockThreshold;
            return this;
        }
        public Integer getSecurityLockThreshold() {
            return this.securityLockThreshold;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setLinks(DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinks links) {
            this.links = links;
            return this;
        }
        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinks getLinks() {
            return this.links;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setApplicationBandwidthPackageId(String applicationBandwidthPackageId) {
            this.applicationBandwidthPackageId = applicationBandwidthPackageId;
            return this;
        }
        public String getApplicationBandwidthPackageId() {
            return this.applicationBandwidthPackageId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setAccelerateBandwidth(Long accelerateBandwidth) {
            this.accelerateBandwidth = accelerateBandwidth;
            return this;
        }
        public Long getAccelerateBandwidth() {
            return this.accelerateBandwidth;
        }

    }

    public static class DescribeSmartAccessGatewaysResponseBodySmartAccessGateways extends TeaModel {
        @NameInMap("SmartAccessGateway")
        public java.util.List<DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway> smartAccessGateway;

        public static DescribeSmartAccessGatewaysResponseBodySmartAccessGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewaysResponseBodySmartAccessGateways self = new DescribeSmartAccessGatewaysResponseBodySmartAccessGateways();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGateways setSmartAccessGateway(java.util.List<DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway> smartAccessGateway) {
            this.smartAccessGateway = smartAccessGateway;
            return this;
        }
        public java.util.List<DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway> getSmartAccessGateway() {
            return this.smartAccessGateway;
        }

    }

}
