// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomainappsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutArchdomainappsResponseBody body;

    public static GetLinkeBahamutArchdomainappsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomainappsResponse self = new GetLinkeBahamutArchdomainappsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomainappsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutArchdomainappsResponse setBody(GetLinkeBahamutArchdomainappsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutArchdomainappsResponseBody getBody() {
        return this.body;
    }

}
