// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCloudmsgbinginginfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricCloudmsgbinginginfoResponseBody body;

    public static QueryLinkefabricFabricCloudmsgbinginginfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCloudmsgbinginginfoResponse self = new QueryLinkefabricFabricCloudmsgbinginginfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoResponse setBody(QueryLinkefabricFabricCloudmsgbinginginfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricCloudmsgbinginginfoResponseBody getBody() {
        return this.body;
    }

}
