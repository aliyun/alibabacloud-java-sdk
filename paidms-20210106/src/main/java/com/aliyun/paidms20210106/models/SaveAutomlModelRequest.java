// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class SaveAutomlModelRequest extends TeaModel {
    @NameInMap("Auc")
    public String auc;

    @NameInMap("ExecutionRecordId")
    public Long executionRecordId;

    @NameInMap("ExperimentId")
    public Long experimentId;

    @NameInMap("F1score")
    public String f1score;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Indicator")
    public String indicator;

    @NameInMap("IndicatorData")
    public String indicatorData;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("IsMigrate")
    public Integer isMigrate;

    @NameInMap("Iterations")
    public Integer iterations;

    @NameInMap("ModelIndex")
    public Integer modelIndex;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("ModelParam")
    public String modelParam;

    @NameInMap("PrecisionScore")
    public String precisionScore;

    @NameInMap("Recall")
    public String recall;

    @NameInMap("Roc")
    public String roc;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TaskId")
    public Long taskId;

    public static SaveAutomlModelRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAutomlModelRequest self = new SaveAutomlModelRequest();
        return TeaModel.build(map, self);
    }

    public SaveAutomlModelRequest setAuc(String auc) {
        this.auc = auc;
        return this;
    }
    public String getAuc() {
        return this.auc;
    }

    public SaveAutomlModelRequest setExecutionRecordId(Long executionRecordId) {
        this.executionRecordId = executionRecordId;
        return this;
    }
    public Long getExecutionRecordId() {
        return this.executionRecordId;
    }

    public SaveAutomlModelRequest setExperimentId(Long experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public Long getExperimentId() {
        return this.experimentId;
    }

    public SaveAutomlModelRequest setF1score(String f1score) {
        this.f1score = f1score;
        return this;
    }
    public String getF1score() {
        return this.f1score;
    }

    public SaveAutomlModelRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SaveAutomlModelRequest setIndicator(String indicator) {
        this.indicator = indicator;
        return this;
    }
    public String getIndicator() {
        return this.indicator;
    }

    public SaveAutomlModelRequest setIndicatorData(String indicatorData) {
        this.indicatorData = indicatorData;
        return this;
    }
    public String getIndicatorData() {
        return this.indicatorData;
    }

    public SaveAutomlModelRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public SaveAutomlModelRequest setIsMigrate(Integer isMigrate) {
        this.isMigrate = isMigrate;
        return this;
    }
    public Integer getIsMigrate() {
        return this.isMigrate;
    }

    public SaveAutomlModelRequest setIterations(Integer iterations) {
        this.iterations = iterations;
        return this;
    }
    public Integer getIterations() {
        return this.iterations;
    }

    public SaveAutomlModelRequest setModelIndex(Integer modelIndex) {
        this.modelIndex = modelIndex;
        return this;
    }
    public Integer getModelIndex() {
        return this.modelIndex;
    }

    public SaveAutomlModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public SaveAutomlModelRequest setModelParam(String modelParam) {
        this.modelParam = modelParam;
        return this;
    }
    public String getModelParam() {
        return this.modelParam;
    }

    public SaveAutomlModelRequest setPrecisionScore(String precisionScore) {
        this.precisionScore = precisionScore;
        return this;
    }
    public String getPrecisionScore() {
        return this.precisionScore;
    }

    public SaveAutomlModelRequest setRecall(String recall) {
        this.recall = recall;
        return this;
    }
    public String getRecall() {
        return this.recall;
    }

    public SaveAutomlModelRequest setRoc(String roc) {
        this.roc = roc;
        return this;
    }
    public String getRoc() {
        return this.roc;
    }

    public SaveAutomlModelRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SaveAutomlModelRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
