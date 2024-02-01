// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetTrafficMirrorServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrafficMirrorServiceStatusResponseBody body;

    public static GetTrafficMirrorServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficMirrorServiceStatusResponse self = new GetTrafficMirrorServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTrafficMirrorServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrafficMirrorServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrafficMirrorServiceStatusResponse setBody(GetTrafficMirrorServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrafficMirrorServiceStatusResponseBody getBody() {
        return this.body;
    }

}
