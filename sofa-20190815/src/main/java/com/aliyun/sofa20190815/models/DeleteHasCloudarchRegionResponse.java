// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasCloudarchRegionResponseBody body;

    public static DeleteHasCloudarchRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchRegionResponse self = new DeleteHasCloudarchRegionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasCloudarchRegionResponse setBody(DeleteHasCloudarchRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasCloudarchRegionResponseBody getBody() {
        return this.body;
    }

}
