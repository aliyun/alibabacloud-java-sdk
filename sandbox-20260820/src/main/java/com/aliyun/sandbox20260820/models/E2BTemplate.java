// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class E2BTemplate extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ready</p>
     */
    @NameInMap("buildStatus")
    public String buildStatus;

    /**
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("category")
    public String category;

    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpuCount")
    public Integer cpuCount;

    /**
     * <strong>example:</strong>
     * <p>2026-08-20T08:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memoryMB")
    public Integer memoryMB;

    @NameInMap("names")
    public java.util.List<String> names;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    @NameInMap("public")
    public Boolean _public;

    /**
     * <strong>example:</strong>
     * <p>rg-****</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <strong>example:</strong>
     * <p>拉取源镜像失败：认证信息无效</p>
     */
    @NameInMap("statusReason")
    public String statusReason;

    @NameInMap("tags")
    public java.util.List<E2BTemplateTag> tags;

    /**
     * <strong>example:</strong>
     * <p>5f4a2c18-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <strong>example:</strong>
     * <p>sandbox-dev</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <strong>example:</strong>
     * <p>std</p>
     */
    @NameInMap("teamPlan")
    public String teamPlan;

    /**
     * <strong>example:</strong>
     * <p>tm-8f3a2c7b5e14d806</p>
     */
    @NameInMap("templateID")
    public String templateID;

    /**
     * <strong>example:</strong>
     * <p>2026-08-21T09:15:30Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <strong>example:</strong>
     * <p>9c1d4e72-****</p>
     */
    @NameInMap("userID")
    public String userID;

    public static E2BTemplate build(java.util.Map<String, ?> map) throws Exception {
        E2BTemplate self = new E2BTemplate();
        return TeaModel.build(map, self);
    }

    public E2BTemplate setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
        return this;
    }
    public String getBuildStatus() {
        return this.buildStatus;
    }

    public E2BTemplate setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public E2BTemplate setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public E2BTemplate setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public E2BTemplate setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public E2BTemplate setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public E2BTemplate setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    public E2BTemplate setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public E2BTemplate setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public E2BTemplate set_public(Boolean _public) {
        this._public = _public;
        return this;
    }
    public Boolean get_public() {
        return this._public;
    }

    public E2BTemplate setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public E2BTemplate setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public E2BTemplate setTags(java.util.List<E2BTemplateTag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<E2BTemplateTag> getTags() {
        return this.tags;
    }

    public E2BTemplate setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public E2BTemplate setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public E2BTemplate setTeamPlan(String teamPlan) {
        this.teamPlan = teamPlan;
        return this;
    }
    public String getTeamPlan() {
        return this.teamPlan;
    }

    public E2BTemplate setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public E2BTemplate setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public E2BTemplate setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

}
