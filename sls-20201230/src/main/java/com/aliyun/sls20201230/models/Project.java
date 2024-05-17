// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Project extends TeaModel {
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("dataRedundancyType")
    public String dataRedundancyType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("lastModifyTime")
    public String lastModifyTime;

    @NameInMap("owner")
    public String owner;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("projectName")
    public String projectName;

    @NameInMap("quota")
    public java.util.Map<String, ?> quota;

    @NameInMap("region")
    public String region;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("status")
    public String status;

    public static Project build(java.util.Map<String, ?> map) throws Exception {
        Project self = new Project();
        return TeaModel.build(map, self);
    }

    public Project setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Project setDataRedundancyType(String dataRedundancyType) {
        this.dataRedundancyType = dataRedundancyType;
        return this;
    }
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    public Project setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Project setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public String getLastModifyTime() {
        return this.lastModifyTime;
    }

    public Project setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public Project setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public Project setQuota(java.util.Map<String, ?> quota) {
        this.quota = quota;
        return this;
    }
    public java.util.Map<String, ?> getQuota() {
        return this.quota;
    }

    public Project setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public Project setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public Project setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
