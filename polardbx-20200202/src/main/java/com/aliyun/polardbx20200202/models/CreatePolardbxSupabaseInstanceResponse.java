// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePolardbxSupabaseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePolardbxSupabaseInstanceResponseBody body;

    public static CreatePolardbxSupabaseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolardbxSupabaseInstanceResponse self = new CreatePolardbxSupabaseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolardbxSupabaseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolardbxSupabaseInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePolardbxSupabaseInstanceResponse setBody(CreatePolardbxSupabaseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolardbxSupabaseInstanceResponseBody getBody() {
        return this.body;
    }

}
