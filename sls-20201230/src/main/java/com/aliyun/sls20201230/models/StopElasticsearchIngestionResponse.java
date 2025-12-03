// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class StopElasticsearchIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static StopElasticsearchIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        StopElasticsearchIngestionResponse self = new StopElasticsearchIngestionResponse();
        return TeaModel.build(map, self);
    }

    public StopElasticsearchIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopElasticsearchIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
