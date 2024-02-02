// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopObjectRetrievalUploadDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopObjectRetrievalUploadDataResponseBody body;

    public static PopObjectRetrievalUploadDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PopObjectRetrievalUploadDataResponse self = new PopObjectRetrievalUploadDataResponse();
        return TeaModel.build(map, self);
    }

    public PopObjectRetrievalUploadDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopObjectRetrievalUploadDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopObjectRetrievalUploadDataResponse setBody(PopObjectRetrievalUploadDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PopObjectRetrievalUploadDataResponseBody getBody() {
        return this.body;
    }

}
