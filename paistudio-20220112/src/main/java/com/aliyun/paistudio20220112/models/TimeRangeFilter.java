// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class TimeRangeFilter extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static TimeRangeFilter build(java.util.Map<String, ?> map) throws Exception {
        TimeRangeFilter self = new TimeRangeFilter();
        return TeaModel.build(map, self);
    }

    public TimeRangeFilter setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TimeRangeFilter setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
