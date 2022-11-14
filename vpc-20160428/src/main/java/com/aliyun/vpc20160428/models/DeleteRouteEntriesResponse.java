// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRouteEntriesResponseBody body;

    public static DeleteRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteEntriesResponse self = new DeleteRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRouteEntriesResponse setBody(DeleteRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
