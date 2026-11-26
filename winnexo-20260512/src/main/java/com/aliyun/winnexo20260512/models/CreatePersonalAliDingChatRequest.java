// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalAliDingChatRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If provided, the operation is executed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The ID of the DingTalk group chat session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cidxxxxxxxx</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>The name of the group chat.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer project group</p>
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
     * <p>The content of meeting notes (optional), which is used for auxiliary analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>Focus on identifying customer requirements and to-do items</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The name of the digital employee (the name of the operating object, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The resource tags (optional). The value is a JSON string list, such as [&quot;tagA&quot;,&quot;tagB&quot;].</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Customer&quot;,&quot;Group chat&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The tenant ID. This is a common parameter and is explicitly passed by using the --tenant-id option in winnexo-cli.</p>
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
    public CreatePersonalAliDingChatRequestUpdateFrequency updateFrequency;

    public static CreatePersonalAliDingChatRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalAliDingChatRequest self = new CreatePersonalAliDingChatRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalAliDingChatRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public CreatePersonalAliDingChatRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public CreatePersonalAliDingChatRequest setChatName(String chatName) {
        this.chatName = chatName;
        return this;
    }
    public String getChatName() {
        return this.chatName;
    }

    public CreatePersonalAliDingChatRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalAliDingChatRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalAliDingChatRequest setHistoryStartTime(String historyStartTime) {
        this.historyStartTime = historyStartTime;
        return this;
    }
    public String getHistoryStartTime() {
        return this.historyStartTime;
    }

    public CreatePersonalAliDingChatRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreatePersonalAliDingChatRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalAliDingChatRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreatePersonalAliDingChatRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreatePersonalAliDingChatRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreatePersonalAliDingChatRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreatePersonalAliDingChatRequest setUpdateFrequency(CreatePersonalAliDingChatRequestUpdateFrequency updateFrequency) {
        this.updateFrequency = updateFrequency;
        return this;
    }
    public CreatePersonalAliDingChatRequestUpdateFrequency getUpdateFrequency() {
        return this.updateFrequency;
    }

    public static class CreatePersonalAliDingChatRequestUpdateFrequency extends TeaModel {
        /**
         * <p>The cron expression for the timed scheduling node.</p>
         * 
         * <strong>example:</strong>
         * <p>0 2 * * *</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p><strong>Enable or disable</strong></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The preset mode, which can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>hourly</p>
         */
        @NameInMap("preset")
        public String preset;

        public static CreatePersonalAliDingChatRequestUpdateFrequency build(java.util.Map<String, ?> map) throws Exception {
            CreatePersonalAliDingChatRequestUpdateFrequency self = new CreatePersonalAliDingChatRequestUpdateFrequency();
            return TeaModel.build(map, self);
        }

        public CreatePersonalAliDingChatRequestUpdateFrequency setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreatePersonalAliDingChatRequestUpdateFrequency setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreatePersonalAliDingChatRequestUpdateFrequency setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

    }

}
