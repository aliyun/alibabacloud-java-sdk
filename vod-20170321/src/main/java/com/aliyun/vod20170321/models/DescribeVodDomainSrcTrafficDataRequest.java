// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainSrcTrafficDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name to query.</p>
     * <ul>
     * <li>If you do not specify this parameter, the pooled data of all accelerated domain names is returned by default.</li>
     * <li>Batch queries are supported. Separate multiple domain names with commas (,). You can specify up to 500 domain names at a time.</li>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>, and choose <strong>Configuration Management &gt; CDN Configuration &gt; Domain Names</strong> in the left-side navigation pane to view the accelerated domain names that you have added to ApsaraVideo VOD. You can also call the <a href="~~DescribeVodUserDomains~~">DescribeVodUserDomains</a> operation to query the list of accelerated domain names.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-09-24T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the data entries. Unit: seconds. Valid values: <strong>300</strong>, <strong>3600</strong>, and <strong>86400</strong>. If you do not specify this parameter or specify an unsupported value, the default value is used. Based on the time span specified by <code>StartTime</code> and <code>EndTime</code>, the supported time granularity values are as follows:</p>
     * <ul>
     * <li>Less than 3 days (exclusive): <strong>300</strong> (default), <strong>3600</strong>, and <strong>86400</strong>.</li>
     * <li>3 to 31 days (exclusive of 31 days): <strong>3600</strong> (default) and <strong>86400</strong>.</li>
     * <li>31 days or more: <strong>86400</strong> (default).</li>
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
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
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
