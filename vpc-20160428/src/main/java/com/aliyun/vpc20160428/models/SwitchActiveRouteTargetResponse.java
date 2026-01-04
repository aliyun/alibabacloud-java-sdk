// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class SwitchActiveRouteTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchActiveRouteTargetResponseBody body;

    public static SwitchActiveRouteTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchActiveRouteTargetResponse self = new SwitchActiveRouteTargetResponse();
        return TeaModel.build(map, self);
    }

    public SwitchActiveRouteTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchActiveRouteTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchActiveRouteTargetResponse setBody(SwitchActiveRouteTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchActiveRouteTargetResponseBody getBody() {
        return this.body;
    }

}
