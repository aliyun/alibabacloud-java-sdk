// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetRouteTargetGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRouteTargetGroupResponseBody body;

    public static GetRouteTargetGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRouteTargetGroupResponse self = new GetRouteTargetGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetRouteTargetGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRouteTargetGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRouteTargetGroupResponse setBody(GetRouteTargetGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRouteTargetGroupResponseBody getBody() {
        return this.body;
    }

}
