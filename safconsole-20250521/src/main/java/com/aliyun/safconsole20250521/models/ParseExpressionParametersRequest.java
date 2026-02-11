// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class ParseExpressionParametersRequest extends TeaModel {
    /**
     * <p>Expression.</p>
     * 
     * <strong>example:</strong>
     * <p>score</p>
     */
    @NameInMap("Expression")
    public String expression;

    public static ParseExpressionParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ParseExpressionParametersRequest self = new ParseExpressionParametersRequest();
        return TeaModel.build(map, self);
    }

    public ParseExpressionParametersRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

}
