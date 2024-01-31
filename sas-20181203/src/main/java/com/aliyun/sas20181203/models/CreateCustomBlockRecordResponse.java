// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCustomBlockRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomBlockRecordResponseBody body;

    public static CreateCustomBlockRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomBlockRecordResponse self = new CreateCustomBlockRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomBlockRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomBlockRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomBlockRecordResponse setBody(CreateCustomBlockRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomBlockRecordResponseBody getBody() {
        return this.body;
    }

}
