// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddRenderingDeviceInternetPortsResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("RequestId")
    public String requestId;

    public static AddRenderingDeviceInternetPortsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRenderingDeviceInternetPortsResponseBody self = new AddRenderingDeviceInternetPortsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRenderingDeviceInternetPortsResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public AddRenderingDeviceInternetPortsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
