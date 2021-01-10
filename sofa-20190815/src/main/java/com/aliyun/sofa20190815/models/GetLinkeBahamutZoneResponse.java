// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutZoneResponseBody body;

    public static GetLinkeBahamutZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutZoneResponse self = new GetLinkeBahamutZoneResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutZoneResponse setBody(GetLinkeBahamutZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutZoneResponseBody getBody() {
        return this.body;
    }

}
