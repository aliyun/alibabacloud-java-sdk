// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUnitenvidsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutUnitenvidsResponseBody body;

    public static GetLinkeBahamutUnitenvidsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUnitenvidsResponse self = new GetLinkeBahamutUnitenvidsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUnitenvidsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutUnitenvidsResponse setBody(GetLinkeBahamutUnitenvidsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutUnitenvidsResponseBody getBody() {
        return this.body;
    }

}
