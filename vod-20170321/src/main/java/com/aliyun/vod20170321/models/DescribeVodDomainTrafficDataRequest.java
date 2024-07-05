// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainTrafficDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     * <ul>
     * <li>If you leave this parameter empty, the merged data of all your accelerated domain names is returned.</li>
     * <li>You can specify multiple domain names and separate them with commas (,). You can specify a maximum of 500 domain names in each call.</li>
     * <li>To obtain the accelerated domain name, perform the following steps: Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management &gt; CDN Configuration &gt; Domain Names</strong>. On the Domain Names page, view the accelerated domain names. Alternatively, you can call the <a href="~~DescribeVodUserDomains~~">DescribeVodUserDomains</a> operation to query the accelerated domain names.</li>
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
     * <p>2019-01-20T14:59:58Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the query. Unit: seconds. Valid values: <strong>300</strong>, <strong>3600</strong>, and <strong>86400</strong>. If you leave this parameter empty or specify an invalid value, the default value is used. The supported time granularity varies based on the time range specified by <code>EndTime</code> and <code>StartTime</code>. The following content describes the supported time granularity.</p>
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

    /**
     * <p>The name of the Internet service provider (ISP). If you leave this parameter empty, all ISPs are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The name of the region. If you leave this parameter empty, all regions are queried. You can specify only the China (Shanghai) region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The start of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-20T13:59:58Z</p>
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
