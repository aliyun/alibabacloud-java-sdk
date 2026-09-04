// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupDingtalkChatRequest extends TeaModel {
    /**
     * <p>The session ID, typically used for JSSDK.</p>
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
     * <p>The description of the AI assistant.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer chat history</p>
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
     * <p>The project group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleGroupId</p>
     */
    @NameInMap("groupId")
    public String groupId;

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
     * <p>The name of the digital employee (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The source tags.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Customer&quot;,&quot;GroupChat&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this explicitly with --tenant-id.</p>
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
    public CreateGroupDingtalkChatRequestUpdateFrequency updateFrequency;

    public static CreateGroupDingtalkChatRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupDingtalkChatRequest self = new CreateGroupDingtalkChatRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupDingtalkChatRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public CreateGroupDingtalkChatRequest setChatName(String chatName) {
        this.chatName = chatName;
        return this;
    }
    public String getChatName() {
        return this.chatName;
    }

    public CreateGroupDingtalkChatRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupDingtalkChatRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupDingtalkChatRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupDingtalkChatRequest setHistoryStartTime(String historyStartTime) {
        this.historyStartTime = historyStartTime;
        return this;
    }
    public String getHistoryStartTime() {
        return this.historyStartTime;
    }

    public CreateGroupDingtalkChatRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreateGroupDingtalkChatRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreateGroupDingtalkChatRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreateGroupDingtalkChatRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateGroupDingtalkChatRequest setUpdateFrequency(CreateGroupDingtalkChatRequestUpdateFrequency updateFrequency) {
        this.updateFrequency = updateFrequency;
        return this;
    }
    public CreateGroupDingtalkChatRequestUpdateFrequency getUpdateFrequency() {
        return this.updateFrequency;
    }

    public static class CreateGroupDingtalkChatRequestUpdateFrequency extends TeaModel {
        /**
         * <p>The cron expression for timed scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>0 2 * * *</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>Specifies whether the throttling rule is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The preset mode. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>hourly</p>
         */
        @NameInMap("preset")
        public String preset;

        public static CreateGroupDingtalkChatRequestUpdateFrequency build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupDingtalkChatRequestUpdateFrequency self = new CreateGroupDingtalkChatRequestUpdateFrequency();
            return TeaModel.build(map, self);
        }

        public CreateGroupDingtalkChatRequestUpdateFrequency setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreateGroupDingtalkChatRequestUpdateFrequency setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateGroupDingtalkChatRequestUpdateFrequency setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

    }

}
