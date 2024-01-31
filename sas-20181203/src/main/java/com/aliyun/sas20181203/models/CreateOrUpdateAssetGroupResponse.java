// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAssetGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrUpdateAssetGroupResponseBody body;

    public static CreateOrUpdateAssetGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAssetGroupResponse self = new CreateOrUpdateAssetGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAssetGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateAssetGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateAssetGroupResponse setBody(CreateOrUpdateAssetGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateAssetGroupResponseBody getBody() {
        return this.body;
    }

}
