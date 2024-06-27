// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ImportNameListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportNameListResponseBody body;

    public static ImportNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportNameListResponse self = new ImportNameListResponse();
        return TeaModel.build(map, self);
    }

    public ImportNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportNameListResponse setBody(ImportNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportNameListResponseBody getBody() {
        return this.body;
    }

}
