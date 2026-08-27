// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalDingtalkChatRequest extends TeaModel {
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
     * <p>The directory ID.</p>
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
     * <p>my-agent</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The resource tags (optional, a JSON string list, such as [&quot;tagA&quot;,&quot;tagB&quot;]).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Customer&quot;,&quot;GroupChat&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The tenant ID.</p>
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
    public CreatePersonalDingtalkChatRequestUpdateFrequency updateFrequency;

    public static CreatePersonalDingtalkChatRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDingtalkChatRequest self = new CreatePersonalDingtalkChatRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDingtalkChatRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public CreatePersonalDingtalkChatRequest setChatName(String chatName) {
        this.chatName = chatName;
        return this;
    }
    public String getChatName() {
        return this.chatName;
    }

    public CreatePersonalDingtalkChatRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalDingtalkChatRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalDingtalkChatRequest setHistoryStartTime(String historyStartTime) {
        this.historyStartTime = historyStartTime;
        return this;
    }
    public String getHistoryStartTime() {
        return this.historyStartTime;
    }

    public CreatePersonalDingtalkChatRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreatePersonalDingtalkChatRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalDingtalkChatRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreatePersonalDingtalkChatRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreatePersonalDingtalkChatRequest setUpdateFrequency(CreatePersonalDingtalkChatRequestUpdateFrequency updateFrequency) {
        this.updateFrequency = updateFrequency;
        return this;
    }
    public CreatePersonalDingtalkChatRequestUpdateFrequency getUpdateFrequency() {
        return this.updateFrequency;
    }

    public static class CreatePersonalDingtalkChatRequestUpdateFrequency extends TeaModel {
        /**
         * <p>The cron expression for timed scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>0 2 * * *</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>Specifies whether to enable or disable the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The preset mode (can be ignored).</p>
         * 
         * <strong>example:</strong>
         * <p>hourly</p>
         */
        @NameInMap("preset")
        public String preset;

        public static CreatePersonalDingtalkChatRequestUpdateFrequency build(java.util.Map<String, ?> map) throws Exception {
            CreatePersonalDingtalkChatRequestUpdateFrequency self = new CreatePersonalDingtalkChatRequestUpdateFrequency();
            return TeaModel.build(map, self);
        }

        public CreatePersonalDingtalkChatRequestUpdateFrequency setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreatePersonalDingtalkChatRequestUpdateFrequency setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreatePersonalDingtalkChatRequestUpdateFrequency setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

    }

}
