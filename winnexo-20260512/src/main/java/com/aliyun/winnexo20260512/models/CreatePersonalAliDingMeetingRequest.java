// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalAliDingMeetingRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The description of the AI assistant.</p>
     * 
     * <strong>example:</strong>
     * <p>controll service user</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The name of the image-trained digital human.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>p-toolset-3dcef7ca-31b9-4d1c-8692-1ef03099cad3</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The meeting notes (optional). The notes are used for auxiliary analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The name of the digital employee (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

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
     * <p>The original Shanji link (required).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("shanjiUrl")
    public String shanjiUrl;

    /**
     * <p>A list of resource tag JSON strings.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Important&quot;,&quot;Meeting&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>549003315603714</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreatePersonalAliDingMeetingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalAliDingMeetingRequest self = new CreatePersonalAliDingMeetingRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalAliDingMeetingRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public CreatePersonalAliDingMeetingRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalAliDingMeetingRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalAliDingMeetingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalAliDingMeetingRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreatePersonalAliDingMeetingRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalAliDingMeetingRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreatePersonalAliDingMeetingRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreatePersonalAliDingMeetingRequest setShanjiUrl(String shanjiUrl) {
        this.shanjiUrl = shanjiUrl;
        return this;
    }
    public String getShanjiUrl() {
        return this.shanjiUrl;
    }

    public CreatePersonalAliDingMeetingRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreatePersonalAliDingMeetingRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
