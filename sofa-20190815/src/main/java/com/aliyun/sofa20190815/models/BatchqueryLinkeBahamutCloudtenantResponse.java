// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryLinkeBahamutCloudtenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryLinkeBahamutCloudtenantResponseBody body;

    public static BatchqueryLinkeBahamutCloudtenantResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryLinkeBahamutCloudtenantResponse self = new BatchqueryLinkeBahamutCloudtenantResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryLinkeBahamutCloudtenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryLinkeBahamutCloudtenantResponse setBody(BatchqueryLinkeBahamutCloudtenantResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryLinkeBahamutCloudtenantResponseBody getBody() {
        return this.body;
    }

}
