// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySQLCollectorRetentionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifySQLCollectorRetentionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySQLCollectorRetentionResponse setBody(ModifySQLCollectorRetentionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySQLCollectorRetentionResponseBody getBody() {
        return this.body;
    }

}
