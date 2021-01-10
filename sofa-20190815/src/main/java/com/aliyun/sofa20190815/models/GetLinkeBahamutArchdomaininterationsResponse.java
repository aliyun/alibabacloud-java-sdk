// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomaininterationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutArchdomaininterationsResponseBody body;

    public static GetLinkeBahamutArchdomaininterationsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomaininterationsResponse self = new GetLinkeBahamutArchdomaininterationsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomaininterationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutArchdomaininterationsResponse setBody(GetLinkeBahamutArchdomaininterationsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutArchdomaininterationsResponseBody getBody() {
        return this.body;
    }

}
