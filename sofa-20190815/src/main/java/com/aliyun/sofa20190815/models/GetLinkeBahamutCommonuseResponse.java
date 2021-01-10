// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCommonuseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutCommonuseResponseBody body;

    public static GetLinkeBahamutCommonuseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCommonuseResponse self = new GetLinkeBahamutCommonuseResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCommonuseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutCommonuseResponse setBody(GetLinkeBahamutCommonuseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutCommonuseResponseBody getBody() {
        return this.body;
    }

}
