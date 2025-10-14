// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RefreshImportMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshImportMetaResponseBody body;

    public static RefreshImportMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshImportMetaResponse self = new RefreshImportMetaResponse();
        return TeaModel.build(map, self);
    }

    public RefreshImportMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshImportMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshImportMetaResponse setBody(RefreshImportMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshImportMetaResponseBody getBody() {
        return this.body;
    }

}
