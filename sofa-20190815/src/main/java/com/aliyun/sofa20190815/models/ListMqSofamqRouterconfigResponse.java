// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqRouterconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqSofamqRouterconfigResponseBody body;

    public static ListMqSofamqRouterconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqRouterconfigResponse self = new ListMqSofamqRouterconfigResponse();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqRouterconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqSofamqRouterconfigResponse setBody(ListMqSofamqRouterconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqSofamqRouterconfigResponseBody getBody() {
        return this.body;
    }

}
