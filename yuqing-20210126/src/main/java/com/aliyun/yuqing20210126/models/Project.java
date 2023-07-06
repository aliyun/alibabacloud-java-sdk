// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class Project extends TeaModel {
    @NameInMap("assKeywords")
    public String assKeywords;

    @NameInMap("defaultFilterId")
    public Long defaultFilterId;

    @NameInMap("extCriteria")
    public String extCriteria;

    @NameInMap("gmtCreateTimestamp")
    public Long gmtCreateTimestamp;

    @NameInMap("gmtModifiedTimestamp")
    public Long gmtModifiedTimestamp;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("negKeywords")
    public String negKeywords;

    @NameInMap("pid")
    public Long pid;

    @NameInMap("posKeywords")
    public String posKeywords;

    @NameInMap("projectGroupId")
    public Long projectGroupId;

    @NameInMap("projectType")
    public Long projectType;

    @NameInMap("projectTypeName")
    public String projectTypeName;

    @NameInMap("subProjectIds")
    public java.util.List<Long> subProjectIds;

    @NameInMap("teamId")
    public Long teamId;

    @NameInMap("uidCreate")
    public String uidCreate;

    @NameInMap("uidModified")
    public String uidModified;

    @NameInMap("unameCreate")
    public String unameCreate;

    @NameInMap("unameModified")
    public String unameModified;

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
