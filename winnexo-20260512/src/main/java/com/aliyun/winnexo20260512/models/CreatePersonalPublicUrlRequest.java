// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalPublicUrlRequest extends TeaModel {
    /**
     * <p>The resource description.</p>
     * 
     * <strong>example:</strong>
     * <p>Project design document</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the target personal directory. If not specified, the current user\&quot;s default personal root directory is used.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_personal_child</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The resource name. If omitted, the URL is used.</p>
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
     * <p>The list of resource tag JSON strings.</p>
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

    public static CreatePersonalPublicUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalPublicUrlRequest self = new CreatePersonalPublicUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalPublicUrlRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalPublicUrlRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalPublicUrlRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalPublicUrlRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreatePersonalPublicUrlRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalPublicUrlRequest setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
        return this;
    }
    public String getOriginalUrl() {
        return this.originalUrl;
    }

    public CreatePersonalPublicUrlRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreatePersonalPublicUrlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
