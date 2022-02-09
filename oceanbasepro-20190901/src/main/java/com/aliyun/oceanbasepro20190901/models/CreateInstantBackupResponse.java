// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateInstantBackupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstantBackupResponseBody body;

    public static CreateInstantBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstantBackupResponse self = new CreateInstantBackupResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstantBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstantBackupResponse setBody(CreateInstantBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstantBackupResponseBody getBody() {
        return this.body;
    }

}
