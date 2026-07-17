// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupRequest extends TeaModel {
    /**
     * <p>The online version of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>1223232</p>
     */
    @NameInMap("currentVersion")
    public String currentVersion;

    /**
     * <p>The description of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot; instance description&quot;</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The industry. Valid values:</p>
     * <ul>
     * <li><p>general: general.</p>
     * </li>
     * <li><p>ecommerce: e-commerce.</p>
     * </li>
     * <li><p>education: education.</p>
     * </li>
     * <li><p>esports: gaming.</p>
     * </li>
     * <li><p>community: content community.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;ecommerce&quot;</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-****</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
