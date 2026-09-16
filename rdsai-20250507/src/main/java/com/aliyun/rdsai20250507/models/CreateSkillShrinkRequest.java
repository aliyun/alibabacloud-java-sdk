// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateSkillShrinkRequest extends TeaModel {
    /**
     * <p>The content.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MySQL&quot;: &quot;MySQL optimization guide...&quot;,&quot;PostgreSQL&quot;: &quot;PostgreSQL optimization guide...&quot;}</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>The list of database types.</p>
     */
    @NameInMap("Dbtypes")
    public String dbtypesShrink;

    /**
     * <p>The Skill description. The description can be up to 1000 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL query optimization skill</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The Skill name. The name can contain only lowercase letters, digits, and hyphens.</p>
     * 
     * <strong>example:</strong>
     * <p>query-optimization</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Skill upload session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>upload-example</p>
     */
    @NameInMap("UploadId")
    public String uploadId;

    /**
     * <p>The Skill upload session token.</p>
     * 
     * <strong>example:</strong>
     * <p>token-example</p>
     */
    @NameInMap("UploadToken")
    public String uploadToken;

    /**
     * <p>The ContextDB workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateSkillShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillShrinkRequest self = new CreateSkillShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public CreateSkillShrinkRequest setDbtypesShrink(String dbtypesShrink) {
        this.dbtypesShrink = dbtypesShrink;
        return this;
    }
    public String getDbtypesShrink() {
        return this.dbtypesShrink;
    }

    public CreateSkillShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSkillShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSkillShrinkRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public CreateSkillShrinkRequest setUploadToken(String uploadToken) {
        this.uploadToken = uploadToken;
        return this;
    }
    public String getUploadToken() {
        return this.uploadToken;
    }

    public CreateSkillShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
