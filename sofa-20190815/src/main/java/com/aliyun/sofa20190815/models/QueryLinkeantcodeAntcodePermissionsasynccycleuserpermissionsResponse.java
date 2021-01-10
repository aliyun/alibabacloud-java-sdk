// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponseBody body;

    public static QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse self = new QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponse setBody(QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodePermissionsasynccycleuserpermissionsResponseBody getBody() {
        return this.body;
    }

}
