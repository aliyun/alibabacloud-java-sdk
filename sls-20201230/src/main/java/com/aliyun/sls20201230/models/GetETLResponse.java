// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetETLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ETL body;

    public static GetETLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetETLResponse self = new GetETLResponse();
        return TeaModel.build(map, self);
    }

    public GetETLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetETLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetETLResponse setBody(ETL body) {
        this.body = body;
        return this;
    }
    public ETL getBody() {
        return this.body;
    }

}
