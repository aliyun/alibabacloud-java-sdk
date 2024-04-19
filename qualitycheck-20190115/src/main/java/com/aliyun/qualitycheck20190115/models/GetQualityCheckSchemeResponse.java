// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetQualityCheckSchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityCheckSchemeResponseBody body;

    public static GetQualityCheckSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityCheckSchemeResponse self = new GetQualityCheckSchemeResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityCheckSchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityCheckSchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityCheckSchemeResponse setBody(GetQualityCheckSchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityCheckSchemeResponseBody getBody() {
        return this.body;
    }

}
