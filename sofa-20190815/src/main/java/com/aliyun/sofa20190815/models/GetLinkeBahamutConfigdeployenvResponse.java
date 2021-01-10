// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutConfigdeployenvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutConfigdeployenvResponseBody body;

    public static GetLinkeBahamutConfigdeployenvResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutConfigdeployenvResponse self = new GetLinkeBahamutConfigdeployenvResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutConfigdeployenvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutConfigdeployenvResponse setBody(GetLinkeBahamutConfigdeployenvResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutConfigdeployenvResponseBody getBody() {
        return this.body;
    }

}
