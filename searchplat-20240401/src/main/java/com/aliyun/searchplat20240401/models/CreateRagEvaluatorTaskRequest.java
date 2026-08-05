// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateRagEvaluatorTaskRequest extends TeaModel {
    /**
     * <p>app_name</p>
     * 
     * <strong>example:</strong>
     * <p>空</p>
     */
    @NameInMap("app_name")
    public String appName;

    /**
     * <p>The list of evaluation data.</p>
     */
    @NameInMap("data")
    public java.util.List<CreateRagEvaluatorTaskRequestData> data;

    /**
     * <p>The datasource config.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;data_source_type&quot;: &quot;oss&quot;,
     * &quot;file_path&quot;: &quot;oss://xxx.&quot;,
     * &quot;file_name&quot;: &quot;04837719-default-zz.xlsx&quot;
     * }</p>
     */
    @NameInMap("data_source_config")
    public Object dataSourceConfig;

    /**
     * <p>emails</p>
     */
    @NameInMap("emails")
    public java.util.List<String> emails;

    /**
     * <p>The evaluation configuration.</p>
     */
    @NameInMap("evaluate_config")
    public CreateRagEvaluatorTaskRequestEvaluateConfig evaluateConfig;

    /**
     * <p>has_data_source</p>
     * 
     * <strong>example:</strong>
     * <p>空</p>
     */
    @NameInMap("has_data_source")
    public Boolean hasDataSource;

    /**
     * <p>The metric values. Valid values:</p>
     * <ul>
     * <li>context_recall</li>
     * <li>context_precision</li>
     * <li>faithfulness</li>
     * <li>satisfaction</li>
     * <li>comprehensive_score.</li>
     * </ul>
     */
    @NameInMap("metrics")
    public java.util.List<?> metrics;

    /**
     * <p>The evaluation task name.</p>
     * 
     * <strong>example:</strong>
     * <p>taskName</p>
     */
    @NameInMap("task_name")
    public String taskName;

    public static CreateRagEvaluatorTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRagEvaluatorTaskRequest self = new CreateRagEvaluatorTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRagEvaluatorTaskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateRagEvaluatorTaskRequest setData(java.util.List<CreateRagEvaluatorTaskRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateRagEvaluatorTaskRequestData> getData() {
        return this.data;
    }

    public CreateRagEvaluatorTaskRequest setDataSourceConfig(Object dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
        return this;
    }
    public Object getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    public CreateRagEvaluatorTaskRequest setEmails(java.util.List<String> emails) {
        this.emails = emails;
        return this;
    }
    public java.util.List<String> getEmails() {
        return this.emails;
    }

    public CreateRagEvaluatorTaskRequest setEvaluateConfig(CreateRagEvaluatorTaskRequestEvaluateConfig evaluateConfig) {
        this.evaluateConfig = evaluateConfig;
        return this;
    }
    public CreateRagEvaluatorTaskRequestEvaluateConfig getEvaluateConfig() {
        return this.evaluateConfig;
    }

    public CreateRagEvaluatorTaskRequest setHasDataSource(Boolean hasDataSource) {
        this.hasDataSource = hasDataSource;
        return this;
    }
    public Boolean getHasDataSource() {
        return this.hasDataSource;
    }

    public CreateRagEvaluatorTaskRequest setMetrics(java.util.List<?> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<?> getMetrics() {
        return this.metrics;
    }

    public CreateRagEvaluatorTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public static class CreateRagEvaluatorTaskRequestData extends TeaModel {
        /**
         * <p>model_answer</p>
         * 
         * <strong>example:</strong>
         * <p>空</p>
         */
        @NameInMap("model_answer")
        public String modelAnswer;

        /**
         * <p>question</p>
         * 
         * <strong>example:</strong>
         * <p>空</p>
         */
        @NameInMap("question")
        public String question;

        /**
         * <p>recall_docs</p>
         */
        @NameInMap("recall_docs")
        public java.util.List<String> recallDocs;

        /**
         * <p>standard_answer</p>
         * 
         * <strong>example:</strong>
         * <p>空</p>
         */
        @NameInMap("standard_answer")
        public String standardAnswer;

        public static CreateRagEvaluatorTaskRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreateRagEvaluatorTaskRequestData self = new CreateRagEvaluatorTaskRequestData();
            return TeaModel.build(map, self);
        }

        public CreateRagEvaluatorTaskRequestData setModelAnswer(String modelAnswer) {
            this.modelAnswer = modelAnswer;
            return this;
        }
        public String getModelAnswer() {
            return this.modelAnswer;
        }

        public CreateRagEvaluatorTaskRequestData setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public CreateRagEvaluatorTaskRequestData setRecallDocs(java.util.List<String> recallDocs) {
            this.recallDocs = recallDocs;
            return this;
        }
        public java.util.List<String> getRecallDocs() {
            return this.recallDocs;
        }

        public CreateRagEvaluatorTaskRequestData setStandardAnswer(String standardAnswer) {
            this.standardAnswer = standardAnswer;
            return this;
        }
        public String getStandardAnswer() {
            return this.standardAnswer;
        }

    }

    public static class CreateRagEvaluatorTaskRequestEvaluateConfig extends TeaModel {
        /**
         * <p>The model to use.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-72b</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>prompt</p>
         * 
         * <strong>example:</strong>
         * <p>空</p>
         */
        @NameInMap("prompt")
        public String prompt;

        /**
         * <p>run_all_step</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("run_all_step")
        public Boolean runAllStep;

        public static CreateRagEvaluatorTaskRequestEvaluateConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRagEvaluatorTaskRequestEvaluateConfig self = new CreateRagEvaluatorTaskRequestEvaluateConfig();
            return TeaModel.build(map, self);
        }

        public CreateRagEvaluatorTaskRequestEvaluateConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateRagEvaluatorTaskRequestEvaluateConfig setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public CreateRagEvaluatorTaskRequestEvaluateConfig setRunAllStep(Boolean runAllStep) {
            this.runAllStep = runAllStep;
            return this;
        }
        public Boolean getRunAllStep() {
            return this.runAllStep;
        }

    }

}
