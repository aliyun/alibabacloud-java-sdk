// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewayAttributeResponseBody extends TeaModel {
    /**
     * <p>The peak bandwidth of application acceleration for the SAG instance. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AccelerateBandwidth")
    public Long accelerateBandwidth;

    /**
     * <p>The ID of the access point of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>238</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    @NameInMap("AclIds")
    public DescribeSmartAccessGatewayAttributeResponseBodyAclIds aclIds;

    /**
     * <p>The status of the application acceleration bandwidth package instance.</p>
     * <ul>
     * <li><strong>Abnormal</strong>: Abnormal.</li>
     * <li><strong>Normal</strong>: Normal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("ApplicationBandwidthPackageBussinessStatus")
    public String applicationBandwidthPackageBussinessStatus;

    /**
     * <p>The ID of the application acceleration bandwidth package associated with the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>abwp-7963l7iqnquyj3****</p>
     */
    @NameInMap("ApplicationBandwidthPackageId")
    public String applicationBandwidthPackageId;

    /**
     * <p>The name of the application acceleration bandwidth package associated with the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("ApplicationBandwidthPackageName")
    public String applicationBandwidthPackageName;

    /**
     * <p>The lock information of the application acceleration bandwidth package instance.</p>
     */
    @NameInMap("ApplicationBandwidthPackageOperationLocks")
    public DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks applicationBandwidthPackageOperationLocks;

    /**
     * <p>The ID of the CCN instance associated with the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ccn-iz26o9zye6lhoo****</p>
     */
    @NameInMap("AssociatedCcnId")
    public String associatedCcnId;

    /**
     * <p>The name of the Cloud Connect Network (CCN) instance associated with the SAG instance.</p>
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
     * <p>The public IP address of the primary SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>112.XX.XX.25</p>
     */
    @NameInMap("BoxControllerIp")
    public String boxControllerIp;

    /**
     * <p>The private CIDR block used for communication between the on-premises network or clients and the cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.9.0/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The ID of the city where the SAG device is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The creation timestamp of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1622617250000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The data plan of the SAG instance. Unit: GB.</p>
     * <blockquote>
     * <p>Currently, only 5 GB of complimentary data traffic is provided for each account per month.</p>
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
     * <p>Indicates whether the optimized retransmission feature is enabled for the SAG instance.</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableOptimization")
    public Boolean enableOptimization;

    /**
     * <p>Indicates whether connection log auditing is enabled for the SAG APP instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Connection log auditing is enabled for the SAG APP instance.</p>
     * </li>
     * <li><p><strong>false</strong>: Connection log auditing is disabled for the SAG APP instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSoftwareConnectionAudit")
    public Boolean enableSoftwareConnectionAudit;

    /**
     * <p>The expiration timestamp of the SAG instance.</p>
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
     * <p>The type of the SAG instance.</p>
     * <ul>
     * <li><strong>sag-1000</strong>: The instance is a hardware SAG instance with a SAG-1000 device.</li>
     * <li><strong>sag-10wm</strong>: The instance is a hardware SAG instance with a SAG-100WM device.</li>
     * <li><strong>sag-software</strong>: The instance is an SAG APP instance.</li>
     * <li><strong>sag-vcpe</strong>: The instance is an SAG vCPE instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sag-vcpe</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The status of the IPsec-VPN connection.</p>
     * <ul>
     * <li><strong>up</strong>: The IPsec-VPN connection is normal.</li>
     * <li><strong>down</strong>: The IPsec-VPN connection is abnormal.</li>
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
     * <p>The peak bandwidth of the SAG instance. Unit: Mbit/s.</p>
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
     * <p>The optimized retransmission type of the SAG instance. After the optimized retransmission type is enabled, the default value is <strong>fec</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>fec</p>
     */
    @NameInMap("OptimizationType")
    public Boolean optimizationType;

    /**
     * <p>The location of the SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>shanghai</p>
     */
    @NameInMap("Position")
    public String position;

    @NameInMap("QosIds")
    public DescribeSmartAccessGatewayAttributeResponseBodyQosIds qosIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F02D092B-A0B7-4BA1-BCA7-014B953C5DC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the reseller instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-v0fkpk4akfz5******</p>
     */
    @NameInMap("ResellerInstanceId")
    public String resellerInstanceId;

    /**
     * <p>The ID of the reseller account.</p>
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
     * <p>The routing synchronization method of the SAG instance.</p>
     * <ul>
     * <li><p><strong>static</strong>: Static routing.</p>
     * </li>
     * <li><p><strong>dynamic</strong>: Dynamic routing.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("RoutingStrategy")
    public String routingStrategy;

    /**
     * <p>The time threshold for locking the SAG device when it goes offline.</p>
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
     * <p>The status of the SAG instance.</p>
     * <ul>
     * <li><strong>Ordered</strong>: Pending delivery.</li>
     * <li><strong>Delivered</strong>: Delivered.</li>
     * <li><strong>Received</strong>: Activated.</li>
     * <li><strong>Unconfirmed</strong>: Pending confirmation.</li>
     * <li><strong>Active</strong>: Available.</li>
     * <li><strong>Offline</strong>: Offline.</li>
     * <li><strong>Arrearage</strong>: Locked due to overdue payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The serial number of the SAG device that is currently responsible for transmitting traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>sage6nniq3d****</p>
     */
    @NameInMap("TrafficMasterSn")
    public String trafficMasterSn;

    /**
     * <p>The maximum upstream bandwidth of the 4G public network for the SAG device. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("UpBandwidth4G")
    public Integer upBandwidth4G;

    /**
     * <p>The maximum upstream bandwidth of the WAN port for the SAG device. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("UpBandwidthWan")
    public Integer upBandwidthWan;

    /**
     * <p>The number of client accounts of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("UserCount")
    public Integer userCount;

    /**
     * <p>The status of the aliVPN connection.</p>
     * <ul>
     * <li><strong>up</strong>: The aliVPN connection is normal.</li>
     * <li><strong>down</strong>: The aliVPN connection is abnormal.</li>
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
         * <p>The reason for the lock.</p>
         * 
         * <strong>example:</strong>
         * <p>Message</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The lock type. Valid value: <strong>FinancialLocked</strong>.</p>
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
