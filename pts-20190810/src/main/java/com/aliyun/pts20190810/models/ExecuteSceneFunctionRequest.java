// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class ExecuteSceneFunctionRequest extends TeaModel {
    @NameInMap("Expression")
    @Validation(required = true)
    public String expression;

    public static ExecuteSceneFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSceneFunctionRequest self = new ExecuteSceneFunctionRequest();
        return TeaModel.build(map, self);
    }

}
