// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateSkillRequest extends TeaModel {
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
     * <p>The name of the Skill. The name can contain only lowercase letters, digits, and hyphens.</p>
     * 
     * <strong>example:</strong>
     * <p>sql-optimization</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The unique identifier of the Skill.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8f6a2111-3828-4a9f-a3ce-51ce73c6****</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    /**
     * <p>The version update note for the ContextDB Skill. Specify this parameter when confirming storage after the check passes. The note can be up to 1000 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Update Skill documentation</p>
     */
    @NameInMap("UpdateNote")
    public String updateNote;

    /**
     * <p>The upload session ID returned by GetUploadPolicy for ContextDB full package updates. This parameter is not required for original RDS field updates.</p>
     * 
     * <strong>example:</strong>
     * <p>upload-example</p>
     */
    @NameInMap("UploadId")
    public String uploadId;

    /**
     * <p>The upload session token paired with UploadId, used to verify ownership. This parameter is not required for original RDS field updates.</p>
     * 
     * <strong>example:</strong>
     * <p>token-example</p>
     */
    @NameInMap("UploadToken")
    public String uploadToken;

    /**
     * <p>The ContextDB workspace ID. This parameter is not required for regular Skill calls.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-example</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillRequest self = new UpdateSkillRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillRequest setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public UpdateSkillRequest setDbtypes(java.util.List<String> dbtypes) {
        this.dbtypes = dbtypes;
        return this;
    }
    public java.util.List<String> getDbtypes() {
        return this.dbtypes;
    }

    public UpdateSkillRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSkillRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSkillRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public UpdateSkillRequest setUpdateNote(String updateNote) {
        this.updateNote = updateNote;
        return this;
    }
    public String getUpdateNote() {
        return this.updateNote;
    }

    public UpdateSkillRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public UpdateSkillRequest setUploadToken(String uploadToken) {
        this.uploadToken = uploadToken;
        return this;
    }
    public String getUploadToken() {
        return this.uploadToken;
    }

    public UpdateSkillRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
