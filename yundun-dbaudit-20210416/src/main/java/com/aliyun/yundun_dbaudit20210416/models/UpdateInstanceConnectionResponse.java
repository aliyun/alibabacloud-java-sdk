// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class UpdateInstanceConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceConnectionResponseBody body;

    public static UpdateInstanceConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceConnectionResponse self = new UpdateInstanceConnectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceConnectionResponse setBody(UpdateInstanceConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceConnectionResponseBody getBody() {
        return this.body;
    }

}
