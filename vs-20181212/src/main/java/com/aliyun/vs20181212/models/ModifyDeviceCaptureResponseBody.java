// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDeviceCaptureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDeviceCaptureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceCaptureResponseBody self = new ModifyDeviceCaptureResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceCaptureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
