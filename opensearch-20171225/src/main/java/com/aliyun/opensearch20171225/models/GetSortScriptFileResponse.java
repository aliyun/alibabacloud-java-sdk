// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetSortScriptFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSortScriptFileResponseBody body;

    public static GetSortScriptFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSortScriptFileResponse self = new GetSortScriptFileResponse();
        return TeaModel.build(map, self);
    }

    public GetSortScriptFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSortScriptFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSortScriptFileResponse setBody(GetSortScriptFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSortScriptFileResponseBody getBody() {
        return this.body;
    }

}
