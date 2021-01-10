// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMiscgetgraylterationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutMiscgetgraylterationsResponseBody body;

    public static GetLinkeBahamutMiscgetgraylterationsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMiscgetgraylterationsResponse self = new GetLinkeBahamutMiscgetgraylterationsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMiscgetgraylterationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutMiscgetgraylterationsResponse setBody(GetLinkeBahamutMiscgetgraylterationsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutMiscgetgraylterationsResponseBody getBody() {
        return this.body;
    }

}
