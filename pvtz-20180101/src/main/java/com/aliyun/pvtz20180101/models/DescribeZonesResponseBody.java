// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("Zones")
    public DescribeZonesResponseBodyZones zones;

    public static DescribeZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponseBody self = new DescribeZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeZonesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeZonesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeZonesResponseBody setZones(DescribeZonesResponseBodyZones zones) {
        this.zones = zones;
        return this;
    }
    public DescribeZonesResponseBodyZones getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseBodyZonesZoneResourceTagsResourceTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeZonesResponseBodyZonesZoneResourceTagsResourceTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneResourceTagsResourceTag self = new DescribeZonesResponseBodyZonesZoneResourceTagsResourceTag();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneResourceTagsResourceTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeZonesResponseBodyZonesZoneResourceTagsResourceTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneResourceTags extends TeaModel {
        @NameInMap("ResourceTag")
        public java.util.List<DescribeZonesResponseBodyZonesZoneResourceTagsResourceTag> resourceTag;

        public static DescribeZonesResponseBodyZonesZoneResourceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneResourceTags self = new DescribeZonesResponseBodyZonesZoneResourceTags();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneResourceTags setResourceTag(java.util.List<DescribeZonesResponseBodyZonesZoneResourceTagsResourceTag> resourceTag) {
            this.resourceTag = resourceTag;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZonesZoneResourceTagsResourceTag> getResourceTag() {
            return this.resourceTag;
        }

    }

    public static class DescribeZonesResponseBodyZonesZone extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorSubType")
        public String creatorSubType;

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

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceTags")
        public DescribeZonesResponseBodyZonesZoneResourceTags resourceTags;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <p>zone ID。</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneName")
        public String zoneName;

        @NameInMap("ZoneTag")
        public String zoneTag;

        @NameInMap("ZoneType")
        public String zoneType;

        public static DescribeZonesResponseBodyZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZone self = new DescribeZonesResponseBodyZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZone setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeZonesResponseBodyZonesZone setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeZonesResponseBodyZonesZone setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeZonesResponseBodyZonesZone setCreatorSubType(String creatorSubType) {
            this.creatorSubType = creatorSubType;
            return this;
        }
        public String getCreatorSubType() {
            return this.creatorSubType;
        }

        public DescribeZonesResponseBodyZonesZone setDnsGroup(String dnsGroup) {
            this.dnsGroup = dnsGroup;
            return this;
        }
        public String getDnsGroup() {
            return this.dnsGroup;
        }

        public DescribeZonesResponseBodyZonesZone setDnsGroupChanging(Boolean dnsGroupChanging) {
            this.dnsGroupChanging = dnsGroupChanging;
            return this;
        }
        public Boolean getDnsGroupChanging() {
            return this.dnsGroupChanging;
        }

        public DescribeZonesResponseBodyZonesZone setIsPtr(Boolean isPtr) {
            this.isPtr = isPtr;
            return this;
        }
        public Boolean getIsPtr() {
            return this.isPtr;
        }

        public DescribeZonesResponseBodyZonesZone setProxyPattern(String proxyPattern) {
            this.proxyPattern = proxyPattern;
            return this;
        }
        public String getProxyPattern() {
            return this.proxyPattern;
        }

        public DescribeZonesResponseBodyZonesZone setRecordCount(Integer recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Integer getRecordCount() {
            return this.recordCount;
        }

        public DescribeZonesResponseBodyZonesZone setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeZonesResponseBodyZonesZone setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeZonesResponseBodyZonesZone setResourceTags(DescribeZonesResponseBodyZonesZoneResourceTags resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneResourceTags getResourceTags() {
            return this.resourceTags;
        }

        public DescribeZonesResponseBodyZonesZone setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeZonesResponseBodyZonesZone setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeZonesResponseBodyZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeZonesResponseBodyZonesZone setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

        public DescribeZonesResponseBodyZonesZone setZoneTag(String zoneTag) {
            this.zoneTag = zoneTag;
            return this;
        }
        public String getZoneTag() {
            return this.zoneTag;
        }

        public DescribeZonesResponseBodyZonesZone setZoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }
        public String getZoneType() {
            return this.zoneType;
        }

    }

    public static class DescribeZonesResponseBodyZones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<DescribeZonesResponseBodyZonesZone> zone;

        public static DescribeZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZones self = new DescribeZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZones setZone(java.util.List<DescribeZonesResponseBodyZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZonesZone> getZone() {
            return this.zone;
        }

    }

}
