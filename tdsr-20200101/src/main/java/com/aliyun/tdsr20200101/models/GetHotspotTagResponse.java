// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotspotTagResponseBody body;

    public static GetHotspotTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotTagResponse self = new GetHotspotTagResponse();
        return TeaModel.build(map, self);
    }

    public GetHotspotTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotspotTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotspotTagResponse setBody(GetHotspotTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotspotTagResponseBody getBody() {
        return this.body;
    }

}
