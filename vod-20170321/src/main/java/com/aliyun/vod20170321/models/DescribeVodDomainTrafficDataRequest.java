// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainTrafficDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name that you want to query. If you leave this parameter empty, the merged data of all your accelerated domain names is returned. Separate multiple domain names with commas (,).</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The interval at which to return data. Unit: seconds. Valid values: **300**, **3600**, and **86400**. If you leave this parameter empty or specify an invalid value, the default value is used.</p>
     * <br>
     * <p>*   Valid values if the time range to query is less than 3 days: **300**, **3600**, and **86400**. Default value: 300.</p>
     * <p>*   Valid values if the time range to query is 3 to less than 31 days: **3600** and **86400**. Default value: 3600.</p>
     * <p>*   Valid value if the time range to query is 31 to 90 days: **86400**.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the Internet service provider (ISP). If you leave this parameter empty, all ISPs are queried.</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The name of the region. If you leave this parameter empty, all regions are queried. You can specify only the China (Shanghai) region.</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> The minimum time granularity to query data is 5 minutes. If you leave this parameter empty, the data in the last 24 hours is queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainTrafficDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainTrafficDataRequest self = new DescribeVodDomainTrafficDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainTrafficDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainTrafficDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainTrafficDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVodDomainTrafficDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeVodDomainTrafficDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeVodDomainTrafficDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainTrafficDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
