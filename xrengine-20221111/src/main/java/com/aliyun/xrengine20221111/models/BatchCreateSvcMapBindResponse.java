// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class BatchCreateSvcMapBindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateSvcMapBindResponseBody body;

    public static BatchCreateSvcMapBindResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateSvcMapBindResponse self = new BatchCreateSvcMapBindResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateSvcMapBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateSvcMapBindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateSvcMapBindResponse setBody(BatchCreateSvcMapBindResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateSvcMapBindResponseBody getBody() {
        return this.body;
    }

}
