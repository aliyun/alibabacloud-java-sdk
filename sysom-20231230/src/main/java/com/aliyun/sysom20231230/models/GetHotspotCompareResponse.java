// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotCompareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotspotCompareResponseBody body;

    public static GetHotspotCompareResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotCompareResponse self = new GetHotspotCompareResponse();
        return TeaModel.build(map, self);
    }

    public GetHotspotCompareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotspotCompareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotspotCompareResponse setBody(GetHotspotCompareResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotspotCompareResponseBody getBody() {
        return this.body;
    }

}
