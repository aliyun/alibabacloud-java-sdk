// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSamplingLogsRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("MaxRT")
    public Integer maxRT;

    @NameInMap("MinRT")
    public Integer minRT;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("ResponseCode")
    public String responseCode;

    @NameInMap("SamplerId")
    public Integer samplerId;

    @NameInMap("Success")
    public Boolean success;

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
