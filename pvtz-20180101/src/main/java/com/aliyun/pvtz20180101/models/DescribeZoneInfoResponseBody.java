// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneInfoResponseBody extends TeaModel {
    @NameInMap("BindEdgeDnsClusters")
    public DescribeZoneInfoResponseBodyBindEdgeDnsClusters bindEdgeDnsClusters;

    /**
     * <p>The VPCs associated with the zone.</p>
     */
    @NameInMap("BindVpcs")
    public DescribeZoneInfoResponseBodyBindVpcs bindVpcs;

    /**
     * <p>The time when the zone was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-23T03:15Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the zone was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1516775741000</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The creator of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>141339776561****</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The type of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("CreatorType")
    public String creatorType;

    /**
     * <p>The logical location type of the built-in authoritative module in which the zone is added. Valid values:</p>
     * <ul>
     * <li><strong>NORMAL_ZONE</strong>: regular module</li>
     * <li><strong>FAST_ZONE</strong>: acceleration module</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FAST_ZONE</p>
     */
    @NameInMap("DnsGroup")
    public String dnsGroup;

    /**
     * <p>Indicates whether the zone is being removed to another logical location. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DnsGroupChanging")
    public Boolean dnsGroupChanging;

    /**
     * <p>Indicates whether the zone is a reverse lookup zone. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsPtr")
    public Boolean isPtr;

    /**
     * <p>Indicates whether the recursive resolution proxy for subdomain names is enabled. Valid values:</p>
     * <ul>
     * <li>ZONE: The recursive resolution proxy for subdomain names is disabled. In this case, NXDOMAIN is returned if the queried domain name does not exist in the zone.</li>
     * <li>RECORD: The recursive resolution proxy for subdomain names is enabled. In this case, if the queried domain name does not exist in the zone, DNS requests are recursively forwarded to the forward module and then to the recursion module until DNS results are returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ZONE</p>
     */
    @NameInMap("ProxyPattern")
    public String proxyPattern;

    /**
     * <p>The total number of DNS records added in the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RecordCount")
    public Integer recordCount;

    /**
     * <p>The description of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F73F41A3-B6DD-42CA-A793-FFF93277835D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the zone belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmykd63gt****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Indicates whether the secondary Domain Name System (DNS) feature is enabled for the zone. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The secondary DNS feature is enabled.</li>
     * <li><strong>false</strong>: The secondary DNS feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SlaveDns")
    public Boolean slaveDns;

    /**
     * <p>The time when the zone was last updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-24T06:35Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The time when the zone was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1516775741000</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    /**
     * <p>The zone ID. This ID uniquely identifies the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>df2d03865266bd9842306db586d3****</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The zone name.</p>
     * 
     * <strong>example:</strong>
     * <p>zone-test.cn</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    /**
     * <p>The tag added to the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>pvtz</p>
     */
    @NameInMap("ZoneTag")
    public String zoneTag;

    /**
     * <p>The zone type. Valid values:</p>
     * <ul>
     * <li><strong>AUTH_ZONE</strong>: authoritative zone</li>
     * <li><strong>CLOUD_PRODUCT_ZONE</strong>: authoritative zone for cloud services</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLOUD_PRODUCT_ZONE</p>
     */
    @NameInMap("ZoneType")
    public String zoneType;

    public static DescribeZoneInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneInfoResponseBody self = new DescribeZoneInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZoneInfoResponseBody setBindEdgeDnsClusters(DescribeZoneInfoResponseBodyBindEdgeDnsClusters bindEdgeDnsClusters) {
        this.bindEdgeDnsClusters = bindEdgeDnsClusters;
        return this;
    }
    public DescribeZoneInfoResponseBodyBindEdgeDnsClusters getBindEdgeDnsClusters() {
        return this.bindEdgeDnsClusters;
    }

    public DescribeZoneInfoResponseBody setBindVpcs(DescribeZoneInfoResponseBodyBindVpcs bindVpcs) {
        this.bindVpcs = bindVpcs;
        return this;
    }
    public DescribeZoneInfoResponseBodyBindVpcs getBindVpcs() {
        return this.bindVpcs;
    }

    public DescribeZoneInfoResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeZoneInfoResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeZoneInfoResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public DescribeZoneInfoResponseBody setCreatorType(String creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public String getCreatorType() {
        return this.creatorType;
    }

    public DescribeZoneInfoResponseBody setDnsGroup(String dnsGroup) {
        this.dnsGroup = dnsGroup;
        return this;
    }
    public String getDnsGroup() {
        return this.dnsGroup;
    }

    public DescribeZoneInfoResponseBody setDnsGroupChanging(Boolean dnsGroupChanging) {
        this.dnsGroupChanging = dnsGroupChanging;
        return this;
    }
    public Boolean getDnsGroupChanging() {
        return this.dnsGroupChanging;
    }

    public DescribeZoneInfoResponseBody setIsPtr(Boolean isPtr) {
        this.isPtr = isPtr;
        return this;
    }
    public Boolean getIsPtr() {
        return this.isPtr;
    }

    public DescribeZoneInfoResponseBody setProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
        return this;
    }
    public String getProxyPattern() {
        return this.proxyPattern;
    }

    public DescribeZoneInfoResponseBody setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
        return this;
    }
    public Integer getRecordCount() {
        return this.recordCount;
    }

    public DescribeZoneInfoResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeZoneInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZoneInfoResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeZoneInfoResponseBody setSlaveDns(Boolean slaveDns) {
        this.slaveDns = slaveDns;
        return this;
    }
    public Boolean getSlaveDns() {
        return this.slaveDns;
    }

    public DescribeZoneInfoResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeZoneInfoResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeZoneInfoResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeZoneInfoResponseBody setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public DescribeZoneInfoResponseBody setZoneTag(String zoneTag) {
        this.zoneTag = zoneTag;
        return this;
    }
    public String getZoneTag() {
        return this.zoneTag;
    }

    public DescribeZoneInfoResponseBody setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

    public static class DescribeZoneInfoResponseBodyBindEdgeDnsClustersEdgeDnsCluster extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterUserId")
        public Long clusterUserId;

        public static DescribeZoneInfoResponseBodyBindEdgeDnsClustersEdgeDnsCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeZoneInfoResponseBodyBindEdgeDnsClustersEdgeDnsCluster self = new DescribeZoneInfoResponseBodyBindEdgeDnsClustersEdgeDnsCluster();
            return TeaModel.build(map, self);
        }

        public DescribeZoneInfoResponseBodyBindEdgeDnsClustersEdgeDnsCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeZoneInfoResponseBodyBindEdgeDnsClustersEdgeDnsCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeZoneInfoResponseBodyBindEdgeDnsClustersEdgeDnsCluster setClusterUserId(Long clusterUserId) {
            this.clusterUserId = clusterUserId;
            return this;
        }
        public Long getClusterUserId() {
            return this.clusterUserId;
        }

    }

    public static class DescribeZoneInfoResponseBodyBindEdgeDnsClusters extends TeaModel {
        @NameInMap("EdgeDnsCluster")
        public java.util.List<DescribeZoneInfoResponseBodyBindEdgeDnsClustersEdgeDnsCluster> edgeDnsCluster;

        public static DescribeZoneInfoResponseBodyBindEdgeDnsClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeZoneInfoResponseBodyBindEdgeDnsClusters self = new DescribeZoneInfoResponseBodyBindEdgeDnsClusters();
            return TeaModel.build(map, self);
        }

        public DescribeZoneInfoResponseBodyBindEdgeDnsClusters setEdgeDnsCluster(java.util.List<DescribeZoneInfoResponseBodyBindEdgeDnsClustersEdgeDnsCluster> edgeDnsCluster) {
            this.edgeDnsCluster = edgeDnsCluster;
            return this;
        }
        public java.util.List<DescribeZoneInfoResponseBodyBindEdgeDnsClustersEdgeDnsCluster> getEdgeDnsCluster() {
            return this.edgeDnsCluster;
        }

    }

    public static class DescribeZoneInfoResponseBodyBindVpcsVpc extends TeaModel {
        /**
         * <p>The region ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region where the VPC resides.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Heyuan)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The VPC ID. This ID uniquely identifies the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-f8zvrvr1payllgz38****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC name.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_test</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        /**
         * <p>The VPC type. Valid values:</p>
         * <ul>
         * <li>STANDARD: standard VPC</li>
         * <li>EDS: Elastic Desktop Service (EDS) workspace VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        /**
         * <p>The user ID to which the VPC belongs. If null is returned, the VPC belongs to the current user.</p>
         * 
         * <strong>example:</strong>
         * <p>141339776561****</p>
         */
        @NameInMap("VpcUserId")
        public Long vpcUserId;

        public static DescribeZoneInfoResponseBodyBindVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeZoneInfoResponseBodyBindVpcsVpc self = new DescribeZoneInfoResponseBodyBindVpcsVpc();
            return TeaModel.build(map, self);
        }

        public DescribeZoneInfoResponseBodyBindVpcsVpc setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeZoneInfoResponseBodyBindVpcsVpc setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeZoneInfoResponseBodyBindVpcsVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeZoneInfoResponseBodyBindVpcsVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeZoneInfoResponseBodyBindVpcsVpc setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

        public DescribeZoneInfoResponseBodyBindVpcsVpc setVpcUserId(Long vpcUserId) {
            this.vpcUserId = vpcUserId;
            return this;
        }
        public Long getVpcUserId() {
            return this.vpcUserId;
        }

    }

    public static class DescribeZoneInfoResponseBodyBindVpcs extends TeaModel {
        @NameInMap("Vpc")
        public java.util.List<DescribeZoneInfoResponseBodyBindVpcsVpc> vpc;

        public static DescribeZoneInfoResponseBodyBindVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeZoneInfoResponseBodyBindVpcs self = new DescribeZoneInfoResponseBodyBindVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeZoneInfoResponseBodyBindVpcs setVpc(java.util.List<DescribeZoneInfoResponseBodyBindVpcsVpc> vpc) {
            this.vpc = vpc;
            return this;
        }
        public java.util.List<DescribeZoneInfoResponseBodyBindVpcsVpc> getVpc() {
            return this.vpc;
        }

    }

}
