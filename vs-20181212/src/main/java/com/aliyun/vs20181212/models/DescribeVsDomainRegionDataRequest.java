// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainRegionDataRequest extends TeaModel {
    /**
     * <p>Visual Edge Computing Service domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>End time of the data range. The end time must be later than the start time. Specify the time in ISO 8601 format in UTC.<br>Format: YYYY-MM-DDThh:mm:ssZ.<br></p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-31T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Start time of the data range. Specify the time in ISO 8601 format in UTC.<br>Format: YYYY-MM-DDThh:mm:ssZ.<br>Minimum data granularity is 5 minutes.<br>If you do not specify this parameter, data from the last 24 hours is returned by default.<br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-30T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsDomainRegionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainRegionDataRequest self = new DescribeVsDomainRegionDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainRegionDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainRegionDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainRegionDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsDomainRegionDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
