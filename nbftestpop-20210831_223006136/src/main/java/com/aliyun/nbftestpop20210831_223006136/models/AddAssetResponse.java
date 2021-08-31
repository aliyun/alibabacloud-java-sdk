// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210831_223006136.models;

import com.aliyun.tea.*;

public class AddAssetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAssetResponseBody body;

    public static AddAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAssetResponse self = new AddAssetResponse();
        return TeaModel.build(map, self);
    }

    public AddAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAssetResponse setBody(AddAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAssetResponseBody getBody() {
        return this.body;
    }

}
