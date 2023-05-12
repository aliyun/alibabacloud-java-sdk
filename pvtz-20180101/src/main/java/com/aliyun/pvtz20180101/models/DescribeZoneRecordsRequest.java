// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneRecordsRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchMode")
    public String searchMode;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>Zone ID。</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeZoneRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneRecordsRequest self = new DescribeZoneRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZoneRecordsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeZoneRecordsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeZoneRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeZoneRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeZoneRecordsRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public DescribeZoneRecordsRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeZoneRecordsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeZoneRecordsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
