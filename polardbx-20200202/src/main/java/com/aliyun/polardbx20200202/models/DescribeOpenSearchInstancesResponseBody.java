// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The operation result.</p>
     */
    @NameInMap("Data")
    public DescribeOpenSearchInstancesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOpenSearchInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchInstancesResponseBody self = new DescribeOpenSearchInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchInstancesResponseBody setAccessDeniedDetail(DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeOpenSearchInstancesResponseBody setData(DescribeOpenSearchInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOpenSearchInstancesResponseBodyData getData() {
        return this.data;
    }

    public DescribeOpenSearchInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authentication principal.</p>
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
         * <p>The type of the authentication principal.</p>
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

        public static DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail self = new DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeOpenSearchInstancesResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeOpenSearchInstancesResponseBodyDataInstances extends TeaModel {
        /**
         * <p>The zone.</p>
         * 
         * <strong>example:</strong>
         * <p>t1222576965886205</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of CPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-08T07:19:05.000+0000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The number of data nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DataNodeCount")
        public Integer dataNodeCount;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>My Supabase project</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The DPI engine version. Default value: 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-shrdb7a2t8w3c1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        /**
         * <p>The network type of the connection string. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: public endpoint.</li>
         * <li><strong>Private</strong>: private endpoint.</li>
         * <li><strong>Inner</strong>: private endpoint (classic network).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The display name of the instance specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>8 cores 32 GB</p>
         */
        @NameInMap("SpecDisplay")
        public String specDisplay;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage size of a single data node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("StorageSizeGB")
        public Integer storageSizeGB;

        public static DescribeOpenSearchInstancesResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchInstancesResponseBodyDataInstances self = new DescribeOpenSearchInstancesResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setDataNodeCount(Integer dataNodeCount) {
            this.dataNodeCount = dataNodeCount;
            return this;
        }
        public Integer getDataNodeCount() {
            return this.dataNodeCount;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setSpecDisplay(String specDisplay) {
            this.specDisplay = specDisplay;
            return this;
        }
        public String getSpecDisplay() {
            return this.specDisplay;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOpenSearchInstancesResponseBodyDataInstances setStorageSizeGB(Integer storageSizeGB) {
            this.storageSizeGB = storageSizeGB;
            return this;
        }
        public Integer getStorageSizeGB() {
            return this.storageSizeGB;
        }

    }

    public static class DescribeOpenSearchInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("Instances")
        public java.util.List<DescribeOpenSearchInstancesResponseBodyDataInstances> instances;

        /**
         * <p>The maximum number of entries per page for a paging query. Maximum value: 100. Default value: If you do not specify a value or the value is less than 10, the default value is 10. If the value is greater than 100, the default value is 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kmMV9kamx92yNWehxph5Fw</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>130</p>
         */
        @NameInMap("TotalNumber")
        public Integer totalNumber;

        public static DescribeOpenSearchInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchInstancesResponseBodyData self = new DescribeOpenSearchInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchInstancesResponseBodyData setInstances(java.util.List<DescribeOpenSearchInstancesResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<DescribeOpenSearchInstancesResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

        public DescribeOpenSearchInstancesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeOpenSearchInstancesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeOpenSearchInstancesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeOpenSearchInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeOpenSearchInstancesResponseBodyData setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

}
