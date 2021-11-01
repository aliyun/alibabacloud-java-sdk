// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class Project extends TeaModel {
    // 搭配词
    @NameInMap("assKeywords")
    public String assKeywords;

    // 项目的默认过滤模板ID
    @NameInMap("defaultFilterId")
    public Long defaultFilterId;

    // 高级用法，非关键词配置，如at用户，标题排除词。
    @NameInMap("extCriteria")
    public String extCriteria;

    // 项目创建时间，毫秒
    @NameInMap("gmtCreateTimestamp")
    public Long gmtCreateTimestamp;

    // 项目修改时间，毫秒
    @NameInMap("gmtModifiedTimestamp")
    public Long gmtModifiedTimestamp;

    // 舆情项目ID
    @NameInMap("id")
    public Long id;

    // 项目名称
    @NameInMap("name")
    public String name;

    // 排除词
    @NameInMap("negKeywords")
    public String negKeywords;

    // 项目父ID，如果没有父项目则为0
    @NameInMap("pid")
    public Long pid;

    // 项目关键词
    @NameInMap("posKeywords")
    public String posKeywords;

    // 项目归属分组ID，0代表没有分组
    @NameInMap("projectGroupId")
    public Long projectGroupId;

    // 0:通用舆情项目，1：金融舆情项目
    @NameInMap("projectType")
    public Long projectType;

    // 舆情项目类型名称
    @NameInMap("projectTypeName")
    public String projectTypeName;

    // 项目的子项目ID列表
    @NameInMap("subProjectIds")
    public java.util.List<Long> subProjectIds;

    // 团队id
    @NameInMap("teamId")
    public Long teamId;

    // 项目创建人uid
    @NameInMap("uidCreate")
    public String uidCreate;

    // 项目修改人uid
    @NameInMap("uidModified")
    public String uidModified;

    // 项目创建人名称
    @NameInMap("unameCreate")
    public String unameCreate;

    // 项目修改人名称
    @NameInMap("unameModified")
    public String unameModified;

    // 状态，1为生效，0为失效。
    @NameInMap("valid")
    public Long valid;

    public static Project build(java.util.Map<String, ?> map) throws Exception {
        Project self = new Project();
        return TeaModel.build(map, self);
    }

    public Project setAssKeywords(String assKeywords) {
        this.assKeywords = assKeywords;
        return this;
    }
    public String getAssKeywords() {
        return this.assKeywords;
    }

    public Project setDefaultFilterId(Long defaultFilterId) {
        this.defaultFilterId = defaultFilterId;
        return this;
    }
    public Long getDefaultFilterId() {
        return this.defaultFilterId;
    }

    public Project setExtCriteria(String extCriteria) {
        this.extCriteria = extCriteria;
        return this;
    }
    public String getExtCriteria() {
        return this.extCriteria;
    }

    public Project setGmtCreateTimestamp(Long gmtCreateTimestamp) {
        this.gmtCreateTimestamp = gmtCreateTimestamp;
        return this;
    }
    public Long getGmtCreateTimestamp() {
        return this.gmtCreateTimestamp;
    }

    public Project setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
        this.gmtModifiedTimestamp = gmtModifiedTimestamp;
        return this;
    }
    public Long getGmtModifiedTimestamp() {
        return this.gmtModifiedTimestamp;
    }

    public Project setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Project setNegKeywords(String negKeywords) {
        this.negKeywords = negKeywords;
        return this;
    }
    public String getNegKeywords() {
        return this.negKeywords;
    }

    public Project setPid(Long pid) {
        this.pid = pid;
        return this;
    }
    public Long getPid() {
        return this.pid;
    }

    public Project setPosKeywords(String posKeywords) {
        this.posKeywords = posKeywords;
        return this;
    }
    public String getPosKeywords() {
        return this.posKeywords;
    }

    public Project setProjectGroupId(Long projectGroupId) {
        this.projectGroupId = projectGroupId;
        return this;
    }
    public Long getProjectGroupId() {
        return this.projectGroupId;
    }

    public Project setProjectType(Long projectType) {
        this.projectType = projectType;
        return this;
    }
    public Long getProjectType() {
        return this.projectType;
    }

    public Project setProjectTypeName(String projectTypeName) {
        this.projectTypeName = projectTypeName;
        return this;
    }
    public String getProjectTypeName() {
        return this.projectTypeName;
    }

    public Project setSubProjectIds(java.util.List<Long> subProjectIds) {
        this.subProjectIds = subProjectIds;
        return this;
    }
    public java.util.List<Long> getSubProjectIds() {
        return this.subProjectIds;
    }

    public Project setTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    public Long getTeamId() {
        return this.teamId;
    }

    public Project setUidCreate(String uidCreate) {
        this.uidCreate = uidCreate;
        return this;
    }
    public String getUidCreate() {
        return this.uidCreate;
    }

    public Project setUidModified(String uidModified) {
        this.uidModified = uidModified;
        return this;
    }
    public String getUidModified() {
        return this.uidModified;
    }

    public Project setUnameCreate(String unameCreate) {
        this.unameCreate = unameCreate;
        return this;
    }
    public String getUnameCreate() {
        return this.unameCreate;
    }

    public Project setUnameModified(String unameModified) {
        this.unameModified = unameModified;
        return this;
    }
    public String getUnameModified() {
        return this.unameModified;
    }

    public Project setValid(Long valid) {
        this.valid = valid;
        return this;
    }
    public Long getValid() {
        return this.valid;
    }

}
