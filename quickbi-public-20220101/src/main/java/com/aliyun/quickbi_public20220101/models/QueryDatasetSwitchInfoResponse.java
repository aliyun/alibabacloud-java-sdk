// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetSwitchInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDatasetSwitchInfoResponseBody body;

    public static QueryDatasetSwitchInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetSwitchInfoResponse self = new QueryDatasetSwitchInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatasetSwitchInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDatasetSwitchInfoResponse setBody(QueryDatasetSwitchInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDatasetSwitchInfoResponseBody getBody() {
        return this.body;
    }

}
