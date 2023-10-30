// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the queried bastion hosts.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of bastion hosts that are queried.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(java.util.List<DescribeInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>The description of the bastion host.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The timestamp when the bastion host expires. Unit: milliseconds.</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The image version of the bastion host.</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>The ID of the bastion host.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the bastion host. Valid values:</p>
         * <br>
         * <p>*   **PENDING**: The bastion host is not initialized.</p>
         * <p>*   **CREATING**: The bastion host is being created.</p>
         * <p>*   **RUNNING**: The bastion host is running.</p>
         * <p>*   **EXPIRED**: The bastion host expired.</p>
         * <p>*   **CREATE_FAILED**: The bastion host fails to be created.</p>
         * <p>*   **UPGRADING**: The configurations of the bastion host are being changed.</p>
         * <p>*   **UPGRADE_FAILED**: The configurations of the bastion host fail to be changed.</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The public O\&M address of the bastion host.</p>
         */
        @NameInMap("InternetEndpoint")
        public String internetEndpoint;

        /**
         * <p>The private O\&M address of the bastion host.</p>
         */
        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        /**
         * <p>Indicates whether the bastion host runs an earlier version. Valid values:</p>
         * <br>
         * <p>*   **true**: indicates that the bastion host runs V2 or V3.1.</p>
         * <p>*   **false**:indicates that the bastion host runs V3.2.</p>
         */
        @NameInMap("Legacy")
        public Boolean legacy;

        /**
         * <p>The license code of the bastion host.</p>
         */
        @NameInMap("LicenseCode")
        public String licenseCode;

        /**
         * <p>The edition of the bastion host. Valid values:</p>
         * <br>
         * <p>*   **cloudbastion**: Basic</p>
         * <p>*   **cloudbastion_ha**: Enterprise</p>
         */
        @NameInMap("PlanCode")
        public String planCode;

        /**
         * <p>Indicates whether the bastion host can be accessed from the Internet. Valid values:</p>
         * <br>
         * <p>*   **true**: The bastion host can be accessed from the Internet.</p>
         * <p>*   **false**: The bastion host cannot be accessed from the Internet.</p>
         */
        @NameInMap("PublicNetworkAccess")
        public Boolean publicNetworkAccess;

        /**
         * <p>The region ID of the bastion host.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the bastion host belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The timestamp when the bastion host is purchased or renewed. Unit: milliseconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the bastion host belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch to which the bastion host belongs.</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstancesResponseBodyInstances setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseBodyInstances setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstances setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstancesResponseBodyInstances setInternetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        public DescribeInstancesResponseBodyInstances setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public DescribeInstancesResponseBodyInstances setLegacy(Boolean legacy) {
            this.legacy = legacy;
            return this;
        }
        public Boolean getLegacy() {
            return this.legacy;
        }

        public DescribeInstancesResponseBodyInstances setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public DescribeInstancesResponseBodyInstances setPlanCode(String planCode) {
            this.planCode = planCode;
            return this;
        }
        public String getPlanCode() {
            return this.planCode;
        }

        public DescribeInstancesResponseBodyInstances setPublicNetworkAccess(Boolean publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Boolean getPublicNetworkAccess() {
            return this.publicNetworkAccess;
        }

        public DescribeInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesResponseBodyInstances setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeInstancesResponseBodyInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstancesResponseBodyInstances setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

}
