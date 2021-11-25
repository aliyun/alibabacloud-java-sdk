// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDeviceForInstanceRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("DeleteInstanceFlag")
    public Boolean deleteInstanceFlag;

    @NameInMap("DeviceCount")
    public String deviceCount;

    @NameInMap("Devices")
    public java.util.List<DeleteDeviceForInstanceRequestDevices> devices;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteDeviceForInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceForInstanceRequest self = new DeleteDeviceForInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceForInstanceRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public DeleteDeviceForInstanceRequest setDeleteInstanceFlag(Boolean deleteInstanceFlag) {
        this.deleteInstanceFlag = deleteInstanceFlag;
        return this;
    }
    public Boolean getDeleteInstanceFlag() {
        return this.deleteInstanceFlag;
    }

    public DeleteDeviceForInstanceRequest setDeviceCount(String deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }
    public String getDeviceCount() {
        return this.deviceCount;
    }

    public DeleteDeviceForInstanceRequest setDevices(java.util.List<DeleteDeviceForInstanceRequestDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<DeleteDeviceForInstanceRequestDevices> getDevices() {
        return this.devices;
    }

    public DeleteDeviceForInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDeviceForInstanceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public static class DeleteDeviceForInstanceRequestDevices extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("RegionId")
        public String regionId;

        public static DeleteDeviceForInstanceRequestDevices build(java.util.Map<String, ?> map) throws Exception {
            DeleteDeviceForInstanceRequestDevices self = new DeleteDeviceForInstanceRequestDevices();
            return TeaModel.build(map, self);
        }

        public DeleteDeviceForInstanceRequestDevices setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DeleteDeviceForInstanceRequestDevices setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
