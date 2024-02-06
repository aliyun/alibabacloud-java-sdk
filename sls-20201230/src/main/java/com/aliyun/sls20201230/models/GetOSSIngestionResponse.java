// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetOSSIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OSSIngestion body;

    public static GetOSSIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOSSIngestionResponse self = new GetOSSIngestionResponse();
        return TeaModel.build(map, self);
    }

    public GetOSSIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOSSIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOSSIngestionResponse setBody(OSSIngestion body) {
        this.body = body;
        return this;
    }
    public OSSIngestion getBody() {
        return this.body;
    }

}
