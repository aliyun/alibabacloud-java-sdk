// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsermenucommonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutUsermenucommonResponseBody body;

    public static GetLinkeBahamutUsermenucommonResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsermenucommonResponse self = new GetLinkeBahamutUsermenucommonResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsermenucommonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutUsermenucommonResponse setBody(GetLinkeBahamutUsermenucommonResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutUsermenucommonResponseBody getBody() {
        return this.body;
    }

}
