// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddCameraForInstanceShrinkRequest extends TeaModel {
    @NameInMap("CameraIds")
    public String cameraIdsShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    public static AddCameraForInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCameraForInstanceShrinkRequest self = new AddCameraForInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddCameraForInstanceShrinkRequest setCameraIdsShrink(String cameraIdsShrink) {
        this.cameraIdsShrink = cameraIdsShrink;
        return this;
    }
    public String getCameraIdsShrink() {
        return this.cameraIdsShrink;
    }

    public AddCameraForInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
