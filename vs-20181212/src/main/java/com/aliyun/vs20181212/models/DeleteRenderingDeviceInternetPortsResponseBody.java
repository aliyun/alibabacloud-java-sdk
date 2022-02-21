// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteRenderingDeviceInternetPortsResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    public DeleteRenderingDeviceInternetPortsResponseBodyInstanceIds instanceIds;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRenderingDeviceInternetPortsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRenderingDeviceInternetPortsResponseBody self = new DeleteRenderingDeviceInternetPortsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRenderingDeviceInternetPortsResponseBody setInstanceIds(DeleteRenderingDeviceInternetPortsResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public DeleteRenderingDeviceInternetPortsResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public DeleteRenderingDeviceInternetPortsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteRenderingDeviceInternetPortsResponseBodyInstanceIds extends TeaModel {
        @NameInMap("instanceIds")
        public java.util.List<String> instanceIds;

        public static DeleteRenderingDeviceInternetPortsResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteRenderingDeviceInternetPortsResponseBodyInstanceIds self = new DeleteRenderingDeviceInternetPortsResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public DeleteRenderingDeviceInternetPortsResponseBodyInstanceIds setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

    }

}
