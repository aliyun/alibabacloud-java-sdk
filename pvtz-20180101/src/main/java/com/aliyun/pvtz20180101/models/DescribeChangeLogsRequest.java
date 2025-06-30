// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeChangeLogsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1516779348000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The type of operation logs. Valid values:</p>
     * <ul>
     * <li><strong>PV_ZONE</strong>: the logs that record the operations on built-in authoritative zones</li>
     * <li><strong>PV_RECORD</strong>: the logs that record the operations on DNS records</li>
     * <li><strong>RESOLVER_RULE</strong>: the logs that record the operations on forwarding rules</li>
     * <li><strong>CUSTOM_LINE</strong>: the logs that record the operations on user-defined lines</li>
     * <li><strong>RESOLVER_ENDPOINT</strong>: the logs that record the operations on outbound endpoints</li>
     * <li><strong>INBOUND_ENDPOINT</strong>: the logs that record the operations on inbound endpoints</li>
     * <li><strong>CACHE_RESERVE_DOMAIN</strong>: the logs that record the operations on cache retention domain names</li>
     * </ul>
     * <blockquote>
     * <p> If you set EntityType to other values, all types of logs are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PV_ZONE</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The keyword of the operation or the operation content. Fuzzy search is supported. The value is not case-sensitive.</p>
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
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1516779348000</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The zone ID. Valid values:</p>
     * <ul>
     * <li><p>If you set ZoneId to a zone ID, the logs that record the operations on the DNS records of the specified zone are queried.\</p>
     * </li>
     * <li><p>If you leave ZoneId empty, the logs that record the operations on all zones and the DNS records of these zones that belong to the current Alibaba Cloud account are queried.</p>
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
