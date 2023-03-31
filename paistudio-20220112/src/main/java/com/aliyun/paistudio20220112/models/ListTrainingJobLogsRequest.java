// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobLogsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("WorkerId")
    public String workerId;

    public static ListTrainingJobLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobLogsRequest self = new ListTrainingJobLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTrainingJobLogsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListTrainingJobLogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTrainingJobLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTrainingJobLogsRequest setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }
    public String getWorkerId() {
        return this.workerId;
    }

}
