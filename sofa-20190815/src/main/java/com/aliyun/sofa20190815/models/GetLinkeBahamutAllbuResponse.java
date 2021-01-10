// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAllbuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAllbuResponseBody body;

    public static GetLinkeBahamutAllbuResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAllbuResponse self = new GetLinkeBahamutAllbuResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAllbuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAllbuResponse setBody(GetLinkeBahamutAllbuResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAllbuResponseBody getBody() {
        return this.body;
    }

}
