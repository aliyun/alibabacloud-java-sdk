// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowProcessoperationlogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody body;

    public static GetLinkelinkflowLinkflowProcessoperationlogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowProcessoperationlogResponse self = new GetLinkelinkflowLinkflowProcessoperationlogResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowProcessoperationlogResponse setBody(GetLinkelinkflowLinkflowProcessoperationlogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowProcessoperationlogResponseBody getBody() {
        return this.body;
    }

}
