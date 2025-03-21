// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainMax95BpsDataRequest extends TeaModel {
    /**
     * <p>The cycle to query the 95th percentile bandwidth data. Valid values:</p>
     * <ul>
     * <li>day (default)</li>
     * <li>month</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("Cycle")
    public String cycle;

    /**
     * <p>The domain name to be queried for acceleration. If the parameter is empty, the data merged from all accelerated domain names will be returned by default.</p>
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
     * <p>End time point. The date format follows the ISO8601 representation and uses UTC time, in the format yyyy-MM-dd\&quot;T\&quot;HH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-12T13:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Start time point. The date format follows the ISO8601 representation and uses UTC time, in the format yyyy-MM-dd\&quot;T\&quot;HH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The start time point for getting the data. The date format follows the ISO8601 representation and uses UTC time, in the format yyyy-MM-dd\&quot;T\&quot;HH:mm:ssZ.</p>
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
