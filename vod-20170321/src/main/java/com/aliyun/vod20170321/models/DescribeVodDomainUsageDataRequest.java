// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainUsageDataRequest extends TeaModel {
    /**
     * <p>The region code. Default value: CN (the Chinese mainland). Valid values:</p>
     * <ul>
     * <li><strong>CN</strong>: the Chinese mainland.</li>
     * <li><strong>OverSeas</strong>: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The accelerated domain name. If this parameter is left empty, the merged data of all accelerated domain names is returned by default. Batch queries are supported. Separate multiple domain names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T12:20:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The data type. Valid values:</p>
     * <ul>
     * <li><strong>bps</strong>: bandwidth.</li>
     * <li><strong>traf</strong>: traffic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bps</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>Forces the retrieval of data at the specified time granularity, in seconds. Valid values: <strong>300</strong> (5 minutes), <strong>3600</strong> (1 hour), and <strong>86400</strong> (1 day).</p>
     * <ul>
     * <li><strong>Interval</strong>=<strong>300</strong>: You can query data for up to the last half year. The maximum time span for a single query is 3 days.</li>
     * <li><strong>Interval</strong>=<strong>3600</strong> or <strong>86400</strong>: You can query data for up to the last year.</li>
     * <li>If <strong>Interval</strong> is not specified: The maximum time span for a single query is 1 month. If the query time range is 1 to 3 days, data is returned at hourly granularity. If the query time range is 4 days or more, data is returned at daily granularity.</li>
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
     * <p>The beginning of the time range to query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-10T10:20:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of usage data to retrieve. Valid values:</p>
     * <ul>
     * <li><strong>static</strong>: static content.</li>
     * <li><strong>dynamic</strong>: dynamic content.</li>
     * <li><strong>all</strong>: all content.</li>
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
