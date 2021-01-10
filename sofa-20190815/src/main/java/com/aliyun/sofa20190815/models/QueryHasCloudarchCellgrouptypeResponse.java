// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchCellgrouptypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCloudarchCellgrouptypeResponseBody body;

    public static QueryHasCloudarchCellgrouptypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchCellgrouptypeResponse self = new QueryHasCloudarchCellgrouptypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchCellgrouptypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCloudarchCellgrouptypeResponse setBody(QueryHasCloudarchCellgrouptypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCloudarchCellgrouptypeResponseBody getBody() {
        return this.body;
    }

}
