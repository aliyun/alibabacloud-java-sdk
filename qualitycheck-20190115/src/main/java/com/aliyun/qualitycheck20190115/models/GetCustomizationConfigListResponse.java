// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetCustomizationConfigListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomizationConfigListResponseBody body;

    public static GetCustomizationConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizationConfigListResponse self = new GetCustomizationConfigListResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomizationConfigListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomizationConfigListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomizationConfigListResponse setBody(GetCustomizationConfigListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomizationConfigListResponseBody getBody() {
        return this.body;
    }

}
