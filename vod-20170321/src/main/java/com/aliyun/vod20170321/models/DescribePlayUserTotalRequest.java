// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayUserTotalRequest extends TeaModel {
    /**
     * <p>The end time of the query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The maximum time span between the start time and end time is 180 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-30T13:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The start time of the query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T13:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribePlayUserTotalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayUserTotalRequest self = new DescribePlayUserTotalRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayUserTotalRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePlayUserTotalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePlayUserTotalRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
