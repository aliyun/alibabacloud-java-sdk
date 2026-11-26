// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateTenantDirectoryShrinkRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>后续内容更新的AI版本摘要开关；false关闭，未传/null保持既有语义，不删除既有摘要</p>
     */
    @NameInMap("changeRecordEnabled")
    public Boolean changeRecordEnabled;

    /**
     * <p>The new directory description. If this parameter is omitted or set to null, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>Team product materials and operation guides</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The business ID of the enterprise knowledge base directory for the current tenant, which is not the internal primary key. When digital employee associations or version summary configurations are included, the target must be the root directory of a standard enterprise knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The new directory name. It can be up to 256 characters in length. If this parameter is omitted or set to null, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>Product knowledge base</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>数字员工关联模式；仅普通企业知识库根可设置。未传/null保持既有语义；SPECIFIED须显式提供名单，ALL仅允许省略或空名单</p>
     * 
     * <strong>example:</strong>
     * <p>SPECIFIED</p>
     */
    @NameInMap("ooVisibilityMode")
    public String ooVisibilityMode;

    /**
     * <p>数字员工内部名称列表，最多100项，每项非空且最多256字符；SPECIFIED空数组表示不关联任何员工，非空名单按去重后全量替换</p>
     */
    @NameInMap("operatingObjectNames")
    public String operatingObjectNamesShrink;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The internal primary key of the new parent folder. If this parameter is omitted or set to null, the original parent folder is retained. If a non-null value is passed, knowledge base management permissions for the target parent folder are required. This parameter cannot be committed at the same time as the digital employee associate or version summary configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    /**
     * <p>The new directory path. If this parameter is omitted or set to null, a new path is not explicitly specified and is processed by the directory service.</p>
     * 
     * <strong>example:</strong>
     * <p>/Product knowledge base</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The ID of the target tenant. It is used for tenant routing in public requests. The server-side authentication chain verifies access permissions. You cannot use this parameter to access unauthorized tenants.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateTenantDirectoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantDirectoryShrinkRequest self = new UpdateTenantDirectoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTenantDirectoryShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public UpdateTenantDirectoryShrinkRequest setChangeRecordEnabled(Boolean changeRecordEnabled) {
        this.changeRecordEnabled = changeRecordEnabled;
        return this;
    }
    public Boolean getChangeRecordEnabled() {
        return this.changeRecordEnabled;
    }

    public UpdateTenantDirectoryShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTenantDirectoryShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateTenantDirectoryShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTenantDirectoryShrinkRequest setOoVisibilityMode(String ooVisibilityMode) {
        this.ooVisibilityMode = ooVisibilityMode;
        return this;
    }
    public String getOoVisibilityMode() {
        return this.ooVisibilityMode;
    }

    public UpdateTenantDirectoryShrinkRequest setOperatingObjectNamesShrink(String operatingObjectNamesShrink) {
        this.operatingObjectNamesShrink = operatingObjectNamesShrink;
        return this;
    }
    public String getOperatingObjectNamesShrink() {
        return this.operatingObjectNamesShrink;
    }

    public UpdateTenantDirectoryShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public UpdateTenantDirectoryShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public UpdateTenantDirectoryShrinkRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public UpdateTenantDirectoryShrinkRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateTenantDirectoryShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
