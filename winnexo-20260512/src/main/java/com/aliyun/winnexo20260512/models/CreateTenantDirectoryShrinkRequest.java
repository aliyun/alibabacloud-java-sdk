// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateTenantDirectoryShrinkRequest extends TeaModel {
    /**
     * <p>The platform application credential. Pass this parameter when you use the application proxy mode, and specify the operator by using opsUserId or opsUserCode based on the application configuration. Do not use real credentials in logs or public examples.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>Specifies whether to generate AI version summaries for subsequent content updates. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.
     * If this parameter is omitted or set to null, the configuration is not changed. Disabling this feature does not delete existing summaries. This parameter is supported only for standard enterprise knowledge base root directories.</li>
     * </ul>
     */
    @NameInMap("changeRecordEnabled")
    public Boolean changeRecordEnabled;

    /**
     * <p>The purpose or content description of the directory. If this parameter is omitted, the value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Team product materials and operation guides</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the directory. The name must be 1 to 256 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Product knowledge base</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The digital employee association mode. ALL indicates that the directory is visible to all digital employees, and operatingObjectNames must be omitted, set to null, or set to an empty array. SPECIFIED indicates association by list, and operatingObjectNames must be explicitly provided. An empty array indicates that no employees are associated. If this parameter is omitted or set to null, the association configuration is not changed. This parameter is supported only for standard enterprise knowledge base root directories.</p>
     * 
     * <strong>example:</strong>
     * <p>SPECIFIED</p>
     */
    @NameInMap("ooVisibilityMode")
    public String ooVisibilityMode;

    /**
     * <p>The list of internal names of the specified associated digital employees. This parameter must be used together with ooVisibilityMode. This parameter is required when ooVisibilityMode is set to SPECIFIED. An empty array indicates that all associations are cleared. When ooVisibilityMode is set to ALL, this parameter must be omitted, set to null, or set to an empty array. You can specify up to 100 items. Each item must be 1 to 256 characters in length after leading and trailing spaces are removed. The server verifies that the employees exist and are available in the current tenant, and fully replaces the associations after deduplication.</p>
     */
    @NameInMap("operatingObjectNames")
    public String operatingObjectNamesShrink;

    /**
     * <p>The unique code of the proxied user in the tenant. This parameter is used only when the identity mapping mode of the application credential is source_uid. You cannot use this parameter to bypass tenant or knowledge base permission verification.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The ID of the proxied WINNEXO platform user. This parameter is used only when the identity mapping mode of the application credential is winnexo_uid. You cannot use this parameter to bypass tenant or knowledge base permission verification.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The internal primary key of the parent directory. If this parameter is omitted or set to null, an enterprise knowledge base root directory is created. If this parameter is specified, a subdirectory is created. This parameter must be omitted or set to null when digital employee association or version summary configurations are included.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    /**
     * <p>The path of the directory. If this parameter is omitted or set to null, the server calculates the path based on the parent directory and the name.</p>
     * 
     * <strong>example:</strong>
     * <p>/Product knowledge base</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The ID of the target tenant. This parameter is used for tenant routing in public requests. The server authentication chain verifies access permissions based on this parameter. You cannot use this parameter to access unauthorized tenants.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateTenantDirectoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantDirectoryShrinkRequest self = new CreateTenantDirectoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantDirectoryShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public CreateTenantDirectoryShrinkRequest setChangeRecordEnabled(Boolean changeRecordEnabled) {
        this.changeRecordEnabled = changeRecordEnabled;
        return this;
    }
    public Boolean getChangeRecordEnabled() {
        return this.changeRecordEnabled;
    }

    public CreateTenantDirectoryShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTenantDirectoryShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTenantDirectoryShrinkRequest setOoVisibilityMode(String ooVisibilityMode) {
        this.ooVisibilityMode = ooVisibilityMode;
        return this;
    }
    public String getOoVisibilityMode() {
        return this.ooVisibilityMode;
    }

    public CreateTenantDirectoryShrinkRequest setOperatingObjectNamesShrink(String operatingObjectNamesShrink) {
        this.operatingObjectNamesShrink = operatingObjectNamesShrink;
        return this;
    }
    public String getOperatingObjectNamesShrink() {
        return this.operatingObjectNamesShrink;
    }

    public CreateTenantDirectoryShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreateTenantDirectoryShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreateTenantDirectoryShrinkRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateTenantDirectoryShrinkRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateTenantDirectoryShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
