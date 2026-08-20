// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalFeishuChatRequest extends TeaModel {
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
    public CreatePersonalFeishuChatRequestUpdateFrequency updateFrequency;

    public static CreatePersonalFeishuChatRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalFeishuChatRequest self = new CreatePersonalFeishuChatRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalFeishuChatRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public CreatePersonalFeishuChatRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalFeishuChatRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalFeishuChatRequest setHistoryStartTime(String historyStartTime) {
        this.historyStartTime = historyStartTime;
        return this;
    }
    public String getHistoryStartTime() {
        return this.historyStartTime;
    }

    public CreatePersonalFeishuChatRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreatePersonalFeishuChatRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalFeishuChatRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreatePersonalFeishuChatRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreatePersonalFeishuChatRequest setUpdateFrequency(CreatePersonalFeishuChatRequestUpdateFrequency updateFrequency) {
        this.updateFrequency = updateFrequency;
        return this;
    }
    public CreatePersonalFeishuChatRequestUpdateFrequency getUpdateFrequency() {
        return this.updateFrequency;
    }

    public static class CreatePersonalFeishuChatRequestUpdateFrequency extends TeaModel {
        /**
         * <p>The cron expression for the timed scheduling node.</p>
         * 
         * <strong>example:</strong>
         * <p>0 * * * *</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>Specifies whether to enable the scheduled synchronization.</p>
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

        public static CreatePersonalFeishuChatRequestUpdateFrequency build(java.util.Map<String, ?> map) throws Exception {
            CreatePersonalFeishuChatRequestUpdateFrequency self = new CreatePersonalFeishuChatRequestUpdateFrequency();
            return TeaModel.build(map, self);
        }

        public CreatePersonalFeishuChatRequestUpdateFrequency setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreatePersonalFeishuChatRequestUpdateFrequency setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreatePersonalFeishuChatRequestUpdateFrequency setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

    }

}
