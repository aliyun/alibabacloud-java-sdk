// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileDetectResultResponseBody body;

    public static GetFileDetectResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileDetectResultResponse self = new GetFileDetectResultResponse();
        return TeaModel.build(map, self);
    }

    public GetFileDetectResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileDetectResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileDetectResultResponse setBody(GetFileDetectResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileDetectResultResponseBody getBody() {
        return this.body;
    }

}
