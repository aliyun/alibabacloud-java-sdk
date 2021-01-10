// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchIaasakemetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasCloudarchIaasakemetadataResponseBody body;

    public static UpdateHasCloudarchIaasakemetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchIaasakemetadataResponse self = new UpdateHasCloudarchIaasakemetadataResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchIaasakemetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasCloudarchIaasakemetadataResponse setBody(UpdateHasCloudarchIaasakemetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasCloudarchIaasakemetadataResponseBody getBody() {
        return this.body;
    }

}
