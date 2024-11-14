// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveDetectionResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSensitiveDetectionResultResponseBody body;

    public static DescribeSensitiveDetectionResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveDetectionResultResponse self = new DescribeSensitiveDetectionResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveDetectionResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSensitiveDetectionResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSensitiveDetectionResultResponse setBody(DescribeSensitiveDetectionResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSensitiveDetectionResultResponseBody getBody() {
        return this.body;
    }

}
