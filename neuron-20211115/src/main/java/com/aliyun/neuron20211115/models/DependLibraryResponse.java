// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DependLibraryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CatalogCommonResult body;

    public static DependLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        DependLibraryResponse self = new DependLibraryResponse();
        return TeaModel.build(map, self);
    }

    public DependLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DependLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DependLibraryResponse setBody(CatalogCommonResult body) {
        this.body = body;
        return this;
    }
    public CatalogCommonResult getBody() {
        return this.body;
    }

}
