// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasInspectPluginResponseBody body;

    public static UpdateHasInspectPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectPluginResponse self = new UpdateHasInspectPluginResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasInspectPluginResponse setBody(UpdateHasInspectPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasInspectPluginResponseBody getBody() {
        return this.body;
    }

}
