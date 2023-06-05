// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RemoveCameraForInstanceRequest extends TeaModel {
    @NameInMap("CameraIds")
    public java.util.List<String> cameraIds;

    @NameInMap("InstanceId")
    public String instanceId;

    public static RemoveCameraForInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveCameraForInstanceRequest self = new RemoveCameraForInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveCameraForInstanceRequest setCameraIds(java.util.List<String> cameraIds) {
        this.cameraIds = cameraIds;
        return this;
    }
    public java.util.List<String> getCameraIds() {
        return this.cameraIds;
    }

    public RemoveCameraForInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
