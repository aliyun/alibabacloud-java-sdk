// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasCloudarchCellResponseBody body;

    public static DeleteHasCloudarchCellResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchCellResponse self = new DeleteHasCloudarchCellResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasCloudarchCellResponse setBody(DeleteHasCloudarchCellResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasCloudarchCellResponseBody getBody() {
        return this.body;
    }

}
