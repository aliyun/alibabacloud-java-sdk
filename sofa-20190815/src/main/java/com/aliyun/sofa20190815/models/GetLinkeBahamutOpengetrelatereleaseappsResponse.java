// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetrelatereleaseappsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutOpengetrelatereleaseappsResponseBody body;

    public static GetLinkeBahamutOpengetrelatereleaseappsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetrelatereleaseappsResponse self = new GetLinkeBahamutOpengetrelatereleaseappsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetrelatereleaseappsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutOpengetrelatereleaseappsResponse setBody(GetLinkeBahamutOpengetrelatereleaseappsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutOpengetrelatereleaseappsResponseBody getBody() {
        return this.body;
    }

}
