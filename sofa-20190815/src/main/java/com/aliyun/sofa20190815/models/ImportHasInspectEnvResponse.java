// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportHasInspectEnvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportHasInspectEnvResponseBody body;

    public static ImportHasInspectEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportHasInspectEnvResponse self = new ImportHasInspectEnvResponse();
        return TeaModel.build(map, self);
    }

    public ImportHasInspectEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportHasInspectEnvResponse setBody(ImportHasInspectEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportHasInspectEnvResponseBody getBody() {
        return this.body;
    }

}
