// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobsRequest extends TeaModel {
    /**
     * <p>The algorithm name.</p>
     * 
     * <strong>example:</strong>
     * <p>llm_train</p>
     */
    @NameInMap("AlgorithmName")
    public String algorithmName;

    /**
     * <p>The algorithm provider.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("AlgorithmProvider")
    public String algorithmProvider;

    /**
     * <p>The end time of the job creation time range for the query. Default value: current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-27T02:10:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether the algorithm is a temporary algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTempAlgo")
    public Boolean isTempAlgo;

    /**
     * <p>The labels of the training job.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;project&quot;: &quot;sd-s3&quot;}</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, ?> labels;

    /**
     * <p>The sort order. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The field by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtModifiedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time of the job creation time range for the query. Default value: 7 days ago.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-22T01:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the training job.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The training job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>trains930928remn</p>
     */
    @NameInMap("TrainingJobId")
    public String trainingJobId;

    /**
     * <p>The name of the training job.</p>
     * 
     * <strong>example:</strong>
     * <p>large_language_model_training</p>
     */
    @NameInMap("TrainingJobName")
    public String trainingJobName;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListTrainingJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobsRequest self = new ListTrainingJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobsRequest setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public ListTrainingJobsRequest setAlgorithmProvider(String algorithmProvider) {
        this.algorithmProvider = algorithmProvider;
        return this;
    }
    public String getAlgorithmProvider() {
        return this.algorithmProvider;
    }

    public ListTrainingJobsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTrainingJobsRequest setIsTempAlgo(Boolean isTempAlgo) {
        this.isTempAlgo = isTempAlgo;
        return this;
    }
    public Boolean getIsTempAlgo() {
        return this.isTempAlgo;
    }

    public ListTrainingJobsRequest setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public ListTrainingJobsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTrainingJobsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListTrainingJobsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTrainingJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTrainingJobsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTrainingJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTrainingJobsRequest setTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }
    public String getTrainingJobId() {
        return this.trainingJobId;
    }

    public ListTrainingJobsRequest setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
        return this;
    }
    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    public ListTrainingJobsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
