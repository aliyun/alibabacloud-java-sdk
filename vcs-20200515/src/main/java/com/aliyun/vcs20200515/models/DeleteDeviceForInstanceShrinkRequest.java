// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDeviceForInstanceShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Devices")
    public String devicesShrink;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("DeleteInstanceFlag")
    public Boolean deleteInstanceFlag;

    @NameInMap("DeviceCount")
    public String deviceCount;

    public static DeleteDeviceForInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceForInstanceShrinkRequest self = new DeleteDeviceForInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceForInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDeviceForInstanceShrinkRequest setDevicesShrink(String devicesShrink) {
        this.devicesShrink = devicesShrink;
        return this;
    }
    public String getDevicesShrink() {
        return this.devicesShrink;
    }

    public DeleteDeviceForInstanceShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteDeviceForInstanceShrinkRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public DeleteDeviceForInstanceShrinkRequest setDeleteInstanceFlag(Boolean deleteInstanceFlag) {
        this.deleteInstanceFlag = deleteInstanceFlag;
        return this;
    }
    public Boolean getDeleteInstanceFlag() {
        return this.deleteInstanceFlag;
    }

    public DeleteDeviceForInstanceShrinkRequest setDeviceCount(String deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }
    public String getDeviceCount() {
        return this.deviceCount;
    }

}
