// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class GetFileDetectResultInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileDetectResultInnerResponseBody body;

    public static GetFileDetectResultInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileDetectResultInnerResponse self = new GetFileDetectResultInnerResponse();
        return TeaModel.build(map, self);
    }

    public GetFileDetectResultInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileDetectResultInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileDetectResultInnerResponse setBody(GetFileDetectResultInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileDetectResultInnerResponseBody getBody() {
        return this.body;
    }

}
