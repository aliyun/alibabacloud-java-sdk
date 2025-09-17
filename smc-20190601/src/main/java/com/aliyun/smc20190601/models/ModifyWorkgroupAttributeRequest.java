// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ModifyWorkgroupAttributeRequest extends TeaModel {
    /**
     * <p>The new description of the workgroup. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the workgroup. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be unique.</li>
     * <li>The name must be 2 to 64 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), periods (.), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testMigrationTaskName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the workgroup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>w-***</p>
     */
    @NameInMap("WorkgroupId")
    public String workgroupId;

    public static ModifyWorkgroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWorkgroupAttributeRequest self = new ModifyWorkgroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWorkgroupAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyWorkgroupAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyWorkgroupAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyWorkgroupAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyWorkgroupAttributeRequest setWorkgroupId(String workgroupId) {
        this.workgroupId = workgroupId;
        return this;
    }
    public String getWorkgroupId() {
        return this.workgroupId;
    }

}
