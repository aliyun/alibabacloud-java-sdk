// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutArchdomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutArchdomainResponseBody body;

    public static AddLinkeBahamutArchdomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutArchdomainResponse self = new AddLinkeBahamutArchdomainResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutArchdomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutArchdomainResponse setBody(AddLinkeBahamutArchdomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutArchdomainResponseBody getBody() {
        return this.body;
    }

}
