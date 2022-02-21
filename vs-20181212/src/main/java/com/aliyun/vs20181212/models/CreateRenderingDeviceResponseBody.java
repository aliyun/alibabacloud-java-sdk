// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateRenderingDeviceResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateRenderingDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRenderingDeviceResponseBody self = new CreateRenderingDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRenderingDeviceResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateRenderingDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
