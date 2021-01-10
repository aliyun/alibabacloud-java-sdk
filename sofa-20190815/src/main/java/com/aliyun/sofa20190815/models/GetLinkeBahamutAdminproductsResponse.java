// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAdminproductsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAdminproductsResponseBody body;

    public static GetLinkeBahamutAdminproductsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAdminproductsResponse self = new GetLinkeBahamutAdminproductsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAdminproductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAdminproductsResponse setBody(GetLinkeBahamutAdminproductsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAdminproductsResponseBody getBody() {
        return this.body;
    }

}
