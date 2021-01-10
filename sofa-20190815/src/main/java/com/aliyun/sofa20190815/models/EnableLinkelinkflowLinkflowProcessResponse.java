// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableLinkelinkflowLinkflowProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableLinkelinkflowLinkflowProcessResponseBody body;

    public static EnableLinkelinkflowLinkflowProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableLinkelinkflowLinkflowProcessResponse self = new EnableLinkelinkflowLinkflowProcessResponse();
        return TeaModel.build(map, self);
    }

    public EnableLinkelinkflowLinkflowProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableLinkelinkflowLinkflowProcessResponse setBody(EnableLinkelinkflowLinkflowProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableLinkelinkflowLinkflowProcessResponseBody getBody() {
        return this.body;
    }

}
