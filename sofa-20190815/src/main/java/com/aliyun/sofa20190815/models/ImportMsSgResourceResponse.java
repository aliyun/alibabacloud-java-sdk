// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportMsSgResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportMsSgResourceResponseBody body;

    public static ImportMsSgResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportMsSgResourceResponse self = new ImportMsSgResourceResponse();
        return TeaModel.build(map, self);
    }

    public ImportMsSgResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportMsSgResourceResponse setBody(ImportMsSgResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportMsSgResourceResponseBody getBody() {
        return this.body;
    }

}
