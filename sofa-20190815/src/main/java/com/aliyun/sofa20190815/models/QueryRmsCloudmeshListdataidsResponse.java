// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshListdataidsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsCloudmeshListdataidsResponseBody body;

    public static QueryRmsCloudmeshListdataidsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshListdataidsResponse self = new QueryRmsCloudmeshListdataidsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshListdataidsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsCloudmeshListdataidsResponse setBody(QueryRmsCloudmeshListdataidsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsCloudmeshListdataidsResponseBody getBody() {
        return this.body;
    }

}
