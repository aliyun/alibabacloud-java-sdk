// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetreleasebyldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutOpengetreleasebyldResponseBody body;

    public static GetLinkeBahamutOpengetreleasebyldResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetreleasebyldResponse self = new GetLinkeBahamutOpengetreleasebyldResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetreleasebyldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutOpengetreleasebyldResponse setBody(GetLinkeBahamutOpengetreleasebyldResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutOpengetreleasebyldResponseBody getBody() {
        return this.body;
    }

}
