// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCallbackEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMessageCallbackEventListResponseBody body;

    public static GetMessageCallbackEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCallbackEventListResponse self = new GetMessageCallbackEventListResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageCallbackEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageCallbackEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageCallbackEventListResponse setBody(GetMessageCallbackEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageCallbackEventListResponseBody getBody() {
        return this.body;
    }

}
