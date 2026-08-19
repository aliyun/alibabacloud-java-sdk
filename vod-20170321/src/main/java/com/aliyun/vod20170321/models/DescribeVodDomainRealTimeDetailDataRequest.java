// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRealTimeDetailDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name to query.</p>
     * <ul>
     * <li>Batch queries are supported. Separate multiple domain names with commas (,). You can specify up to 20 domain names at a time.</li>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>, and in the left-side navigation pane, choose <strong>Configuration Management &gt; CDN Configuration &gt; Domain Names</strong> to view the accelerated domain names that you have added to ApsaraVideo VOD. Alternatively, call the <a href="~~DescribeVodUserDomains~~">DescribeVodUserDomains</a> operation to query the list of accelerated domain names.</li>
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
     * <p>The end time must be later than the start time, and the difference between the end time and the start time cannot exceed 10 minutes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-23T12:40:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of access data to query. You can specify multiple types. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>qps</strong>: queries per second (QPS).</li>
     * <li><strong>bps</strong>: bandwidth data.</li>
     * <li><strong>http_code</strong>: HTTP status codes.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qps</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The Internet service provider (ISP) name in English. If you do not specify this parameter, data for all ISPs is queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>unicom</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The region name in English. If you do not specify this parameter, data for all regions is queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>shanghai</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>Specifies whether to return aggregated data by domain name. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Returns aggregated data across all domain names.</li>
     * <li><strong>false</strong> (default): Returns data grouped by domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Merge")
    public String merge;

    /**
     * <p>Specifies whether to return aggregated data by region and ISP. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Returns data grouped only by domain name, with region and ISP values aggregated.</li>
     * <li><strong>false</strong> (default): Returns data grouped by domain name, region, and ISP.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MergeLocIsp")
    public String mergeLocIsp;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-23T12:35:12Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainRealTimeDetailDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRealTimeDetailDataRequest self = new DescribeVodDomainRealTimeDetailDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRealTimeDetailDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainRealTimeDetailDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainRealTimeDetailDataRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeVodDomainRealTimeDetailDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeVodDomainRealTimeDetailDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeVodDomainRealTimeDetailDataRequest setMerge(String merge) {
        this.merge = merge;
        return this;
    }
    public String getMerge() {
        return this.merge;
    }

    public DescribeVodDomainRealTimeDetailDataRequest setMergeLocIsp(String mergeLocIsp) {
        this.mergeLocIsp = mergeLocIsp;
        return this;
    }
    public String getMergeLocIsp() {
        return this.mergeLocIsp;
    }

    public DescribeVodDomainRealTimeDetailDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainRealTimeDetailDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
