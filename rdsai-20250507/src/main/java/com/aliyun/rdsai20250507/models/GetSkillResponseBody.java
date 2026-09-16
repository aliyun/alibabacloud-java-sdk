// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetSkillResponseBody extends TeaModel {
    /**
     * <p>The currently active version ID.</p>
     * 
     * <strong>example:</strong>
     * <p>version-example</p>
     */
    @NameInMap("ActiveVersionId")
    public String activeVersionId;

    /**
     * <p>The Skill category.</p>
     * 
     * <strong>example:</strong>
     * <p>productivity</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The content.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MySQL&quot;: &quot;MySQL optimization guide...&quot;,&quot;PostgreSQL&quot;: &quot;PostgreSQL optimization guide...&quot;}</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-04T02:25:43Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The list of database types.</p>
     */
    @NameInMap("Dbtypes")
    public java.util.List<String> dbtypes;

    /**
     * <p>The Skill description, up to 1000 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL Review Expert: Comprehensively reviews SQL for security, performance, and compliance, identifies risks, and provides optimization suggestions. Activated immediately when a user submits SQL or asks about &quot;SQL review&quot;, &quot;SQL Review&quot;, &quot;any risks&quot;, or &quot;how to optimize&quot;</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The Skill display name.</p>
     * 
     * <strong>example:</strong>
     * <p>Example Skill</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The public HTTPS URL of the current icon. This value is empty if no icon is configured.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/skill-icon.png">https://example.com/skill-icon.png</a></p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Icon")
    public String icon;

    /**
     * <p>The unique identifier of the Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Indicates whether the Skill is deleted.</p>
     */
    @NameInMap("IsDeleted")
    public Boolean isDeleted;

    /**
     * <p>The Skill name. The name can contain only lowercase letters, digits, and hyphens.</p>
     * 
     * <strong>example:</strong>
     * <p>sql-optimization</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The visibility scope of the Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The Skill type.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("SkillType")
    public String skillType;

    /**
     * <p>The stable identifier of a private Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>example-skill</p>
     */
    @NameInMap("Slug")
    public String slug;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-04T21:14:45Z</p>
     */
    @NameInMap("UpdatedAt")
    public String updatedAt;

    /**
     * <p>The list of versions visible to the current principal.</p>
     */
    @NameInMap("Versions")
    public java.util.List<GetSkillResponseBodyVersions> versions;

    public static GetSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillResponseBody self = new GetSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillResponseBody setActiveVersionId(String activeVersionId) {
        this.activeVersionId = activeVersionId;
        return this;
    }
    public String getActiveVersionId() {
        return this.activeVersionId;
    }

    public GetSkillResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetSkillResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public GetSkillResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetSkillResponseBody setDbtypes(java.util.List<String> dbtypes) {
        this.dbtypes = dbtypes;
        return this;
    }
    public java.util.List<String> getDbtypes() {
        return this.dbtypes;
    }

    public GetSkillResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetSkillResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetSkillResponseBody setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public GetSkillResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetSkillResponseBody setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public GetSkillResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetSkillResponseBody setSkillType(String skillType) {
        this.skillType = skillType;
        return this;
    }
    public String getSkillType() {
        return this.skillType;
    }

    public GetSkillResponseBody setSlug(String slug) {
        this.slug = slug;
        return this;
    }
    public String getSlug() {
        return this.slug;
    }

    public GetSkillResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public GetSkillResponseBody setVersions(java.util.List<GetSkillResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<GetSkillResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public static class GetSkillResponseBodyVersions extends TeaModel {
        /**
         * <p>The activation time of the Skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-15T10:00:00Z</p>
         */
        @NameInMap("ActivatedAt")
        public String activatedAt;

        /**
         * <p>The creation time of the Skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-15T10:00:00Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>Indicates whether the Skill requires a credential.</p>
         */
        @NameInMap("CredentialRequired")
        public Boolean credentialRequired;

        /**
         * <p>The Skill version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>version-example</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The Skill package size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("PackageSize")
        public Long packageSize;

        /**
         * <p>The reason for revoking the Skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>Replaced by a newer version</p>
         */
        @NameInMap("RevokeReason")
        public String revokeReason;

        /**
         * <p>The revocation time of the Skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-15T11:00:00Z</p>
         */
        @NameInMap("RevokedAt")
        public String revokedAt;

        /**
         * <p>The SHA-256 digest of the Skill package.</p>
         * 
         * <strong>example:</strong>
         * <p>0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("Sha256")
        public String sha256;

        /**
         * <p>The ID of the Skill to which this version belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-example</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>The Markdown content of the Skill.</p>
         * 
         * <strong>example:</strong>
         * <h1>Example Skill</h1>
         */
        @NameInMap("SkillMarkdown")
        public String skillMarkdown;

        /**
         * <p>The status of the Skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version number of the Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetSkillResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            GetSkillResponseBodyVersions self = new GetSkillResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public GetSkillResponseBodyVersions setActivatedAt(String activatedAt) {
            this.activatedAt = activatedAt;
            return this;
        }
        public String getActivatedAt() {
            return this.activatedAt;
        }

        public GetSkillResponseBodyVersions setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetSkillResponseBodyVersions setCredentialRequired(Boolean credentialRequired) {
            this.credentialRequired = credentialRequired;
            return this;
        }
        public Boolean getCredentialRequired() {
            return this.credentialRequired;
        }

        public GetSkillResponseBodyVersions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSkillResponseBodyVersions setPackageSize(Long packageSize) {
            this.packageSize = packageSize;
            return this;
        }
        public Long getPackageSize() {
            return this.packageSize;
        }

        public GetSkillResponseBodyVersions setRevokeReason(String revokeReason) {
            this.revokeReason = revokeReason;
            return this;
        }
        public String getRevokeReason() {
            return this.revokeReason;
        }

        public GetSkillResponseBodyVersions setRevokedAt(String revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }
        public String getRevokedAt() {
            return this.revokedAt;
        }

        public GetSkillResponseBodyVersions setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public String getSha256() {
            return this.sha256;
        }

        public GetSkillResponseBodyVersions setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public GetSkillResponseBodyVersions setSkillMarkdown(String skillMarkdown) {
            this.skillMarkdown = skillMarkdown;
            return this;
        }
        public String getSkillMarkdown() {
            return this.skillMarkdown;
        }

        public GetSkillResponseBodyVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSkillResponseBodyVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
