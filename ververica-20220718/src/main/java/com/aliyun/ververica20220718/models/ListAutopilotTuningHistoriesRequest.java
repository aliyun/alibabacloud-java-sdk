// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListAutopilotTuningHistoriesRequest extends TeaModel {
    /**
     * <p>The query end timestamp in milliseconds. If not specified, the default is the current time. The time span between startTime and endTime cannot exceed 30 days.</p>
     * 
     * <strong>example:</strong>
     * <p>1689321600000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The page number, starting from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The query start timestamp in milliseconds. If not specified, the default is the last 3 days.</p>
     * 
     * <strong>example:</strong>
     * <p>1689235200000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static ListAutopilotTuningHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutopilotTuningHistoriesRequest self = new ListAutopilotTuningHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAutopilotTuningHistoriesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAutopilotTuningHistoriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAutopilotTuningHistoriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAutopilotTuningHistoriesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
