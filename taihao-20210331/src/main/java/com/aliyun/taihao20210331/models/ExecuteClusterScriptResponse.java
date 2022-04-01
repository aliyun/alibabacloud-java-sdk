// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ExecuteClusterScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StringResponse body;

    public static ExecuteClusterScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteClusterScriptResponse self = new ExecuteClusterScriptResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteClusterScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteClusterScriptResponse setBody(StringResponse body) {
        this.body = body;
        return this;
    }
    public StringResponse getBody() {
        return this.body;
    }

}
