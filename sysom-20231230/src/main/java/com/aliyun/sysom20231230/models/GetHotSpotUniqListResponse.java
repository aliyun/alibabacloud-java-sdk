// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotSpotUniqListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotSpotUniqListResponseBody body;

    public static GetHotSpotUniqListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotSpotUniqListResponse self = new GetHotSpotUniqListResponse();
        return TeaModel.build(map, self);
    }

    public GetHotSpotUniqListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotSpotUniqListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotSpotUniqListResponse setBody(GetHotSpotUniqListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotSpotUniqListResponseBody getBody() {
        return this.body;
    }

}
