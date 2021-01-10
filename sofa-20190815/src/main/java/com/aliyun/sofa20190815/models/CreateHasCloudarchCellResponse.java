// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasCloudarchCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasCloudarchCellResponseBody body;

    public static CreateHasCloudarchCellResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasCloudarchCellResponse self = new CreateHasCloudarchCellResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasCloudarchCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasCloudarchCellResponse setBody(CreateHasCloudarchCellResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasCloudarchCellResponseBody getBody() {
        return this.body;
    }

}
