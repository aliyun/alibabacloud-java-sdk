// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpShelfLibraryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CatalogCommonResult body;

    public static UpShelfLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpShelfLibraryResponse self = new UpShelfLibraryResponse();
        return TeaModel.build(map, self);
    }

    public UpShelfLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpShelfLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpShelfLibraryResponse setBody(CatalogCommonResult body) {
        this.body = body;
        return this;
    }
    public CatalogCommonResult getBody() {
        return this.body;
    }

}
