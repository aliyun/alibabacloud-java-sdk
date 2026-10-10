// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupFeishuChatResponseBody extends TeaModel {
    /**
     * <p>The DingTalk group chat session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cidxxxxxxxx</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>The error code.</p>
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
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-26T10:00:00+08:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The project group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleGroupId</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The error details.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>oklabs_tongyici</p>
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
     * <p>PERSONAL</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The original project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The signing status. Valid values:</p>
     * <ul>
     * <li>CREATED: Created but not signed.</li>
     * <li>SUCCESS: Signed successfully.</li>
     * <li>STOP: Terminated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("status")
    public String status;

    public static CreateGroupFeishuChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupFeishuChatResponseBody self = new CreateGroupFeishuChatResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupFeishuChatResponseBody setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public CreateGroupFeishuChatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGroupFeishuChatResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupFeishuChatResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateGroupFeishuChatResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupFeishuChatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGroupFeishuChatResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupFeishuChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGroupFeishuChatResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateGroupFeishuChatResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateGroupFeishuChatResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
