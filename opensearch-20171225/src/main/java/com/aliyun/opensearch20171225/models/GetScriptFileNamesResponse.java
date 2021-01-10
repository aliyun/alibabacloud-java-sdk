// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetScriptFileNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScriptFileNamesResponseBody body;

    public static GetScriptFileNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScriptFileNamesResponse self = new GetScriptFileNamesResponse();
        return TeaModel.build(map, self);
    }

    public GetScriptFileNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScriptFileNamesResponse setBody(GetScriptFileNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScriptFileNamesResponseBody getBody() {
        return this.body;
    }

}
