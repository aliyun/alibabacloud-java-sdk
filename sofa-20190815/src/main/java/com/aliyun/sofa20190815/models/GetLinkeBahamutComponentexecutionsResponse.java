// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutComponentexecutionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutComponentexecutionsResponseBody body;

    public static GetLinkeBahamutComponentexecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutComponentexecutionsResponse self = new GetLinkeBahamutComponentexecutionsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutComponentexecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutComponentexecutionsResponse setBody(GetLinkeBahamutComponentexecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutComponentexecutionsResponseBody getBody() {
        return this.body;
    }

}
