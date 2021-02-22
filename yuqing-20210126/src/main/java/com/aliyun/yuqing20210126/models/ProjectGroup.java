// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class ProjectGroup extends TeaModel {
    // 项目分组创建时间
    @NameInMap("gmtCreateTimestamp")
    public Long gmtCreateTimestamp;

    // 项目分组修改时间
    @NameInMap("gmtModifiedTimestamp")
    public Long gmtModifiedTimestamp;

    // 项目分组id，唯一标识项目分组
    @NameInMap("id")
    public Long id;

    // 项目分组名称
    @NameInMap("name")
    public String name;

    // 父项目分组id，0为默认值，表示无父项目分组
    @NameInMap("parentId")
    public Long parentId;

    // 项目分组类型，0表示通用舆情，2表示金融舆情
    @NameInMap("projectGroupType")
    public Long projectGroupType;

    // 项目创建人uid
    @NameInMap("uidCreate")
    public String uidCreate;

    // 项目分组创建人名称
    @NameInMap("unameCreate")
    public String unameCreate;

    // 是否有效，1表示有效，0表示无效
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
