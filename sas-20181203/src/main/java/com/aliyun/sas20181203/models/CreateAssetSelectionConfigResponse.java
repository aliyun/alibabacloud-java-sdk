// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAssetSelectionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAssetSelectionConfigResponseBody body;

    public static CreateAssetSelectionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetSelectionConfigResponse self = new CreateAssetSelectionConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateAssetSelectionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAssetSelectionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAssetSelectionConfigResponse setBody(CreateAssetSelectionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAssetSelectionConfigResponseBody getBody() {
        return this.body;
    }

}
