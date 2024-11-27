// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetLogRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>1721636220</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>1310630367761285120</p>
     */
    @NameInMap("JobExecutionId")
    public String jobExecutionId;

    /**
     * <strong>example:</strong>
     * <p>hello word</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>LineNum</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LineNum")
    public Integer lineNum;

    /**
     * <strong>example:</strong>
     * <p>344008</p>
     */
    @NameInMap("LogId")
    public Long logId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <strong>example:</strong>
     * <p>1721636220</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogRequest self = new GetLogRequest();
        return TeaModel.build(map, self);
    }

    public GetLogRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLogRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetLogRequest setJobExecutionId(String jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }
    public String getJobExecutionId() {
        return this.jobExecutionId;
    }

    public GetLogRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetLogRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetLogRequest setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
        return this;
    }
    public Integer getLineNum() {
        return this.lineNum;
    }

    public GetLogRequest setLogId(Long logId) {
        this.logId = logId;
        return this;
    }
    public Long getLogId() {
        return this.logId;
    }

    public GetLogRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public GetLogRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public GetLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
