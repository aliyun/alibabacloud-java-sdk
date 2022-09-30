// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SearchOmsOpenAPIMonitorMetricRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("MaxPointNum")
    public Long maxPointNum;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static SearchOmsOpenAPIMonitorMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchOmsOpenAPIMonitorMetricRequest self = new SearchOmsOpenAPIMonitorMetricRequest();
        return TeaModel.build(map, self);
    }

    public SearchOmsOpenAPIMonitorMetricRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setMaxPointNum(Long maxPointNum) {
        this.maxPointNum = maxPointNum;
        return this;
    }
    public Long getMaxPointNum() {
        return this.maxPointNum;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
