// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20191209.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("InstanceAttribute")
    public DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute;

    /**
     * <strong>example:</strong>
     * <p>28382024-466D-4641-A144-40FD0DD53766</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponseBody self = new DescribeInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponseBody setInstanceAttribute(DescribeInstanceAttributeResponseBodyInstanceAttribute instanceAttribute) {
        this.instanceAttribute = instanceAttribute;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyInstanceAttribute getInstanceAttribute() {
        return this.instanceAttribute;
    }

    public DescribeInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceAttributeResponseBodyInstanceAttribute extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1578067200000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>dbaudit-cn-78v1gc****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <strong>example:</strong>
         * <p>tsiqvqjjlq-public.dbaudit.aliyuncs.com</p>
         */
        @NameInMap("InternetEndpoint")
        public String internetEndpoint;

        /**
         * <strong>example:</strong>
         * <p>tsiqvqjjlq.dbaudit.aliyuncs.com</p>
         */
        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        /**
         * <strong>example:</strong>
         * <p>alpha.professional</p>
         */
        @NameInMap("LicenseCode")
        public String licenseCode;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PublicNetworkAccess")
        public Boolean publicNetworkAccess;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>alpha</p>
         */
        @NameInMap("SeriesCode")
        public String seriesCode;

        /**
         * <strong>example:</strong>
         * <p>1577437765000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1c85tzgqu1bf5b****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1kep1f0k5fnyfs****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("WhiteList")
        public java.util.List<String> whiteList;

        public static DescribeInstanceAttributeResponseBodyInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstanceAttribute self = new DescribeInstanceAttributeResponseBodyInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setInternetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setPublicNetworkAccess(Boolean publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Boolean getPublicNetworkAccess() {
            return this.publicNetworkAccess;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setSeriesCode(String seriesCode) {
            this.seriesCode = seriesCode;
            return this;
        }
        public String getSeriesCode() {
            return this.seriesCode;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeInstanceAttributeResponseBodyInstanceAttribute setWhiteList(java.util.List<String> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<String> getWhiteList() {
            return this.whiteList;
        }

    }

}
