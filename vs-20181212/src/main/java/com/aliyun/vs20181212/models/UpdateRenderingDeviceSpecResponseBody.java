// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingDeviceSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRenderingDeviceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRenderingDeviceSpecResponseBody self = new UpdateRenderingDeviceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRenderingDeviceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
