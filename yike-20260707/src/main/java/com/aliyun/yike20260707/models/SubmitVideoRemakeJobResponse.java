// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoRemakeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitVideoRemakeJobResponseBody body;

    public static SubmitVideoRemakeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoRemakeJobResponse self = new SubmitVideoRemakeJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoRemakeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoRemakeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVideoRemakeJobResponse setBody(SubmitVideoRemakeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoRemakeJobResponseBody getBody() {
        return this.body;
    }

}
