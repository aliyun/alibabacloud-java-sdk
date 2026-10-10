// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupFeishuChatRequest extends TeaModel {
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
     * <p>The pipeline description.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
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
     * <p>The project group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleGroupId</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The start time for historical messages. The value must be in the YYYY-MM-DD or YYYY-MM-DD HH:MM:SS format. If this parameter is not specified, all visible historical messages are retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-01</p>
     */
    @NameInMap("historyStartTime")
    public String historyStartTime;

    /**
     * <p>The meeting notes content (optional). The notes are used for auxiliary analysis.</p>
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
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The source tags.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Key&quot;,&quot;File&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The tenant ID. This is a common parameter. You can pass it explicitly by using --tenant-id in winnexo-cli.</p>
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
    public CreateGroupFeishuChatRequestUpdateFrequency updateFrequency;

    public static CreateGroupFeishuChatRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupFeishuChatRequest self = new CreateGroupFeishuChatRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupFeishuChatRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public CreateGroupFeishuChatRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupFeishuChatRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupFeishuChatRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupFeishuChatRequest setHistoryStartTime(String historyStartTime) {
        this.historyStartTime = historyStartTime;
        return this;
    }
    public String getHistoryStartTime() {
        return this.historyStartTime;
    }

    public CreateGroupFeishuChatRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreateGroupFeishuChatRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreateGroupFeishuChatRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreateGroupFeishuChatRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateGroupFeishuChatRequest setUpdateFrequency(CreateGroupFeishuChatRequestUpdateFrequency updateFrequency) {
        this.updateFrequency = updateFrequency;
        return this;
    }
    public CreateGroupFeishuChatRequestUpdateFrequency getUpdateFrequency() {
        return this.updateFrequency;
    }

    public static class CreateGroupFeishuChatRequestUpdateFrequency extends TeaModel {
        /**
         * <p>The cron expression for the timed scheduling task.</p>
         * 
         * <strong>example:</strong>
         * <p>0 2 * * *</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p><strong>Enable/Disable</strong></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The synchronization preset: hourly or daily_2am.</p>
         * 
         * <strong>example:</strong>
         * <p>hourly</p>
         */
        @NameInMap("preset")
        public String preset;

        public static CreateGroupFeishuChatRequestUpdateFrequency build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupFeishuChatRequestUpdateFrequency self = new CreateGroupFeishuChatRequestUpdateFrequency();
            return TeaModel.build(map, self);
        }

        public CreateGroupFeishuChatRequestUpdateFrequency setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreateGroupFeishuChatRequestUpdateFrequency setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateGroupFeishuChatRequestUpdateFrequency setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

    }

}
