// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainBpsDataRequest extends TeaModel {
    /**
     * <p>The domain name to be queried. If you do not specify this parameter, the merged data of all your domain names for CDN is returned. You can specify multiple domain names. Separate them with commas (,).</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The query interval. Unit: seconds. Valid values: **300**, **3600**, and **86400**.</p>
     * <br>
     * <p>*   If the time range to query is less than 3 days, valid values are **300**, **3600**, and **86400**. The default value is 300.</p>
     * <p>*   If the time range to query is from 3 to less than 31 days, valid values are **3600** and **86400**. The default value is 3600.</p>
     * <p>*   If the time range to query is from 31 to 90 days, the valid value is **86400**.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the Internet service provider (ISP). If you do not specify this parameter, the data of all ISPs is returned.</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The name of the region. If you do not specify this parameter, the data in all regions is returned. Only data in the China (Shanghai) region can be queried.</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> The minimum query interval is 5 minutes. If you do not specify this parameter, the data in the last 24 hours is queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainBpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainBpsDataRequest self = new DescribeVodDomainBpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainBpsDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainBpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainBpsDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVodDomainBpsDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeVodDomainBpsDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeVodDomainBpsDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainBpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
