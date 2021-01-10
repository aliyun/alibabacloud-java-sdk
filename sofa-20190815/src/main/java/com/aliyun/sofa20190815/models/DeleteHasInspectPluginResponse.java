// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasInspectPluginResponseBody body;

    public static DeleteHasInspectPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectPluginResponse self = new DeleteHasInspectPluginResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasInspectPluginResponse setBody(DeleteHasInspectPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasInspectPluginResponseBody getBody() {
        return this.body;
    }

}
