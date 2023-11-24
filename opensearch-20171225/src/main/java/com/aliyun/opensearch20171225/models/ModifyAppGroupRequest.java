// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupRequest extends TeaModel {
    /**
     * <p>The online version of the application.</p>
     */
    @NameInMap("currentVersion")
    public String currentVersion;

    /**
     * <p>The description of the application.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The type of the industry. Valid values:</p>
     * <br>
     * <p>*   general: general.</p>
     * <p>*   ecommerce: e-commerce.</p>
     * <p>*   education: education.</p>
     * <p>*   esports: electronic sports.</p>
     * <p>*   community: content community.</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to verify the application before modification. Valid values: true and false.</p>
     */
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
