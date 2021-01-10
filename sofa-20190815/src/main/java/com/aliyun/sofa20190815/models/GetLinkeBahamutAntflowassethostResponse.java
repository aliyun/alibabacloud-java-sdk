// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAntflowassethostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAntflowassethostResponseBody body;

    public static GetLinkeBahamutAntflowassethostResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAntflowassethostResponse self = new GetLinkeBahamutAntflowassethostResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAntflowassethostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAntflowassethostResponse setBody(GetLinkeBahamutAntflowassethostResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAntflowassethostResponseBody getBody() {
        return this.body;
    }

}
