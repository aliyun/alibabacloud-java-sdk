// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210916_103600223.models;

import com.aliyun.tea.*;

public class AssetPublishTestOpenApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssetPublishTestOpenApiResponseBody body;

    public static AssetPublishTestOpenApiResponse build(java.util.Map<String, ?> map) throws Exception {
        AssetPublishTestOpenApiResponse self = new AssetPublishTestOpenApiResponse();
        return TeaModel.build(map, self);
    }

    public AssetPublishTestOpenApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssetPublishTestOpenApiResponse setBody(AssetPublishTestOpenApiResponseBody body) {
        this.body = body;
        return this;
    }
    public AssetPublishTestOpenApiResponseBody getBody() {
        return this.body;
    }

}
