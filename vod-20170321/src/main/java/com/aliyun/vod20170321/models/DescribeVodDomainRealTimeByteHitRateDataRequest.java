// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeByteHitRateDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name to query.</p>
     * <ul>
     * <li>Separate multiple domain names with commas (,). You can specify up to 100 domain names at a time.</li>
     * <li>When you query multiple domain names, the returned data is the aggregated data of all specified domain names.</li>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>, and choose <strong>Configuration Management &gt; CDN Configuration &gt; Domain Names</strong> in the left-side navigation pane to view the accelerated domain names that you have added to ApsaraVideo VOD. You can also call the <a href="https://help.aliyun.com/document_detail/455030.html">DescribeVodUserDomains</a> operation to query the list of accelerated domain names.</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <p>2020-05-15T09:15:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-15T09:13:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainRealTimeByteHitRateDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeByteHitRateDataRequest self = new DescribeVodDomainRealTimeByteHitRateDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeByteHitRateDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainRealTimeByteHitRateDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainRealTimeByteHitRateDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainRealTimeByteHitRateDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
