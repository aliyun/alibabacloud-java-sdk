// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationsgetunitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationsgetunitsResponseBody body;

    public static GetLinkeBahamutIterationsgetunitsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationsgetunitsResponse self = new GetLinkeBahamutIterationsgetunitsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationsgetunitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationsgetunitsResponse setBody(GetLinkeBahamutIterationsgetunitsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationsgetunitsResponseBody getBody() {
        return this.body;
    }

}
