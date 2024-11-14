// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteApisecEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApisecEventsResponseBody body;

    public static DeleteApisecEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApisecEventsResponse self = new DeleteApisecEventsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApisecEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApisecEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApisecEventsResponse setBody(DeleteApisecEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApisecEventsResponseBody getBody() {
        return this.body;
    }

}
