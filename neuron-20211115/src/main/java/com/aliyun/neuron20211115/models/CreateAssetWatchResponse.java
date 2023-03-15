// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateAssetWatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CatalogCommonResult body;

    public static CreateAssetWatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetWatchResponse self = new CreateAssetWatchResponse();
        return TeaModel.build(map, self);
    }

    public CreateAssetWatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAssetWatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAssetWatchResponse setBody(CatalogCommonResult body) {
        this.body = body;
        return this;
    }
    public CatalogCommonResult getBody() {
        return this.body;
    }

}
