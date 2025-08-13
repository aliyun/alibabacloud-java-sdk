// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateExpressionVariableRequest extends TeaModel {
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
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>获取入参的手机号前7位</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Event code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de_ahpayh4121</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Calculation expression</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>@ex_GX9rrlTq4b67 + 1001</p>
     */
    @NameInMap("expression")
    public String expression;

    /**
     * <p>Display value of calculation expression</p>
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
     * <p>[{&quot;name&quot;:&quot;ex_GX9rrlTq4b67&quot;,&quot;code&quot;:&quot;deInvokeSelfVariable(44659)&quot;,&quot;fieldType&quot;:&quot;INT&quot;}]</p>
     */
    @NameInMap("expressionVariable")
    public String expressionVariable;

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
     * <p>获取手机号前7位</p>
     */
    @NameInMap("title")
    public String title;

    public static CreateExpressionVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressionVariableRequest self = new CreateExpressionVariableRequest();
        return TeaModel.build(map, self);
    }

    public CreateExpressionVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateExpressionVariableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExpressionVariableRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public CreateExpressionVariableRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public CreateExpressionVariableRequest setExpressionTitle(String expressionTitle) {
        this.expressionTitle = expressionTitle;
        return this;
    }
    public String getExpressionTitle() {
        return this.expressionTitle;
    }

    public CreateExpressionVariableRequest setExpressionVariable(String expressionVariable) {
        this.expressionVariable = expressionVariable;
        return this;
    }
    public String getExpressionVariable() {
        return this.expressionVariable;
    }

    public CreateExpressionVariableRequest setOutlier(String outlier) {
        this.outlier = outlier;
        return this;
    }
    public String getOutlier() {
        return this.outlier;
    }

    public CreateExpressionVariableRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public CreateExpressionVariableRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateExpressionVariableRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
