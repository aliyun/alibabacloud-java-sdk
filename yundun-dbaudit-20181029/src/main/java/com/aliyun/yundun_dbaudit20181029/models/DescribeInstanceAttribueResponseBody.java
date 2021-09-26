// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttribueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceAttribue")
    public DescribeInstanceAttribueResponseBodyInstanceAttribue instanceAttribue;

    public static DescribeInstanceAttribueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttribueResponseBody self = new DescribeInstanceAttribueResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttribueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAttribueResponseBody setInstanceAttribue(DescribeInstanceAttribueResponseBodyInstanceAttribue instanceAttribue) {
        this.instanceAttribue = instanceAttribue;
        return this;
    }
    public DescribeInstanceAttribueResponseBodyInstanceAttribue getInstanceAttribue() {
        return this.instanceAttribue;
    }

    public static class DescribeInstanceAttribueResponseBodyInstanceAttribue extends TeaModel {
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
        public Integer instanceStatus;

        @NameInMap("LicenseCode")
        public String licenseCode;

        @NameInMap("PublicNetworkAccess")
        public Boolean publicNetworkAccess;

        @NameInMap("WhiteList")
        public java.util.List<String> whiteList;

        public static DescribeInstanceAttribueResponseBodyInstanceAttribue build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttribueResponseBodyInstanceAttribue self = new DescribeInstanceAttribueResponseBodyInstanceAttribue();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setInternetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setSeriesCode(String seriesCode) {
            this.seriesCode = seriesCode;
            return this;
        }
        public String getSeriesCode() {
            return this.seriesCode;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setPublicNetworkAccess(Boolean publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Boolean getPublicNetworkAccess() {
            return this.publicNetworkAccess;
        }

        public DescribeInstanceAttribueResponseBodyInstanceAttribue setWhiteList(java.util.List<String> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<String> getWhiteList() {
            return this.whiteList;
        }

    }

}
