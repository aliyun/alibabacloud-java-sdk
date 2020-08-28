// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class ExecuteSceneFunctionResponse extends TeaModel {
    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    public static ExecuteSceneFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSceneFunctionResponse self = new ExecuteSceneFunctionResponse();
        return TeaModel.build(map, self);
    }

}
