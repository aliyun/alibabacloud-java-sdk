// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsissueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsissueResponseBody body;

    public static GetLinkeBahamutVcsissueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsissueResponse self = new GetLinkeBahamutVcsissueResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsissueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsissueResponse setBody(GetLinkeBahamutVcsissueResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsissueResponseBody getBody() {
        return this.body;
    }

}
