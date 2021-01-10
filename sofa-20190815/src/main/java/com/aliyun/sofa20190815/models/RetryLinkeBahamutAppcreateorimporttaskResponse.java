// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutAppcreateorimporttaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryLinkeBahamutAppcreateorimporttaskResponseBody body;

    public static RetryLinkeBahamutAppcreateorimporttaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutAppcreateorimporttaskResponse self = new RetryLinkeBahamutAppcreateorimporttaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutAppcreateorimporttaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLinkeBahamutAppcreateorimporttaskResponse setBody(RetryLinkeBahamutAppcreateorimporttaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLinkeBahamutAppcreateorimporttaskResponseBody getBody() {
        return this.body;
    }

}
