// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmrcommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsmrcommentResponseBody body;

    public static GetLinkeBahamutVcsmrcommentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmrcommentResponse self = new GetLinkeBahamutVcsmrcommentResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmrcommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsmrcommentResponse setBody(GetLinkeBahamutVcsmrcommentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsmrcommentResponseBody getBody() {
        return this.body;
    }

}
