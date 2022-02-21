// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingDevicesHostOSResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeRenderingDevicesHostOSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingDevicesHostOSResponseBody self = new UpgradeRenderingDevicesHostOSResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingDevicesHostOSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
