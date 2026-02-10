// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class AddOSSMultimodalFineTuneDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddOSSMultimodalFineTuneDatasetResponseBody body;

    public static AddOSSMultimodalFineTuneDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOSSMultimodalFineTuneDatasetResponse self = new AddOSSMultimodalFineTuneDatasetResponse();
        return TeaModel.build(map, self);
    }

    public AddOSSMultimodalFineTuneDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOSSMultimodalFineTuneDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddOSSMultimodalFineTuneDatasetResponse setBody(AddOSSMultimodalFineTuneDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOSSMultimodalFineTuneDatasetResponseBody getBody() {
        return this.body;
    }

}
