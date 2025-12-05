// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSamplingLogsRequest extends TeaModel {
    /**
     * <p>The ID of the load generator. This parameter is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>14238000</p>
     */
    @NameInMap("AgentId")
    public Long agentId;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1637157073000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1637157076000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The keyword. You can use the keyword in the value of <strong>SceneName</strong> for fuzzy searching or use the value of <strong>SceneID</strong> for exact searching.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The maximum response time. Unit: ms.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxRT")
    public Integer maxRT;

    /**
     * <p>The minimum response time. Unit: ms.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinRT")
    public Integer minRT;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the report.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7R4RE352</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ResponseCode")
    public String responseCode;

    /**
     * <p>The ID of the sampler. The value starts from 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SamplerId")
    public Integer samplerId;

    /**
     * <p>Specifies whether the sampling is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The name of the thread. Fuzzy searching is supported. If you specify multiple threads, separate the threads with spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
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
