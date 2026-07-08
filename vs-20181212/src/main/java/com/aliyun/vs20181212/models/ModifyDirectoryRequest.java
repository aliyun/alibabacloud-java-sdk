// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDirectoryRequest extends TeaModel {
    /**
     * <p>The description of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>目录2</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>399*****488-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>目录2</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static ModifyDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDirectoryRequest self = new ModifyDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDirectoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDirectoryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyDirectoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyDirectoryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
