// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class EnableResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableResourceDirectoryResponseBody body;

    public static EnableResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableResourceDirectoryResponse self = new EnableResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public EnableResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableResourceDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableResourceDirectoryResponse setBody(EnableResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
