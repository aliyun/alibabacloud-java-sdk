// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateRouteTargetGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRouteTargetGroupResponseBody body;

    public static UpdateRouteTargetGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteTargetGroupResponse self = new UpdateRouteTargetGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRouteTargetGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRouteTargetGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRouteTargetGroupResponse setBody(UpdateRouteTargetGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRouteTargetGroupResponseBody getBody() {
        return this.body;
    }

}
