// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class AddSampleDataByTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSampleDataByTextResponseBody body;

    public static AddSampleDataByTextResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSampleDataByTextResponse self = new AddSampleDataByTextResponse();
        return TeaModel.build(map, self);
    }

    public AddSampleDataByTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSampleDataByTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSampleDataByTextResponse setBody(AddSampleDataByTextResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSampleDataByTextResponseBody getBody() {
        return this.body;
    }

}
