// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the bastion hosts returned.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>61D36C55-AAFC-4678-8FAD-34FEF9E7182E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of bastion hosts that are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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
        @NameInMap("BandWidth")
        public Long bandWidth;

        /**
         * <p>The remarks of the bastion host.</p>
         * 
         * <strong>example:</strong>
         * <p>Test API</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The timestamp when the bastion host expires. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1578326400000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The image version of the bastion host.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0.0</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>The bastion host ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-78v1gh****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the bastion host. Valid values:</p>
         * <ul>
         * <li><strong>PENDING</strong>: The bastion host is not initialized.</li>
         * <li><strong>CREATING</strong>: The bastion host is being created.</li>
         * <li><strong>RUNNING</strong>: The bastion host is running.</li>
         * <li><strong>EXPIRED</strong>: The bastion host expired.</li>
         * <li><strong>CREATE_FAILED</strong>: The bastion host fails to be created.</li>
         * <li><strong>UPGRADING</strong>: The configurations of the bastion host are being changed.</li>
         * <li><strong>UPGRADE_FAILED</strong>: The configurations of the bastion host fail to be changed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The public O\&amp;M address of the bastion host.</p>
         * 
         * <strong>example:</strong>
         * <p>drawvxalwb-public.bastionhost.aliyuncs.com</p>
         */
        @NameInMap("InternetEndpoint")
        public String internetEndpoint;

        /**
         * <p>The private O\&amp;M address of the bastion host.</p>
         * 
         * <strong>example:</strong>
         * <p>drawvxalwb.bastionhost.aliyuncs.com</p>
         */
        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        /**
         * <p>Indicates whether the bastion host runs an earlier version. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The bastion host runs V2 or V3.1.</li>
         * <li><strong>false</strong>: The bastion host runs V3.2.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Legacy")
        public Boolean legacy;

        /**
         * <p>The license code of the bastion host.</p>
         * 
         * <strong>example:</strong>
         * <p>bhah_ent_50_asset</p>
         */
        @NameInMap("LicenseCode")
        public String licenseCode;

        /**
         * <p>The edition of the bastion host. Valid values:</p>
         * <ul>
         * <li><strong>cloudbastion</strong>: Basic Edition.</li>
         * <li><strong>cloudbastion_ha</strong>: Enterprise Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloudbastion_ha</p>
         */
        @NameInMap("PlanCode")
        public String planCode;

        /**
         * <p>Indicates whether the bastion host can be accessed from the Internet. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PublicNetworkAccess")
        public Boolean publicNetworkAccess;

        /**
         * <p>The region ID of the bastion host.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the bastion host belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>g-acfm26ougi****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SlaveVswitchId")
        public String slaveVswitchId;

        /**
         * <p>The timestamp when the bastion host is purchased or renewed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1577681345000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the bastion host belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1c85tzgqu1bf5b****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch to which the bastion host belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1xfwzzfti0kjbf****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
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

        public DescribeInstancesResponseBodyInstances setSlaveVswitchId(String slaveVswitchId) {
            this.slaveVswitchId = slaveVswitchId;
            return this;
        }
        public String getSlaveVswitchId() {
            return this.slaveVswitchId;
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
