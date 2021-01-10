// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryLinkeBahamutAntflowtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryLinkeBahamutAntflowtaskResponseBody body;

    public static BatchqueryLinkeBahamutAntflowtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryLinkeBahamutAntflowtaskResponse self = new BatchqueryLinkeBahamutAntflowtaskResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryLinkeBahamutAntflowtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryLinkeBahamutAntflowtaskResponse setBody(BatchqueryLinkeBahamutAntflowtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryLinkeBahamutAntflowtaskResponseBody getBody() {
        return this.body;
    }

}
