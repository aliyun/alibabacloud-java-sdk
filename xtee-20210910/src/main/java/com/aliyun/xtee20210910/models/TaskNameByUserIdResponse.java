// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class TaskNameByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TaskNameByUserIdResponseBody body;

    public static TaskNameByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        TaskNameByUserIdResponse self = new TaskNameByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public TaskNameByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TaskNameByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TaskNameByUserIdResponse setBody(TaskNameByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public TaskNameByUserIdResponseBody getBody() {
        return this.body;
    }

}
