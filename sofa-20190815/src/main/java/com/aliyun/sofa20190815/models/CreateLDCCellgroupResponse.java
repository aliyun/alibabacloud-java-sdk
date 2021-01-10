// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCCellgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLDCCellgroupResponseBody body;

    public static CreateLDCCellgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCCellgroupResponse self = new CreateLDCCellgroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateLDCCellgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLDCCellgroupResponse setBody(CreateLDCCellgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLDCCellgroupResponseBody getBody() {
        return this.body;
    }

}
