// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ImportFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportFieldResponseBody body;

    public static ImportFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportFieldResponse self = new ImportFieldResponse();
        return TeaModel.build(map, self);
    }

    public ImportFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportFieldResponse setBody(ImportFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportFieldResponseBody getBody() {
        return this.body;
    }

}
