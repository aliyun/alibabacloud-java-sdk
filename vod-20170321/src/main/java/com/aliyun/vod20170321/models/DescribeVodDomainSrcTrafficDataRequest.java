// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainSrcTrafficDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify a maximum of 500 domain names in a request. Separate multiple domain names with commas (,). If you specify multiple domain names in a request, aggregation results are returned.</p>
     * <p>If you leave this parameter empty, the origin traffic data for all accelerated domain names is queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-24T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time interval between the data entries to return. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><strong>300</strong>: 5 minutes</li>
     * <li><strong>3600</strong>: 1 hour</li>
     * <li><strong>86400</strong>: 1 day</li>
     * </ul>
     * <blockquote>
     * <p>The time granularity supported by the Interval parameter varies based on the time range per query specified by using <code>StartTime</code> and <code>EndTime</code>. For more information, see the <strong>Time granularity</strong> section of this topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>If you leave this parameter empty, the origin traffic data that is generated in the last 24 hours is queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-22T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainSrcTrafficDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainSrcTrafficDataRequest self = new DescribeVodDomainSrcTrafficDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainSrcTrafficDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainSrcTrafficDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainSrcTrafficDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVodDomainSrcTrafficDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainSrcTrafficDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
