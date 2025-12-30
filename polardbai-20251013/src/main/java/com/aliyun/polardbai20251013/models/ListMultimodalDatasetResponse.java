// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMultimodalDatasetResponseBody body;

    public static ListMultimodalDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalDatasetResponse self = new ListMultimodalDatasetResponse();
        return TeaModel.build(map, self);
    }

    public ListMultimodalDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultimodalDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultimodalDatasetResponse setBody(ListMultimodalDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultimodalDatasetResponseBody getBody() {
        return this.body;
    }

}
