// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAllarchdomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAllarchdomainsResponseBody body;

    public static GetLinkeBahamutAllarchdomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAllarchdomainsResponse self = new GetLinkeBahamutAllarchdomainsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAllarchdomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAllarchdomainsResponse setBody(GetLinkeBahamutAllarchdomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAllarchdomainsResponseBody getBody() {
        return this.body;
    }

}
