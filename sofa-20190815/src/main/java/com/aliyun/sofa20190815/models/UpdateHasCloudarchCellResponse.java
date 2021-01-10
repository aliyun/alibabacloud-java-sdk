// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasCloudarchCellResponseBody body;

    public static UpdateHasCloudarchCellResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchCellResponse self = new UpdateHasCloudarchCellResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasCloudarchCellResponse setBody(UpdateHasCloudarchCellResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasCloudarchCellResponseBody getBody() {
        return this.body;
    }

}
