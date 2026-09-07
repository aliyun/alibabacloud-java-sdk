// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoDetextJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitVideoDetextJobResponseBody body;

    public static SubmitVideoDetextJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoDetextJobResponse self = new SubmitVideoDetextJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoDetextJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoDetextJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVideoDetextJobResponse setBody(SubmitVideoDetextJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoDetextJobResponseBody getBody() {
        return this.body;
    }

}
