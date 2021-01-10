// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowVariabledictionarylistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowVariabledictionarylistResponseBody body;

    public static GetLinkelinkflowLinkflowVariabledictionarylistResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowVariabledictionarylistResponse self = new GetLinkelinkflowLinkflowVariabledictionarylistResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowVariabledictionarylistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowVariabledictionarylistResponse setBody(GetLinkelinkflowLinkflowVariabledictionarylistResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowVariabledictionarylistResponseBody getBody() {
        return this.body;
    }

}
