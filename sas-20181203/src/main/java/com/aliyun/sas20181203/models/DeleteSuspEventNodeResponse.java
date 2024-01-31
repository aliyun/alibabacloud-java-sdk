// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSuspEventNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSuspEventNodeResponseBody body;

    public static DeleteSuspEventNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSuspEventNodeResponse self = new DeleteSuspEventNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSuspEventNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSuspEventNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSuspEventNodeResponse setBody(DeleteSuspEventNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSuspEventNodeResponseBody getBody() {
        return this.body;
    }

}
