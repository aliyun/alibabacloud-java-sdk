// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateSkillResponseBody extends TeaModel {
    /**
     * <p>The content of the skill.</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The list of database engines.</p>
     */
    @NameInMap("Dbtypes")
    public java.util.List<String> dbtypes;

    /**
     * <p>The description of the skill. It can be up to 1000 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The unique identifier of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the skill, which can contain only lowercase letters, numbers, and hyphens.</p>
     * 
     * <strong>example:</strong>
     * <p>sql-review</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The skill type.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("SkillType")
    public String skillType;

    /**
     * <p>The update time of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-04T21:14:45Z</p>
     */
    @NameInMap("UpdatedAt")
    public String updatedAt;

    public static UpdateSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillResponseBody self = new UpdateSkillResponseBody();
        return TeaModel.build(map, self);
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

}
