// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainBpsDataByLayerRequest extends TeaModel {
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
     * <p>The end of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-01-23T12:40:12Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the data. Unit: seconds. Valid values: <strong>300</strong>, <strong>3600</strong>, and <strong>86400</strong>. If you do not specify this parameter or specify an unsupported value, the default value is used. The supported time granularity varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>:</p>
     * <ul>
     * <li>Less than 3 days (exclusive): <strong>300</strong> (default), <strong>3600</strong>, and <strong>86400</strong>.</li>
     * <li>3 to 31 days (exclusive): <strong>3600</strong> (default) and <strong>86400</strong>.</li>
     * <li>31 days or more: <strong>86400</strong> (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the Internet service provider (ISP) in English. If you do not specify this parameter, data of all ISPs is queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>unicom</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The protocol type. You can specify the protocol type at the network layer or application layer.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>all: includes both network layer and application layer</li>
     * </ul>
     * <p>Network layer values:</p>
     * <ul>
     * <li>IPv4</li>
     * <li>IPv6</li>
     * </ul>
     * <p>Application layer values:</p>
     * <ul>
     * <li>http</li>
     * <li>https</li>
     * <li>quic</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("Layer")
    public String layer;

    /**
     * <p>The name of the region in English. If you do not specify this parameter, data of all regions is queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>beijing</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-23T12:35:12Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodDomainBpsDataByLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainBpsDataByLayerRequest self = new DescribeVodDomainBpsDataByLayerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainBpsDataByLayerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodDomainBpsDataByLayerRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodDomainBpsDataByLayerRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVodDomainBpsDataByLayerRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeVodDomainBpsDataByLayerRequest setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public DescribeVodDomainBpsDataByLayerRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeVodDomainBpsDataByLayerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodDomainBpsDataByLayerRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
