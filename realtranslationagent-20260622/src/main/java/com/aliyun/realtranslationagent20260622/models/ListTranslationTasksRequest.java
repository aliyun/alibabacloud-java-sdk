// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class ListTranslationTasksRequest extends TeaModel {
    /**
     * <p>The API key that identifies the identity of member accounts. You can obtain it from the RuiYiBao console.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-1***s</p>
     */
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>The end time of the task.</p>
     * <ul>
     * <li>Format: YYYY-MM-dd HH:mm:ss.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2026-06-27 00:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of results to return per request when using the NextToken-based pagination.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6lkCoZlXVoygoU1omMcKBVc</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the source file.</p>
     * 
     * <strong>example:</strong>
     * <p>translated_a_file.pptx</p>
     */
    @NameInMap("OriginalFileName")
    public String originalFileName;

    /**
     * <p>The language of the source file.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The start time of the task.</p>
     * <ul>
     * <li>Format: YYYY-MM-dd HH:mm:ss.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2026-06-26 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>CANCELLED: Cancelled.</li>
     * <li>COMPLETED: Completed.</li>
     * <li>FAILED: Failed.</li>
     * <li>PROCESSING: Processing.</li>
     * <li>PENDING: Pending.</li>
     * <li>ANALYZED: Analyzed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROCESSING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The target language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The translation task ID, which is the TaskId obtained from UploadTranslationFile.</p>
     * 
     * <strong>example:</strong>
     * <p>f9c35b0453b</p>
     */
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
