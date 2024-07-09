// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneVpcTreeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B07FBC3-3A53-4939-A3C6-2BDFE407BAB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The zones.</p>
     */
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
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>China North 2</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2z21341ssdadsfzyd49ra</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-vpc</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        /**
         * <p>The type of the VPC. Valid values:</p>
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
        /**
         * <p>The time when the zone was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-18T08:20Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the zone was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1568794812000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The creator of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>5463564356</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The operator type.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("CreatorType")
        public String creatorType;

        /**
         * <p>The logical location of the built-in authoritative module in which the zone is added. Valid values:</p>
         * <ul>
         * <li>NORMAL_ZONE: regular module</li>
         * <li>FAST_ZONE: acceleration module</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL_ZONE</p>
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
         * <p>true</p>
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
         * <p>The number of Domain Name System (DNS) records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecordCount")
        public Integer recordCount;

        /**
         * <p>The description of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The time when the zone was last modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-18T08:20Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The time when the zone was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1568794834000</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <p>The VPCs bound to the zones.</p>
         */
        @NameInMap("Vpcs")
        public DescribeZoneVpcTreeResponseBodyZonesZoneVpcs vpcs;

        /**
         * <p>The global ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>6d83e3b31aa60ca4aaa7161f1b6baa95</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The name of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>localzone.demo</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        /**
         * <p>The type of the cloud service.</p>
         * <ul>
         * <li>If the value of the ZoneType parameter is AUTH_ZONE, no value is returned for this parameter.</li>
         * <li>If the value of the ZoneType parameter is CLOUD_PRODUCT_ZONE, the type of the cloud service is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BLINK</p>
         */
        @NameInMap("ZoneTag")
        public String zoneTag;

        /**
         * <p>The type of the zone. Valid values:</p>
         * <ul>
         * <li>AUTH_ZONE: authoritative zone</li>
         * <li>CLOUD_PRODUCT_ZONE: authoritative zone for cloud services</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTH_ZONE</p>
         */
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

        public DescribeZoneVpcTreeResponseBodyZonesZone setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setDnsGroup(String dnsGroup) {
            this.dnsGroup = dnsGroup;
            return this;
        }
        public String getDnsGroup() {
            return this.dnsGroup;
        }

        public DescribeZoneVpcTreeResponseBodyZonesZone setDnsGroupChanging(Boolean dnsGroupChanging) {
            this.dnsGroupChanging = dnsGroupChanging;
            return this;
        }
        public Boolean getDnsGroupChanging() {
            return this.dnsGroupChanging;
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
