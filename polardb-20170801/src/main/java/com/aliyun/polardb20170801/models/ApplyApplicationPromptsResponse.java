// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ApplyApplicationPromptsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyApplicationPromptsResponseBody body;

    public static ApplyApplicationPromptsResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyApplicationPromptsResponse self = new ApplyApplicationPromptsResponse();
        return TeaModel.build(map, self);
    }

    public ApplyApplicationPromptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyApplicationPromptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyApplicationPromptsResponse setBody(ApplyApplicationPromptsResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyApplicationPromptsResponseBody getBody() {
        return this.body;
    }

}
