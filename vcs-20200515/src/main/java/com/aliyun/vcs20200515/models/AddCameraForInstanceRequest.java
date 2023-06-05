// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddCameraForInstanceRequest extends TeaModel {
    @NameInMap("CameraIds")
    public java.util.List<String> cameraIds;

    @NameInMap("InstanceId")
    public String instanceId;

    public static AddCameraForInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCameraForInstanceRequest self = new AddCameraForInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AddCameraForInstanceRequest setCameraIds(java.util.List<String> cameraIds) {
        this.cameraIds = cameraIds;
        return this;
    }
    public java.util.List<String> getCameraIds() {
        return this.cameraIds;
    }

    public AddCameraForInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
