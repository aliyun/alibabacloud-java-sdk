// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVSwitchResponseBody body;

    public static DeleteVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVSwitchResponse self = new DeleteVSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVSwitchResponse setBody(DeleteVSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVSwitchResponseBody getBody() {
        return this.body;
    }

}
