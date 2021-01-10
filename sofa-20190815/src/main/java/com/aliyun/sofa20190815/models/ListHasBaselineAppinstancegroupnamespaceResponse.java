// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasBaselineAppinstancegroupnamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasBaselineAppinstancegroupnamespaceResponseBody body;

    public static ListHasBaselineAppinstancegroupnamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasBaselineAppinstancegroupnamespaceResponse self = new ListHasBaselineAppinstancegroupnamespaceResponse();
        return TeaModel.build(map, self);
    }

    public ListHasBaselineAppinstancegroupnamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasBaselineAppinstancegroupnamespaceResponse setBody(ListHasBaselineAppinstancegroupnamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasBaselineAppinstancegroupnamespaceResponseBody getBody() {
        return this.body;
    }

}
