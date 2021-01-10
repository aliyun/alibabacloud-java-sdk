// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCCellgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLDCCellgroupResponseBody body;

    public static GetLDCCellgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLDCCellgroupResponse self = new GetLDCCellgroupResponse();
        return TeaModel.build(map, self);
    }

    public GetLDCCellgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLDCCellgroupResponse setBody(GetLDCCellgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLDCCellgroupResponseBody getBody() {
        return this.body;
    }

}
