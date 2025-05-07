// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataSyncForLLMResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadDataSyncForLLMResponseBody body;

    public static UploadDataSyncForLLMResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDataSyncForLLMResponse self = new UploadDataSyncForLLMResponse();
        return TeaModel.build(map, self);
    }

    public UploadDataSyncForLLMResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDataSyncForLLMResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadDataSyncForLLMResponse setBody(UploadDataSyncForLLMResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDataSyncForLLMResponseBody getBody() {
        return this.body;
    }

}
