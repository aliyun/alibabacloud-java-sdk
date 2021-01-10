// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqSofamqGroupResponseBody body;

    public static ListMqSofamqGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqGroupResponse self = new ListMqSofamqGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqSofamqGroupResponse setBody(ListMqSofamqGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqSofamqGroupResponseBody getBody() {
        return this.body;
    }

}
