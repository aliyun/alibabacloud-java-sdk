// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    /**
     * <p>The keyword of the zone name. The value is not case-sensitive. You can set SearchMode to LIKE or EXACT. The default value of SearchMode is LIKE.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the virtual private cloud (VPC) associated with the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("QueryRegionId")
    public String queryRegionId;

    /**
     * <p>The ID of the VPC associated with the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-f8zvrvr1payllgz38****</p>
     */
    @NameInMap("QueryVpcId")
    public String queryVpcId;

    /**
     * <p>The ID of the resource group to which the zone belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz2qj7awz****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags added to the zone.</p>
     */
    @NameInMap("ResourceTag")
    public java.util.List<DescribeZonesRequestResourceTag> resourceTag;

    /**
     * <p>The search mode. The value of Keyword is the search scope. Valid values:</p>
     * <ul>
     * <li><strong>LIKE</strong> (default): fuzzy search</li>
     * <li><strong>EXACT</strong>: exact search</li>
     * </ul>
     * <p>Default value: <strong>LIKE</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>LIKE</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The types of cloud services.</p>
     * 
     * <strong>example:</strong>
     * <p>BLINK</p>
     */
    @NameInMap("ZoneTag")
    public java.util.List<String> zoneTag;

    /**
     * <p>The zone type. Valid values:</p>
     * <ul>
     * <li><strong>AUTH_ZONE</strong>: authoritative zone</li>
     * <li><strong>CLOUD_PRODUCT_ZONE</strong>: authoritative zone for cloud services</li>
     * </ul>
     * <p>Default value: <strong>AUTH_ZONE</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>CLOUD_PRODUCT_ZONE</p>
     */
    @NameInMap("ZoneType")
    public String zoneType;

    public static DescribeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesRequest self = new DescribeZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZonesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeZonesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeZonesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeZonesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeZonesRequest setQueryRegionId(String queryRegionId) {
        this.queryRegionId = queryRegionId;
        return this;
    }
    public String getQueryRegionId() {
        return this.queryRegionId;
    }

    public DescribeZonesRequest setQueryVpcId(String queryVpcId) {
        this.queryVpcId = queryVpcId;
        return this;
    }
    public String getQueryVpcId() {
        return this.queryVpcId;
    }

    public DescribeZonesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeZonesRequest setResourceTag(java.util.List<DescribeZonesRequestResourceTag> resourceTag) {
        this.resourceTag = resourceTag;
        return this;
    }
    public java.util.List<DescribeZonesRequestResourceTag> getResourceTag() {
        return this.resourceTag;
    }

    public DescribeZonesRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public DescribeZonesRequest setZoneTag(java.util.List<String> zoneTag) {
        this.zoneTag = zoneTag;
        return this;
    }
    public java.util.List<String> getZoneTag() {
        return this.zoneTag;
    }

    public DescribeZonesRequest setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

    public static class DescribeZonesRequestResourceTag extends TeaModel {
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

        public static DescribeZonesRequestResourceTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesRequestResourceTag self = new DescribeZonesRequestResourceTag();
            return TeaModel.build(map, self);
        }

        public DescribeZonesRequestResourceTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeZonesRequestResourceTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
