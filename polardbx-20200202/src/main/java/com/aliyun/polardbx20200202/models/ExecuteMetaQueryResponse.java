// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ExecuteMetaQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteMetaQueryResponseBody body;

    public static ExecuteMetaQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteMetaQueryResponse self = new ExecuteMetaQueryResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteMetaQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteMetaQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteMetaQueryResponse setBody(ExecuteMetaQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteMetaQueryResponseBody getBody() {
        return this.body;
    }

}
