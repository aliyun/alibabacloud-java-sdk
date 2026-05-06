// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CancelSubTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelSubTaskResponseBody body;

    public static CancelSubTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSubTaskResponse self = new CancelSubTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelSubTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSubTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSubTaskResponse setBody(CancelSubTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSubTaskResponseBody getBody() {
        return this.body;
    }

}
