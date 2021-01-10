// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetrelatereleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutOpengetrelatereleaseResponseBody body;

    public static GetLinkeBahamutOpengetrelatereleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetrelatereleaseResponse self = new GetLinkeBahamutOpengetrelatereleaseResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetrelatereleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutOpengetrelatereleaseResponse setBody(GetLinkeBahamutOpengetrelatereleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutOpengetrelatereleaseResponseBody getBody() {
        return this.body;
    }

}
