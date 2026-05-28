// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Project extends TeaModel {
    /**
     * <p>The time at which the project was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-07 14:08:09</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The data redundancy type.</p>
     * 
     * <strong>example:</strong>
     * <p>LRS</p>
     */
    @NameInMap("dataRedundancyType")
    public String dataRedundancyType;

    /**
     * <p>The description of the project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Description of my-project</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The time at which the project was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-18 13:30:19</p>
     */
    @NameInMap("lastModifyTime")
    public String lastModifyTime;

    /**
     * <p>The ID of the Alibaba Cloud account that is used to create the project.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The name of the project. The name is included in the value of the Host header. The name must be unique in a region. You cannot change the name after the project is created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-test-project</p>
     */
    @NameInMap("projectName")
    public String projectName;

    /**
     * <p>project quota</p>
     */
    @NameInMap("quota")
    public java.util.Map<String, ?> quota;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("recycleBinEnabled")
    public Boolean recycleBinEnabled;

    /**
     * <p>The region to which the project belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The ID of the resource group to which the project belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acf******sq</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the project. Valid values:</p>
     * <ul>
     * <li>Normal</li>
     * <li>Disable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
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

    public Project setRecycleBinEnabled(Boolean recycleBinEnabled) {
        this.recycleBinEnabled = recycleBinEnabled;
        return this;
    }
    public Boolean getRecycleBinEnabled() {
        return this.recycleBinEnabled;
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
