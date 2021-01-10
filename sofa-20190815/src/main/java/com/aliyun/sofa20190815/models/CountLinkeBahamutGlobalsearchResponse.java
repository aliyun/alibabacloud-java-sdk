// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeBahamutGlobalsearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountLinkeBahamutGlobalsearchResponseBody body;

    public static CountLinkeBahamutGlobalsearchResponse build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeBahamutGlobalsearchResponse self = new CountLinkeBahamutGlobalsearchResponse();
        return TeaModel.build(map, self);
    }

    public CountLinkeBahamutGlobalsearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountLinkeBahamutGlobalsearchResponse setBody(CountLinkeBahamutGlobalsearchResponseBody body) {
        this.body = body;
        return this;
    }
    public CountLinkeBahamutGlobalsearchResponseBody getBody() {
        return this.body;
    }

}
