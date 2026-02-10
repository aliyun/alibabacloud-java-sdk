// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalFineTuneDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMultimodalFineTuneDatasetResponseBody body;

    public static ListMultimodalFineTuneDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalFineTuneDatasetResponse self = new ListMultimodalFineTuneDatasetResponse();
        return TeaModel.build(map, self);
    }

    public ListMultimodalFineTuneDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultimodalFineTuneDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultimodalFineTuneDatasetResponse setBody(ListMultimodalFineTuneDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultimodalFineTuneDatasetResponseBody getBody() {
        return this.body;
    }

}
