// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class PreCheckSqlFlashbackTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreCheckSqlFlashbackTaskResponseBody body;

    public static PreCheckSqlFlashbackTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PreCheckSqlFlashbackTaskResponse self = new PreCheckSqlFlashbackTaskResponse();
        return TeaModel.build(map, self);
    }

    public PreCheckSqlFlashbackTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreCheckSqlFlashbackTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreCheckSqlFlashbackTaskResponse setBody(PreCheckSqlFlashbackTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PreCheckSqlFlashbackTaskResponseBody getBody() {
        return this.body;
    }

}
