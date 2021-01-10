// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("FromDevStage")
    public String fromDevStage;

    @NameInMap("FromEnv")
    public String fromEnv;

    @NameInMap("IsPublic")
    public Boolean isPublic;

    @NameInMap("OriginAppName")
    public String originAppName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("ToDevStage")
    public String toDevStage;

    @NameInMap("ToEnv")
    public String toEnv;

    public static SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest self = new SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest();
        return TeaModel.build(map, self);
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest setFromDevStage(String fromDevStage) {
        this.fromDevStage = fromDevStage;
        return this;
    }
    public String getFromDevStage() {
        return this.fromDevStage;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest setFromEnv(String fromEnv) {
        this.fromEnv = fromEnv;
        return this;
    }
    public String getFromEnv() {
        return this.fromEnv;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest setOriginAppName(String originAppName) {
        this.originAppName = originAppName;
        return this;
    }
    public String getOriginAppName() {
        return this.originAppName;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest setToDevStage(String toDevStage) {
        this.toDevStage = toDevStage;
        return this;
    }
    public String getToDevStage() {
        return this.toDevStage;
    }

    public SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest setToEnv(String toEnv) {
        this.toEnv = toEnv;
        return this;
    }
    public String getToEnv() {
        return this.toEnv;
    }

}
