// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class SelectRequest extends TeaModel {
    // description
    @NameInMap("Expression")
    public String expression;

    public static SelectRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectRequest self = new SelectRequest();
        return TeaModel.build(map, self);
    }

    public SelectRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

}
