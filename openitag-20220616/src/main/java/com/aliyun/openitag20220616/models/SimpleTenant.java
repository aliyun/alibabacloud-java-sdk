// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SimpleTenant extends TeaModel {
    /**
     * <p>Creator</p>
     */
    @NameInMap("Creator")
    public SimpleUser creator;

    /**
     * <p>Description</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个测试租户</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Creation Time</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-07 16:09:20</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Updated At</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-07 16:09:20</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Updated By Information</p>
     */
    @NameInMap("Modifier")
    public SimpleUser modifier;

    /**
     * <p>Role Information</p>
     * 
     * <strong>example:</strong>
     * <p>ADMIN</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>Tenant ID</p>
     * 
     * <strong>example:</strong>
     * <p>GA***W134</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>Tenant Name</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("TenantName")
    public String tenantName;

    /**
     * <p>Unique Identifier</p>
     * 
     * <strong>example:</strong>
     * <p>paiworkspace-0001</p>
     */
    @NameInMap("UUID")
    public String UUID;

    public static SimpleTenant build(java.util.Map<String, ?> map) throws Exception {
        SimpleTenant self = new SimpleTenant();
        return TeaModel.build(map, self);
    }

    public SimpleTenant setCreator(SimpleUser creator) {
        this.creator = creator;
        return this;
    }
    public SimpleUser getCreator() {
        return this.creator;
    }

    public SimpleTenant setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SimpleTenant setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public SimpleTenant setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public SimpleTenant setModifier(SimpleUser modifier) {
        this.modifier = modifier;
        return this;
    }
    public SimpleUser getModifier() {
        return this.modifier;
    }

    public SimpleTenant setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public SimpleTenant setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SimpleTenant setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public SimpleTenant setUUID(String UUID) {
        this.UUID = UUID;
        return this;
    }
    public String getUUID() {
        return this.UUID;
    }

}
