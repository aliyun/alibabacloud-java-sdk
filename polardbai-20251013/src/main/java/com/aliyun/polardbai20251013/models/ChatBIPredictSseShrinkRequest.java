// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPredictSseShrinkRequest extends TeaModel {
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
    public String parametersShrink;

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

    public static ChatBIPredictSseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPredictSseShrinkRequest self = new ChatBIPredictSseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChatBIPredictSseShrinkRequest setAuthMessage(String authMessage) {
        this.authMessage = authMessage;
        return this;
    }
    public String getAuthMessage() {
        return this.authMessage;
    }

    public ChatBIPredictSseShrinkRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ChatBIPredictSseShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ChatBIPredictSseShrinkRequest setGenerateChart(Boolean generateChart) {
        this.generateChart = generateChart;
        return this;
    }
    public Boolean getGenerateChart() {
        return this.generateChart;
    }

    public ChatBIPredictSseShrinkRequest setGenerateSummary(Boolean generateSummary) {
        this.generateSummary = generateSummary;
        return this;
    }
    public Boolean getGenerateSummary() {
        return this.generateSummary;
    }

    public ChatBIPredictSseShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ChatBIPredictSseShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public ChatBIPredictSseShrinkRequest setPatternIndexTableName(String patternIndexTableName) {
        this.patternIndexTableName = patternIndexTableName;
        return this;
    }
    public String getPatternIndexTableName() {
        return this.patternIndexTableName;
    }

    public ChatBIPredictSseShrinkRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public ChatBIPredictSseShrinkRequest setSchemaIndexTableName(String schemaIndexTableName) {
        this.schemaIndexTableName = schemaIndexTableName;
        return this;
    }
    public String getSchemaIndexTableName() {
        return this.schemaIndexTableName;
    }

    public ChatBIPredictSseShrinkRequest setSelectData(Boolean selectData) {
        this.selectData = selectData;
        return this;
    }
    public Boolean getSelectData() {
        return this.selectData;
    }

    public ChatBIPredictSseShrinkRequest setThinkingMode(Boolean thinkingMode) {
        this.thinkingMode = thinkingMode;
        return this;
    }
    public Boolean getThinkingMode() {
        return this.thinkingMode;
    }

}
