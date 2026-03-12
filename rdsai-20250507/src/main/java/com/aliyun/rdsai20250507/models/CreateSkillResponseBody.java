// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateSkillResponseBody extends TeaModel {
    /**
     * <p>The database engine-specific content.</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The creation time of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-04T21:14:45Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The list of database engines.</p>
     */
    @NameInMap("Dbtypes")
    public java.util.List<String> dbtypes;

    /**
     * <p>The description of the skill.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The unique identifier of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>82cf3d62-0add-47bd-869f-877131f7****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>query-optimization</p>
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
     * <p>The type of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("SkillType")
    public String skillType;

    public static CreateSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillResponseBody self = new CreateSkillResponseBody();
        return TeaModel.build(map, self);
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

    public CreateSkillResponseBody setSkillType(String skillType) {
        this.skillType = skillType;
        return this;
    }
    public String getSkillType() {
        return this.skillType;
    }

}
