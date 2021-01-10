// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody body;

    public static QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse self = new QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse setBody(QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseBody getBody() {
        return this.body;
    }

}
