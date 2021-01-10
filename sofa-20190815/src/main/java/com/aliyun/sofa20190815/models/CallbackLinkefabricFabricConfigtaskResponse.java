// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CallbackLinkefabricFabricConfigtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CallbackLinkefabricFabricConfigtaskResponseBody body;

    public static CallbackLinkefabricFabricConfigtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackLinkefabricFabricConfigtaskResponse self = new CallbackLinkefabricFabricConfigtaskResponse();
        return TeaModel.build(map, self);
    }

    public CallbackLinkefabricFabricConfigtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CallbackLinkefabricFabricConfigtaskResponse setBody(CallbackLinkefabricFabricConfigtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CallbackLinkefabricFabricConfigtaskResponseBody getBody() {
        return this.body;
    }

}
