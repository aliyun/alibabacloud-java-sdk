// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryJenkinsImageRegistryPersistenceDayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryJenkinsImageRegistryPersistenceDayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryJenkinsImageRegistryPersistenceDayResponse setBody(QueryJenkinsImageRegistryPersistenceDayResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryJenkinsImageRegistryPersistenceDayResponseBody getBody() {
        return this.body;
    }

}
