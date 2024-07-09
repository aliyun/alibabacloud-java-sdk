// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    /**
     * <p>The zones.</p>
     */
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
        /**
         * <p>The key of tag N added to the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>daily</p>
         */
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
        /**
         * <p>The time when the zone was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-28T13:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the zone was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1514466483000</p>
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
         * <p>The type of the user account.</p>
         * <ul>
         * <li><strong>CUSTOMER</strong>: Alibaba Cloud account</li>
         * <li><strong>SUB</strong>: RAM user</li>
         * <li><strong>STS</strong>: assumed role that obtains the Security Token Service (STS) token of a RAM role</li>
         * <li><strong>OTHER</strong>: other types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUB</p>
         */
        @NameInMap("CreatorSubType")
        public String creatorSubType;

        /**
         * <p>The logical location type of the built-in authoritative module in which the zone is added. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL_ZONE</strong>: regular module</li>
         * <li><strong>FAST_ZONE</strong>: acceleration module</li>
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
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPtr")
        public Boolean isPtr;

        /**
         * <p>Indicates whether the recursive resolution proxy feature is enabled for the zone. Valid values:</p>
         * <ul>
         * <li><strong>ZONE</strong>: The recursive resolution proxy feature is disabled for the zone.</li>
         * <li><strong>RECORD</strong>: The recursive resolution proxy feature is enabled for the zone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ZONE</p>
         */
        @NameInMap("ProxyPattern")
        public String proxyPattern;

        /**
         * <p>The number of Domain Name System (DNS) records.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags added to the resources.</p>
         */
        @NameInMap("ResourceTags")
        public DescribeZonesResponseBodyZonesZoneResourceTags resourceTags;

        /**
         * <p>The time when the zone was last modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-03T08:57Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The time when the DNS record was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1514969843000</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6d83e3b31aa60ca4aaa7161f1b6b**95</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The name of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        /**
         * <p>The type of the cloud service. Valid values:</p>
         * <ul>
         * <li>If ZoneType is set to AUTH_ZONE, no value is returned for this parameter.</li>
         * <li>If ZoneType is set to CLOUD_PRODUCT_ZONE, the type of the cloud service is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BLINK</p>
         */
        @NameInMap("ZoneTag")
        public String zoneTag;

        /**
         * <p>The type of zones. Valid values:</p>
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
