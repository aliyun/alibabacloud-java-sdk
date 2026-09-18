// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupDirectoryResponseBody extends TeaModel {
    /**
     * <p>SUCCESS indicates success. In failure cases, the corresponding error type is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description of the AI assistant.</p>
     * 
     * <strong>example:</strong>
     * <p>ProjectDescription</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The folder type.</p>
     * 
     * <strong>example:</strong>
     * <p>GROUP</p>
     */
    @NameInMap("directoryType")
    public String directoryType;

    /**
     * <p>The project group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The root folder ID of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_root</p>
     */
    @NameInMap("kbRootDirectoryId")
    public String kbRootDirectoryId;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The name of the worksheet.</p>
     * 
     * <strong>example:</strong>
     * <p>ProjectFiles</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_parent</p>
     */
    @NameInMap("parentDirectoryId")
    public String parentDirectoryId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F4A9EB1C-6952-5CCC-B1DC-355576FC82A7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateGroupDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupDirectoryResponseBody self = new CreateGroupDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupDirectoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGroupDirectoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupDirectoryResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupDirectoryResponseBody setDirectoryType(String directoryType) {
        this.directoryType = directoryType;
        return this;
    }
    public String getDirectoryType() {
        return this.directoryType;
    }

    public CreateGroupDirectoryResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupDirectoryResponseBody setKbRootDirectoryId(String kbRootDirectoryId) {
        this.kbRootDirectoryId = kbRootDirectoryId;
        return this;
    }
    public String getKbRootDirectoryId() {
        return this.kbRootDirectoryId;
    }

    public CreateGroupDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGroupDirectoryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupDirectoryResponseBody setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public CreateGroupDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
