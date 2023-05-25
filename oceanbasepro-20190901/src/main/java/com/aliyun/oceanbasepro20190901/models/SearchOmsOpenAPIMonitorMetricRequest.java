// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SearchOmsOpenAPIMonitorMetricRequest extends TeaModel {
    /**
     * <p>Alibaba Cloud provides SDKs in different languages to help you quickly integrate Alibaba Cloud products and services by using APIs. We recommend that you use an SDK to call APIs. In this way, you do not need to sign for verification.</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>It is an Alibaba Cloud asset management and configuration tool, with which you can manage multiple Alibaba Cloud products and services by using commands. It is easy to use and a good helper in migration to cloud.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Contact the administrator.</p>
     */
    @NameInMap("MaxPointNum")
    public Long maxPointNum;

    /**
     * <p>The business data returned.</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The information about the object.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>A millisecond-level timestamp.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The value corresponding to the time.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The name of the metric.</p>
     */
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
