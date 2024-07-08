// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceEventsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2020-11-08T15:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("MaxEventsNum")
    public Integer maxEventsNum;

    /**
     * <strong>example:</strong>
     * <p>2020-11-08T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetInstanceEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceEventsRequest self = new GetInstanceEventsRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetInstanceEventsRequest setMaxEventsNum(Integer maxEventsNum) {
        this.maxEventsNum = maxEventsNum;
        return this;
    }
    public Integer getMaxEventsNum() {
        return this.maxEventsNum;
    }

    public GetInstanceEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
