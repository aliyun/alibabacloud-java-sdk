// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Folder extends TeaModel {
    /**
     * <p>The time when the folder was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1723537978</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The ID of the folder.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-0000-0000-0000012312****</p>
     */
    @NameInMap("folderId")
    public String folderId;

    /**
     * <p>The time when the folder was modified.</p>
     * 
     * <strong>example:</strong>
     * <p>1723537978</p>
     */
    @NameInMap("modifiedAt")
    public Long modifiedAt;

    /**
     * <p>The name of the folder.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default-namespace</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The ID of the parent folder.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-0000-0000-0000012390****</p>
     */
    @NameInMap("parentId")
    public String parentId;

    /**
     * <p>The list of subfolders.</p>
     */
    @NameInMap("subFolder")
    public java.util.List<SubFolder> subFolder;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>edcef******b4f</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static Folder build(java.util.Map<String, ?> map) throws Exception {
        Folder self = new Folder();
        return TeaModel.build(map, self);
    }

    public Folder setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Folder setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public Folder setModifiedAt(Long modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public Long getModifiedAt() {
        return this.modifiedAt;
    }

    public Folder setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Folder setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Folder setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public Folder setSubFolder(java.util.List<SubFolder> subFolder) {
        this.subFolder = subFolder;
        return this;
    }
    public java.util.List<SubFolder> getSubFolder() {
        return this.subFolder;
    }

    public Folder setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
