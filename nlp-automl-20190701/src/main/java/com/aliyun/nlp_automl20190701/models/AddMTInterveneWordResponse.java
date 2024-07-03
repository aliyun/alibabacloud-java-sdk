// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class AddMTInterveneWordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMTInterveneWordResponseBody body;

    public static AddMTInterveneWordResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMTInterveneWordResponse self = new AddMTInterveneWordResponse();
        return TeaModel.build(map, self);
    }

    public AddMTInterveneWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMTInterveneWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMTInterveneWordResponse setBody(AddMTInterveneWordResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMTInterveneWordResponseBody getBody() {
        return this.body;
    }

}
