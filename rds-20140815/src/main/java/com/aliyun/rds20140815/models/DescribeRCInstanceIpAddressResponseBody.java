// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceIpAddressResponseBody extends TeaModel {
    /**
     * <p>The details of instances to which the assets that are assigned public IP addresses belong.</p>
     */
    @NameInMap("RCInstanceList")
    public java.util.List<DescribeRCInstanceIpAddressResponseBodyRCInstanceList> RCInstanceList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C048E440-EA84-5E97-8C81-2A7060D0****_th**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of assets that are assigned public IP addresses returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The basic DDoS Mitigation Threshold of the assets that are assigned public IP addresses. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5200</p>
         */
        @NameInMap("BlackholeThreshold")
        public Integer blackholeThreshold;

        /**
         * <p>The traffic scrubbing threshold of the assets that are assigned public IP addresses. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("DefenseBpsThreshold")
        public Integer defenseBpsThreshold;

        /**
         * <p>The message rate scrubbing threshold of the assets that are assigned public IP addresses. Unit: pps.</p>
         * 
         * <strong>example:</strong>
         * <p>70000</p>
         */
        @NameInMap("DefensePpsThreshold")
        public Integer defensePpsThreshold;

        /**
         * <p>The DDoS burstable Mitigation Threshold of the assets that are assigned public IP addresses. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>12310</p>
         */
        @NameInMap("ElasticThreshold")
        public Integer elasticThreshold;

        /**
         * <p>The IP address of the assets that are assigned public IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>39.105.XXX.XXX</p>
         */
        @NameInMap("InstanceIp")
        public String instanceIp;

        /**
         * <p>The DDoS mitigation status of the assets that are assigned public IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>mitigating</strong>: Cleaning.</li>
         * <li><strong>blackholed</strong>: Black Hole Activated.</li>
         * <li><strong>normal</strong>: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("IpStatus")
        public String ipStatus;

        /**
         * <p>The IP protocol version of the instance. Valid values:</p>
         * <ul>
         * <li><strong>v4</strong></li>
         * <li><strong>v6</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>v4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>Indicates whether the assets that are assigned public IP addresses is attached to Anti-DDoS Origin. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Attached.</li>
         * <li><strong>false</strong>: Not attached.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsBgppack")
        public Boolean isBgppack;

        /**
         * <p>Indicates whether best-effort protection is enabled for the assets that are assigned public IP addresses in Anti-DDoS Origin. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Best-effort protection is not enabled.</li>
         * <li><strong>1</strong>: Best-effort protection is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsFullProtection")
        public Integer isFullProtection;

        /**
         * <p>The region encoding of the assets that are assigned public IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-wt97-a01</p>
         */
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
        /**
         * <p>The Custom instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-kti8hw44yy0x53******</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The Custom instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-kti8hw44yy0x53******</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The DDoS mitigation status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>abnormal</strong>: Under attack.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The type of the assets that are assigned public IP addresses. The value is fixed as <strong>ecs</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The details of the assets that are assigned public IP addresses.</p>
         */
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
