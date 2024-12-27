// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotspotInstanceListResponseBody body;

    public static GetHotspotInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotInstanceListResponse self = new GetHotspotInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public GetHotspotInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotspotInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotspotInstanceListResponse setBody(GetHotspotInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotspotInstanceListResponseBody getBody() {
        return this.body;
    }

}
