// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobMetricsRequest extends TeaModel {
    // 截止UTC时间，格式 iso8601，假如为空是当前时间
    @NameInMap("EndTime")
    public String endTime;

    // 分页，从1开始，默认1
    @NameInMap("Name")
    public String name;

    // Metrics的时间顺序，有ASC和DESC
    @NameInMap("Order")
    public String order;

    // 每页返回的日志数量
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 每页返回的日志数量
    @NameInMap("PageSize")
    public Long pageSize;

    // 起始UTC时间，格式 iso8601，假如为空是任务开始时间
    @NameInMap("StartTime")
    public String startTime;

    public static ListTrainingJobMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobMetricsRequest self = new ListTrainingJobMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTrainingJobMetricsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListTrainingJobMetricsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTrainingJobMetricsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListTrainingJobMetricsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTrainingJobMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
