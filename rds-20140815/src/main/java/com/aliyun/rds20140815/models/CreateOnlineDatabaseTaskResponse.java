// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOnlineDatabaseTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOnlineDatabaseTaskResponseBody body;

    public static CreateOnlineDatabaseTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOnlineDatabaseTaskResponse self = new CreateOnlineDatabaseTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateOnlineDatabaseTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOnlineDatabaseTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOnlineDatabaseTaskResponse setBody(CreateOnlineDatabaseTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOnlineDatabaseTaskResponseBody getBody() {
        return this.body;
    }

}
