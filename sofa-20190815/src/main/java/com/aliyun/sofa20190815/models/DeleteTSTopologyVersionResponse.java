// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteTSTopologyVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTSTopologyVersionResponseBody body;

    public static DeleteTSTopologyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTSTopologyVersionResponse self = new DeleteTSTopologyVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTSTopologyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTSTopologyVersionResponse setBody(DeleteTSTopologyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTSTopologyVersionResponseBody getBody() {
        return this.body;
    }

}
