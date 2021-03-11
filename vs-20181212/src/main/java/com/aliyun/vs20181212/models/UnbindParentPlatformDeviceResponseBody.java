// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindParentPlatformDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindParentPlatformDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindParentPlatformDeviceResponseBody self = new UnbindParentPlatformDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindParentPlatformDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
