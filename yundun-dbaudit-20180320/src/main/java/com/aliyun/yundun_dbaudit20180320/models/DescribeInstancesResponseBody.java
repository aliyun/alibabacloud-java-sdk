// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("EcsStatus")
        public String ecsStatus;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("ImageVersionName")
        public String imageVersionName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InternetEndpoint")
        public String internetEndpoint;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Legacy")
        public Boolean legacy;

        @NameInMap("LicenseCode")
        public String licenseCode;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Operatable")
        public Boolean operatable;

        @NameInMap("PlanUpgradeStatus")
        public Integer planUpgradeStatus;

        @NameInMap("PlanUpgradeable")
        public Boolean planUpgradeable;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Renewable")
        public Boolean renewable;

        @NameInMap("SeriesCode")
        public String seriesCode;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("UpgradeStatus")
        public Integer upgradeStatus;

        @NameInMap("Upgradeable")
        public Boolean upgradeable;

        @NameInMap("VpcId")
        public String vpcId;

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

        public DescribeInstancesResponseBodyInstances setEcsStatus(String ecsStatus) {
            this.ecsStatus = ecsStatus;
            return this;
        }
        public String getEcsStatus() {
            return this.ecsStatus;
        }

        public DescribeInstancesResponseBodyInstances setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseBodyInstances setImageVersionName(String imageVersionName) {
            this.imageVersionName = imageVersionName;
            return this;
        }
        public String getImageVersionName() {
            return this.imageVersionName;
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

        public DescribeInstancesResponseBodyInstances setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeInstancesResponseBodyInstances setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public DescribeInstancesResponseBodyInstances setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
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

        public DescribeInstancesResponseBodyInstances setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeInstancesResponseBodyInstances setOperatable(Boolean operatable) {
            this.operatable = operatable;
            return this;
        }
        public Boolean getOperatable() {
            return this.operatable;
        }

        public DescribeInstancesResponseBodyInstances setPlanUpgradeStatus(Integer planUpgradeStatus) {
            this.planUpgradeStatus = planUpgradeStatus;
            return this;
        }
        public Integer getPlanUpgradeStatus() {
            return this.planUpgradeStatus;
        }

        public DescribeInstancesResponseBodyInstances setPlanUpgradeable(Boolean planUpgradeable) {
            this.planUpgradeable = planUpgradeable;
            return this;
        }
        public Boolean getPlanUpgradeable() {
            return this.planUpgradeable;
        }

        public DescribeInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstances setRenewable(Boolean renewable) {
            this.renewable = renewable;
            return this;
        }
        public Boolean getRenewable() {
            return this.renewable;
        }

        public DescribeInstancesResponseBodyInstances setSeriesCode(String seriesCode) {
            this.seriesCode = seriesCode;
            return this;
        }
        public String getSeriesCode() {
            return this.seriesCode;
        }

        public DescribeInstancesResponseBodyInstances setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeInstancesResponseBodyInstances setUpgradeStatus(Integer upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }
        public Integer getUpgradeStatus() {
            return this.upgradeStatus;
        }

        public DescribeInstancesResponseBodyInstances setUpgradeable(Boolean upgradeable) {
            this.upgradeable = upgradeable;
            return this;
        }
        public Boolean getUpgradeable() {
            return this.upgradeable;
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
