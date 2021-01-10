// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUserproductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutUserproductResponseBody body;

    public static GetLinkeBahamutUserproductResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUserproductResponse self = new GetLinkeBahamutUserproductResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUserproductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutUserproductResponse setBody(GetLinkeBahamutUserproductResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutUserproductResponseBody getBody() {
        return this.body;
    }

}
