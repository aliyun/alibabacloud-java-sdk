// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateWaypointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWaypointResponseBody body;

    public static CreateWaypointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWaypointResponse self = new CreateWaypointResponse();
        return TeaModel.build(map, self);
    }

    public CreateWaypointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWaypointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWaypointResponse setBody(CreateWaypointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWaypointResponseBody getBody() {
        return this.body;
    }

}
