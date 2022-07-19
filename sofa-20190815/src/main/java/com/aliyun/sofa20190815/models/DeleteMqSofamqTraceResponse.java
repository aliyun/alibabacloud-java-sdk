// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMqSofamqTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMqSofamqTraceResponseBody body;

    public static DeleteMqSofamqTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqSofamqTraceResponse self = new DeleteMqSofamqTraceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMqSofamqTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMqSofamqTraceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMqSofamqTraceResponse setBody(DeleteMqSofamqTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMqSofamqTraceResponseBody getBody() {
        return this.body;
    }

}
