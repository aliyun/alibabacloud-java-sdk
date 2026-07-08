// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsTopDomainsByFlowRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The end time must be later than the start time. The date format follows the ISO 8601 standard and uses UTC.<br>Format: YYYY-MM-DDThh:mm:ssZ<br></p>
     * 
     * <strong>example:</strong>
     * <p>2018-12-10T18:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of domain names to return. The default value is 20. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The start of the time range to query. The date format follows the ISO 8601 standard and uses UTC.<br>Format: YYYY-MM-DDThh:mm:ssZ<br>The minimum data granularity is 5 minutes.<br>If you do not specify this parameter, data for the current month is queried.<br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-12T10:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsTopDomainsByFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsTopDomainsByFlowRequest self = new DescribeVsTopDomainsByFlowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsTopDomainsByFlowRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsTopDomainsByFlowRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeVsTopDomainsByFlowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsTopDomainsByFlowRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
