// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainReqTrafficDataRequest extends TeaModel {
    /**
     * <p>Visual Edge Computing Service domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>End time of the query. Must be later than the start time. Specify in ISO 8601 format using UTC time.<br>Format: YYYY-MM-DDThh:mm:ssZ<br></p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-13T10:00:41Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Time granularity of the query. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><p><strong>300</strong> (default).</p>
     * </li>
     * <li><p><strong>3600</strong>.</p>
     * </li>
     * <li><p><strong>86400</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you omit this parameter or specify an unsupported value, the default value <strong>300</strong> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>ISP name in English. Call DescribeCdnRegionAndIsp to get valid values. If you omit this parameter, the system returns data for all ISPs.</p>
     * 
     * <strong>example:</strong>
     * <p>unicom</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>Region name in English. Call DescribeCdnRegionAndIsp to get valid values. If you omit this parameter, the system returns data for all regions.</p>
     * 
     * <strong>example:</strong>
     * <p>shanghai</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Start time of the query. Specify in ISO 8601 format using UTC time.<br>Format: YYYY-MM-DDThh:mm:ssZ<br>Minimum time granularity is 5 minutes.<br>If you omit this parameter, the system returns data for the last 24 hours.<br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-30T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsDomainReqTrafficDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainReqTrafficDataRequest self = new DescribeVsDomainReqTrafficDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainReqTrafficDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainReqTrafficDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainReqTrafficDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVsDomainReqTrafficDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeVsDomainReqTrafficDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeVsDomainReqTrafficDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsDomainReqTrafficDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
