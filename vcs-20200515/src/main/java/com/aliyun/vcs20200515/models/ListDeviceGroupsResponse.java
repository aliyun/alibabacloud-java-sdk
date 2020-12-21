// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListDeviceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceGroupsResponseBody body;

    public static ListDeviceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupsResponse self = new ListDeviceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceGroupsResponse setBody(ListDeviceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceGroupsResponseBody getBody() {
        return this.body;
    }

}
