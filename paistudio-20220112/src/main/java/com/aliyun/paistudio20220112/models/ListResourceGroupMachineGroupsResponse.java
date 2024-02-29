// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListResourceGroupMachineGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceGroupMachineGroupsResponseBody body;

    public static ListResourceGroupMachineGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupMachineGroupsResponse self = new ListResourceGroupMachineGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupMachineGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceGroupMachineGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceGroupMachineGroupsResponse setBody(ListResourceGroupMachineGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceGroupMachineGroupsResponseBody getBody() {
        return this.body;
    }

}
