// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class BizTagTree extends TeaModel {
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

    @NameInMap("status")
    public Long status;

    @NameInMap("tagIdPath")
    public String tagIdPath;

    @NameInMap("tagNamePath")
    public String tagNamePath;

    @NameInMap("uidCreate")
    public String uidCreate;

    @NameInMap("uidModified")
    public String uidModified;

    @NameInMap("unameCreate")
    public String unameCreate;

    @NameInMap("unameModified")
    public String unameModified;

    public static BizTagTree build(java.util.Map<String, ?> map) throws Exception {
        BizTagTree self = new BizTagTree();
        return TeaModel.build(map, self);
    }

    public BizTagTree setGmtCreateTimestamp(Long gmtCreateTimestamp) {
        this.gmtCreateTimestamp = gmtCreateTimestamp;
        return this;
    }
    public Long getGmtCreateTimestamp() {
        return this.gmtCreateTimestamp;
    }

    public BizTagTree setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
        this.gmtModifiedTimestamp = gmtModifiedTimestamp;
        return this;
    }
    public Long getGmtModifiedTimestamp() {
        return this.gmtModifiedTimestamp;
    }

    public BizTagTree setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public BizTagTree setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BizTagTree setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public BizTagTree setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public BizTagTree setTagIdPath(String tagIdPath) {
        this.tagIdPath = tagIdPath;
        return this;
    }
    public String getTagIdPath() {
        return this.tagIdPath;
    }

    public BizTagTree setTagNamePath(String tagNamePath) {
        this.tagNamePath = tagNamePath;
        return this;
    }
    public String getTagNamePath() {
        return this.tagNamePath;
    }

    public BizTagTree setUidCreate(String uidCreate) {
        this.uidCreate = uidCreate;
        return this;
    }
    public String getUidCreate() {
        return this.uidCreate;
    }

    public BizTagTree setUidModified(String uidModified) {
        this.uidModified = uidModified;
        return this;
    }
    public String getUidModified() {
        return this.uidModified;
    }

    public BizTagTree setUnameCreate(String unameCreate) {
        this.unameCreate = unameCreate;
        return this;
    }
    public String getUnameCreate() {
        return this.unameCreate;
    }

    public BizTagTree setUnameModified(String unameModified) {
        this.unameModified = unameModified;
        return this;
    }
    public String getUnameModified() {
        return this.unameModified;
    }

}
