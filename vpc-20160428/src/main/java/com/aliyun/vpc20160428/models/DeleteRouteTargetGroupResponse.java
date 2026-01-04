// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteTargetGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRouteTargetGroupResponseBody body;

    public static DeleteRouteTargetGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteTargetGroupResponse self = new DeleteRouteTargetGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteTargetGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouteTargetGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRouteTargetGroupResponse setBody(DeleteRouteTargetGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouteTargetGroupResponseBody getBody() {
        return this.body;
    }

}
