// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetLogRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end time. This value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1721636220</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The job execution ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1310630367761285120</p>
     */
    @NameInMap("JobExecutionId")
    public String jobExecutionId;

    /**
     * <p>The keyword to search for.</p>
     * 
     * <strong>example:</strong>
     * <p>hello word</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The log level.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The number of log entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LineNum")
    public Integer lineNum;

    /**
     * <p>The log ID.</p>
     * 
     * <strong>example:</strong>
     * <p>344008</p>
     */
    @NameInMap("LogId")
    public Long logId;

    /**
     * <p>The offset.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <p>Specifies whether to sort the results in descending order.</p>
     * <ul>
     * <li><p><strong>true</strong>: sorts the results in descending order.</p>
     * </li>
     * <li><p><strong>false</strong>: sorts the results in ascending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The time when the job was scheduled. This value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01 12:00:00</p>
     */
    @NameInMap("ScheduleTime")
    public Long scheduleTime;

    /**
     * <p>The start time. This value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1721636220</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The worker address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.100</p>
     */
    @NameInMap("WorkerAddr")
    public String workerAddr;

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

    public GetLogRequest setScheduleTime(Long scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public Long getScheduleTime() {
        return this.scheduleTime;
    }

    public GetLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetLogRequest setWorkerAddr(String workerAddr) {
        this.workerAddr = workerAddr;
        return this;
    }
    public String getWorkerAddr() {
        return this.workerAddr;
    }

}
