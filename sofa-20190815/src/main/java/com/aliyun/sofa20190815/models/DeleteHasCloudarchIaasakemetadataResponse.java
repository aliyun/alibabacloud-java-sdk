// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchIaasakemetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasCloudarchIaasakemetadataResponseBody body;

    public static DeleteHasCloudarchIaasakemetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchIaasakemetadataResponse self = new DeleteHasCloudarchIaasakemetadataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchIaasakemetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasCloudarchIaasakemetadataResponse setBody(DeleteHasCloudarchIaasakemetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasCloudarchIaasakemetadataResponseBody getBody() {
        return this.body;
    }

}
