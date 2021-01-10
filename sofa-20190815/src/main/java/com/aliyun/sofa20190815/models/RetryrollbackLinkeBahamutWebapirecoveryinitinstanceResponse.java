// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody body;

    public static RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse self = new RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse();
        return TeaModel.build(map, self);
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponse setBody(RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody getBody() {
        return this.body;
    }

}
