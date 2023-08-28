// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class View extends TeaModel {
    @NameInMap("category")
    public String category;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("description")
    public String description;

    @NameInMap("ex_fields_info")
    public java.util.Map<String, ?> exFieldsInfo;

    @NameInMap("file_count")
    public Long fileCount;

    @NameInMap("name")
    public String name;

    @NameInMap("owner")
    public String owner;

    @NameInMap("updated_at")
    public String updatedAt;

    @NameInMap("view_id")
    public String viewId;

    public static View build(java.util.Map<String, ?> map) throws Exception {
        View self = new View();
        return TeaModel.build(map, self);
    }

    public View setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public View setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public View setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public View setExFieldsInfo(java.util.Map<String, ?> exFieldsInfo) {
        this.exFieldsInfo = exFieldsInfo;
        return this;
    }
    public java.util.Map<String, ?> getExFieldsInfo() {
        return this.exFieldsInfo;
    }

    public View setFileCount(Long fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public Long getFileCount() {
        return this.fileCount;
    }

    public View setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public View setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public View setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public View setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

}
