// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class BatchDeleteSvcMapBindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteSvcMapBindResponseBody body;

    public static BatchDeleteSvcMapBindResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteSvcMapBindResponse self = new BatchDeleteSvcMapBindResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteSvcMapBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteSvcMapBindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteSvcMapBindResponse setBody(BatchDeleteSvcMapBindResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteSvcMapBindResponseBody getBody() {
        return this.body;
    }

}
