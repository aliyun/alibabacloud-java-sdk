// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("SearchMode")
    public String searchMode;

    @NameInMap("QueryRegionId")
    public String queryRegionId;

    @NameInMap("QueryVpcId")
    public String queryVpcId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("ZoneType")
    public String zoneType;

    @NameInMap("ZoneTag")
    public java.util.List<String> zoneTag;

    public static DescribeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesRequest self = new DescribeZonesRequest();
        return TeaModel.build(map, self);
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

    public DescribeZonesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeZonesRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeZonesRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
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

    public DescribeZonesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeZonesRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeZonesRequest setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

    public DescribeZonesRequest setZoneTag(java.util.List<String> zoneTag) {
        this.zoneTag = zoneTag;
        return this;
    }
    public java.util.List<String> getZoneTag() {
        return this.zoneTag;
    }

}
