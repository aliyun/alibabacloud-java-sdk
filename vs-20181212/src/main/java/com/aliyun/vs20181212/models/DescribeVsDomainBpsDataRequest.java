// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainBpsDataRequest extends TeaModel {
    /**
     * <p>Domain Names. If this parameter is empty, the system returns merged data for all accelerated Domain Names. Enter the accelerated Domain Names to query. Separate multiple Domain Names with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time must be later than the start time. The date format follows ISO8601 notation and uses UTC time. Format: YYYY-MM-DDThh:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-02T02:30:48Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity for query data. Supports 300, 3600, and 86400 seconds. If this parameter is not specified or the specified value is not supported, the system uses 300 seconds by default.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The English name of the carrier (ISP). Obtain this from the DescribeCdnRegionAndIsp interface. If not specified, the system queries all carriers (ISPs).</p>
     * 
     * <strong>example:</strong>
     * <p>unicom</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The English name of the region. Obtain this from the DescribeCdnRegionAndIsp interface. If not specified, the system queries all regions.</p>
     * 
     * <strong>example:</strong>
     * <p>guangdong</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The start time for data retrieval. The date format follows ISO8601 notation and uses UTC time. Format: YYYY-MM-DDThh:mm:ssZ. The minimum data granularity is 5 minutes. If not specified, the system reads data from the past 24 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-26T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsDomainBpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainBpsDataRequest self = new DescribeVsDomainBpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainBpsDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainBpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainBpsDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVsDomainBpsDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeVsDomainBpsDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeVsDomainBpsDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsDomainBpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
