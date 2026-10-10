// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupTextResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The project group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>ProjectResources</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The permission scope.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The unique identifier on the business system side, that is, the business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("status")
    public String status;

    public static CreateGroupTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupTextResponseBody self = new CreateGroupTextResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupTextResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGroupTextResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupTextResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateGroupTextResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupTextResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGroupTextResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGroupTextResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateGroupTextResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateGroupTextResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
