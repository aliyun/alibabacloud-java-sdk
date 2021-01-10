// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCCellgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCCellgroupResponseBody body;

    public static ListLDCCellgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCCellgroupResponse self = new ListLDCCellgroupResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCCellgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCCellgroupResponse setBody(ListLDCCellgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCCellgroupResponseBody getBody() {
        return this.body;
    }

}
