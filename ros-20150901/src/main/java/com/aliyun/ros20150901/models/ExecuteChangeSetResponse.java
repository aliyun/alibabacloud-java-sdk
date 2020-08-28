// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class ExecuteChangeSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteChangeSetResponseBody body;

    public static ExecuteChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteChangeSetResponse self = new ExecuteChangeSetResponse();
        return TeaModel.build(map, self);
    }

}
