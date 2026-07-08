// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainReqBpsDataRequest extends TeaModel {
    /**
     * <p>Visual Edge Computing Service domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>End time must be later than start time. Use ISO 8601 notation and UTC time.<br>Format: YYYY-MM-DDThh:mm:ssZ<br></p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-16T07:00:46Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Time granularity for the query, in seconds. Valid values: 300, 3600, and 86400. If you omit this parameter or specify an unsupported value, the default value 300 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>ISP name in English. Get this value from the DescribeCdnRegionAndIsp operation. If you omit this parameter, the system queries data for all ISPs.</p>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>Region name in English. Get this value from the DescribeCdnRegionAndIsp operation. If you omit this parameter, the system queries data for all regions.</p>
     * 
     * <strong>example:</strong>
     * <p>beijing</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Start time of the data query. Use ISO 8601 notation and UTC time.<br>Format: YYYY-MM-DDThh:mm:ssZ<br>Minimum data granularity is 5 minutes.<br>If you omit this parameter, the system reads data from the last 24 hours by default.<br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-15T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsDomainReqBpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainReqBpsDataRequest self = new DescribeVsDomainReqBpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainReqBpsDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainReqBpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainReqBpsDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVsDomainReqBpsDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeVsDomainReqBpsDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeVsDomainReqBpsDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsDomainReqBpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
