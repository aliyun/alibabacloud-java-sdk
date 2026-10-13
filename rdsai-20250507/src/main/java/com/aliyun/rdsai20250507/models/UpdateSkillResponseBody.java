// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateSkillResponseBody extends TeaModel {
    /**
     * <p>The update action performed.</p>
     * 
     * <strong>example:</strong>
     * <p>ADD_VERSION</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <p>The content digest of the Skill package.</p>
     * 
     * <strong>example:</strong>
     * <p>0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("BundleHash")
    public String bundleHash;

    /**
     * <p>The content.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MySQL&quot;: &quot;MySQL optimization guide...&quot;,&quot;PostgreSQL&quot;: &quot;PostgreSQL optimization guide...&quot;}</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The list of database types.</p>
     */
    @NameInMap("Dbtypes")
    public java.util.List<String> dbtypes;

    /**
     * <p>The description of the Skill. The description can be up to 1000 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL Review Expert: Comprehensively reviews SQL for security, performance, and compliance, identifies risks, and provides optimization suggestions. Activated immediately when a user submits SQL or asks &quot;SQL review&quot;, &quot;SQL Review&quot;, &quot;any risks?&quot;, or &quot;how to optimize&quot;</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The unique identifier of the Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the Skill. The name can contain only lowercase letters, digits, and hyphens.</p>
     * 
     * <strong>example:</strong>
     * <p>sql-review</p>
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
     * <p>The ID of the updated Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>skill-example</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    /**
     * <p>The Skill type.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("SkillType")
    public String skillType;

    /**
     * <p>The time when the Skill was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-04T21:14:45Z</p>
     */
    @NameInMap("UpdatedAt")
    public String updatedAt;

    /**
     * <p>The ID of the Skill version created in this update.</p>
     * 
     * <strong>example:</strong>
     * <p>version-example</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static UpdateSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillResponseBody self = new UpdateSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSkillResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public UpdateSkillResponseBody setBundleHash(String bundleHash) {
        this.bundleHash = bundleHash;
        return this;
    }
    public String getBundleHash() {
        return this.bundleHash;
    }

    public UpdateSkillResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public UpdateSkillResponseBody setDbtypes(java.util.List<String> dbtypes) {
        this.dbtypes = dbtypes;
        return this;
    }
    public java.util.List<String> getDbtypes() {
        return this.dbtypes;
    }

    public UpdateSkillResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSkillResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateSkillResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSkillResponseBody setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public UpdateSkillResponseBody setSkillType(String skillType) {
        this.skillType = skillType;
        return this;
    }
    public String getSkillType() {
        return this.skillType;
    }

    public UpdateSkillResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UpdateSkillResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
