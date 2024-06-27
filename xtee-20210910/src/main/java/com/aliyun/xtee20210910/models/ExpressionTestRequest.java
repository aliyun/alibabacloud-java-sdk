// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ExpressionTestRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("expression")
    public String expression;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("expressionVariable")
    public String expressionVariable;

    @NameInMap("expressionVariableIds")
    public String expressionVariableIds;

    @NameInMap("id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
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
