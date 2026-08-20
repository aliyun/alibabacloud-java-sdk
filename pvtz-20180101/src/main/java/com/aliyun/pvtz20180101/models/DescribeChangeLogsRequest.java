// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeChangeLogsRequest extends TeaModel {
    /**
     * <p>The end time. This value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>2516779348000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The type of log to obtain. Valid values:</p>
     * <ul>
     * <li><p><strong>PV_ZONE</strong>: operation logs of built-in authoritative zones.</p>
     * </li>
     * <li><p><strong>PV_RECORD</strong>: operation logs of DNS records.</p>
     * </li>
     * <li><p><strong>RESOLVER_RULE</strong>: operation logs of forwarding rules.</p>
     * </li>
     * <li><p><strong>CUSTOM_LINE</strong>: operation logs of custom lines.</p>
     * </li>
     * <li><p><strong>RESOLVER_ENDPOINT</strong>: operation logs of outbound endpoints.</p>
     * </li>
     * <li><p><strong>INBOUND_ENDPOINT</strong>: operation logs of inbound endpoints.</p>
     * </li>
     * <li><p><strong>CACHE_RESERVE_DOMAIN</strong>: operation logs of domains for which cache is retained.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you specify another value, this parameter is ignored and logs of all types are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PV_ZONE</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The keyword, such as a behavior or content. Fuzzy search is supported. The keyword is not case-sensitive.</p>
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
     * <p>Default value: en</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time. This value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1516779348000</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>The IP address of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The ID of the zone.</p>
     * <ul>
     * <li><p>If you specify this parameter, the operation returns the change logs of DNS records for the specified zone.<br></p>
     * </li>
     * <li><p>If you leave this parameter empty, the operation returns the change logs of all zones and DNS records that belong to the current account.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>df2d03865266bd9842306db586d3****</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeChangeLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeLogsRequest self = new DescribeChangeLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChangeLogsRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeChangeLogsRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DescribeChangeLogsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeChangeLogsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeChangeLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeChangeLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeChangeLogsRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeChangeLogsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeChangeLogsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
