// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PageImageRegistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PageImageRegistryResponse setBody(PageImageRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public PageImageRegistryResponseBody getBody() {
        return this.body;
    }

}
