// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupRequest extends TeaModel {
    @NameInMap("currentVersion")
    public String currentVersion;

    @NameInMap("description")
    public String description;

    @NameInMap("domain")
    public String domain;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static ModifyAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppGroupRequest self = new ModifyAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppGroupRequest setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public String getCurrentVersion() {
        return this.currentVersion;
    }

    public ModifyAppGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAppGroupRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyAppGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyAppGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
