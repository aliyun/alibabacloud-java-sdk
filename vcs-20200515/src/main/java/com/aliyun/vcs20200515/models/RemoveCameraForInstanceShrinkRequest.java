// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RemoveCameraForInstanceShrinkRequest extends TeaModel {
    @NameInMap("CameraIds")
    public String cameraIdsShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    public static RemoveCameraForInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveCameraForInstanceShrinkRequest self = new RemoveCameraForInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveCameraForInstanceShrinkRequest setCameraIdsShrink(String cameraIdsShrink) {
        this.cameraIdsShrink = cameraIdsShrink;
        return this;
    }
    public String getCameraIdsShrink() {
        return this.cameraIdsShrink;
    }

    public RemoveCameraForInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
