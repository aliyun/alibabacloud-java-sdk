// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobOutputModelsResponseBody extends TeaModel {
    /**
     * <p>List of models produced by training.</p>
     */
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
        /**
         * <p>Tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>RootModelName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen2-0.5</p>
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
        /**
         * <p>Model compression configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("CompressionSpec")
        public java.util.Map<String, ?> compressionSpec;

        /**
         * <p>Model evaluation configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("EvaluationSpec")
        public java.util.Map<String, ?> evaluationSpec;

        /**
         * <p>Model inference configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("InferenceSpec")
        public java.util.Map<String, ?> inferenceSpec;

        /**
         * <p>List of tags.</p>
         */
        @NameInMap("Labels")
        public java.util.List<ListTrainingJobOutputModelsResponseBodyOutputModelsLabels> labels;

        /**
         * <p>Training job metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;Results&quot;: [
         *           {
         *             &quot;Dataset&quot;: {
         *               &quot;Train&quot;: &quot;oss://somebucket.oss-cn-hangzhou.aliyuncs.com/datasets/Chinese-medical-dialogue-data/chinese_medical_train_sampled.json&quot;
         *             },
         *             &quot;Metrics&quot;: {
         *               &quot;loss&quot;: 2.1276
         *             }
         *           }
         *         ]
         * }</p>
         */
        @NameInMap("Metrics")
        public java.util.Map<String, ?> metrics;

        /**
         * <p>Name of the training output data.</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("OutputChannelName")
        public String outputChannelName;

        /**
         * <p>Source ID (optional):</p>
         * <ul>
         * <li><p>If the source is Custom, there are no format requirements.</p>
         * </li>
         * <li><p>If the source is PAIFlow, use the format: region=cn-shanghai,workspaceId=1345,kind=PipelineRun,id=run-sakdbaskjdf.</p>
         * </li>
         * <li><p>If the source is TrainingService, use the format: region=cn-shanghai,workspaceId=1345,kind=TrainingJob,id=job-sakdbaskjdf.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>region=cn-shanghai,workspaceId=1345,kind=PipelineRun,id=run-sakdbaskjdf</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>Source (the type of job that produced the model). Default: Custom.</p>
         * 
         * <strong>example:</strong>
         * <p>PAIFlow</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>Model training configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("TrainingSpec")
        public java.util.Map<String, ?> trainingSpec;

        /**
         * <p>Link to the training output data.</p>
         * 
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
