// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteUisNodeIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUisNodeIpResponseBody body;

    public static DeleteUisNodeIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisNodeIpResponse self = new DeleteUisNodeIpResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUisNodeIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUisNodeIpResponse setBody(DeleteUisNodeIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUisNodeIpResponseBody getBody() {
        return this.body;
    }

}
