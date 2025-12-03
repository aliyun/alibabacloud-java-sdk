// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenScoreThreadRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1723445464501</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1722840664501</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeScreenScoreThreadRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenScoreThreadRequest self = new DescribeScreenScoreThreadRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScreenScoreThreadRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeScreenScoreThreadRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
