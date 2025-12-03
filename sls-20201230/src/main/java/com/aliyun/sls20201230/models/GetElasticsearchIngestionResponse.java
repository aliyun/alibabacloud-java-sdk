// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetElasticsearchIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ESIngestion body;

    public static GetElasticsearchIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetElasticsearchIngestionResponse self = new GetElasticsearchIngestionResponse();
        return TeaModel.build(map, self);
    }

    public GetElasticsearchIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetElasticsearchIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetElasticsearchIngestionResponse setBody(ESIngestion body) {
        this.body = body;
        return this;
    }
    public ESIngestion getBody() {
        return this.body;
    }

}
