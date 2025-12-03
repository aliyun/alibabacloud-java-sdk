// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAzureBlobIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAzureBlobIngestionResponseBody body;

    public static ListAzureBlobIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAzureBlobIngestionResponse self = new ListAzureBlobIngestionResponse();
        return TeaModel.build(map, self);
    }

    public ListAzureBlobIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAzureBlobIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAzureBlobIngestionResponse setBody(ListAzureBlobIngestionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAzureBlobIngestionResponseBody getBody() {
        return this.body;
    }

}
