// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class CreateMultimodalSearchTaskResultFineTuneDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMultimodalSearchTaskResultFineTuneDatasetResponseBody body;

    public static CreateMultimodalSearchTaskResultFineTuneDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMultimodalSearchTaskResultFineTuneDatasetResponse self = new CreateMultimodalSearchTaskResultFineTuneDatasetResponse();
        return TeaModel.build(map, self);
    }

    public CreateMultimodalSearchTaskResultFineTuneDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMultimodalSearchTaskResultFineTuneDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMultimodalSearchTaskResultFineTuneDatasetResponse setBody(CreateMultimodalSearchTaskResultFineTuneDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMultimodalSearchTaskResultFineTuneDatasetResponseBody getBody() {
        return this.body;
    }

}
