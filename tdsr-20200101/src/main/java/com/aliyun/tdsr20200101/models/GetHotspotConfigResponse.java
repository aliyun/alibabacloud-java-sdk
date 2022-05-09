// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotspotConfigResponseBody body;

    public static GetHotspotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotConfigResponse self = new GetHotspotConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetHotspotConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotspotConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotspotConfigResponse setBody(GetHotspotConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotspotConfigResponseBody getBody() {
        return this.body;
    }

}
