// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorRetentionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySQLCollectorRetentionResponseBody body;

    public static ModifySQLCollectorRetentionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySQLCollectorRetentionResponse self = new ModifySQLCollectorRetentionResponse();
        return TeaModel.build(map, self);
    }

    public ModifySQLCollectorRetentionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySQLCollectorRetentionResponse setBody(ModifySQLCollectorRetentionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySQLCollectorRetentionResponseBody getBody() {
        return this.body;
    }

}
