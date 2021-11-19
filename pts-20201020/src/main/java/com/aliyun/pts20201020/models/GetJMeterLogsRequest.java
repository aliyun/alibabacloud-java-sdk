// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterLogsRequest extends TeaModel {
    // 第几台引擎，起始为0
    @NameInMap("AgentIndex")
    public Integer agentIndex;

    // 开始时间
    @NameInMap("BeginTime")
    public Long beginTime;

    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    // 关键字
    @NameInMap("Keyword")
    public String keyword;

    // 日志等级
    @NameInMap("Level")
    public String level;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 报告ID
    @NameInMap("ReportId")
    public String reportId;

    // 线程名
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
