// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListAITasksRequest extends TeaModel {
    /**
     * <p>The maximum number of data entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>U12WEI6Ro2ol3wA54rBNS3Cltv2VJyA+7hP4GqbIOhmWU5mWU9ZE3cXLgDaH4KSMRfIYcIVrvtHaAzCoyfo7VQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the AI task. You can filter AI tasks by task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>t-asasas*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The type of the AI task. You can filter AI tasks by task type.</p>
     * <ul>
     * <li>GenerateTemplate: The AI task is used to generate a template.</li>
     * <li>FixTemplate: The AI task is used to fix a template.</li>
     * </ul>
     * <p>If you leave this parameter empty, all task types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>GenerateTemplate</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static ListAITasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAITasksRequest self = new ListAITasksRequest();
        return TeaModel.build(map, self);
    }

    public ListAITasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAITasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAITasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListAITasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
