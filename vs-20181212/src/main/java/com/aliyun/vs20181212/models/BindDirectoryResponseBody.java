// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindDirectoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindDirectoryResponseBody self = new BindDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public BindDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
