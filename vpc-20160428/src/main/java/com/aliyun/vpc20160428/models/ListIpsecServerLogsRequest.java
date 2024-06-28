// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpsecServerLogsRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. The value must be a UNIX timestamp. For example, 1671003744 specifies 15:42:24 (UTC+8) on December 14, 2022.</p>
     * <blockquote>
     * <p> If you specify <strong>From</strong>, you must also specify <strong>To</strong> or <strong>MinutePeriod</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1671003744</p>
     */
    @NameInMap("From")
    public Integer from;

    /**
     * <p>The ID of the IPsec server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iss-2zei2n5q5zhirfh73****</p>
     */
    @NameInMap("IpsecServerId")
    public String ipsecServerId;

    /**
     * <p>The interval at which log data is queried. Valid values: <strong>1</strong> to <strong>10</strong>. Unit: minutes.</p>
     * <blockquote>
     * <p> If both <strong>From</strong> and <strong>To</strong> are not specified, you must specify <strong>MinutePeriod</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinutePeriod")
    public Integer minutePeriod;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the IPsec server is created.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The end of the time range to query. The value must be a unix timestamp. For example, 1671004344 specifies 15:52:24 (UTC+8) on December 14, 2022.</p>
     * <blockquote>
     * <p> If you specify <strong>To</strong>, you must also specify <strong>From</strong> or <strong>MinutePeriod</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1671004344</p>
     */
    @NameInMap("To")
    public Integer to;

    public static ListIpsecServerLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpsecServerLogsRequest self = new ListIpsecServerLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListIpsecServerLogsRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public ListIpsecServerLogsRequest setIpsecServerId(String ipsecServerId) {
        this.ipsecServerId = ipsecServerId;
        return this;
    }
    public String getIpsecServerId() {
        return this.ipsecServerId;
    }

    public ListIpsecServerLogsRequest setMinutePeriod(Integer minutePeriod) {
        this.minutePeriod = minutePeriod;
        return this;
    }
    public Integer getMinutePeriod() {
        return this.minutePeriod;
    }

    public ListIpsecServerLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIpsecServerLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIpsecServerLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIpsecServerLogsRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

}
