// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlaveDns")
    public Boolean slaveDns;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ProxyPattern")
    public String proxyPattern;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ZoneType")
    public String zoneType;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ZoneName")
    public String zoneName;

    @NameInMap("ZoneTag")
    public String zoneTag;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    @NameInMap("RecordCount")
    public Integer recordCount;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("BindVpcs")
    public DescribeZoneInfoResponseBodyBindVpcs bindVpcs;

    @NameInMap("IsPtr")
    public Boolean isPtr;

    public static DescribeZoneInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneInfoResponseBody self = new DescribeZoneInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZoneInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZoneInfoResponseBody setSlaveDns(Boolean slaveDns) {
        this.slaveDns = slaveDns;
        return this;
    }
    public Boolean getSlaveDns() {
        return this.slaveDns;
    }

    public DescribeZoneInfoResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeZoneInfoResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeZoneInfoResponseBody setProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
        return this;
    }
    public String getProxyPattern() {
        return this.proxyPattern;
    }

    public DescribeZoneInfoResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeZoneInfoResponseBody setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

    public DescribeZoneInfoResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
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

    public DescribeZoneInfoResponseBody setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
        return this;
    }
    public Integer getRecordCount() {
        return this.recordCount;
    }

    public DescribeZoneInfoResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeZoneInfoResponseBody setBindVpcs(DescribeZoneInfoResponseBodyBindVpcs bindVpcs) {
        this.bindVpcs = bindVpcs;
        return this;
    }
    public DescribeZoneInfoResponseBodyBindVpcs getBindVpcs() {
        return this.bindVpcs;
    }

    public DescribeZoneInfoResponseBody setIsPtr(Boolean isPtr) {
        this.isPtr = isPtr;
        return this;
    }
    public Boolean getIsPtr() {
        return this.isPtr;
    }

    public static class DescribeZoneInfoResponseBodyBindVpcsVpc extends TeaModel {
        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("VpcUserId")
        public Long vpcUserId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeZoneInfoResponseBodyBindVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeZoneInfoResponseBodyBindVpcsVpc self = new DescribeZoneInfoResponseBodyBindVpcsVpc();
            return TeaModel.build(map, self);
        }

        public DescribeZoneInfoResponseBodyBindVpcsVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeZoneInfoResponseBodyBindVpcsVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeZoneInfoResponseBodyBindVpcsVpc setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeZoneInfoResponseBodyBindVpcsVpc setVpcUserId(Long vpcUserId) {
            this.vpcUserId = vpcUserId;
            return this;
        }
        public Long getVpcUserId() {
            return this.vpcUserId;
        }

        public DescribeZoneInfoResponseBodyBindVpcsVpc setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
