// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneInfoResponseBody extends TeaModel {
    @NameInMap("BindEdgeDnsClusters")
    public DescribeZoneInfoResponseBodyBindEdgeDnsClusters bindEdgeDnsClusters;

    @NameInMap("BindVpcs")
    public DescribeZoneInfoResponseBodyBindVpcs bindVpcs;

    /**
     * <p>The time when the zone was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-15T09:40Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The timestamp that indicates when the zone was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1721036404000</p>
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
     * <p>The DNS group. Valid values:</p>
     * <ul>
     * <li><p><strong>NORMAL_ZONE</strong>: Regular group</p>
     * </li>
     * <li><p><strong>FAST_ZONE</strong>: Fast group</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FAST_ZONE</p>
     */
    @NameInMap("DnsGroup")
    public String dnsGroup;

    /**
     * <p>The status of switching the DNS group for the zone. You can switch a zone between the regular and fast groups. Valid values:</p>
     * <ul>
     * <li><p>true: The DNS group is being switched.</p>
     * </li>
     * <li><p>false: The DNS group is not being switched.</p>
     * </li>
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
     * <li><p>true: The zone is a reverse lookup zone.</p>
     * </li>
     * <li><p>false: The zone is not a reverse lookup zone.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsPtr")
    public Boolean isPtr;

    /**
     * <p>Indicates whether the recursive proxy for subdomains is enabled.</p>
     * <ul>
     * <li><p>ZONE: Disabled. If a non-existent subdomain is resolved, an NXDOMAIN response is returned to indicate that the subdomain does not exist.</p>
     * </li>
     * <li><p>RECORD: Enabled. If a non-existent subdomain is resolved, the system queries the forwarding and recursion modules in sequence and uses the final result to respond to the DNS query.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ZONE</p>
     */
    @NameInMap("ProxyPattern")
    public String proxyPattern;

    /**
     * <p>The total number of DNS records in the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RecordCount")
    public Integer recordCount;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The unique ID of the request.</p>
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
     * <p>Indicates whether secondary DNS is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SlaveDns")
    public Boolean slaveDns;

    /**
     * <p>The time when the zone was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-22T09:39Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The timestamp that indicates when the zone was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>1721641148000</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    /**
     * <p>The unique ID of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>df2d03865266bd9842306db586d3****</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The name of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>zone-test.cn</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    /**
     * <p>The tag of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>pvtz</p>
     */
    @NameInMap("ZoneTag")
    public String zoneTag;

    /**
     * <p>The type of the zone. Valid values:</p>
     * <ul>
     * <li><p><strong>AUTH_ZONE</strong>: Authoritative zone.</p>
     * </li>
     * <li><p><strong>CLOUD_PRODUCT_ZONE</strong>: Authoritative zone for a cloud product.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTH_ZONE</p>
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
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("VpcType")
        public String vpcType;

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
