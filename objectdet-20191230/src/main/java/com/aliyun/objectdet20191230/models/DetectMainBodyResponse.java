// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectMainBodyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectMainBodyResponseBody body;

    public static DetectMainBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectMainBodyResponse self = new DetectMainBodyResponse();
        return TeaModel.build(map, self);
    }

    public DetectMainBodyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectMainBodyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectMainBodyResponse setBody(DetectMainBodyResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectMainBodyResponseBody getBody() {
        return this.body;
    }

}
