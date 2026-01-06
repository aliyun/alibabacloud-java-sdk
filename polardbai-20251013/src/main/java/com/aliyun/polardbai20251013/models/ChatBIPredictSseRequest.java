// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPredictSseRequest extends TeaModel {
    @NameInMap("AuthMessage")
    public String authMessage;

    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db_test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GenerateChart")
    public Boolean generateChart;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GenerateSummary")
    public Boolean generateSummary;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze7smdi2f*******</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Parameters")
    public ChatBIPredictSseRequestParameters parameters;

    /**
     * <strong>example:</strong>
     * <p>空字符串, pattern_index_1</p>
     */
    @NameInMap("PatternIndexTableName")
    public String patternIndexTableName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>查询2023年10月1日至2023年10月3日期间开课的课程名称和上课地点。</p>
     */
    @NameInMap("Question")
    public String question;

    /**
     * <strong>example:</strong>
     * <p>schema_index_1</p>
     */
    @NameInMap("SchemaIndexTableName")
    public String schemaIndexTableName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SelectData")
    public Boolean selectData;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ThinkingMode")
    public Boolean thinkingMode;

    public static ChatBIPredictSseRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPredictSseRequest self = new ChatBIPredictSseRequest();
        return TeaModel.build(map, self);
    }

    public ChatBIPredictSseRequest setAuthMessage(String authMessage) {
        this.authMessage = authMessage;
        return this;
    }
    public String getAuthMessage() {
        return this.authMessage;
    }

    public ChatBIPredictSseRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ChatBIPredictSseRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ChatBIPredictSseRequest setGenerateChart(Boolean generateChart) {
        this.generateChart = generateChart;
        return this;
    }
    public Boolean getGenerateChart() {
        return this.generateChart;
    }

    public ChatBIPredictSseRequest setGenerateSummary(Boolean generateSummary) {
        this.generateSummary = generateSummary;
        return this;
    }
    public Boolean getGenerateSummary() {
        return this.generateSummary;
    }

    public ChatBIPredictSseRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ChatBIPredictSseRequest setParameters(ChatBIPredictSseRequestParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public ChatBIPredictSseRequestParameters getParameters() {
        return this.parameters;
    }

    public ChatBIPredictSseRequest setPatternIndexTableName(String patternIndexTableName) {
        this.patternIndexTableName = patternIndexTableName;
        return this;
    }
    public String getPatternIndexTableName() {
        return this.patternIndexTableName;
    }

    public ChatBIPredictSseRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public ChatBIPredictSseRequest setSchemaIndexTableName(String schemaIndexTableName) {
        this.schemaIndexTableName = schemaIndexTableName;
        return this;
    }
    public String getSchemaIndexTableName() {
        return this.schemaIndexTableName;
    }

    public ChatBIPredictSseRequest setSelectData(Boolean selectData) {
        this.selectData = selectData;
        return this;
    }
    public Boolean getSelectData() {
        return this.selectData;
    }

    public ChatBIPredictSseRequest setThinkingMode(Boolean thinkingMode) {
        this.thinkingMode = thinkingMode;
        return this;
    }
    public Boolean getThinkingMode() {
        return this.thinkingMode;
    }

    public static class ChatBIPredictSseRequestParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.85</p>
         */
        @NameInMap("PatternIndexThreshold")
        public Double patternIndexThreshold;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PatternIndexTop")
        public Integer patternIndexTop;

        /**
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("ResultType")
        public String resultType;

        public static ChatBIPredictSseRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ChatBIPredictSseRequestParameters self = new ChatBIPredictSseRequestParameters();
            return TeaModel.build(map, self);
        }

        public ChatBIPredictSseRequestParameters setPatternIndexThreshold(Double patternIndexThreshold) {
            this.patternIndexThreshold = patternIndexThreshold;
            return this;
        }
        public Double getPatternIndexThreshold() {
            return this.patternIndexThreshold;
        }

        public ChatBIPredictSseRequestParameters setPatternIndexTop(Integer patternIndexTop) {
            this.patternIndexTop = patternIndexTop;
            return this;
        }
        public Integer getPatternIndexTop() {
            return this.patternIndexTop;
        }

        public ChatBIPredictSseRequestParameters setResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }
        public String getResultType() {
            return this.resultType;
        }

    }

}
