// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

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
        @NameInMap("InstancePurchaseStorage")
        public Long instancePurchaseStorage;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("InstanceTotalStorage")
        public Long instanceTotalStorage;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceConnectionQuota")
        public Integer instanceConnectionQuota;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("InstanceDatabaseQuota")
        public Long instanceDatabaseQuota;

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

        @NameInMap("InstanceConnectionMaxBandwidth")
        public Integer instanceConnectionMaxBandwidth;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setInstancePurchaseStorage(Long instancePurchaseStorage) {
            this.instancePurchaseStorage = instancePurchaseStorage;
            return this;
        }
        public Long getInstancePurchaseStorage() {
            return this.instancePurchaseStorage;
        }

        public DescribeInstancesResponseBodyInstances setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseBodyInstances setInstanceTotalStorage(Long instanceTotalStorage) {
            this.instanceTotalStorage = instanceTotalStorage;
            return this;
        }
        public Long getInstanceTotalStorage() {
            return this.instanceTotalStorage;
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

        public DescribeInstancesResponseBodyInstances setInstanceConnectionQuota(Integer instanceConnectionQuota) {
            this.instanceConnectionQuota = instanceConnectionQuota;
            return this;
        }
        public Integer getInstanceConnectionQuota() {
            return this.instanceConnectionQuota;
        }

        public DescribeInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstances setInstanceDatabaseQuota(Long instanceDatabaseQuota) {
            this.instanceDatabaseQuota = instanceDatabaseQuota;
            return this;
        }
        public Long getInstanceDatabaseQuota() {
            return this.instanceDatabaseQuota;
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

        public DescribeInstancesResponseBodyInstances setInstanceConnectionMaxBandwidth(Integer instanceConnectionMaxBandwidth) {
            this.instanceConnectionMaxBandwidth = instanceConnectionMaxBandwidth;
            return this;
        }
        public Integer getInstanceConnectionMaxBandwidth() {
            return this.instanceConnectionMaxBandwidth;
        }

    }

}
