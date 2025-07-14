// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryReadableResourcesListByUserIdV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryReadableResourcesListByUserIdV2ResponseBody body;

    public static QueryReadableResourcesListByUserIdV2Response build(java.util.Map<String, ?> map) throws Exception {
        QueryReadableResourcesListByUserIdV2Response self = new QueryReadableResourcesListByUserIdV2Response();
        return TeaModel.build(map, self);
    }

    public QueryReadableResourcesListByUserIdV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReadableResourcesListByUserIdV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryReadableResourcesListByUserIdV2Response setBody(QueryReadableResourcesListByUserIdV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReadableResourcesListByUserIdV2ResponseBody getBody() {
        return this.body;
    }

}
