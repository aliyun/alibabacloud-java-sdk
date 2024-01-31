// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddImageEventOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddImageEventOperationResponseBody body;

    public static AddImageEventOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageEventOperationResponse self = new AddImageEventOperationResponse();
        return TeaModel.build(map, self);
    }

    public AddImageEventOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddImageEventOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddImageEventOperationResponse setBody(AddImageEventOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddImageEventOperationResponseBody getBody() {
        return this.body;
    }

}
