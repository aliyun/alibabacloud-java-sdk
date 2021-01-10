// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSMeshWorkspaceRequest extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("Zones")
    public String zones;

    public static CreateAKSMeshWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSMeshWorkspaceRequest self = new CreateAKSMeshWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSMeshWorkspaceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAKSMeshWorkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAKSMeshWorkspaceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateAKSMeshWorkspaceRequest setZones(String zones) {
        this.zones = zones;
        return this;
    }
    public String getZones() {
        return this.zones;
    }

}
