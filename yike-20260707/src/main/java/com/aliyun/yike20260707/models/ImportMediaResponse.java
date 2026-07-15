// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class ImportMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportMediaResponseBody body;

    public static ImportMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportMediaResponse self = new ImportMediaResponse();
        return TeaModel.build(map, self);
    }

    public ImportMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportMediaResponse setBody(ImportMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportMediaResponseBody getBody() {
        return this.body;
    }

}
