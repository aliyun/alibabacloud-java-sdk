// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ReleaseSortScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseSortScriptResponseBody body;

    public static ReleaseSortScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseSortScriptResponse self = new ReleaseSortScriptResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseSortScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseSortScriptResponse setBody(ReleaseSortScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseSortScriptResponseBody getBody() {
        return this.body;
    }

}
