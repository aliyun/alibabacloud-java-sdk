// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class OperateRenderingDevicesResponseBody extends TeaModel {
    @NameInMap("FailedIds")
    public java.util.List<String> failedIds;

    @NameInMap("RequestId")
    public String requestId;

    public static OperateRenderingDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateRenderingDevicesResponseBody self = new OperateRenderingDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateRenderingDevicesResponseBody setFailedIds(java.util.List<String> failedIds) {
        this.failedIds = failedIds;
        return this;
    }
    public java.util.List<String> getFailedIds() {
        return this.failedIds;
    }

    public OperateRenderingDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
