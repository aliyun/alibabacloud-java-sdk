// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class ProjectGroup extends TeaModel {
    @NameInMap("gmtCreateTimestamp")
    public Long gmtCreateTimestamp;

    @NameInMap("gmtModifiedTimestamp")
    public Long gmtModifiedTimestamp;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("parentId")
    public Long parentId;

    @NameInMap("projectGroupType")
    public Long projectGroupType;

    @NameInMap("uidCreate")
    public String uidCreate;

    @NameInMap("unameCreate")
    public String unameCreate;

    @NameInMap("valid")
    public Long valid;

    public static ProjectGroup build(java.util.Map<String, ?> map) throws Exception {
        ProjectGroup self = new ProjectGroup();
        return TeaModel.build(map, self);
    }

    public ProjectGroup setGmtCreateTimestamp(Long gmtCreateTimestamp) {
        this.gmtCreateTimestamp = gmtCreateTimestamp;
        return this;
    }
    public Long getGmtCreateTimestamp() {
        return this.gmtCreateTimestamp;
    }

    public ProjectGroup setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
        this.gmtModifiedTimestamp = gmtModifiedTimestamp;
        return this;
    }
    public Long getGmtModifiedTimestamp() {
        return this.gmtModifiedTimestamp;
    }

    public ProjectGroup setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ProjectGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ProjectGroup setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public ProjectGroup setProjectGroupType(Long projectGroupType) {
        this.projectGroupType = projectGroupType;
        return this;
    }
    public Long getProjectGroupType() {
        return this.projectGroupType;
    }

    public ProjectGroup setUidCreate(String uidCreate) {
        this.uidCreate = uidCreate;
        return this;
    }
    public String getUidCreate() {
        return this.uidCreate;
    }

    public ProjectGroup setUnameCreate(String unameCreate) {
        this.unameCreate = unameCreate;
        return this;
    }
    public String getUnameCreate() {
        return this.unameCreate;
    }

    public ProjectGroup setValid(Long valid) {
        this.valid = valid;
        return this;
    }
    public Long getValid() {
        return this.valid;
    }

}
