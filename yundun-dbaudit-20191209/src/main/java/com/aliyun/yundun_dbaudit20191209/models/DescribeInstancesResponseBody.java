// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20191209.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setInstances(java.util.List<DescribeInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InternetEndpoint")
        public String internetEndpoint;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("SeriesCode")
        public String seriesCode;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("LicenseCode")
        public String licenseCode;

        @NameInMap("PublicNetworkAccess")
        public Boolean publicNetworkAccess;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
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

        public DescribeInstancesResponseBodyInstances setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstances setInternetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        public DescribeInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstances setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public DescribeInstancesResponseBodyInstances setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeInstancesResponseBodyInstances setSeriesCode(String seriesCode) {
            this.seriesCode = seriesCode;
            return this;
        }
        public String getSeriesCode() {
            return this.seriesCode;
        }

        public DescribeInstancesResponseBodyInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstancesResponseBodyInstances setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstancesResponseBodyInstances setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public DescribeInstancesResponseBodyInstances setPublicNetworkAccess(Boolean publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Boolean getPublicNetworkAccess() {
            return this.publicNetworkAccess;
        }

    }

}
