// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetLabelDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLabelDetailResponseBody body;

    public static GetLabelDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLabelDetailResponse self = new GetLabelDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetLabelDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLabelDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLabelDetailResponse setBody(GetLabelDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLabelDetailResponseBody getBody() {
        return this.body;
    }

}
