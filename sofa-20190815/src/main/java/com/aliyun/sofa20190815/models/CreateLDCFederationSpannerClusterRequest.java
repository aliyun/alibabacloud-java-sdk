// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFederationSpannerClusterRequest extends TeaModel {
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("Cpu")
    public String cpu;

    @NameInMap("Disk")
    public String disk;

    @NameInMap("HostNetwork")
    public Boolean hostNetwork;

    @NameInMap("Mem")
    public String mem;

    @NameInMap("Name")
    public String name;

    @NameInMap("State")
    public String state;

    @NameInMap("SubClustersConfig")
    public String subClustersConfig;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static CreateLDCFederationSpannerClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFederationSpannerClusterRequest self = new CreateLDCFederationSpannerClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDCFederationSpannerClusterRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public CreateLDCFederationSpannerClusterRequest setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public CreateLDCFederationSpannerClusterRequest setDisk(String disk) {
        this.disk = disk;
        return this;
    }
    public String getDisk() {
        return this.disk;
    }

    public CreateLDCFederationSpannerClusterRequest setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    public CreateLDCFederationSpannerClusterRequest setMem(String mem) {
        this.mem = mem;
        return this;
    }
    public String getMem() {
        return this.mem;
    }

    public CreateLDCFederationSpannerClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLDCFederationSpannerClusterRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateLDCFederationSpannerClusterRequest setSubClustersConfig(String subClustersConfig) {
        this.subClustersConfig = subClustersConfig;
        return this;
    }
    public String getSubClustersConfig() {
        return this.subClustersConfig;
    }

    public CreateLDCFederationSpannerClusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
