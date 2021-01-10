// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasEmergencyPlantypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasEmergencyPlantypesResponseBody body;

    public static QueryHasEmergencyPlantypesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasEmergencyPlantypesResponse self = new QueryHasEmergencyPlantypesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasEmergencyPlantypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasEmergencyPlantypesResponse setBody(QueryHasEmergencyPlantypesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasEmergencyPlantypesResponseBody getBody() {
        return this.body;
    }

}
