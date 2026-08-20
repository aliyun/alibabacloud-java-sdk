// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneRecordsRequest extends TeaModel {
    /**
     * <p>The keyword for the hostname. The search is not case-sensitive. Use the SearchMode parameter to switch between a fuzzy search and an exact search. The default is an exact search.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese.</p>
     * </li>
     * <li><p>en: English.</p>
     * </li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. Pages start from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The maximum value is 100. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search mode. Valid values:</p>
     * <ul>
     * <li><p><strong>LIKE</strong>: fuzzy search</p>
     * </li>
     * <li><p><strong>EXACT</strong>: exact search (default)</p>
     * </li>
     * </ul>
     * <p>This parameter is used with the Keyword parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>EXACT</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The tag. Valid values:</p>
     * <ul>
     * <li><p>ecs: Queries the hostnames that are synchronized from ECS instances to the zone.</p>
     * </li>
     * <li><p>If you do not specify this parameter, all DNS records in the zone are queried.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The client IP address of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.XX.XX</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The unique ID of the zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a96d70eb4ab8ef01503dc5486914****</p>
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
