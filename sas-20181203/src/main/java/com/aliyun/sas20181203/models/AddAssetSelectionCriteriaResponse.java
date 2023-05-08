// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddAssetSelectionCriteriaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddAssetSelectionCriteriaResponseBody body;

    public static AddAssetSelectionCriteriaResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAssetSelectionCriteriaResponse self = new AddAssetSelectionCriteriaResponse();
        return TeaModel.build(map, self);
    }

    public AddAssetSelectionCriteriaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAssetSelectionCriteriaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAssetSelectionCriteriaResponse setBody(AddAssetSelectionCriteriaResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAssetSelectionCriteriaResponseBody getBody() {
        return this.body;
    }

}
