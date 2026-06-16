// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateQueryVariableRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The data source code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds_vcaoii1697</p>
     */
    @NameInMap("dataSourceCode")
    public String dataSourceCode;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The event code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de_ajnoqe2016</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>The expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT  AVG( $source )\nFROM ds_vcaoii1697 \nWHERE  $age &gt; 0</p>
     */
    @NameInMap("expression")
    public String expression;

    /**
     * <p>The display expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT  AVG( $source )\nFROM testCase\nWHERE  $age &gt; 0</p>
     */
    @NameInMap("expressionTitle")
    public String expressionTitle;

    /**
     * <p>The variable associated with the expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("expressionVariable")
    public String expressionVariable;

    /**
     * <p>The primary key ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3144</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The outlier value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("outlier")
    public String outlier;

    /**
     * <p>The return type of the variable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STRING</p>
     */
    @NameInMap("outputs")
    public String outputs;

    /**
     * <p>The region code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>获取年龄大于30的数据</p>
     */
    @NameInMap("title")
    public String title;

    public static UpdateQueryVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQueryVariableRequest self = new UpdateQueryVariableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQueryVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateQueryVariableRequest setDataSourceCode(String dataSourceCode) {
        this.dataSourceCode = dataSourceCode;
        return this;
    }
    public String getDataSourceCode() {
        return this.dataSourceCode;
    }

    public UpdateQueryVariableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateQueryVariableRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public UpdateQueryVariableRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public UpdateQueryVariableRequest setExpressionTitle(String expressionTitle) {
        this.expressionTitle = expressionTitle;
        return this;
    }
    public String getExpressionTitle() {
        return this.expressionTitle;
    }

    public UpdateQueryVariableRequest setExpressionVariable(String expressionVariable) {
        this.expressionVariable = expressionVariable;
        return this;
    }
    public String getExpressionVariable() {
        return this.expressionVariable;
    }

    public UpdateQueryVariableRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateQueryVariableRequest setOutlier(String outlier) {
        this.outlier = outlier;
        return this;
    }
    public String getOutlier() {
        return this.outlier;
    }

    public UpdateQueryVariableRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public UpdateQueryVariableRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public UpdateQueryVariableRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
