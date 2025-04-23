// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class UpdateOnlineEvalTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-llm-one</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2024-09-02 22:24:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EvaluationConfig")
    public EvaluationConfig evaluationConfig;

    @NameInMap("Filters")
    public java.util.List<UpdateOnlineEvalTaskRequestFilters> filters;

    @NameInMap("ModelConfig")
    public ModelConfig modelConfig;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SamplingFrequencyMinutes")
    public Integer samplingFrequencyMinutes;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("SamplingRatio")
    public Integer samplingRatio;

    /**
     * <strong>example:</strong>
     * <p>2024-07-31 08:30:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TaskName")
    public String taskName;

    public static UpdateOnlineEvalTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnlineEvalTaskRequest self = new UpdateOnlineEvalTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOnlineEvalTaskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateOnlineEvalTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOnlineEvalTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateOnlineEvalTaskRequest setEvaluationConfig(EvaluationConfig evaluationConfig) {
        this.evaluationConfig = evaluationConfig;
        return this;
    }
    public EvaluationConfig getEvaluationConfig() {
        return this.evaluationConfig;
    }

    public UpdateOnlineEvalTaskRequest setFilters(java.util.List<UpdateOnlineEvalTaskRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<UpdateOnlineEvalTaskRequestFilters> getFilters() {
        return this.filters;
    }

    public UpdateOnlineEvalTaskRequest setModelConfig(ModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public ModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public UpdateOnlineEvalTaskRequest setSamplingFrequencyMinutes(Integer samplingFrequencyMinutes) {
        this.samplingFrequencyMinutes = samplingFrequencyMinutes;
        return this;
    }
    public Integer getSamplingFrequencyMinutes() {
        return this.samplingFrequencyMinutes;
    }

    public UpdateOnlineEvalTaskRequest setSamplingRatio(Integer samplingRatio) {
        this.samplingRatio = samplingRatio;
        return this;
    }
    public Integer getSamplingRatio() {
        return this.samplingRatio;
    }

    public UpdateOnlineEvalTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateOnlineEvalTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public static class UpdateOnlineEvalTaskRequestFilters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ServiceId
         * ServiceName
         * Input
         * Output
         * Status
         * TraceType
         * SpanType
         * TraceName
         * SpanName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>=
         * StartsWith
         * Contains</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>foo</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateOnlineEvalTaskRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            UpdateOnlineEvalTaskRequestFilters self = new UpdateOnlineEvalTaskRequestFilters();
            return TeaModel.build(map, self);
        }

        public UpdateOnlineEvalTaskRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateOnlineEvalTaskRequestFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateOnlineEvalTaskRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
