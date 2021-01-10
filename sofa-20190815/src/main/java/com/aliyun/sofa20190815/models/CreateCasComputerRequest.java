// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasComputerRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppServiceId")
    public String appServiceId;

    @NameInMap("CellId")
    public String cellId;

    @NameInMap("CommonImageSequence")
    public String commonImageSequence;

    @NameInMap("Description")
    public String description;

    @NameInMap("ImageSequence")
    public String imageSequence;

    @NameInMap("InstanceCount")
    public Long instanceCount;

    @NameInMap("Name")
    public String name;

    @NameInMap("Password")
    public String password;

    @NameInMap("SecurityGroupSequence")
    public String securityGroupSequence;

    @NameInMap("SpecId")
    public String specId;

    @NameInMap("SystemDiskSize")
    public Long systemDiskSize;

    @NameInMap("SystemDiskType")
    public String systemDiskType;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("Zone")
    public String zone;

    @NameInMap("DataDisks")
    public java.util.List<CreateCasComputerRequestDataDisks> dataDisks;

    public static CreateCasComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCasComputerRequest self = new CreateCasComputerRequest();
        return TeaModel.build(map, self);
    }

    public CreateCasComputerRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateCasComputerRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public CreateCasComputerRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public CreateCasComputerRequest setCommonImageSequence(String commonImageSequence) {
        this.commonImageSequence = commonImageSequence;
        return this;
    }
    public String getCommonImageSequence() {
        return this.commonImageSequence;
    }

    public CreateCasComputerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCasComputerRequest setImageSequence(String imageSequence) {
        this.imageSequence = imageSequence;
        return this;
    }
    public String getImageSequence() {
        return this.imageSequence;
    }

    public CreateCasComputerRequest setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    public CreateCasComputerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCasComputerRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateCasComputerRequest setSecurityGroupSequence(String securityGroupSequence) {
        this.securityGroupSequence = securityGroupSequence;
        return this;
    }
    public String getSecurityGroupSequence() {
        return this.securityGroupSequence;
    }

    public CreateCasComputerRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

    public CreateCasComputerRequest setSystemDiskSize(Long systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Long getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateCasComputerRequest setSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    public CreateCasComputerRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateCasComputerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateCasComputerRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public CreateCasComputerRequest setDataDisks(java.util.List<CreateCasComputerRequestDataDisks> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<CreateCasComputerRequestDataDisks> getDataDisks() {
        return this.dataDisks;
    }

    public static class CreateCasComputerRequestDataDisks extends TeaModel {
        @NameInMap("SnapshotSequence")
        public String snapshotSequence;

        @NameInMap("Device")
        public String device;

        @NameInMap("Size")
        public Long size;

        @NameInMap("SpecId")
        public String specId;

        public static CreateCasComputerRequestDataDisks build(java.util.Map<String, ?> map) throws Exception {
            CreateCasComputerRequestDataDisks self = new CreateCasComputerRequestDataDisks();
            return TeaModel.build(map, self);
        }

        public CreateCasComputerRequestDataDisks setSnapshotSequence(String snapshotSequence) {
            this.snapshotSequence = snapshotSequence;
            return this;
        }
        public String getSnapshotSequence() {
            return this.snapshotSequence;
        }

        public CreateCasComputerRequestDataDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateCasComputerRequestDataDisks setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public CreateCasComputerRequestDataDisks setSpecId(String specId) {
            this.specId = specId;
            return this;
        }
        public String getSpecId() {
            return this.specId;
        }

    }

}
