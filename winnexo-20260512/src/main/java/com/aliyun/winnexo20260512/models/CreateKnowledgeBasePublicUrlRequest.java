// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBasePublicUrlRequest extends TeaModel {
    /**
     * <p>The resource description.</p>
     * 
     * <strong>example:</strong>
     * <p>Project design document</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the destination folder in the enterprise knowledge base. This parameter is required. You must have knowledge base management permissions on the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_tenant_child</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The resource name. If not specified, the URL is used.</p>
     * 
     * <strong>example:</strong>
     * <p>Project Plan</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The analysis instruction.</p>
     * 
     * <strong>example:</strong>
     * <p>Extract decisions and to-do items</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The name of the operating object.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D Assistant</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The URL of the public HTTP/HTTPS web page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com">https://example.com</a></p>
     */
    @NameInMap("originalUrl")
    public String originalUrl;

    /**
     * <p>The list of resource tags as JSON strings.</p>
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
