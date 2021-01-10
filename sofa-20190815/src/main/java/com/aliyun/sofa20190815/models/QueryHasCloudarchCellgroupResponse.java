// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchCellgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCloudarchCellgroupResponseBody body;

    public static QueryHasCloudarchCellgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchCellgroupResponse self = new QueryHasCloudarchCellgroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchCellgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCloudarchCellgroupResponse setBody(QueryHasCloudarchCellgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCloudarchCellgroupResponseBody getBody() {
        return this.body;
    }

}
