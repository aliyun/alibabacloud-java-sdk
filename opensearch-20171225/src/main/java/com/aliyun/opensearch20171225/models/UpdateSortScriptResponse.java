// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSortScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSortScriptResponseBody body;

    public static UpdateSortScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSortScriptResponse self = new UpdateSortScriptResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSortScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSortScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSortScriptResponse setBody(UpdateSortScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSortScriptResponseBody getBody() {
        return this.body;
    }

}
