// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMiscgetreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutMiscgetreleaseResponseBody body;

    public static GetLinkeBahamutMiscgetreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMiscgetreleaseResponse self = new GetLinkeBahamutMiscgetreleaseResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMiscgetreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutMiscgetreleaseResponse setBody(GetLinkeBahamutMiscgetreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutMiscgetreleaseResponseBody getBody() {
        return this.body;
    }

}
