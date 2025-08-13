// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateQueryVariableRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Data source code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds_vcaoii1697</p>
     */
    @NameInMap("dataSourceCode")
    public String dataSourceCode;

    /**
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Event code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de_ajnoqe2016</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT  AVG( $source )\nFROM ds_vcaoii1697 \nWHERE  $age &gt; 0</p>
     */
    @NameInMap("expression")
    public String expression;

    /**
     * <p>Display expression</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT  AVG( $source )\nFROM testCase\nWHERE  $age &gt; 0</p>
     */
    @NameInMap("expressionTitle")
    public String expressionTitle;

    /**
     * <p>Expression associated variable</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("expressionVariable")
    public String expressionVariable;

    /**
     * <p>Primary key ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3144</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Outlier</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("outlier")
    public String outlier;

    /**
     * <p>Variable return type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STRING</p>
     */
    @NameInMap("outputs")
    public String outputs;

    /**
     * <p>Region code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Title.</p>
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
