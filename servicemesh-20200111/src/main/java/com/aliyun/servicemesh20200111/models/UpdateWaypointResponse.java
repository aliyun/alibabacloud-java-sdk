// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateWaypointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWaypointResponseBody body;

    public static UpdateWaypointResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaypointResponse self = new UpdateWaypointResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWaypointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWaypointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWaypointResponse setBody(UpdateWaypointResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWaypointResponseBody getBody() {
        return this.body;
    }

}
