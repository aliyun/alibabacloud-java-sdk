// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateElasticsearchIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static UpdateElasticsearchIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateElasticsearchIngestionResponse self = new UpdateElasticsearchIngestionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateElasticsearchIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateElasticsearchIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
