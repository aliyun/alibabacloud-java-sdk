// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutFlowtaskhostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutFlowtaskhostResponseBody body;

    public static GetLinkeBahamutFlowtaskhostResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutFlowtaskhostResponse self = new GetLinkeBahamutFlowtaskhostResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutFlowtaskhostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutFlowtaskhostResponse setBody(GetLinkeBahamutFlowtaskhostResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutFlowtaskhostResponseBody getBody() {
        return this.body;
    }

}
