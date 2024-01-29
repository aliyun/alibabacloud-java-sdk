// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceDirectoryResponseBody body;

    public static GetResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceDirectoryResponse self = new GetResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceDirectoryResponse setBody(GetResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
