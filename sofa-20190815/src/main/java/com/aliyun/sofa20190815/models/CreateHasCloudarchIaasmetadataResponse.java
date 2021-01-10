// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasCloudarchIaasmetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasCloudarchIaasmetadataResponseBody body;

    public static CreateHasCloudarchIaasmetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasCloudarchIaasmetadataResponse self = new CreateHasCloudarchIaasmetadataResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasCloudarchIaasmetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasCloudarchIaasmetadataResponse setBody(CreateHasCloudarchIaasmetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasCloudarchIaasmetadataResponseBody getBody() {
        return this.body;
    }

}
