// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainMax95BpsDataRequest extends TeaModel {
    /**
     * <p>The cycle for the 95th percentile bandwidth. Default value: day. Valid values:</p>
     * <ul>
     * <li><p>day: queries the 95th percentile bandwidth by day.</p>
     * </li>
     * <li><p>month: queries the 95th percentile bandwidth by month.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("Cycle")
    public String cycle;

    /**
     * <p>The accelerated domain name to query. If this parameter is left empty, the merged data of all accelerated domain names is returned by default.</p>
     * <blockquote>
     * <p>Batch domain name queries are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time of the query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-01-12T13:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The start time of the query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The start time point for data retrieval. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T10:00:00Z</p>
     */
    @NameInMap("TimePoint")
    public String timePoint;

    public static DescribeVodDomainMax95BpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainMax95BpsDataRequest self = new DescribeVodDomainMax95BpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainMax95BpsDataRequest setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }
    public String getCycle() {
        return this.cycle;
    }

    public DescribeVodDomainMax95BpsDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainMax95BpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainMax95BpsDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainMax95BpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodDomainMax95BpsDataRequest setTimePoint(String timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public String getTimePoint() {
        return this.timePoint;
    }

}
