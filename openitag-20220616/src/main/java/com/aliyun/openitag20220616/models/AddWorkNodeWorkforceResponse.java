// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class AddWorkNodeWorkforceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddWorkNodeWorkforceResponseBody body;

    public static AddWorkNodeWorkforceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWorkNodeWorkforceResponse self = new AddWorkNodeWorkforceResponse();
        return TeaModel.build(map, self);
    }

    public AddWorkNodeWorkforceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWorkNodeWorkforceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWorkNodeWorkforceResponse setBody(AddWorkNodeWorkforceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWorkNodeWorkforceResponseBody getBody() {
        return this.body;
    }

}
