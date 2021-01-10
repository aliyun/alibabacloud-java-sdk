// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class JoinTSJobGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public JoinTSJobGroupsResponseBody body;

    public static JoinTSJobGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinTSJobGroupsResponse self = new JoinTSJobGroupsResponse();
        return TeaModel.build(map, self);
    }

    public JoinTSJobGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinTSJobGroupsResponse setBody(JoinTSJobGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinTSJobGroupsResponseBody getBody() {
        return this.body;
    }

}
