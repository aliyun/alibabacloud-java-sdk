// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionLogsRequest extends TeaModel {
    /**
     * <p>The ID of the execution.</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>The type of the log.</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region in which you want to query the logs of the execution.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The execution ID of the task.</p>
     */
    @NameInMap("TaskExecutionId")
    public String taskExecutionId;

    public static ListExecutionLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionLogsRequest self = new ListExecutionLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutionLogsRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public ListExecutionLogsRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public ListExecutionLogsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExecutionLogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExecutionLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListExecutionLogsRequest setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
        return this;
    }
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

}
