// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotTrackingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotspotTrackingResponseBody body;

    public static GetHotspotTrackingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotTrackingResponse self = new GetHotspotTrackingResponse();
        return TeaModel.build(map, self);
    }

    public GetHotspotTrackingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotspotTrackingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotspotTrackingResponse setBody(GetHotspotTrackingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotspotTrackingResponseBody getBody() {
        return this.body;
    }

}
