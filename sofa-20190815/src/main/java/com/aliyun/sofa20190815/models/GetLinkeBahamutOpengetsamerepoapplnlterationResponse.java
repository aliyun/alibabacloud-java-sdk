// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetsamerepoapplnlterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutOpengetsamerepoapplnlterationResponseBody body;

    public static GetLinkeBahamutOpengetsamerepoapplnlterationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetsamerepoapplnlterationResponse self = new GetLinkeBahamutOpengetsamerepoapplnlterationResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetsamerepoapplnlterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutOpengetsamerepoapplnlterationResponse setBody(GetLinkeBahamutOpengetsamerepoapplnlterationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutOpengetsamerepoapplnlterationResponseBody getBody() {
        return this.body;
    }

}
