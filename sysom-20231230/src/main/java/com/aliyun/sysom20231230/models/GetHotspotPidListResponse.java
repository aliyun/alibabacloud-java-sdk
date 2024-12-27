// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotPidListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotspotPidListResponseBody body;

    public static GetHotspotPidListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotPidListResponse self = new GetHotspotPidListResponse();
        return TeaModel.build(map, self);
    }

    public GetHotspotPidListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotspotPidListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotspotPidListResponse setBody(GetHotspotPidListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotspotPidListResponseBody getBody() {
        return this.body;
    }

}
