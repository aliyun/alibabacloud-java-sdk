// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStcresultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutStcresultResponseBody body;

    public static GetLinkeBahamutStcresultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStcresultResponse self = new GetLinkeBahamutStcresultResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStcresultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutStcresultResponse setBody(GetLinkeBahamutStcresultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutStcresultResponseBody getBody() {
        return this.body;
    }

}
