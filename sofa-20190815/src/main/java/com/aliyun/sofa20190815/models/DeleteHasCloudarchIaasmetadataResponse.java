// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchIaasmetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasCloudarchIaasmetadataResponseBody body;

    public static DeleteHasCloudarchIaasmetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchIaasmetadataResponse self = new DeleteHasCloudarchIaasmetadataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchIaasmetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasCloudarchIaasmetadataResponse setBody(DeleteHasCloudarchIaasmetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasCloudarchIaasmetadataResponseBody getBody() {
        return this.body;
    }

}
