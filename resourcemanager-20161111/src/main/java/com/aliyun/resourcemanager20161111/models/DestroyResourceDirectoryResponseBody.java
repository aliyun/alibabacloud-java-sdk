// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class DestroyResourceDirectoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DestroyResourceDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DestroyResourceDirectoryResponseBody self = new DestroyResourceDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DestroyResourceDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
