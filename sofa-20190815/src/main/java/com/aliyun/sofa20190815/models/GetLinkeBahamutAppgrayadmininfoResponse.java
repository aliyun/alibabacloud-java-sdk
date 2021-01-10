// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppgrayadmininfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAppgrayadmininfoResponseBody body;

    public static GetLinkeBahamutAppgrayadmininfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppgrayadmininfoResponse self = new GetLinkeBahamutAppgrayadmininfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppgrayadmininfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAppgrayadmininfoResponse setBody(GetLinkeBahamutAppgrayadmininfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAppgrayadmininfoResponseBody getBody() {
        return this.body;
    }

}
