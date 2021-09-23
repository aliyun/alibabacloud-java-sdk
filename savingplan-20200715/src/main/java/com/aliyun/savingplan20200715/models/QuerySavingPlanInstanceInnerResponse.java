// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class QuerySavingPlanInstanceInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySavingPlanInstanceInnerResponseBody body;

    public static QuerySavingPlanInstanceInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingPlanInstanceInnerResponse self = new QuerySavingPlanInstanceInnerResponse();
        return TeaModel.build(map, self);
    }

    public QuerySavingPlanInstanceInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySavingPlanInstanceInnerResponse setBody(QuerySavingPlanInstanceInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySavingPlanInstanceInnerResponseBody getBody() {
        return this.body;
    }

}
