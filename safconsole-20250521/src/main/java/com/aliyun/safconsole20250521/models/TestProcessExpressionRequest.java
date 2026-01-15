// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class TestProcessExpressionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>score</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <strong>example:</strong>
     * <p>{&quot;score&quot;: &quot;1&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    public static TestProcessExpressionRequest build(java.util.Map<String, ?> map) throws Exception {
        TestProcessExpressionRequest self = new TestProcessExpressionRequest();
        return TeaModel.build(map, self);
    }

    public TestProcessExpressionRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public TestProcessExpressionRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
