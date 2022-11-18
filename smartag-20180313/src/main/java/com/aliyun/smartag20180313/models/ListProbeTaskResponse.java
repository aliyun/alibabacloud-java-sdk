// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListProbeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProbeTaskResponseBody body;

    public static ListProbeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProbeTaskResponse self = new ListProbeTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListProbeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProbeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProbeTaskResponse setBody(ListProbeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProbeTaskResponseBody getBody() {
        return this.body;
    }

}
