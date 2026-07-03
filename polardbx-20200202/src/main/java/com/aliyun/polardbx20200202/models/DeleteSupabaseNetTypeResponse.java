// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteSupabaseNetTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSupabaseNetTypeResponseBody body;

    public static DeleteSupabaseNetTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSupabaseNetTypeResponse self = new DeleteSupabaseNetTypeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSupabaseNetTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSupabaseNetTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSupabaseNetTypeResponse setBody(DeleteSupabaseNetTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSupabaseNetTypeResponseBody getBody() {
        return this.body;
    }

}
