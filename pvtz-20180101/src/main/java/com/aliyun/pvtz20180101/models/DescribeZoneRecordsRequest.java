// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneRecordsRequest extends TeaModel {
    /**
     * <p>The hostname keyword based on which the system queries the DNS records.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search mode. Valid values:</p>
     * <ul>
     * <li><strong>LIKE</strong>: fuzzy search</li>
     * <li><strong>EXACT (default)</strong>: exact search</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LIKE</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The tags added to the DNS record.</p>
     * <ul>
     * <li>This parameter is left empty by default. In this case, the DNS records of the zone are queried.</li>
     * <li>If you set Tag to ecs, the DNS records added to the hostnames of Elastic Compute Service (ECS) instances in the zone are queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CAgICA1OA_58</p>
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
