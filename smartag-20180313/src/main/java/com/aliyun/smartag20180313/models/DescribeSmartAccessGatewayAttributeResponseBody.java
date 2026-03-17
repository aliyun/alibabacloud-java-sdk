// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewayAttributeResponseBody extends TeaModel {
    /**
     * <p>The maximum bandwidth value for application acceleration. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AccelerateBandwidth")
    public Long accelerateBandwidth;

    /**
     * <p>The ID of the access point for the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>238</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    @NameInMap("AclIds")
    public DescribeSmartAccessGatewayAttributeResponseBodyAclIds aclIds;

    /**
     * <p>The status of the bandwidth plan for application acceleration. Valid value:</p>
     * <ul>
     * <li><strong>Abnormal</strong>: abnormal</li>
     * <li><strong>Normal</strong>: normal</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("ApplicationBandwidthPackageBussinessStatus")
    public String applicationBandwidthPackageBussinessStatus;

    /**
     * <p>The ID of the bandwidth plan for application acceleration that is associated with the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>abwp-7963l7iqnquyj3****</p>
     */
    @NameInMap("ApplicationBandwidthPackageId")
    public String applicationBandwidthPackageId;

    /**
     * <p>The name of the bandwidth plan for application acceleration that is associated with the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("ApplicationBandwidthPackageName")
    public String applicationBandwidthPackageName;

    /**
     * <p>Indicates whether the bandwidth plan is locked.</p>
     */
    @NameInMap("ApplicationBandwidthPackageOperationLocks")
    public DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks applicationBandwidthPackageOperationLocks;

    /**
     * <p>The ID of the Cloud Connect Network (CCN) instance with which the SAG instance is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>ccn-iz26o9zye6lhoo****</p>
     */
    @NameInMap("AssociatedCcnId")
    public String associatedCcnId;

    /**
     * <p>The ID of the Cloud Connect Network (CCN) instance with which the SAG instance is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("AssociatedCcnName")
    public String associatedCcnName;

    /**
     * <p>The public IP address of the standby SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>112.XX.XX.27</p>
     */
    @NameInMap("BackupBoxControllerIp")
    public String backupBoxControllerIp;

    /**
     * <p>The public IP address of the active SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>112.XX.XX.25</p>
     */
    @NameInMap("BoxControllerIp")
    public String boxControllerIp;

    /**
     * <p>The private CIDR block of the destination network with which the on-premises network or client needs to communicate.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.9.0/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The ID of the city where the SAG device is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The timestamp when the SAG instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1622617250000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The data transfer plan of the SAG instance. Unit: GB.</p>
     * <blockquote>
     * <p> Each client account has a data transfer plan free of charge for 5 GB each month.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DataPlan")
    public Long dataPlan;

    /**
     * <p>The description of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Devices")
    public DescribeSmartAccessGatewayAttributeResponseBodyDevices devices;

    /**
     * <p>Indicates whether the transmission optimization feature is enabled.</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableOptimization")
    public Boolean enableOptimization;

    /**
     * <p>Indicates whether the audit log for connections to the SAG app instance is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled</li>
     * <li><strong>false</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSoftwareConnectionAudit")
    public Boolean enableSoftwareConnectionAudit;

    /**
     * <p>The timestamp when the SAG instance expires.</p>
     * 
     * <strong>example:</strong>
     * <p>1628265600000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("FlowLogIds")
    public DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds flowLogIds;

    @NameInMap("IRIds")
    public DescribeSmartAccessGatewayAttributeResponseBodyIRIds IRIds;

    /**
     * <p>The type of the SAG instance. Valid values:</p>
     * <ul>
     * <li><strong>sag-1000</strong>: indicates an SAG CPE instance and the instance is associated with an SAG-1000 device.</li>
     * <li><strong>sag-10wm</strong>: indicates an SAG CPE instance and the instance is associated with an SAG-100WM device.</li>
     * <li><strong>sag-software</strong>: indicates an SAG app instance.</li>
     * <li><strong>sag-vcpe</strong>: an SAG vCPE instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sag-vcpe</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The status of the IPsec-VPN connection. Valid values:</p>
     * <ul>
     * <li><strong>up</strong>: normal</li>
     * <li><strong>down</strong>: abnormal</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>up</p>
     */
    @NameInMap("IpsecStatus")
    public String ipsecStatus;

    @NameInMap("Links")
    public DescribeSmartAccessGatewayAttributeResponseBodyLinks links;

    /**
     * <p>The maximum bandwidth value of the SAG instance. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>50 M</p>
     */
    @NameInMap("MaxBandwidth")
    public String maxBandwidth;

    /**
     * <p>The name of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The transmission optimization type of the SAG instance. If transmission optimization is enabled, the default value is <strong>fec</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>fec</p>
     */
    @NameInMap("OptimizationType")
    public Boolean optimizationType;

    /**
     * <p>The location of the SAG instance.</p>
     */
    @NameInMap("Position")
    public String position;

    @NameInMap("QosIds")
    public DescribeSmartAccessGatewayAttributeResponseBodyQosIds qosIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F02D092B-A0B7-4BA1-BCA7-014B953C5DC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the instance provided by the third-party reseller.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-v0fkpk4akfz5******</p>
     */
    @NameInMap("ResellerInstanceId")
    public String resellerInstanceId;

    /**
     * <p>The ID of the third-party reseller.</p>
     * 
     * <strong>example:</strong>
     * <p>1210123456123456</p>
     */
    @NameInMap("ResellerUid")
    public String resellerUid;

    /**
     * <p>The ID of the resource group to which the SAG instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2iu4fnc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The method that the SAG instance uses to advertise routes to Alibaba Cloud.</p>
     * <ul>
     * <li><strong>static</strong>: static routing</li>
     * <li><strong>dynamic</strong>: dynamic routing</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("RoutingStrategy")
    public String routingStrategy;

    /**
     * <p>The time threshold. If the SAG device remains disconnected for the specified period of time, the SAG device is locked.</p>
     * <p>Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("SecurityLockThreshold")
    public Integer securityLockThreshold;

    /**
     * <p>The serial number of the SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>sage6gsdllbidl****,sage6nniq3d****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The ID of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-6z21oj0vjjrx6s****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The status of the SAG instance. Valid values:</p>
     * <ul>
     * <li><strong>Ordered</strong>: The order is to be shipped.</li>
     * <li><strong>Delivered</strong>: The SAG instance is shipped.</li>
     * <li><strong>Received</strong>: The SAG instance is activated.</li>
     * <li><strong>Unconfirmed</strong>: The SAG instance is to be confirmed.</li>
     * <li><strong>Active</strong>: The SAG instance is available.</li>
     * <li><strong>Offline</strong>: The SAG instance is disconnected.</li>
     * <li><strong>Arrearage</strong>: The SAG device is locked due to overdue payments.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The serial number of the active SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>sage6nniq3d****</p>
     */
    @NameInMap("TrafficMasterSn")
    public String trafficMasterSn;

    /**
     * <p>The maximum upstream bandwidth of 4G network connections established by the SAG device. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("UpBandwidth4G")
    public Integer upBandwidth4G;

    /**
     * <p>The maximum upstream bandwidth of network connections established on the WAN port of the SAG device. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("UpBandwidthWan")
    public Integer upBandwidthWan;

    /**
     * <p>The number of client accounts on the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("UserCount")
    public Integer userCount;

    /**
     * <p>The status of the VPN connection. Valid values:</p>
     * <ul>
     * <li><strong>up</strong>: normal</li>
     * <li><strong>down</strong>: abnormal</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>down</p>
     */
    @NameInMap("VpnStatus")
    public String vpnStatus;

    public static DescribeSmartAccessGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewayAttributeResponseBody self = new DescribeSmartAccessGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAccelerateBandwidth(Long accelerateBandwidth) {
        this.accelerateBandwidth = accelerateBandwidth;
        return this;
    }
    public Long getAccelerateBandwidth() {
        return this.accelerateBandwidth;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAclIds(DescribeSmartAccessGatewayAttributeResponseBodyAclIds aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyAclIds getAclIds() {
        return this.aclIds;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setApplicationBandwidthPackageBussinessStatus(String applicationBandwidthPackageBussinessStatus) {
        this.applicationBandwidthPackageBussinessStatus = applicationBandwidthPackageBussinessStatus;
        return this;
    }
    public String getApplicationBandwidthPackageBussinessStatus() {
        return this.applicationBandwidthPackageBussinessStatus;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setApplicationBandwidthPackageId(String applicationBandwidthPackageId) {
        this.applicationBandwidthPackageId = applicationBandwidthPackageId;
        return this;
    }
    public String getApplicationBandwidthPackageId() {
        return this.applicationBandwidthPackageId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setApplicationBandwidthPackageName(String applicationBandwidthPackageName) {
        this.applicationBandwidthPackageName = applicationBandwidthPackageName;
        return this;
    }
    public String getApplicationBandwidthPackageName() {
        return this.applicationBandwidthPackageName;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setApplicationBandwidthPackageOperationLocks(DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks applicationBandwidthPackageOperationLocks) {
        this.applicationBandwidthPackageOperationLocks = applicationBandwidthPackageOperationLocks;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks getApplicationBandwidthPackageOperationLocks() {
        return this.applicationBandwidthPackageOperationLocks;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAssociatedCcnId(String associatedCcnId) {
        this.associatedCcnId = associatedCcnId;
        return this;
    }
    public String getAssociatedCcnId() {
        return this.associatedCcnId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAssociatedCcnName(String associatedCcnName) {
        this.associatedCcnName = associatedCcnName;
        return this;
    }
    public String getAssociatedCcnName() {
        return this.associatedCcnName;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setBackupBoxControllerIp(String backupBoxControllerIp) {
        this.backupBoxControllerIp = backupBoxControllerIp;
        return this;
    }
    public String getBackupBoxControllerIp() {
        return this.backupBoxControllerIp;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setBoxControllerIp(String boxControllerIp) {
        this.boxControllerIp = boxControllerIp;
        return this;
    }
    public String getBoxControllerIp() {
        return this.boxControllerIp;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setDataPlan(Long dataPlan) {
        this.dataPlan = dataPlan;
        return this;
    }
    public Long getDataPlan() {
        return this.dataPlan;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setDevices(DescribeSmartAccessGatewayAttributeResponseBodyDevices devices) {
        this.devices = devices;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyDevices getDevices() {
        return this.devices;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setEnableOptimization(Boolean enableOptimization) {
        this.enableOptimization = enableOptimization;
        return this;
    }
    public Boolean getEnableOptimization() {
        return this.enableOptimization;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setEnableSoftwareConnectionAudit(Boolean enableSoftwareConnectionAudit) {
        this.enableSoftwareConnectionAudit = enableSoftwareConnectionAudit;
        return this;
    }
    public Boolean getEnableSoftwareConnectionAudit() {
        return this.enableSoftwareConnectionAudit;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setFlowLogIds(DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds flowLogIds) {
        this.flowLogIds = flowLogIds;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds getFlowLogIds() {
        return this.flowLogIds;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setIRIds(DescribeSmartAccessGatewayAttributeResponseBodyIRIds IRIds) {
        this.IRIds = IRIds;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyIRIds getIRIds() {
        return this.IRIds;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setIpsecStatus(String ipsecStatus) {
        this.ipsecStatus = ipsecStatus;
        return this;
    }
    public String getIpsecStatus() {
        return this.ipsecStatus;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setLinks(DescribeSmartAccessGatewayAttributeResponseBodyLinks links) {
        this.links = links;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyLinks getLinks() {
        return this.links;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setMaxBandwidth(String maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
        return this;
    }
    public String getMaxBandwidth() {
        return this.maxBandwidth;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setOptimizationType(Boolean optimizationType) {
        this.optimizationType = optimizationType;
        return this;
    }
    public Boolean getOptimizationType() {
        return this.optimizationType;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setQosIds(DescribeSmartAccessGatewayAttributeResponseBodyQosIds qosIds) {
        this.qosIds = qosIds;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyQosIds getQosIds() {
        return this.qosIds;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setResellerInstanceId(String resellerInstanceId) {
        this.resellerInstanceId = resellerInstanceId;
        return this;
    }
    public String getResellerInstanceId() {
        return this.resellerInstanceId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setResellerUid(String resellerUid) {
        this.resellerUid = resellerUid;
        return this;
    }
    public String getResellerUid() {
        return this.resellerUid;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setRoutingStrategy(String routingStrategy) {
        this.routingStrategy = routingStrategy;
        return this;
    }
    public String getRoutingStrategy() {
        return this.routingStrategy;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setSecurityLockThreshold(Integer securityLockThreshold) {
        this.securityLockThreshold = securityLockThreshold;
        return this;
    }
    public Integer getSecurityLockThreshold() {
        return this.securityLockThreshold;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setTrafficMasterSn(String trafficMasterSn) {
        this.trafficMasterSn = trafficMasterSn;
        return this;
    }
    public String getTrafficMasterSn() {
        return this.trafficMasterSn;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setUpBandwidth4G(Integer upBandwidth4G) {
        this.upBandwidth4G = upBandwidth4G;
        return this;
    }
    public Integer getUpBandwidth4G() {
        return this.upBandwidth4G;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setUpBandwidthWan(Integer upBandwidthWan) {
        this.upBandwidthWan = upBandwidthWan;
        return this;
    }
    public Integer getUpBandwidthWan() {
        return this.upBandwidthWan;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setVpnStatus(String vpnStatus) {
        this.vpnStatus = vpnStatus;
        return this;
    }
    public String getVpnStatus() {
        return this.vpnStatus;
    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyAclIds extends TeaModel {
        @NameInMap("AclId")
        public java.util.List<String> aclId;

        public static DescribeSmartAccessGatewayAttributeResponseBodyAclIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyAclIds self = new DescribeSmartAccessGatewayAttributeResponseBodyAclIds();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyAclIds setAclId(java.util.List<String> aclId) {
            this.aclId = aclId;
            return this;
        }
        public java.util.List<String> getAclId() {
            return this.aclId;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks extends TeaModel {
        /**
         * <p>The reason why the instance was locked.</p>
         * 
         * <strong>example:</strong>
         * <p>Message</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The lock mode of the instance. The value is set to <strong>FinancialLocked</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinancialLocked</p>
         */
        @NameInMap("LockType")
        public String lockType;

        public static DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks self = new DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks setLockType(String lockType) {
            this.lockType = lockType;
            return this;
        }
        public String getLockType() {
            return this.lockType;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice extends TeaModel {
        @NameInMap("DistributeSkStatus")
        public Integer distributeSkStatus;

        @NameInMap("DpiSignatureDbVersion")
        public String dpiSignatureDbVersion;

        @NameInMap("HaState")
        public String haState;

        @NameInMap("HcState")
        public String hcState;

        @NameInMap("MonitorVersion")
        public String monitorVersion;

        @NameInMap("SecretKey")
        public String secretKey;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("SoftwareVersion")
        public String softwareVersion;

        public static DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice self = new DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setDistributeSkStatus(Integer distributeSkStatus) {
            this.distributeSkStatus = distributeSkStatus;
            return this;
        }
        public Integer getDistributeSkStatus() {
            return this.distributeSkStatus;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setDpiSignatureDbVersion(String dpiSignatureDbVersion) {
            this.dpiSignatureDbVersion = dpiSignatureDbVersion;
            return this;
        }
        public String getDpiSignatureDbVersion() {
            return this.dpiSignatureDbVersion;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setHaState(String haState) {
            this.haState = haState;
            return this;
        }
        public String getHaState() {
            return this.haState;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setHcState(String hcState) {
            this.hcState = hcState;
            return this;
        }
        public String getHcState() {
            return this.hcState;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setMonitorVersion(String monitorVersion) {
            this.monitorVersion = monitorVersion;
            return this;
        }
        public String getMonitorVersion() {
            return this.monitorVersion;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setSoftwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }
        public String getSoftwareVersion() {
            return this.softwareVersion;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyDevices extends TeaModel {
        @NameInMap("Device")
        public java.util.List<DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice> device;

        public static DescribeSmartAccessGatewayAttributeResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyDevices self = new DescribeSmartAccessGatewayAttributeResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevices setDevice(java.util.List<DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice> device) {
            this.device = device;
            return this;
        }
        public java.util.List<DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice> getDevice() {
            return this.device;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds extends TeaModel {
        @NameInMap("FlowLogId")
        public java.util.List<String> flowLogId;

        public static DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds self = new DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds setFlowLogId(java.util.List<String> flowLogId) {
            this.flowLogId = flowLogId;
            return this;
        }
        public java.util.List<String> getFlowLogId() {
            return this.flowLogId;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyIRIds extends TeaModel {
        @NameInMap("IRId")
        public java.util.List<String> IRId;

        public static DescribeSmartAccessGatewayAttributeResponseBodyIRIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyIRIds self = new DescribeSmartAccessGatewayAttributeResponseBodyIRIds();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyIRIds setIRId(java.util.List<String> IRId) {
            this.IRId = IRId;
            return this;
        }
        public java.util.List<String> getIRId() {
            return this.IRId;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyLinksLink extends TeaModel {
        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("CommodityType")
        public String commodityType;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("HealthCheckTargetIp")
        public String healthCheckTargetIp;

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

        public static DescribeSmartAccessGatewayAttributeResponseBodyLinksLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyLinksLink self = new DescribeSmartAccessGatewayAttributeResponseBodyLinksLink();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setCommodityType(String commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public String getCommodityType() {
            return this.commodityType;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setHealthCheckTargetIp(String healthCheckTargetIp) {
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }
        public String getHealthCheckTargetIp() {
            return this.healthCheckTargetIp;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setRelateInstanceId(String relateInstanceId) {
            this.relateInstanceId = relateInstanceId;
            return this;
        }
        public String getRelateInstanceId() {
            return this.relateInstanceId;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setRelateInstanceRegionId(String relateInstanceRegionId) {
            this.relateInstanceRegionId = relateInstanceRegionId;
            return this;
        }
        public String getRelateInstanceRegionId() {
            return this.relateInstanceRegionId;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyLinks extends TeaModel {
        @NameInMap("Link")
        public java.util.List<DescribeSmartAccessGatewayAttributeResponseBodyLinksLink> link;

        public static DescribeSmartAccessGatewayAttributeResponseBodyLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyLinks self = new DescribeSmartAccessGatewayAttributeResponseBodyLinks();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinks setLink(java.util.List<DescribeSmartAccessGatewayAttributeResponseBodyLinksLink> link) {
            this.link = link;
            return this;
        }
        public java.util.List<DescribeSmartAccessGatewayAttributeResponseBodyLinksLink> getLink() {
            return this.link;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyQosIds extends TeaModel {
        @NameInMap("QosId")
        public java.util.List<String> qosId;

        public static DescribeSmartAccessGatewayAttributeResponseBodyQosIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyQosIds self = new DescribeSmartAccessGatewayAttributeResponseBodyQosIds();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyQosIds setQosId(java.util.List<String> qosId) {
            this.qosId = qosId;
            return this;
        }
        public java.util.List<String> getQosId() {
            return this.qosId;
        }

    }

}
