// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RemoveDBClusterFromGDNResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveDBClusterFromGDNResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveDBClusterFromGDNResponseBody self = new RemoveDBClusterFromGDNResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveDBClusterFromGDNResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
