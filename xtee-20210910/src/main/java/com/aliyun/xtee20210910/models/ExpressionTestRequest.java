// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ExpressionTestRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
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
     * <p>Test expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>@ex_GX9rrlTq4b67 + 1001</p>
     */
    @NameInMap("expression")
    public String expression;

    /**
     * <p>Calculation expression variable</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;age\&quot;,\&quot;code\&quot;:\&quot;age\&quot;,\&quot;fieldType\&quot;:\&quot;INT\&quot;,\&quot;id\&quot;:44809,\&quot;value\&quot;:\&quot;1\&quot;}]</p>
     */
    @NameInMap("expressionVariable")
    public String expressionVariable;

    /**
     * <p>Associated variable ID</p>
     * 
     * <strong>example:</strong>
     * <p>[44659]</p>
     */
    @NameInMap("expressionVariableIds")
    public String expressionVariableIds;

    /**
     * <p>Variable ID</p>
     * 
     * <strong>example:</strong>
     * <p>3144</p>
     */
    @NameInMap("id")
    public Long id;

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
     * <p>Scene</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EXPRESSION</p>
     */
    @NameInMap("scene")
    public String scene;

    public static ExpressionTestRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpressionTestRequest self = new ExpressionTestRequest();
        return TeaModel.build(map, self);
    }

    public ExpressionTestRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExpressionTestRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public ExpressionTestRequest setExpressionVariable(String expressionVariable) {
        this.expressionVariable = expressionVariable;
        return this;
    }
    public String getExpressionVariable() {
        return this.expressionVariable;
    }

    public ExpressionTestRequest setExpressionVariableIds(String expressionVariableIds) {
        this.expressionVariableIds = expressionVariableIds;
        return this;
    }
    public String getExpressionVariableIds() {
        return this.expressionVariableIds;
    }

    public ExpressionTestRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExpressionTestRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ExpressionTestRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
