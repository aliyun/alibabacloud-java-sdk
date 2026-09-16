// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateSkillResponseBody extends TeaModel {
    /**
     * <p>The Skill catalog revision number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CatalogRevision")
    public Long catalogRevision;

    /**
     * <p>The content grouped by database type.</p>
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
     * <p>2026-02-04T21:14:45Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The list of database types.</p>
     */
    @NameInMap("Dbtypes")
    public java.util.List<String> dbtypes;

    /**
     * <p>The Skill description.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL query optimization skill</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The unique identifier of the Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>82cf3d62-0add-47bd-869f-877131f7****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The Skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>query-optimization</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The unique request identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The created Skill.</p>
     */
    @NameInMap("Skill")
    public CreateSkillResponseBodySkill skill;

    /**
     * <p>The Skill type.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("SkillType")
    public String skillType;

    /**
     * <p>The created Skill version.</p>
     */
    @NameInMap("Version")
    public CreateSkillResponseBodyVersion version;

    public static CreateSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillResponseBody self = new CreateSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSkillResponseBody setCatalogRevision(Long catalogRevision) {
        this.catalogRevision = catalogRevision;
        return this;
    }
    public Long getCatalogRevision() {
        return this.catalogRevision;
    }

    public CreateSkillResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public CreateSkillResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateSkillResponseBody setDbtypes(java.util.List<String> dbtypes) {
        this.dbtypes = dbtypes;
        return this;
    }
    public java.util.List<String> getDbtypes() {
        return this.dbtypes;
    }

    public CreateSkillResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSkillResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateSkillResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSkillResponseBody setSkill(CreateSkillResponseBodySkill skill) {
        this.skill = skill;
        return this;
    }
    public CreateSkillResponseBodySkill getSkill() {
        return this.skill;
    }

    public CreateSkillResponseBody setSkillType(String skillType) {
        this.skillType = skillType;
        return this;
    }
    public String getSkillType() {
        return this.skillType;
    }

    public CreateSkillResponseBody setVersion(CreateSkillResponseBodyVersion version) {
        this.version = version;
        return this;
    }
    public CreateSkillResponseBodyVersion getVersion() {
        return this.version;
    }

    public static class CreateSkillResponseBodySkill extends TeaModel {
        /**
         * <p>The ID of the currently active version.</p>
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
         * <p>The Skill creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-15T10:00:00Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The Skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>An example ContextDB Skill</p>
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
         * <p>Skill ID</p>
         * 
         * <strong>example:</strong>
         * <p>skill-example</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the Skill is deleted.</p>
         */
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        /**
         * <p>The visibility scope of the Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The stable identifier of the Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>example-skill</p>
         */
        @NameInMap("Slug")
        public String slug;

        /**
         * <p>The Skill update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-15T10:00:00Z</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static CreateSkillResponseBodySkill build(java.util.Map<String, ?> map) throws Exception {
            CreateSkillResponseBodySkill self = new CreateSkillResponseBodySkill();
            return TeaModel.build(map, self);
        }

        public CreateSkillResponseBodySkill setActiveVersionId(String activeVersionId) {
            this.activeVersionId = activeVersionId;
            return this;
        }
        public String getActiveVersionId() {
            return this.activeVersionId;
        }

        public CreateSkillResponseBodySkill setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateSkillResponseBodySkill setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateSkillResponseBodySkill setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSkillResponseBodySkill setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateSkillResponseBodySkill setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public CreateSkillResponseBodySkill setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateSkillResponseBodySkill setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public CreateSkillResponseBodySkill setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreateSkillResponseBodySkill setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public CreateSkillResponseBodySkill setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class CreateSkillResponseBodyVersion extends TeaModel {
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
         * <p>The revocation reason of the Skill version.</p>
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
         * <p>The ID of the parent Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-example</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>The status of the Skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The Skill version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static CreateSkillResponseBodyVersion build(java.util.Map<String, ?> map) throws Exception {
            CreateSkillResponseBodyVersion self = new CreateSkillResponseBodyVersion();
            return TeaModel.build(map, self);
        }

        public CreateSkillResponseBodyVersion setActivatedAt(String activatedAt) {
            this.activatedAt = activatedAt;
            return this;
        }
        public String getActivatedAt() {
            return this.activatedAt;
        }

        public CreateSkillResponseBodyVersion setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateSkillResponseBodyVersion setCredentialRequired(Boolean credentialRequired) {
            this.credentialRequired = credentialRequired;
            return this;
        }
        public Boolean getCredentialRequired() {
            return this.credentialRequired;
        }

        public CreateSkillResponseBodyVersion setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateSkillResponseBodyVersion setPackageSize(Long packageSize) {
            this.packageSize = packageSize;
            return this;
        }
        public Long getPackageSize() {
            return this.packageSize;
        }

        public CreateSkillResponseBodyVersion setRevokeReason(String revokeReason) {
            this.revokeReason = revokeReason;
            return this;
        }
        public String getRevokeReason() {
            return this.revokeReason;
        }

        public CreateSkillResponseBodyVersion setRevokedAt(String revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }
        public String getRevokedAt() {
            return this.revokedAt;
        }

        public CreateSkillResponseBodyVersion setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public String getSha256() {
            return this.sha256;
        }

        public CreateSkillResponseBodyVersion setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public CreateSkillResponseBodyVersion setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateSkillResponseBodyVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
