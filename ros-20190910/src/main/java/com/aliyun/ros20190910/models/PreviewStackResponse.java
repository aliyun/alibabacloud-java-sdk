// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class PreviewStackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewStackResponseBody body;

    public static PreviewStackResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewStackResponse self = new PreviewStackResponse();
        return TeaModel.build(map, self);
    }

    public PreviewStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewStackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewStackResponse setBody(PreviewStackResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewStackResponseBody getBody() {
        return this.body;
    }

}
