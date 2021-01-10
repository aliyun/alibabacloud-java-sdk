// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStcinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutStcinfoResponseBody body;

    public static GetLinkeBahamutStcinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStcinfoResponse self = new GetLinkeBahamutStcinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStcinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutStcinfoResponse setBody(GetLinkeBahamutStcinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutStcinfoResponseBody getBody() {
        return this.body;
    }

}
