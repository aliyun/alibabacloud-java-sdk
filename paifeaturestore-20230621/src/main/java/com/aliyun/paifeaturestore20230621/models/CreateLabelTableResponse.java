// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateLabelTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLabelTableResponseBody body;

    public static CreateLabelTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelTableResponse self = new CreateLabelTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateLabelTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLabelTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLabelTableResponse setBody(CreateLabelTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLabelTableResponseBody getBody() {
        return this.body;
    }

}
