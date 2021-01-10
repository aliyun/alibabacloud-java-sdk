// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsertokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutUsertokenResponseBody body;

    public static GetLinkeBahamutUsertokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsertokenResponse self = new GetLinkeBahamutUsertokenResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsertokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutUsertokenResponse setBody(GetLinkeBahamutUsertokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutUsertokenResponseBody getBody() {
        return this.body;
    }

}
