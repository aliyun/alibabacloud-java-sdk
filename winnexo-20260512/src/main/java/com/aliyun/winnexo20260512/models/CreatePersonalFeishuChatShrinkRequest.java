// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalFeishuChatShrinkRequest extends TeaModel {
    /**
     * <p>The group chat session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oc_abc123</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>The description of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>Product R&amp;D group chat records</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_personal_1</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The start time for historical messages. Supports YYYY-MM-DD or YYYY-MM-DD HH:MM:SS. If not specified, all visible history is pulled.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-01 00:00:00</p>
     */
    @NameInMap("historyStartTime")
    public String historyStartTime;

    /**
     * <p>The meeting notes content (optional). Used for auxiliary analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>Focus on extracting decisions and action items</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The digital employee name (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D Assistant</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The source tags.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;R&amp;D&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The tenant ID to take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The update frequency.</p>
     */
    @NameInMap("updateFrequency")
    public String updateFrequencyShrink;

    public static CreatePersonalFeishuChatShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalFeishuChatShrinkRequest self = new CreatePersonalFeishuChatShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalFeishuChatShrinkRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public CreatePersonalFeishuChatShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalFeishuChatShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalFeishuChatShrinkRequest setHistoryStartTime(String historyStartTime) {
        this.historyStartTime = historyStartTime;
        return this;
    }
    public String getHistoryStartTime() {
        return this.historyStartTime;
    }

    public CreatePersonalFeishuChatShrinkRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreatePersonalFeishuChatShrinkRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalFeishuChatShrinkRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreatePersonalFeishuChatShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreatePersonalFeishuChatShrinkRequest setUpdateFrequencyShrink(String updateFrequencyShrink) {
        this.updateFrequencyShrink = updateFrequencyShrink;
        return this;
    }
    public String getUpdateFrequencyShrink() {
        return this.updateFrequencyShrink;
    }

}
