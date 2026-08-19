// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeBpsDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name to query.</p>
     * <ul>
     * <li>Separate multiple domain names with commas (,). You can specify up to 500 domain names at a time.</li>
     * <li>When you query multiple domain names, the returned data is the aggregated data of all specified domain names.</li>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>, and choose <strong>Configuration Management &gt; CDN Configuration &gt; Domain Names</strong> in the left-side navigation pane to view the accelerated domain names that you have added to ApsaraVideo VOD. You can also call the <a href="~~DescribeVodUserDomains~~">DescribeVodUserDomains</a> operation to query the list of accelerated domain names.</li>
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
     * <p>2019-11-30T05:40:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the Internet service provider (ISP) in English. If you do not specify this parameter, data of all ISPs is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The name of the region in English. If you do not specify this parameter, data of all regions is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>shanghai</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-11-30T05:33:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainRealTimeBpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeBpsDataRequest self = new DescribeVodDomainRealTimeBpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeBpsDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainRealTimeBpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainRealTimeBpsDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeVodDomainRealTimeBpsDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeVodDomainRealTimeBpsDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainRealTimeBpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
