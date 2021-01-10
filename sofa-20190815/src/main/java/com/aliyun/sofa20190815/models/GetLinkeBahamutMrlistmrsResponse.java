// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMrlistmrsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutMrlistmrsResponseBody body;

    public static GetLinkeBahamutMrlistmrsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMrlistmrsResponse self = new GetLinkeBahamutMrlistmrsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMrlistmrsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutMrlistmrsResponse setBody(GetLinkeBahamutMrlistmrsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutMrlistmrsResponseBody getBody() {
        return this.body;
    }

}
