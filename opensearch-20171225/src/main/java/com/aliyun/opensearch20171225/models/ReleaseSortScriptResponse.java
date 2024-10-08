// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ReleaseSortScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ReleaseSortScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseSortScriptResponse setBody(ReleaseSortScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseSortScriptResponseBody getBody() {
        return this.body;
    }

}
