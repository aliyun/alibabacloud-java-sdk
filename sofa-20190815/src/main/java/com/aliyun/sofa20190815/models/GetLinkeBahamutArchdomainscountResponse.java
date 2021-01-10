// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomainscountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutArchdomainscountResponseBody body;

    public static GetLinkeBahamutArchdomainscountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomainscountResponse self = new GetLinkeBahamutArchdomainscountResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomainscountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutArchdomainscountResponse setBody(GetLinkeBahamutArchdomainscountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutArchdomainscountResponseBody getBody() {
        return this.body;
    }

}
