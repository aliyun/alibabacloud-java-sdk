// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody body;

    public static QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse self = new QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse setBody(QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseBody getBody() {
        return this.body;
    }

}
