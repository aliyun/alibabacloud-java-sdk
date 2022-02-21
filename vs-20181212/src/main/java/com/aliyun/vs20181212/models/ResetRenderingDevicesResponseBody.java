// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ResetRenderingDevicesResponseBody extends TeaModel {
    @NameInMap("FailedIds")
    public java.util.List<String> failedIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ResetRenderingDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetRenderingDevicesResponseBody self = new ResetRenderingDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetRenderingDevicesResponseBody setFailedIds(java.util.List<String> failedIds) {
        this.failedIds = failedIds;
        return this;
    }
    public java.util.List<String> getFailedIds() {
        return this.failedIds;
    }

    public ResetRenderingDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
