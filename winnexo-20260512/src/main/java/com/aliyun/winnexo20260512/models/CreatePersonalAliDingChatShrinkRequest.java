// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalAliDingChatShrinkRequest extends TeaModel {
    /**
     * <p>The DingTalk group chat session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cidxxxxxxxx</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>The group chat name.</p>
     * 
     * <strong>example:</strong>
     * <p>CustomerProjectGroup</p>
     */
    @NameInMap("chatName")
    public String chatName;

    /**
     * <p>The pipeline description.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer group chat history</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The start time for collecting chat history.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-01</p>
     */
    @NameInMap("historyStartTime")
    public String historyStartTime;

    /**
     * <p>The meeting notes content (optional). This participates in auxiliary analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>Focus on identifying customer demands and to-do items</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The digital employee name (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The resource tags (optional, a JSON string list such as [&quot;tagA&quot;,&quot;tagB&quot;]).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Customer&quot;,&quot;GroupChat&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The tenant ID. This is a common parameter. The winnexo-cli passes this value explicitly by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The feature update frequency.</p>
     */
    @NameInMap("updateFrequency")
    public String updateFrequencyShrink;

    public static CreatePersonalAliDingChatShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalAliDingChatShrinkRequest self = new CreatePersonalAliDingChatShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalAliDingChatShrinkRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public CreatePersonalAliDingChatShrinkRequest setChatName(String chatName) {
        this.chatName = chatName;
        return this;
    }
    public String getChatName() {
        return this.chatName;
    }

    public CreatePersonalAliDingChatShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalAliDingChatShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalAliDingChatShrinkRequest setHistoryStartTime(String historyStartTime) {
        this.historyStartTime = historyStartTime;
        return this;
    }
    public String getHistoryStartTime() {
        return this.historyStartTime;
    }

    public CreatePersonalAliDingChatShrinkRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreatePersonalAliDingChatShrinkRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalAliDingChatShrinkRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreatePersonalAliDingChatShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreatePersonalAliDingChatShrinkRequest setUpdateFrequencyShrink(String updateFrequencyShrink) {
        this.updateFrequencyShrink = updateFrequencyShrink;
        return this;
    }
    public String getUpdateFrequencyShrink() {
        return this.updateFrequencyShrink;
    }

}
