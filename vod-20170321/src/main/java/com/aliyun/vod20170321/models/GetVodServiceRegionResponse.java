// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVodServiceRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVodServiceRegionResponseBody body;

    public static GetVodServiceRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVodServiceRegionResponse self = new GetVodServiceRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetVodServiceRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVodServiceRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVodServiceRegionResponse setBody(GetVodServiceRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVodServiceRegionResponseBody getBody() {
        return this.body;
    }

}
