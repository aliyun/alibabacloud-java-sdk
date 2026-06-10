// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppChatMessageRequest extends TeaModel {
    /**
     * <p>Appended message metadata (JSON format)</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("AddedMetaData")
    public String addedMetaData;

    /**
     * <p>Message content</p>
     * 
     * <strong>example:</strong>
     * <p>FormatVersion: OOS-2019-06-01nTasks:n  - Name: runCommandn    Action: \&quot;ACS::ECS::RunCommand\&quot;n    Properties:n      commandContent: \&quot; echo Hksqj@@883289</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Session ID</p>
     * 
     * <strong>example:</strong>
     * <p>81bc5a34-1d8d-4ef7-a208-7401c51b054b</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>Message ID</p>
     * 
     * <strong>example:</strong>
     * <p>7baf7d67-1897-42ed-a380-f6ae825d6907</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    public static UpdateAppChatMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppChatMessageRequest self = new UpdateAppChatMessageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppChatMessageRequest setAddedMetaData(String addedMetaData) {
        this.addedMetaData = addedMetaData;
        return this;
    }
    public String getAddedMetaData() {
        return this.addedMetaData;
    }

    public UpdateAppChatMessageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateAppChatMessageRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public UpdateAppChatMessageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
