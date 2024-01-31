// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PageImageRegistryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageImageRegistryResponseBody body;

    public static PageImageRegistryResponse build(java.util.Map<String, ?> map) throws Exception {
        PageImageRegistryResponse self = new PageImageRegistryResponse();
        return TeaModel.build(map, self);
    }

    public PageImageRegistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageImageRegistryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageImageRegistryResponse setBody(PageImageRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public PageImageRegistryResponseBody getBody() {
        return this.body;
    }

}
