// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteWaypointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWaypointResponseBody body;

    public static DeleteWaypointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaypointResponse self = new DeleteWaypointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWaypointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWaypointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWaypointResponse setBody(DeleteWaypointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWaypointResponseBody getBody() {
        return this.body;
    }

}
