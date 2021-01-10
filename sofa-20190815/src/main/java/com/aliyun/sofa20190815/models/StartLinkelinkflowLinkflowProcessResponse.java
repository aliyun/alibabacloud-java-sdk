// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StartLinkelinkflowLinkflowProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartLinkelinkflowLinkflowProcessResponseBody body;

    public static StartLinkelinkflowLinkflowProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLinkelinkflowLinkflowProcessResponse self = new StartLinkelinkflowLinkflowProcessResponse();
        return TeaModel.build(map, self);
    }

    public StartLinkelinkflowLinkflowProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLinkelinkflowLinkflowProcessResponse setBody(StartLinkelinkflowLinkflowProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLinkelinkflowLinkflowProcessResponseBody getBody() {
        return this.body;
    }

}
