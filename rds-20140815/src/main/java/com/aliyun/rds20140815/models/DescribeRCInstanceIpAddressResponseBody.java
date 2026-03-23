// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceIpAddressResponseBody extends TeaModel {
    @NameInMap("RCInstanceList")
    public java.util.List<DescribeRCInstanceIpAddressResponseBodyRCInstanceList> RCInstanceList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public String total;

    public static DescribeRCInstanceIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceIpAddressResponseBody self = new DescribeRCInstanceIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceIpAddressResponseBody setRCInstanceList(java.util.List<DescribeRCInstanceIpAddressResponseBodyRCInstanceList> RCInstanceList) {
        this.RCInstanceList = RCInstanceList;
        return this;
    }
    public java.util.List<DescribeRCInstanceIpAddressResponseBodyRCInstanceList> getRCInstanceList() {
        return this.RCInstanceList;
    }

    public DescribeRCInstanceIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCInstanceIpAddressResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig extends TeaModel {
        @NameInMap("BlackholeThreshold")
        public Integer blackholeThreshold;

        @NameInMap("DefenseBpsThreshold")
        public Integer defenseBpsThreshold;

        @NameInMap("DefensePpsThreshold")
        public Integer defensePpsThreshold;

        @NameInMap("ElasticThreshold")
        public Integer elasticThreshold;

        @NameInMap("InstanceIp")
        public String instanceIp;

        @NameInMap("IpStatus")
        public String ipStatus;

        @NameInMap("IpVersion")
        public String ipVersion;

        @NameInMap("IsBgppack")
        public Boolean isBgppack;

        @NameInMap("IsFullProtection")
        public Integer isFullProtection;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig self = new DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig setBlackholeThreshold(Integer blackholeThreshold) {
            this.blackholeThreshold = blackholeThreshold;
            return this;
        }
        public Integer getBlackholeThreshold() {
            return this.blackholeThreshold;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig setDefenseBpsThreshold(Integer defenseBpsThreshold) {
            this.defenseBpsThreshold = defenseBpsThreshold;
            return this;
        }
        public Integer getDefenseBpsThreshold() {
            return this.defenseBpsThreshold;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig setDefensePpsThreshold(Integer defensePpsThreshold) {
            this.defensePpsThreshold = defensePpsThreshold;
            return this;
        }
        public Integer getDefensePpsThreshold() {
            return this.defensePpsThreshold;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig setElasticThreshold(Integer elasticThreshold) {
            this.elasticThreshold = elasticThreshold;
            return this;
        }
        public Integer getElasticThreshold() {
            return this.elasticThreshold;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig setInstanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }
        public String getInstanceIp() {
            return this.instanceIp;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig setIpStatus(String ipStatus) {
            this.ipStatus = ipStatus;
            return this;
        }
        public String getIpStatus() {
            return this.ipStatus;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig setIsBgppack(Boolean isBgppack) {
            this.isBgppack = isBgppack;
            return this;
        }
        public Boolean getIsBgppack() {
            return this.isBgppack;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig setIsFullProtection(Integer isFullProtection) {
            this.isFullProtection = isFullProtection;
            return this;
        }
        public Integer getIsFullProtection() {
            return this.isFullProtection;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRCInstanceIpAddressResponseBodyRCInstanceList extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("IpAddressConfig")
        public java.util.List<DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig> ipAddressConfig;

        public static DescribeRCInstanceIpAddressResponseBodyRCInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceIpAddressResponseBodyRCInstanceList self = new DescribeRCInstanceIpAddressResponseBodyRCInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceList setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeRCInstanceIpAddressResponseBodyRCInstanceList setIpAddressConfig(java.util.List<DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig> ipAddressConfig) {
            this.ipAddressConfig = ipAddressConfig;
            return this;
        }
        public java.util.List<DescribeRCInstanceIpAddressResponseBodyRCInstanceListIpAddressConfig> getIpAddressConfig() {
            return this.ipAddressConfig;
        }

    }

}
