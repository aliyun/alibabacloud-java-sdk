// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneInfoResponseBody extends TeaModel {
    @NameInMap("BindVpcs")
    public DescribeZoneInfoResponseBodyBindVpcs bindVpcs;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("CreatorType")
    public String creatorType;

    @NameInMap("DnsGroup")
    public String dnsGroup;

    @NameInMap("DnsGroupChanging")
    public Boolean dnsGroupChanging;

    @NameInMap("IsPtr")
    public Boolean isPtr;

    @NameInMap("ProxyPattern")
    public String proxyPattern;

    @NameInMap("RecordCount")
    public Integer recordCount;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SlaveDns")
    public Boolean slaveDns;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    /**
     * <p>Zone ID。</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ZoneName")
    public String zoneName;

    @NameInMap("ZoneTag")
    public String zoneTag;

    @NameInMap("ZoneType")
    public String zoneType;

    public static DescribeZoneInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneInfoResponseBody self = new DescribeZoneInfoResponseBody();
        return TeaModel.build(map, self);
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

    public static class DescribeZoneInfoResponseBodyBindVpcsVpc extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>Vpc ID。</p>
         */
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
