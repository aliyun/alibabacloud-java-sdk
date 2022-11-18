// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewaysResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmartAccessGateways")
    public DescribeSmartAccessGatewaysResponseBodySmartAccessGateways smartAccessGateways;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSmartAccessGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewaysResponseBody self = new DescribeSmartAccessGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeSmartAccessGatewaysResponseBody setSmartAccessGateways(DescribeSmartAccessGatewaysResponseBodySmartAccessGateways smartAccessGateways) {
        this.smartAccessGateways = smartAccessGateways;
        return this;
    }
    public DescribeSmartAccessGatewaysResponseBodySmartAccessGateways getSmartAccessGateways() {
        return this.smartAccessGateways;
    }

    public DescribeSmartAccessGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink extends TeaModel {
        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("CommodityType")
        public String commodityType;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RelateInstanceId")
        public String relateInstanceId;

        @NameInMap("RelateInstanceRegionId")
        public String relateInstanceRegionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink self = new DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setCommodityType(String commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public String getCommodityType() {
            return this.commodityType;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setRelateInstanceId(String relateInstanceId) {
            this.relateInstanceId = relateInstanceId;
            return this;
        }
        public String getRelateInstanceId() {
            return this.relateInstanceId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setRelateInstanceRegionId(String relateInstanceRegionId) {
            this.relateInstanceRegionId = relateInstanceRegionId;
            return this;
        }
        public String getRelateInstanceRegionId() {
            return this.relateInstanceRegionId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinksLink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
        @NameInMap("AccelerateBandwidth")
        public Long accelerateBandwidth;

        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("AclIds")
        public String aclIds;

        @NameInMap("ApplicationBandwidthPackageId")
        public String applicationBandwidthPackageId;

        @NameInMap("AssociatedCcnId")
        public String associatedCcnId;

        @NameInMap("AssociatedCcnName")
        public String associatedCcnName;

        @NameInMap("BackupSoftwareVersion")
        public String backupSoftwareVersion;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("City")
        public String city;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DataPlan")
        public Long dataPlan;

        @NameInMap("Description")
        public String description;

        @NameInMap("DpiMonitorStatus")
        public String dpiMonitorStatus;

        @NameInMap("DpiStatus")
        public String dpiStatus;

        @NameInMap("EnableAdvancedMonitor")
        public Boolean enableAdvancedMonitor;

        @NameInMap("EnableSoftwareConnectionAudit")
        public Boolean enableSoftwareConnectionAudit;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("EnterpriseCode")
        public String enterpriseCode;

        @NameInMap("HardwareVersion")
        public String hardwareVersion;

        @NameInMap("IRIds")
        public String IRIds;

        @NameInMap("IdaasApplicationId")
        public String idaasApplicationId;

        @NameInMap("IdaasId")
        public String idaasId;

        @NameInMap("IpsecStatus")
        public String ipsecStatus;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("Links")
        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinks links;

        @NameInMap("MaxBandwidth")
        public String maxBandwidth;

        @NameInMap("Name")
        public String name;

        @NameInMap("Position")
        public String position;

        @NameInMap("QosIds")
        public String qosIds;

        @NameInMap("ResellerInstanceId")
        public String resellerInstanceId;

        @NameInMap("ResellerUid")
        public String resellerUid;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        @NameInMap("SecurityLockThreshold")
        public Integer securityLockThreshold;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("SmartAGId")
        public String smartAGId;

        @NameInMap("SmartAGUid")
        public Long smartAGUid;

        @NameInMap("SoftwareVersion")
        public String softwareVersion;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpBandwidth4G")
        public Integer upBandwidth4G;

        @NameInMap("UpBandwidthWan")
        public Integer upBandwidthWan;

        @NameInMap("UserCount")
        public Integer userCount;

        @NameInMap("VpnStatus")
        public String vpnStatus;

        public static DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway self = new DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setAccelerateBandwidth(Long accelerateBandwidth) {
            this.accelerateBandwidth = accelerateBandwidth;
            return this;
        }
        public Long getAccelerateBandwidth() {
            return this.accelerateBandwidth;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setAclIds(String aclIds) {
            this.aclIds = aclIds;
            return this;
        }
        public String getAclIds() {
            return this.aclIds;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setApplicationBandwidthPackageId(String applicationBandwidthPackageId) {
            this.applicationBandwidthPackageId = applicationBandwidthPackageId;
            return this;
        }
        public String getApplicationBandwidthPackageId() {
            return this.applicationBandwidthPackageId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setAssociatedCcnId(String associatedCcnId) {
            this.associatedCcnId = associatedCcnId;
            return this;
        }
        public String getAssociatedCcnId() {
            return this.associatedCcnId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setAssociatedCcnName(String associatedCcnName) {
            this.associatedCcnName = associatedCcnName;
            return this;
        }
        public String getAssociatedCcnName() {
            return this.associatedCcnName;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setBackupSoftwareVersion(String backupSoftwareVersion) {
            this.backupSoftwareVersion = backupSoftwareVersion;
            return this;
        }
        public String getBackupSoftwareVersion() {
            return this.backupSoftwareVersion;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setDataPlan(Long dataPlan) {
            this.dataPlan = dataPlan;
            return this;
        }
        public Long getDataPlan() {
            return this.dataPlan;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setDpiMonitorStatus(String dpiMonitorStatus) {
            this.dpiMonitorStatus = dpiMonitorStatus;
            return this;
        }
        public String getDpiMonitorStatus() {
            return this.dpiMonitorStatus;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setDpiStatus(String dpiStatus) {
            this.dpiStatus = dpiStatus;
            return this;
        }
        public String getDpiStatus() {
            return this.dpiStatus;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setEnableAdvancedMonitor(Boolean enableAdvancedMonitor) {
            this.enableAdvancedMonitor = enableAdvancedMonitor;
            return this;
        }
        public Boolean getEnableAdvancedMonitor() {
            return this.enableAdvancedMonitor;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setEnableSoftwareConnectionAudit(Boolean enableSoftwareConnectionAudit) {
            this.enableSoftwareConnectionAudit = enableSoftwareConnectionAudit;
            return this;
        }
        public Boolean getEnableSoftwareConnectionAudit() {
            return this.enableSoftwareConnectionAudit;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setEnterpriseCode(String enterpriseCode) {
            this.enterpriseCode = enterpriseCode;
            return this;
        }
        public String getEnterpriseCode() {
            return this.enterpriseCode;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setHardwareVersion(String hardwareVersion) {
            this.hardwareVersion = hardwareVersion;
            return this;
        }
        public String getHardwareVersion() {
            return this.hardwareVersion;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setIRIds(String IRIds) {
            this.IRIds = IRIds;
            return this;
        }
        public String getIRIds() {
            return this.IRIds;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setIdaasApplicationId(String idaasApplicationId) {
            this.idaasApplicationId = idaasApplicationId;
            return this;
        }
        public String getIdaasApplicationId() {
            return this.idaasApplicationId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setIdaasId(String idaasId) {
            this.idaasId = idaasId;
            return this;
        }
        public String getIdaasId() {
            return this.idaasId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setIpsecStatus(String ipsecStatus) {
            this.ipsecStatus = ipsecStatus;
            return this;
        }
        public String getIpsecStatus() {
            return this.ipsecStatus;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setLinks(DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinks links) {
            this.links = links;
            return this;
        }
        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGatewayLinks getLinks() {
            return this.links;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setMaxBandwidth(String maxBandwidth) {
            this.maxBandwidth = maxBandwidth;
            return this;
        }
        public String getMaxBandwidth() {
            return this.maxBandwidth;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setQosIds(String qosIds) {
            this.qosIds = qosIds;
            return this;
        }
        public String getQosIds() {
            return this.qosIds;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setResellerInstanceId(String resellerInstanceId) {
            this.resellerInstanceId = resellerInstanceId;
            return this;
        }
        public String getResellerInstanceId() {
            return this.resellerInstanceId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setResellerUid(String resellerUid) {
            this.resellerUid = resellerUid;
            return this;
        }
        public String getResellerUid() {
            return this.resellerUid;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setSmartAGUid(Long smartAGUid) {
            this.smartAGUid = smartAGUid;
            return this;
        }
        public Long getSmartAGUid() {
            return this.smartAGUid;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setSoftwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }
        public String getSoftwareVersion() {
            return this.softwareVersion;
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

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setUpBandwidthWan(Integer upBandwidthWan) {
            this.upBandwidthWan = upBandwidthWan;
            return this;
        }
        public Integer getUpBandwidthWan() {
            return this.upBandwidthWan;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public DescribeSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setVpnStatus(String vpnStatus) {
            this.vpnStatus = vpnStatus;
            return this;
        }
        public String getVpnStatus() {
            return this.vpnStatus;
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
