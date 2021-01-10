// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasCloudarchIaasakemetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasCloudarchIaasakemetadataResponseBody body;

    public static CreateHasCloudarchIaasakemetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasCloudarchIaasakemetadataResponse self = new CreateHasCloudarchIaasakemetadataResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasCloudarchIaasakemetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasCloudarchIaasakemetadataResponse setBody(CreateHasCloudarchIaasakemetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasCloudarchIaasakemetadataResponseBody getBody() {
        return this.body;
    }

}
