// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetSortScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSortScriptResponseBody body;

    public static GetSortScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSortScriptResponse self = new GetSortScriptResponse();
        return TeaModel.build(map, self);
    }

    public GetSortScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSortScriptResponse setBody(GetSortScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSortScriptResponseBody getBody() {
        return this.body;
    }

}
