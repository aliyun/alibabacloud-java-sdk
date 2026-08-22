// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchInfoResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeOpenSearchInfoResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The returned result set.</p>
     */
    @NameInMap("Data")
    public DescribeOpenSearchInfoResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>173CA69A-3513-591D-8A09-C1EA37CBE2D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOpenSearchInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchInfoResponseBody self = new DescribeOpenSearchInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchInfoResponseBody setAccessDeniedDetail(DescribeOpenSearchInfoResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeOpenSearchInfoResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeOpenSearchInfoResponseBody setData(DescribeOpenSearchInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOpenSearchInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeOpenSearchInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOpenSearchInfoResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The identity used for authentication in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The authentication principal type.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encoded diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of the permission denial.</p>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeOpenSearchInfoResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchInfoResponseBodyAccessDeniedDetail self = new DescribeOpenSearchInfoResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchInfoResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeOpenSearchInfoResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeOpenSearchInfoResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeOpenSearchInfoResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeOpenSearchInfoResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeOpenSearchInfoResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeOpenSearchInfoResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeOpenSearchInfoResponseBodyDataInstance extends TeaModel {
        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * <li><strong>PREPAY</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The OpenSearch-compatible version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("CompatibleVersion")
        public String compatibleVersion;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-17T02:00:20Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The deployment mode. Valid values:</p>
         * <ul>
         * <li>multiple: multi-zone deployment.</li>
         * <li>single: single-zone deployment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The DPI engine version. Default value: 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>anchashi</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-27T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-spsil01pww4hfz-mem</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-bjr76v5uw7z4f5fs-cdc</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The network type of the connection string. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: public endpoint.</li>
         * <li><strong>Private</strong>: private endpoint.</li>
         * <li><strong>Inner</strong>: private endpoint (classic network).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the last task was updated (in timestamp format).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-02T16:01:51Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the access endpoint resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze99u5upo8zxyf5dlfl5</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The vSwitch ID. This parameter is required when you create a DRDS instance of the VPC network type.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zes4ojp6ygziyvq3vhd2</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeOpenSearchInfoResponseBodyDataInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchInfoResponseBodyDataInstance self = new DescribeOpenSearchInfoResponseBodyDataInstance();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setCompatibleVersion(String compatibleVersion) {
            this.compatibleVersion = compatibleVersion;
            return this;
        }
        public String getCompatibleVersion() {
            return this.compatibleVersion;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeOpenSearchInfoResponseBodyDataInstance setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeOpenSearchInfoResponseBodyDataSpec extends TeaModel {
        /**
         * <p>The number of coordinator nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CoordinatorNodeCount")
        public Integer coordinatorNodeCount;

        /**
         * <p>The number of CPU cores of a single coordinator node.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CoordinatorNodeCpu")
        public Integer coordinatorNodeCpu;

        /**
         * <p>Indicates whether coordinator nodes are enabled.</p>
         */
        @NameInMap("CoordinatorNodeEnabled")
        public Boolean coordinatorNodeEnabled;

        /**
         * <p>The memory size of a single coordinator node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("CoordinatorNodeMemoryGB")
        public Integer coordinatorNodeMemoryGB;

        /**
         * <p>The number of data nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DataNodeCount")
        public Integer dataNodeCount;

        /**
         * <p>The number of CPU cores of a single data node.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DataNodeCpu")
        public Integer dataNodeCpu;

        /**
         * <p>The memory size of a single data node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("DataNodeMemoryGB")
        public Integer dataNodeMemoryGB;

        /**
         * <p>The master node type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The master node is a single node.</li>
         * <li><strong>2</strong>: The master node is in Cluster Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MasterNodeCount")
        public Integer masterNodeCount;

        /**
         * <p>The number of CPU cores of a single dedicated master node.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MasterNodeCpu")
        public Integer masterNodeCpu;

        /**
         * <p>Indicates whether dedicated master nodes are enabled.</p>
         */
        @NameInMap("MasterNodeEnabled")
        public Boolean masterNodeEnabled;

        /**
         * <p>The memory size of a single dedicated master node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("MasterNodeMemoryGB")
        public Integer masterNodeMemoryGB;

        /**
         * <p>The number of replica nodes in the primary zone.</p>
         * <blockquote>
         * <p>The <strong>ReplicaCount</strong> and <strong>SlaveReplicaCount</strong> parameters apply only to cloud-native instances. If the instance uses a cluster architecture, these parameters indicate the number of replica nodes of a <strong>single shard</strong> in the primary and secondary zones.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReplicaCount")
        public Integer replicaCount;

        /**
         * <p>The storage size of a single data node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("StorageSizeGB")
        public Integer storageSizeGB;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeOpenSearchInfoResponseBodyDataSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchInfoResponseBodyDataSpec self = new DescribeOpenSearchInfoResponseBodyDataSpec();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setCoordinatorNodeCount(Integer coordinatorNodeCount) {
            this.coordinatorNodeCount = coordinatorNodeCount;
            return this;
        }
        public Integer getCoordinatorNodeCount() {
            return this.coordinatorNodeCount;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setCoordinatorNodeCpu(Integer coordinatorNodeCpu) {
            this.coordinatorNodeCpu = coordinatorNodeCpu;
            return this;
        }
        public Integer getCoordinatorNodeCpu() {
            return this.coordinatorNodeCpu;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setCoordinatorNodeEnabled(Boolean coordinatorNodeEnabled) {
            this.coordinatorNodeEnabled = coordinatorNodeEnabled;
            return this;
        }
        public Boolean getCoordinatorNodeEnabled() {
            return this.coordinatorNodeEnabled;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setCoordinatorNodeMemoryGB(Integer coordinatorNodeMemoryGB) {
            this.coordinatorNodeMemoryGB = coordinatorNodeMemoryGB;
            return this;
        }
        public Integer getCoordinatorNodeMemoryGB() {
            return this.coordinatorNodeMemoryGB;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setDataNodeCount(Integer dataNodeCount) {
            this.dataNodeCount = dataNodeCount;
            return this;
        }
        public Integer getDataNodeCount() {
            return this.dataNodeCount;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setDataNodeCpu(Integer dataNodeCpu) {
            this.dataNodeCpu = dataNodeCpu;
            return this;
        }
        public Integer getDataNodeCpu() {
            return this.dataNodeCpu;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setDataNodeMemoryGB(Integer dataNodeMemoryGB) {
            this.dataNodeMemoryGB = dataNodeMemoryGB;
            return this;
        }
        public Integer getDataNodeMemoryGB() {
            return this.dataNodeMemoryGB;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setMasterNodeCount(Integer masterNodeCount) {
            this.masterNodeCount = masterNodeCount;
            return this;
        }
        public Integer getMasterNodeCount() {
            return this.masterNodeCount;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setMasterNodeCpu(Integer masterNodeCpu) {
            this.masterNodeCpu = masterNodeCpu;
            return this;
        }
        public Integer getMasterNodeCpu() {
            return this.masterNodeCpu;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setMasterNodeEnabled(Boolean masterNodeEnabled) {
            this.masterNodeEnabled = masterNodeEnabled;
            return this;
        }
        public Boolean getMasterNodeEnabled() {
            return this.masterNodeEnabled;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setMasterNodeMemoryGB(Integer masterNodeMemoryGB) {
            this.masterNodeMemoryGB = masterNodeMemoryGB;
            return this;
        }
        public Integer getMasterNodeMemoryGB() {
            return this.masterNodeMemoryGB;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setReplicaCount(Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }
        public Integer getReplicaCount() {
            return this.replicaCount;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setStorageSizeGB(Integer storageSizeGB) {
            this.storageSizeGB = storageSizeGB;
            return this;
        }
        public Integer getStorageSizeGB() {
            return this.storageSizeGB;
        }

        public DescribeOpenSearchInfoResponseBodyDataSpec setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class DescribeOpenSearchInfoResponseBodyData extends TeaModel {
        /**
         * <p>The instance information.</p>
         */
        @NameInMap("Instance")
        public DescribeOpenSearchInfoResponseBodyDataInstance instance;

        /**
         * <p>The specifications.</p>
         */
        @NameInMap("Spec")
        public DescribeOpenSearchInfoResponseBodyDataSpec spec;

        public static DescribeOpenSearchInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchInfoResponseBodyData self = new DescribeOpenSearchInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchInfoResponseBodyData setInstance(DescribeOpenSearchInfoResponseBodyDataInstance instance) {
            this.instance = instance;
            return this;
        }
        public DescribeOpenSearchInfoResponseBodyDataInstance getInstance() {
            return this.instance;
        }

        public DescribeOpenSearchInfoResponseBodyData setSpec(DescribeOpenSearchInfoResponseBodyDataSpec spec) {
            this.spec = spec;
            return this;
        }
        public DescribeOpenSearchInfoResponseBodyDataSpec getSpec() {
            return this.spec;
        }

    }

}
