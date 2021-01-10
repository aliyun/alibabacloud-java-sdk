// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectPluginapplyforpublishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectPluginapplyforpublishResponseBody body;

    public static ExecHasInspectPluginapplyforpublishResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectPluginapplyforpublishResponse self = new ExecHasInspectPluginapplyforpublishResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectPluginapplyforpublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectPluginapplyforpublishResponse setBody(ExecHasInspectPluginapplyforpublishResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectPluginapplyforpublishResponseBody getBody() {
        return this.body;
    }

}
