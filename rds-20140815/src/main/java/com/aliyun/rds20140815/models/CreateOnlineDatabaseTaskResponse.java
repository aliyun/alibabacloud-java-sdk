// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOnlineDatabaseTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateOnlineDatabaseTaskResponse setBody(CreateOnlineDatabaseTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOnlineDatabaseTaskResponseBody getBody() {
        return this.body;
    }

}
