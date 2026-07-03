// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSupabaseNetTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSupabaseNetTypeResponseBody body;

    public static CreateSupabaseNetTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSupabaseNetTypeResponse self = new CreateSupabaseNetTypeResponse();
        return TeaModel.build(map, self);
    }

    public CreateSupabaseNetTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSupabaseNetTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSupabaseNetTypeResponse setBody(CreateSupabaseNetTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSupabaseNetTypeResponseBody getBody() {
        return this.body;
    }

}
