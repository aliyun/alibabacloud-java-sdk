// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobOutputModelsResponseBody extends TeaModel {
    @NameInMap("OutputModels")
    public java.util.List<ListTrainingJobOutputModelsResponseBodyOutputModels> outputModels;

    public static ListTrainingJobOutputModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobOutputModelsResponseBody self = new ListTrainingJobOutputModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobOutputModelsResponseBody setOutputModels(java.util.List<ListTrainingJobOutputModelsResponseBodyOutputModels> outputModels) {
        this.outputModels = outputModels;
        return this;
    }
    public java.util.List<ListTrainingJobOutputModelsResponseBodyOutputModels> getOutputModels() {
        return this.outputModels;
    }

    public static class ListTrainingJobOutputModelsResponseBodyOutputModelsLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>StableDiffusion</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTrainingJobOutputModelsResponseBodyOutputModelsLabels build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobOutputModelsResponseBodyOutputModelsLabels self = new ListTrainingJobOutputModelsResponseBodyOutputModelsLabels();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobOutputModelsResponseBodyOutputModelsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTrainingJobOutputModelsResponseBodyOutputModelsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTrainingJobOutputModelsResponseBodyOutputModels extends TeaModel {
        @NameInMap("CompressionSpec")
        public java.util.Map<String, ?> compressionSpec;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("EvaluationSpec")
        public java.util.Map<String, ?> evaluationSpec;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("InferenceSpec")
        public java.util.Map<String, ?> inferenceSpec;

        @NameInMap("Labels")
        public java.util.List<ListTrainingJobOutputModelsResponseBodyOutputModelsLabels> labels;

        /**
         * <strong>example:</strong>
         * <p>{
         *       &quot;lr&quot;: 0.000001,
         *       &quot;train_loss&quot;: 2.6345
         * }</p>
         */
        @NameInMap("Metrics")
        public java.util.Map<String, ?> metrics;

        /**
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("OutputChannelName")
        public String outputChannelName;

        /**
         * <strong>example:</strong>
         * <p>region=cn-shanghai,workspaceId=1345,kind=PipelineRun,id=run-sakdbaskjdf</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <strong>example:</strong>
         * <p>PAIFlow</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("TrainingSpec")
        public java.util.Map<String, ?> trainingSpec;

        /**
         * <strong>example:</strong>
         * <p>oss://test-bucket.oss-cn-hangzhou.aliyuncs.com/path/to/output/channel/</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static ListTrainingJobOutputModelsResponseBodyOutputModels build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobOutputModelsResponseBodyOutputModels self = new ListTrainingJobOutputModelsResponseBodyOutputModels();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobOutputModelsResponseBodyOutputModels setCompressionSpec(java.util.Map<String, ?> compressionSpec) {
            this.compressionSpec = compressionSpec;
            return this;
        }
        public java.util.Map<String, ?> getCompressionSpec() {
            return this.compressionSpec;
        }

        public ListTrainingJobOutputModelsResponseBodyOutputModels setEvaluationSpec(java.util.Map<String, ?> evaluationSpec) {
            this.evaluationSpec = evaluationSpec;
            return this;
        }
        public java.util.Map<String, ?> getEvaluationSpec() {
            return this.evaluationSpec;
        }

        public ListTrainingJobOutputModelsResponseBodyOutputModels setInferenceSpec(java.util.Map<String, ?> inferenceSpec) {
            this.inferenceSpec = inferenceSpec;
            return this;
        }
        public java.util.Map<String, ?> getInferenceSpec() {
            return this.inferenceSpec;
        }

        public ListTrainingJobOutputModelsResponseBodyOutputModels setLabels(java.util.List<ListTrainingJobOutputModelsResponseBodyOutputModelsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListTrainingJobOutputModelsResponseBodyOutputModelsLabels> getLabels() {
            return this.labels;
        }

        public ListTrainingJobOutputModelsResponseBodyOutputModels setMetrics(java.util.Map<String, ?> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.Map<String, ?> getMetrics() {
            return this.metrics;
        }

        public ListTrainingJobOutputModelsResponseBodyOutputModels setOutputChannelName(String outputChannelName) {
            this.outputChannelName = outputChannelName;
            return this;
        }
        public String getOutputChannelName() {
            return this.outputChannelName;
        }

        public ListTrainingJobOutputModelsResponseBodyOutputModels setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListTrainingJobOutputModelsResponseBodyOutputModels setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListTrainingJobOutputModelsResponseBodyOutputModels setTrainingSpec(java.util.Map<String, ?> trainingSpec) {
            this.trainingSpec = trainingSpec;
            return this;
        }
        public java.util.Map<String, ?> getTrainingSpec() {
            return this.trainingSpec;
        }

        public ListTrainingJobOutputModelsResponseBodyOutputModels setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
