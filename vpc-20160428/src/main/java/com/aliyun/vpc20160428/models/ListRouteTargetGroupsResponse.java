// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListRouteTargetGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRouteTargetGroupsResponseBody body;

    public static ListRouteTargetGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRouteTargetGroupsResponse self = new ListRouteTargetGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListRouteTargetGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRouteTargetGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRouteTargetGroupsResponse setBody(ListRouteTargetGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRouteTargetGroupsResponseBody getBody() {
        return this.body;
    }

}
