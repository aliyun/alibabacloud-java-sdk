// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLocalDefaultRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLocalDefaultRegionResponseBody body;

    public static GetLocalDefaultRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLocalDefaultRegionResponse self = new GetLocalDefaultRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetLocalDefaultRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLocalDefaultRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLocalDefaultRegionResponse setBody(GetLocalDefaultRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLocalDefaultRegionResponseBody getBody() {
        return this.body;
    }

}
