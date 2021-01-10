// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectPluginpublishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectPluginpublishResponseBody body;

    public static ExecHasInspectPluginpublishResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectPluginpublishResponse self = new ExecHasInspectPluginpublishResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectPluginpublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectPluginpublishResponse setBody(ExecHasInspectPluginpublishResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectPluginpublishResponseBody getBody() {
        return this.body;
    }

}
