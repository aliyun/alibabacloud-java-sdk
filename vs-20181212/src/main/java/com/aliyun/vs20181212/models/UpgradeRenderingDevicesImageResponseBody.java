// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingDevicesImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeRenderingDevicesImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingDevicesImageResponseBody self = new UpgradeRenderingDevicesImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingDevicesImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
