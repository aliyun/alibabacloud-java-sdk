// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryRegionId")
    public String queryRegionId;

    /**
     * <p>VPC ID。</p>
     */
    @NameInMap("QueryVpcId")
    public String queryVpcId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceTag")
    public java.util.List<DescribeZonesRequestResourceTag> resourceTag;

    @NameInMap("SearchMode")
    public String searchMode;

    @NameInMap("ZoneTag")
    public java.util.List<String> zoneTag;

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
        @NameInMap("Key")
        public String key;

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
