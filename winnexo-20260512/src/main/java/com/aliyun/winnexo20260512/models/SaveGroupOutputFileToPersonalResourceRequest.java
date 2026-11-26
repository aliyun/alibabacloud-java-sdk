// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGroupOutputFileToPersonalResourceRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The enterprise knowledge base directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The project group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleGroupId</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>itemIds</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;item-1&quot;,&quot;item-2&quot;]</p>
     */
    @NameInMap("itemIds")
    public java.util.List<String> itemIds;

    /**
     * <p>The save mode. Valid values:</p>
     * <ul>
     * <li>link: Links the output. This mode is idempotent on a 1:1 basis. Editing the output synchronizes the resource.</li>
     * <li>copy: Copies the output. This mode allows unlimited copies and creates a snapshot.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>copy</p>
     */
    @NameInMap("mode")
    public String mode;

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
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static SaveGroupOutputFileToPersonalResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveGroupOutputFileToPersonalResourceRequest self = new SaveGroupOutputFileToPersonalResourceRequest();
        return TeaModel.build(map, self);
    }

    public SaveGroupOutputFileToPersonalResourceRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public SaveGroupOutputFileToPersonalResourceRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SaveGroupOutputFileToPersonalResourceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SaveGroupOutputFileToPersonalResourceRequest setItemIds(java.util.List<String> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }

    public SaveGroupOutputFileToPersonalResourceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SaveGroupOutputFileToPersonalResourceRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public SaveGroupOutputFileToPersonalResourceRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public SaveGroupOutputFileToPersonalResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
