// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAzureBlobIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AzureBlobIngestion body;

    public static GetAzureBlobIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAzureBlobIngestionResponse self = new GetAzureBlobIngestionResponse();
        return TeaModel.build(map, self);
    }

    public GetAzureBlobIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAzureBlobIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAzureBlobIngestionResponse setBody(AzureBlobIngestion body) {
        this.body = body;
        return this;
    }
    public AzureBlobIngestion getBody() {
        return this.body;
    }

}
