// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class AddMTInterveneWordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddMTInterveneWordResponse setBody(AddMTInterveneWordResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMTInterveneWordResponseBody getBody() {
        return this.body;
    }

}
