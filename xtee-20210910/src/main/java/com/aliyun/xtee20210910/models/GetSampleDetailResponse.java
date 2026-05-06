// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class GetSampleDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSampleDetailResponseBody body;

    public static GetSampleDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSampleDetailResponse self = new GetSampleDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSampleDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSampleDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSampleDetailResponse setBody(GetSampleDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSampleDetailResponseBody getBody() {
        return this.body;
    }

}
