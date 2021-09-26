// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceAttribute")
    public DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute;

    public static DescribeInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponseBody self = new DescribeInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAttributeResponseBody setInstanceAttribute(DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute) {
        this.instanceAttribute = instanceAttribute;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyInstanceAttribute getInstanceAttribute() {
        return this.instanceAttribute;
    }

    public static class DescribeInstanceAttributeResponseBodyInstanceAttributeInstanceConnections extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("InstanceConnectionBandwidth")
        public Integer instanceConnectionBandwidth;

        @NameInMap("InstanceConnectionDomain")
        public String instanceConnectionDomain;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        @NameInMap("VswitchIds")
        public java.util.List<String> vswitchIds;

        public static DescribeInstanceAttributeResponseBodyInstanceAttributeInstanceConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstanceAttributeInstanceConnections self = new DescribeInstanceAttributeResponseBodyInstanceAttributeInstanceConnections();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttributeInstanceConnections setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttributeInstanceConnections setInstanceConnectionBandwidth(Integer instanceConnectionBandwidth) {
            this.instanceConnectionBandwidth = instanceConnectionBandwidth;
            return this;
        }
        public Integer getInstanceConnectionBandwidth() {
            return this.instanceConnectionBandwidth;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttributeInstanceConnections setInstanceConnectionDomain(String instanceConnectionDomain) {
            this.instanceConnectionDomain = instanceConnectionDomain;
            return this;
        }
        public String getInstanceConnectionDomain() {
            return this.instanceConnectionDomain;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttributeInstanceConnections setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttributeInstanceConnections setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInstanceAttribute extends TeaModel {
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

        @NameInMap("InstanceConnections")
        public java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributeInstanceConnections> instanceConnections;

        public static DescribeInstanceAttributeResponseBodyInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstanceAttribute self = new DescribeInstanceAttributeResponseBodyInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstancePurchaseStorage(Long instancePurchaseStorage) {
            this.instancePurchaseStorage = instancePurchaseStorage;
            return this;
        }
        public Long getInstancePurchaseStorage() {
            return this.instancePurchaseStorage;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceTotalStorage(Long instanceTotalStorage) {
            this.instanceTotalStorage = instanceTotalStorage;
            return this;
        }
        public Long getInstanceTotalStorage() {
            return this.instanceTotalStorage;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceConnectionQuota(Integer instanceConnectionQuota) {
            this.instanceConnectionQuota = instanceConnectionQuota;
            return this;
        }
        public Integer getInstanceConnectionQuota() {
            return this.instanceConnectionQuota;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceDatabaseQuota(Long instanceDatabaseQuota) {
            this.instanceDatabaseQuota = instanceDatabaseQuota;
            return this;
        }
        public Long getInstanceDatabaseQuota() {
            return this.instanceDatabaseQuota;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setSeriesCode(String seriesCode) {
            this.seriesCode = seriesCode;
            return this;
        }
        public String getSeriesCode() {
            return this.seriesCode;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceConnectionMaxBandwidth(Integer instanceConnectionMaxBandwidth) {
            this.instanceConnectionMaxBandwidth = instanceConnectionMaxBandwidth;
            return this;
        }
        public Integer getInstanceConnectionMaxBandwidth() {
            return this.instanceConnectionMaxBandwidth;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceConnections(java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributeInstanceConnections> instanceConnections) {
            this.instanceConnections = instanceConnections;
            return this;
        }
        public java.util.List<DescribeInstanceAttributeResponseBodyInstanceAttributeInstanceConnections> getInstanceConnections() {
            return this.instanceConnections;
        }

    }

}
