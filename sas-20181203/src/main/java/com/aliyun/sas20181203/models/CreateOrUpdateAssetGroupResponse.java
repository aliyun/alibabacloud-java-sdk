// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAssetGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateOrUpdateAssetGroupResponse setBody(CreateOrUpdateAssetGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateAssetGroupResponseBody getBody() {
        return this.body;
    }

}
