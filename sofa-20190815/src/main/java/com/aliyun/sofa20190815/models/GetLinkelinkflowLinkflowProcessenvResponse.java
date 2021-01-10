// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowProcessenvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowProcessenvResponseBody body;

    public static GetLinkelinkflowLinkflowProcessenvResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowProcessenvResponse self = new GetLinkelinkflowLinkflowProcessenvResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowProcessenvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowProcessenvResponse setBody(GetLinkelinkflowLinkflowProcessenvResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowProcessenvResponseBody getBody() {
        return this.body;
    }

}
