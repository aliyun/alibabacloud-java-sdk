// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseDirectoryResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description of the to-do card type.</p>
     * 
     * <strong>example:</strong>
     * <p>This is default function description by fc-deploy component</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The directory type.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("directoryKind")
    public String directoryKind;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-14T02:18:27Z</p>
     */
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    /**
     * <p>The last modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-19T01:48:56Z</p>
     */
    @NameInMap("gmtModified")
    public Long gmtModified;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>p-toolset-89550434-4e20-4e4e-bcac-9ab81b82c5b3</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>wd-lxykjnnw4lyl9eq</p>
     */
    @NameInMap("parentDirectoryId")
    public String parentDirectoryId;

    /**
     * <p>The path of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>UVCIpI0siUski9iw</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C474BFC7-7B11-5D92-971E-74AA82EC495B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateKnowledgeBaseDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseDirectoryResponseBody self = new CreateKnowledgeBaseDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseDirectoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setDirectoryKind(String directoryKind) {
        this.directoryKind = directoryKind;
        return this;
    }
    public String getDirectoryKind() {
        return this.directoryKind;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateKnowledgeBaseDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
