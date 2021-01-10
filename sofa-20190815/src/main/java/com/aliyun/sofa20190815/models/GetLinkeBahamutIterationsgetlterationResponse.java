// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationsgetlterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationsgetlterationResponseBody body;

    public static GetLinkeBahamutIterationsgetlterationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationsgetlterationResponse self = new GetLinkeBahamutIterationsgetlterationResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationsgetlterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationsgetlterationResponse setBody(GetLinkeBahamutIterationsgetlterationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationsgetlterationResponseBody getBody() {
        return this.body;
    }

}
