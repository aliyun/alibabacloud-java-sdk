// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserExecutionLogsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("LogType")
    public String logType;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskExecutionId")
    public String taskExecutionId;

    public static ListUserExecutionLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserExecutionLogsRequest self = new ListUserExecutionLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserExecutionLogsRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public ListUserExecutionLogsRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public ListUserExecutionLogsRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public ListUserExecutionLogsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserExecutionLogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserExecutionLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUserExecutionLogsRequest setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
        return this;
    }
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

}
