// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCCellgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLDCCellgroupResponseBody body;

    public static DeleteLDCCellgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCCellgroupResponse self = new DeleteLDCCellgroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLDCCellgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLDCCellgroupResponse setBody(DeleteLDCCellgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLDCCellgroupResponseBody getBody() {
        return this.body;
    }

}
