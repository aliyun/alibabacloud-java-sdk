// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateResourceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResourceRecordResponseBody body;

    public static CreateResourceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRecordResponse self = new CreateResourceRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceRecordResponse setBody(CreateResourceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceRecordResponseBody getBody() {
        return this.body;
    }

}
