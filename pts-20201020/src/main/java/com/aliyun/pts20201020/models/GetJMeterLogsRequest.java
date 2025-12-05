// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterLogsRequest extends TeaModel {
    /**
     * <p>Specifies that the operational logs of the stress tester identified as number 0 are returned if the agent index is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AgentIndex")
    public Integer agentIndex;

    /**
     * <p>The beginning of the time range to query. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1637115306000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end of the time range to query. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1637115309000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The log level. Valid values:</p>
     * <ul>
     * <li>ERROR</li>
     * <li>WARN</li>
     * <li>INFO (default)</li>
     * <li>DEBUG</li>
     * <li>TRACE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The report ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KS2YE3J2</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The thread name.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("Thread")
    public String thread;

    public static GetJMeterLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterLogsRequest self = new GetJMeterLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetJMeterLogsRequest setAgentIndex(Integer agentIndex) {
        this.agentIndex = agentIndex;
        return this;
    }
    public Integer getAgentIndex() {
        return this.agentIndex;
    }

    public GetJMeterLogsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetJMeterLogsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetJMeterLogsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetJMeterLogsRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetJMeterLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetJMeterLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetJMeterLogsRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GetJMeterLogsRequest setThread(String thread) {
        this.thread = thread;
        return this;
    }
    public String getThread() {
        return this.thread;
    }

}
