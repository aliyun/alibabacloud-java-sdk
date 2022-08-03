// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class DestoryResourceDirectoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DestoryResourceDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DestoryResourceDirectoryResponseBody self = new DestoryResourceDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DestoryResourceDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
