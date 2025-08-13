// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyExpressionVariableRequest extends TeaModel {
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
     * <p>Data version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("dataVersion")
    public Long dataVersion;

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
     * <p>de_acytyt7036</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Expression</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>@ex_GX9rrlTq4b67 + 1001</p>
     */
    @NameInMap("expression")
    public String expression;

    /**
     * <p>Expression display</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>@selfvariable_02 + 1001</p>
     */
    @NameInMap("expressionTitle")
    public String expressionTitle;

    /**
     * <p>Calculation expression variable</p>
     * 
     * <strong>example:</strong>
     * <p>ex_GX9rrlTq4b67</p>
     */
    @NameInMap("expressionVariable")
    public String expressionVariable;

    /**
     * <p>Variable ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3144</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Variable name</p>
     * 
     * <strong>example:</strong>
     * <p>ex_NgR6nDVD821c</p>
     */
    @NameInMap("name")
    public String name;

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
     * <p>Output</p>
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
     * <p>变量标题</p>
     */
    @NameInMap("title")
    public String title;

    public static ModifyExpressionVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressionVariableRequest self = new ModifyExpressionVariableRequest();
        return TeaModel.build(map, self);
    }

    public ModifyExpressionVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyExpressionVariableRequest setDataVersion(Long dataVersion) {
        this.dataVersion = dataVersion;
        return this;
    }
    public Long getDataVersion() {
        return this.dataVersion;
    }

    public ModifyExpressionVariableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyExpressionVariableRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public ModifyExpressionVariableRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public ModifyExpressionVariableRequest setExpressionTitle(String expressionTitle) {
        this.expressionTitle = expressionTitle;
        return this;
    }
    public String getExpressionTitle() {
        return this.expressionTitle;
    }

    public ModifyExpressionVariableRequest setExpressionVariable(String expressionVariable) {
        this.expressionVariable = expressionVariable;
        return this;
    }
    public String getExpressionVariable() {
        return this.expressionVariable;
    }

    public ModifyExpressionVariableRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyExpressionVariableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyExpressionVariableRequest setOutlier(String outlier) {
        this.outlier = outlier;
        return this;
    }
    public String getOutlier() {
        return this.outlier;
    }

    public ModifyExpressionVariableRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public ModifyExpressionVariableRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ModifyExpressionVariableRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
