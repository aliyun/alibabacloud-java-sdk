// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAonetenantpathiterationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAonetenantpathiterationsResponseBody body;

    public static GetLinkeBahamutAonetenantpathiterationsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAonetenantpathiterationsResponse self = new GetLinkeBahamutAonetenantpathiterationsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAonetenantpathiterationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAonetenantpathiterationsResponse setBody(GetLinkeBahamutAonetenantpathiterationsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAonetenantpathiterationsResponseBody getBody() {
        return this.body;
    }

}
