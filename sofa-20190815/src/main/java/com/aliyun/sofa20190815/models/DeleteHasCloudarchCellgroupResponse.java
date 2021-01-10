// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchCellgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasCloudarchCellgroupResponseBody body;

    public static DeleteHasCloudarchCellgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchCellgroupResponse self = new DeleteHasCloudarchCellgroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchCellgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasCloudarchCellgroupResponse setBody(DeleteHasCloudarchCellgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasCloudarchCellgroupResponseBody getBody() {
        return this.body;
    }

}
