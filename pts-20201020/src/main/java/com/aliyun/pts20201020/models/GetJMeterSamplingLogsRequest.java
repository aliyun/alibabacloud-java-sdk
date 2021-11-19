// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSamplingLogsRequest extends TeaModel {
    // 压测引擎编号
    @NameInMap("AgentId")
    public Long agentId;

    // 开始时间
    @NameInMap("BeginTime")
    public Long beginTime;

    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    // 关键字
    @NameInMap("Keyword")
    public String keyword;

    // 最大响应时间，单位ms
    @NameInMap("MaxRT")
    public Integer maxRT;

    // 最小响应时间，单位ms
    @NameInMap("MinRT")
    public Integer minRT;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 报告ID
    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("ResponseCode")
    public String responseCode;

    // 第几个采样器，从0开始
    @NameInMap("SamplerId")
    public Integer samplerId;

    // 采样结果是否成功
    @NameInMap("Success")
    public Boolean success;

    // 线程
    @NameInMap("Thread")
    public String thread;

    public static GetJMeterSamplingLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterSamplingLogsRequest self = new GetJMeterSamplingLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetJMeterSamplingLogsRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public GetJMeterSamplingLogsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetJMeterSamplingLogsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetJMeterSamplingLogsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetJMeterSamplingLogsRequest setMaxRT(Integer maxRT) {
        this.maxRT = maxRT;
        return this;
    }
    public Integer getMaxRT() {
        return this.maxRT;
    }

    public GetJMeterSamplingLogsRequest setMinRT(Integer minRT) {
        this.minRT = minRT;
        return this;
    }
    public Integer getMinRT() {
        return this.minRT;
    }

    public GetJMeterSamplingLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetJMeterSamplingLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetJMeterSamplingLogsRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GetJMeterSamplingLogsRequest setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public GetJMeterSamplingLogsRequest setSamplerId(Integer samplerId) {
        this.samplerId = samplerId;
        return this;
    }
    public Integer getSamplerId() {
        return this.samplerId;
    }

    public GetJMeterSamplingLogsRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetJMeterSamplingLogsRequest setThread(String thread) {
        this.thread = thread;
        return this;
    }
    public String getThread() {
        return this.thread;
    }

}
