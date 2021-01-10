// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcscommitcommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcscommitcommentResponseBody body;

    public static GetLinkeBahamutVcscommitcommentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcscommitcommentResponse self = new GetLinkeBahamutVcscommitcommentResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcscommitcommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcscommitcommentResponse setBody(GetLinkeBahamutVcscommitcommentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcscommitcommentResponseBody getBody() {
        return this.body;
    }

}
