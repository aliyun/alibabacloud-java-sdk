// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDirectoryRequest extends TeaModel {
    /**
     * <p>Folder description.</p>
     * 
     * <strong>example:</strong>
     * <p>目录1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Space ID to which the folder belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****174-cn-qingdao</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Folder name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>目录1</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Parent folder ID.</p>
     * <blockquote>
     * <p>When you create a device space, the system automatically creates a root directory for that space. Use the <a href="https://next.api.aliyun.com/document/vs/2018-12-12/DescribeDirectories">DescribeDirectories</a> API to query the corresponding root directory.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>399*****774-cn-qingdao</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    public static CreateDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDirectoryRequest self = new CreateDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateDirectoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDirectoryRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateDirectoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDirectoryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDirectoryRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

}
