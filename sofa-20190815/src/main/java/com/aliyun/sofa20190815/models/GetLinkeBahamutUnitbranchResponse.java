// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUnitbranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutUnitbranchResponseBody body;

    public static GetLinkeBahamutUnitbranchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUnitbranchResponse self = new GetLinkeBahamutUnitbranchResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUnitbranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutUnitbranchResponse setBody(GetLinkeBahamutUnitbranchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutUnitbranchResponseBody getBody() {
        return this.body;
    }

}
