// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateGroupDirectoryRequest extends TeaModel {
    /**
     * <p>The new description. If this parameter is set to an empty string, the description is cleared. If this parameter is omitted or set to null, the description remains unchanged. At least one of name or description must be non-null.</p>
     * 
     * <strong>example:</strong>
     * <p>Project description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the physical subfolder in the current space. The internal root folder and reference folders are not allowed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The ID of the collaborative share.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The new name. If this parameter is omitted or set to null, the name remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>Project Materials</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateGroupDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDirectoryRequest self = new UpdateGroupDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDirectoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGroupDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateGroupDirectoryRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateGroupDirectoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGroupDirectoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
