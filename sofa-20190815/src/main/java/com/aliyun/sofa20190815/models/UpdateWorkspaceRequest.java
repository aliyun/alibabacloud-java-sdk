// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRequest extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("Region")
    public String region;

    @NameInMap("ZonesRepeatList")
    public java.util.List<String> zonesRepeatList;

    public static UpdateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceRequest self = new UpdateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateWorkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWorkspaceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public UpdateWorkspaceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateWorkspaceRequest setZonesRepeatList(java.util.List<String> zonesRepeatList) {
        this.zonesRepeatList = zonesRepeatList;
        return this;
    }
    public java.util.List<String> getZonesRepeatList() {
        return this.zonesRepeatList;
    }

}
