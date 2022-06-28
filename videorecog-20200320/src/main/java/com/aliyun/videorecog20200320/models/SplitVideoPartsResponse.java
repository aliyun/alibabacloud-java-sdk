// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class SplitVideoPartsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SplitVideoPartsResponseBody body;

    public static SplitVideoPartsResponse build(java.util.Map<String, ?> map) throws Exception {
        SplitVideoPartsResponse self = new SplitVideoPartsResponse();
        return TeaModel.build(map, self);
    }

    public SplitVideoPartsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SplitVideoPartsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SplitVideoPartsResponse setBody(SplitVideoPartsResponseBody body) {
        this.body = body;
        return this;
    }
    public SplitVideoPartsResponseBody getBody() {
        return this.body;
    }

}
