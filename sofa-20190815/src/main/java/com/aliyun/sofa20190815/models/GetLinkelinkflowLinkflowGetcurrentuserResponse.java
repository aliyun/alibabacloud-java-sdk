// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowGetcurrentuserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody body;

    public static GetLinkelinkflowLinkflowGetcurrentuserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowGetcurrentuserResponse self = new GetLinkelinkflowLinkflowGetcurrentuserResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponse setBody(GetLinkelinkflowLinkflowGetcurrentuserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody getBody() {
        return this.body;
    }

}
