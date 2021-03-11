// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDeviceAlarmResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDeviceAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceAlarmResponseBody self = new ModifyDeviceAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
