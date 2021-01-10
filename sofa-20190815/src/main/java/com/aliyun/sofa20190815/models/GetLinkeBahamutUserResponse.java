// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutUserResponseBody body;

    public static GetLinkeBahamutUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUserResponse self = new GetLinkeBahamutUserResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutUserResponse setBody(GetLinkeBahamutUserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutUserResponseBody getBody() {
        return this.body;
    }

}
