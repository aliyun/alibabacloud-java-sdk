// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetGCSIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GCSIngestion body;

    public static GetGCSIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGCSIngestionResponse self = new GetGCSIngestionResponse();
        return TeaModel.build(map, self);
    }

    public GetGCSIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGCSIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGCSIngestionResponse setBody(GCSIngestion body) {
        this.body = body;
        return this;
    }
    public GCSIngestion getBody() {
        return this.body;
    }

}
