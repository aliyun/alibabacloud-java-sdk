// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppcodeserviceurlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAppcodeserviceurlResponseBody body;

    public static GetLinkeBahamutAppcodeserviceurlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppcodeserviceurlResponse self = new GetLinkeBahamutAppcodeserviceurlResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppcodeserviceurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAppcodeserviceurlResponse setBody(GetLinkeBahamutAppcodeserviceurlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAppcodeserviceurlResponseBody getBody() {
        return this.body;
    }

}
