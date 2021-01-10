// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasEmergencyPlantargettypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasEmergencyPlantargettypesResponseBody body;

    public static QueryHasEmergencyPlantargettypesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasEmergencyPlantargettypesResponse self = new QueryHasEmergencyPlantargettypesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasEmergencyPlantargettypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasEmergencyPlantargettypesResponse setBody(QueryHasEmergencyPlantargettypesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasEmergencyPlantargettypesResponseBody getBody() {
        return this.body;
    }

}
