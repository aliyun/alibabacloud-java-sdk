// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class ListTranslationTasksRequest extends TeaModel {
    @NameInMap("APIKey")
    public String APIKey;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OriginalFileName")
    public String originalFileName;

    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("TargetLanguage")
    public String targetLanguage;

    @NameInMap("TaskId")
    public String taskId;

    public static ListTranslationTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTranslationTasksRequest self = new ListTranslationTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTranslationTasksRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public ListTranslationTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTranslationTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTranslationTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTranslationTasksRequest setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
        return this;
    }
    public String getOriginalFileName() {
        return this.originalFileName;
    }

    public ListTranslationTasksRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public ListTranslationTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTranslationTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTranslationTasksRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public ListTranslationTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
