// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryJenkinsImageRegistryPersistenceDayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryJenkinsImageRegistryPersistenceDayResponseBody body;

    public static QueryJenkinsImageRegistryPersistenceDayResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJenkinsImageRegistryPersistenceDayResponse self = new QueryJenkinsImageRegistryPersistenceDayResponse();
        return TeaModel.build(map, self);
    }

    public QueryJenkinsImageRegistryPersistenceDayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryJenkinsImageRegistryPersistenceDayResponse setBody(QueryJenkinsImageRegistryPersistenceDayResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryJenkinsImageRegistryPersistenceDayResponseBody getBody() {
        return this.body;
    }

}
