// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportHasInspectPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportHasInspectPluginResponseBody body;

    public static ImportHasInspectPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportHasInspectPluginResponse self = new ImportHasInspectPluginResponse();
        return TeaModel.build(map, self);
    }

    public ImportHasInspectPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportHasInspectPluginResponse setBody(ImportHasInspectPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportHasInspectPluginResponseBody getBody() {
        return this.body;
    }

}
