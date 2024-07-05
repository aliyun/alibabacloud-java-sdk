// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainUsageDataRequest extends TeaModel {
    /**
     * <p>The region in which you want to query data. Valid values:</p>
     * <ul>
     * <li><strong>CN</strong>: Chinese mainland</li>
     * <li><strong>OverSeas</strong>: outside the Chinese mainland</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The accelerated domain name. If you leave this parameter empty, the merged data of all your accelerated domain names is returned. Separate multiple accelerated domain names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T12:20:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the data to return. Valid values:</p>
     * <ul>
     * <li><strong>bps</strong>: bandwidth</li>
     * <li><strong>traf</strong>: traffic</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bps</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The time interval between the data entries to return. Unit: seconds. Valid values: <strong>300</strong> (5 minutes), <strong>3600</strong> (1 hour), and <strong>86400</strong> (1 day).</p>
     * <ul>
     * <li>If <strong>Interval</strong> is set to <strong>300</strong>, you can query usage data in the last six months. The maximum time range per query that can be specified is three days.</li>
     * <li>If <strong>Interval</strong> is set to <strong>3600</strong> or <strong>86400</strong>, you can query usage data of the previous year.</li>
     * <li>If you do not set the <strong>Interval</strong> parameter, the maximum time range that you can query is one month. If you specify a time range of 1 to 3 days, the time interval between the entries that are returned is 1 hour. If you specify a time range of at least 4 days, the time interval between the entries that are returned is 1 day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T10:20:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of content that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>static</strong>: static content</li>
     * <li><strong>dynamic</strong>: dynamic requests</li>
     * <li><strong>all</strong>: all content</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeVodDomainUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainUsageDataRequest self = new DescribeVodDomainUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainUsageDataRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeVodDomainUsageDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainUsageDataRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeVodDomainUsageDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVodDomainUsageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodDomainUsageDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
