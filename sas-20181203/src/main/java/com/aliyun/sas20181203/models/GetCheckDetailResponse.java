// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckDetailResponseBody body;

    public static GetCheckDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckDetailResponse self = new GetCheckDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckDetailResponse setBody(GetCheckDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckDetailResponseBody getBody() {
        return this.body;
    }

}
