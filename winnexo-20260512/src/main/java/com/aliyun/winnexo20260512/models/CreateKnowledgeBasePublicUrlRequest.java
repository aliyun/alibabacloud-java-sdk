// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBasePublicUrlRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If specified, the operation is performed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The description of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>Project design document</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the target folder in the enterprise knowledge base. This parameter is required, and you must have knowledge base management permissions on the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_tenant_child</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The name of the resource. If not specified, the URL is used.</p>
     * 
     * <strong>example:</strong>
     * <p>Project plan</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The analysis instructions.</p>
     * 
     * <strong>example:</strong>
     * <p>Extract decisions and action items</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The name of the operating object.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D assistant</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The URL of the public HTTP or HTTPS web page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com">https://example.com</a></p>
     */
    @NameInMap("originalUrl")
    public String originalUrl;

    /**
     * <p>The list of resource tags in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;R&amp;D&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateKnowledgeBasePublicUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBasePublicUrlRequest self = new CreateKnowledgeBasePublicUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBasePublicUrlRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public CreateKnowledgeBasePublicUrlRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBasePublicUrlRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateKnowledgeBasePublicUrlRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeBasePublicUrlRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreateKnowledgeBasePublicUrlRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreateKnowledgeBasePublicUrlRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreateKnowledgeBasePublicUrlRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreateKnowledgeBasePublicUrlRequest setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
        return this;
    }
    public String getOriginalUrl() {
        return this.originalUrl;
    }

    public CreateKnowledgeBasePublicUrlRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreateKnowledgeBasePublicUrlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
