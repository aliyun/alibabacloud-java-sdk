// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateGroupDirectoryResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The folder description.</p>
     * 
     * <strong>example:</strong>
     * <p>Project description</p>
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
     * <p>The folder type. The value is fixed as GROUP.</p>
     * 
     * <strong>example:</strong>
     * <p>GROUP</p>
     */
    @NameInMap("directoryType")
    public String directoryType;

    /**
     * <p>The ID of the collaborative share.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The ID of the internal root folder in the collaborative share. This folder cannot be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_root</p>
     */
    @NameInMap("kbRootDirectoryId")
    public String kbRootDirectoryId;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The folder name.</p>
     * 
     * <strong>example:</strong>
     * <p>Project Materials</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The parent folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_parent</p>
     */
    @NameInMap("parentDirectoryId")
    public String parentDirectoryId;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateGroupDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDirectoryResponseBody self = new UpdateGroupDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDirectoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateGroupDirectoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGroupDirectoryResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateGroupDirectoryResponseBody setDirectoryType(String directoryType) {
        this.directoryType = directoryType;
        return this;
    }
    public String getDirectoryType() {
        return this.directoryType;
    }

    public UpdateGroupDirectoryResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateGroupDirectoryResponseBody setKbRootDirectoryId(String kbRootDirectoryId) {
        this.kbRootDirectoryId = kbRootDirectoryId;
        return this;
    }
    public String getKbRootDirectoryId() {
        return this.kbRootDirectoryId;
    }

    public UpdateGroupDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGroupDirectoryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGroupDirectoryResponseBody setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public UpdateGroupDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
