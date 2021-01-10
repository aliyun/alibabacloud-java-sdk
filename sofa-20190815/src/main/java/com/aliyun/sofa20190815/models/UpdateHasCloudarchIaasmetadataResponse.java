// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchIaasmetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasCloudarchIaasmetadataResponseBody body;

    public static UpdateHasCloudarchIaasmetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchIaasmetadataResponse self = new UpdateHasCloudarchIaasmetadataResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchIaasmetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasCloudarchIaasmetadataResponse setBody(UpdateHasCloudarchIaasmetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasCloudarchIaasmetadataResponseBody getBody() {
        return this.body;
    }

}
