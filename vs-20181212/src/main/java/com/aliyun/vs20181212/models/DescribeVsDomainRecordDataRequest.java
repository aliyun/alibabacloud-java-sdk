// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainRecordDataRequest extends TeaModel {
    /**
     * <p>Visual Edge Computing Service domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>End time of the data range. Must be later than StartTime. Use ISO 8601 notation in UTC. Format: YYYY-MM-DDThh:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-19T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Region information</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Start time of the data range. Use ISO 8601 notation in UTC. Format: YYYY-MM-DDThh:mm:ssZ. Minimum data granularity is 5 minutes. If you omit this parameter, the API returns data from the last 24 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-29T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsDomainRecordDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainRecordDataRequest self = new DescribeVsDomainRecordDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainRecordDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainRecordDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainRecordDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsDomainRecordDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVsDomainRecordDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
