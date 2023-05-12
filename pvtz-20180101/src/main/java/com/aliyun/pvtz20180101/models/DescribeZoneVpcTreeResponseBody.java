// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneVpcTreeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Zones")
    public DescribeZoneVpcTreeResponseBodyZones zones;

    public static DescribeZoneVpcTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneVpcTreeResponseBody self = new DescribeZoneVpcTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZoneVpcTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZoneVpcTreeResponseBody setZones(DescribeZoneVpcTreeResponseBodyZones zones) {
        this.zones = zones;
        return this;
    }
    public DescribeZoneVpcTreeResponseBodyZones getZones() {
        return this.zones;
    }

    public static class DescribeZoneVpcTreeResponseBodyZonesZoneVpcsVpc extends TeaModel {
        /**
         * <p>region Id</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>vpc id</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("VpcType")
        public String vpcType;

        public static DescribeZoneVpcTreeResponseBodyZonesZoneVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeZoneVpcTreeResponseBodyZonesZoneVpcsVpc self = new DescribeZoneVpcTreeResponseBodyZonesZoneVpcsVpc();
            return TeaModel.build(map, self);
        }

        public DescribeZoneVpcTreeResponseBodyZonesZoneVpcsVpc setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZoneVpcsVpc setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZoneVpcsVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZoneVpcsVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZoneVpcsVpc setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

    }

    public static class DescribeZoneVpcTreeResponseBodyZonesZoneVpcs extends TeaModel {
        @NameInMap("Vpc")
        public java.util.List<DescribeZoneVpcTreeResponseBodyZonesZoneVpcsVpc> vpc;

        public static DescribeZoneVpcTreeResponseBodyZonesZoneVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeZoneVpcTreeResponseBodyZonesZoneVpcs self = new DescribeZoneVpcTreeResponseBodyZonesZoneVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeZoneVpcTreeResponseBodyZonesZoneVpcs setVpc(java.util.List<DescribeZoneVpcTreeResponseBodyZonesZoneVpcsVpc> vpc) {
            this.vpc = vpc;
            return this;
        }
        public java.util.List<DescribeZoneVpcTreeResponseBodyZonesZoneVpcsVpc> getVpc() {
            return this.vpc;
        }

    }

    public static class DescribeZoneVpcTreeResponseBodyZonesZone extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("IsPtr")
        public Boolean isPtr;

        @NameInMap("RecordCount")
        public Integer recordCount;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("Vpcs")
        public DescribeZoneVpcTreeResponseBodyZonesZoneVpcs vpcs;

        /**
         * <p>Zone id</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneName")
        public String zoneName;

        @NameInMap("ZoneTag")
        public String zoneTag;

        @NameInMap("ZoneType")
        public String zoneType;

        public static DescribeZoneVpcTreeResponseBodyZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZoneVpcTreeResponseBodyZonesZone self = new DescribeZoneVpcTreeResponseBodyZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setIsPtr(Boolean isPtr) {
            this.isPtr = isPtr;
            return this;
        }
        public Boolean getIsPtr() {
            return this.isPtr;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setRecordCount(Integer recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Integer getRecordCount() {
            return this.recordCount;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setVpcs(DescribeZoneVpcTreeResponseBodyZonesZoneVpcs vpcs) {
            this.vpcs = vpcs;
            return this;
        }
        public DescribeZoneVpcTreeResponseBodyZonesZoneVpcs getVpcs() {
            return this.vpcs;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setZoneTag(String zoneTag) {
            this.zoneTag = zoneTag;
            return this;
        }
        public String getZoneTag() {
            return this.zoneTag;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setZoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }
        public String getZoneType() {
            return this.zoneType;
        }

    }

    public static class DescribeZoneVpcTreeResponseBodyZones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<DescribeZoneVpcTreeResponseBodyZonesZone> zone;

        public static DescribeZoneVpcTreeResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZoneVpcTreeResponseBodyZones self = new DescribeZoneVpcTreeResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeZoneVpcTreeResponseBodyZones setZone(java.util.List<DescribeZoneVpcTreeResponseBodyZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeZoneVpcTreeResponseBodyZonesZone> getZone() {
            return this.zone;
        }

    }

}
