// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class AppendAllDataToTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AppendAllDataToTaskResponseBody body;

    public static AppendAllDataToTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AppendAllDataToTaskResponse self = new AppendAllDataToTaskResponse();
        return TeaModel.build(map, self);
    }

    public AppendAllDataToTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppendAllDataToTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AppendAllDataToTaskResponse setBody(AppendAllDataToTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AppendAllDataToTaskResponseBody getBody() {
        return this.body;
    }

}
