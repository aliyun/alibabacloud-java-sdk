// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteTargetGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRouteTargetGroupResponseBody body;

    public static CreateRouteTargetGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteTargetGroupResponse self = new CreateRouteTargetGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteTargetGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRouteTargetGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRouteTargetGroupResponse setBody(CreateRouteTargetGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRouteTargetGroupResponseBody getBody() {
        return this.body;
    }

}
