// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationSpannerClusterRequest extends TeaModel {
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("ClusterName")
    public String clusterName;

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

    public static UpdateLDCFederationSpannerClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationSpannerClusterRequest self = new UpdateLDCFederationSpannerClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationSpannerClusterRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public UpdateLDCFederationSpannerClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateLDCFederationSpannerClusterRequest setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public UpdateLDCFederationSpannerClusterRequest setDisk(String disk) {
        this.disk = disk;
        return this;
    }
    public String getDisk() {
        return this.disk;
    }

    public UpdateLDCFederationSpannerClusterRequest setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    public UpdateLDCFederationSpannerClusterRequest setMem(String mem) {
        this.mem = mem;
        return this;
    }
    public String getMem() {
        return this.mem;
    }

    public UpdateLDCFederationSpannerClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLDCFederationSpannerClusterRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateLDCFederationSpannerClusterRequest setSubClustersConfig(String subClustersConfig) {
        this.subClustersConfig = subClustersConfig;
        return this;
    }
    public String getSubClustersConfig() {
        return this.subClustersConfig;
    }

    public UpdateLDCFederationSpannerClusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
