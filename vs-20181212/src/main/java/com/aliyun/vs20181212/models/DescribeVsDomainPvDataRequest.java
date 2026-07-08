// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainPvDataRequest extends TeaModel {
    /**
     * <p>The domain name for Visual Edge Computing Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the \<code>YYYY-MM-DDThh:mm:ssZ\\</code> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-15T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the \<code>YYYY-MM-DDThh:mm:ssZ\\</code> format. The time must be in UTC.<br>The minimum data granularity is 1 hour.<br>If you do not set this parameter, the data in the last 24 hours is returned.<br><br></p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-10T17:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsDomainPvDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainPvDataRequest self = new DescribeVsDomainPvDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainPvDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVsDomainPvDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsDomainPvDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsDomainPvDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
