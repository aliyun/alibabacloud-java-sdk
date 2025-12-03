// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetS3IngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public S3Ingestion body;

    public static GetS3IngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetS3IngestionResponse self = new GetS3IngestionResponse();
        return TeaModel.build(map, self);
    }

    public GetS3IngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetS3IngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetS3IngestionResponse setBody(S3Ingestion body) {
        this.body = body;
        return this;
    }
    public S3Ingestion getBody() {
        return this.body;
    }

}
