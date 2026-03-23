// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Project extends TeaModel {
    /**
     * <p>创建Project的时间。</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-07 14:08:09</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>数据冗余类型</p>
     * 
     * <strong>example:</strong>
     * <p>LRS</p>
     */
    @NameInMap("dataRedundancyType")
    public String dataRedundancyType;

    /**
     * <p>Project描述信息。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Description of my-project</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>最后一次更新Project时间。</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-18 13:30:19</p>
     */
    @NameInMap("lastModifyTime")
    public String lastModifyTime;

    /**
     * <p>Project所属得阿里云账号。</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>Project名称，作为Host的一部分。Project名称在阿里云地域内全局唯一，创建后不可修改。</p>
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
     * <p>是否打开回收站</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("recycleBinEnabled")
    public Boolean recycleBinEnabled;

    /**
     * <p>Project所属地域。</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>Project所属的资源组ID。</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acf******sq</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Project状态。</p>
     * <ul>
     * <li>Normal：正常</li>
     * <li>Disable：禁用</li>
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
