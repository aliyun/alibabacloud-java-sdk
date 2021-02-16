// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLExplorerRetentionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLExplorerRetentionResponseBody body;

    public static DescribeSQLExplorerRetentionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLExplorerRetentionResponse self = new DescribeSQLExplorerRetentionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLExplorerRetentionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLExplorerRetentionResponse setBody(DescribeSQLExplorerRetentionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLExplorerRetentionResponseBody getBody() {
        return this.body;
    }

}
