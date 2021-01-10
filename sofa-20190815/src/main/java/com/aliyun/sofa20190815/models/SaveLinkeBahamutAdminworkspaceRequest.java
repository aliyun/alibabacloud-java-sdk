// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutAdminworkspaceRequest extends TeaModel {
    @NameInMap("AccessSecret")
    public String accessSecret;

    @NameInMap("BahamutAccessKey")
    public String bahamutAccessKey;

    @NameInMap("CloudTenant")
    public String cloudTenant;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Created")
    public Long created;

    @NameInMap("CrossCloud")
    public Boolean crossCloud;

    @NameInMap("CustomerId")
    public String customerId;

    @NameInMap("DefaultUse")
    public Boolean defaultUse;

    @NameInMap("Deleted")
    public Boolean deleted;

    @NameInMap("EnvId")
    public String envId;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    @NameInMap("Id")
    public String id;

    @NameInMap("LastModified")
    public Long lastModified;

    @NameInMap("LinkETenant")
    public String linkETenant;

    @NameInMap("Modifier")
    public String modifier;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Type")
    public String type;

    @NameInMap("Use")
    public String use;

    @NameInMap("WorkspaceGroupId")
    public String workspaceGroupId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static SaveLinkeBahamutAdminworkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutAdminworkspaceRequest self = new SaveLinkeBahamutAdminworkspaceRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutAdminworkspaceRequest setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setBahamutAccessKey(String bahamutAccessKey) {
        this.bahamutAccessKey = bahamutAccessKey;
        return this;
    }
    public String getBahamutAccessKey() {
        return this.bahamutAccessKey;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setCloudTenant(String cloudTenant) {
        this.cloudTenant = cloudTenant;
        return this;
    }
    public String getCloudTenant() {
        return this.cloudTenant;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setCreated(Long created) {
        this.created = created;
        return this;
    }
    public Long getCreated() {
        return this.created;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setCrossCloud(Boolean crossCloud) {
        this.crossCloud = crossCloud;
        return this;
    }
    public Boolean getCrossCloud() {
        return this.crossCloud;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setDefaultUse(Boolean defaultUse) {
        this.defaultUse = defaultUse;
        return this;
    }
    public Boolean getDefaultUse() {
        return this.defaultUse;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public Long getLastModified() {
        return this.lastModified;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setLinkETenant(String linkETenant) {
        this.linkETenant = linkETenant;
        return this;
    }
    public String getLinkETenant() {
        return this.linkETenant;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setUse(String use) {
        this.use = use;
        return this;
    }
    public String getUse() {
        return this.use;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SaveLinkeBahamutAdminworkspaceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
