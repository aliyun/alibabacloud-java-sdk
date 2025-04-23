// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class CreateOnlineEvalTaskRequest extends TeaModel {
    @NameInMap("body")
    public CreateOnlineEvalTaskRequestBody body;

    public static CreateOnlineEvalTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOnlineEvalTaskRequest self = new CreateOnlineEvalTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOnlineEvalTaskRequest setBody(CreateOnlineEvalTaskRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateOnlineEvalTaskRequestBody getBody() {
        return this.body;
    }

    public static class CreateOnlineEvalTaskRequestBodyFilters extends TeaModel {
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

        public static CreateOnlineEvalTaskRequestBodyFilters build(java.util.Map<String, ?> map) throws Exception {
            CreateOnlineEvalTaskRequestBodyFilters self = new CreateOnlineEvalTaskRequestBodyFilters();
            return TeaModel.build(map, self);
        }

        public CreateOnlineEvalTaskRequestBodyFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOnlineEvalTaskRequestBodyFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateOnlineEvalTaskRequestBodyFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOnlineEvalTaskRequestBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-best-llm-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2025-06-05 14:00:01
         * 2025-06-05</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EvaluationConfig")
        public EvaluationConfig evaluationConfig;

        @NameInMap("Filters")
        public java.util.List<CreateOnlineEvalTaskRequestBodyFilters> filters;

        @NameInMap("ModelConfig")
        public ModelConfig modelConfig;

        /**
         * <strong>example:</strong>
         * <p>9</p>
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
         * <p>2025-04-05 14:00:01
         * 2025-04-05</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>my-llm-app-eval-task-1</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static CreateOnlineEvalTaskRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateOnlineEvalTaskRequestBody self = new CreateOnlineEvalTaskRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateOnlineEvalTaskRequestBody setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateOnlineEvalTaskRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateOnlineEvalTaskRequestBody setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateOnlineEvalTaskRequestBody setEvaluationConfig(EvaluationConfig evaluationConfig) {
            this.evaluationConfig = evaluationConfig;
            return this;
        }
        public EvaluationConfig getEvaluationConfig() {
            return this.evaluationConfig;
        }

        public CreateOnlineEvalTaskRequestBody setFilters(java.util.List<CreateOnlineEvalTaskRequestBodyFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<CreateOnlineEvalTaskRequestBodyFilters> getFilters() {
            return this.filters;
        }

        public CreateOnlineEvalTaskRequestBody setModelConfig(ModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public ModelConfig getModelConfig() {
            return this.modelConfig;
        }

        public CreateOnlineEvalTaskRequestBody setSamplingFrequencyMinutes(Integer samplingFrequencyMinutes) {
            this.samplingFrequencyMinutes = samplingFrequencyMinutes;
            return this;
        }
        public Integer getSamplingFrequencyMinutes() {
            return this.samplingFrequencyMinutes;
        }

        public CreateOnlineEvalTaskRequestBody setSamplingRatio(Integer samplingRatio) {
            this.samplingRatio = samplingRatio;
            return this;
        }
        public Integer getSamplingRatio() {
            return this.samplingRatio;
        }

        public CreateOnlineEvalTaskRequestBody setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateOnlineEvalTaskRequestBody setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
