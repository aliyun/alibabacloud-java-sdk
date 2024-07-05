// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainSrcBpsDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     * <ul>
     * <li>If you leave this parameter empty, the merged data of all your accelerated domain names is returned.</li>
     * <li>You can specify a maximum of 500 accelerated domain names. Separate multiple domain names with commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-04-26T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity. Unit: seconds. Valid values: <strong>300</strong>, <strong>3600</strong>, and <strong>86400</strong>. If you leave this parameter empty or specify an invalid value, the default value is used. The supported time granularity varies based on the time range specified by <code>EndTime</code> and <code>StartTime</code>. The following content describes the supported time granularity.</p>
     * <ul>
     * <li>Time range per query &lt; 3 days: <strong>300</strong> (default), <strong>3600</strong>, and <strong>86400</strong></li>
     * <li>3 days ≤ Time range per query &lt; 31 days: <strong>3600</strong> (default) and <strong>86400</strong></li>
     * <li>31 days ≤ Time range per query ≤ 366 days: <strong>86400</strong> (default)</li>
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
     * <p>The start of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-25T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainSrcBpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainSrcBpsDataRequest self = new DescribeVodDomainSrcBpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainSrcBpsDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainSrcBpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainSrcBpsDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVodDomainSrcBpsDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainSrcBpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
