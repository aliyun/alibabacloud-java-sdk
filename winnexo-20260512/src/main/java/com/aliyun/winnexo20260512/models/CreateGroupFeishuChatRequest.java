// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupFeishuChatRequest extends TeaModel {
    /**
     * <p>飞书群聊ID，以oc_开头，需当前用户有权读取</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cidxxxxxxxx</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>资料描述</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>空间物理目录ID；省略/root使用空间根，首次可能初始化根目录</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>协作空间 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleGroupId</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>历史起始时间，YYYY-MM-DD或YYYY-MM-DD HH:MM:SS；省略读取全部可见历史</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-01</p>
     */
    @NameInMap("historyStartTime")
    public String historyStartTime;

    /**
     * <p>分析指令</p>
     * 
     * <strong>example:</strong>
     * <p>重点识别客户诉求与待办</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>运营对象名称，用于来源追溯</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>资料标签JSON字符串列表</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;重点&quot;,&quot;文件&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>Source级同步配置</p>
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
         * <p>五段 cron，优先于 preset</p>
         * 
         * <strong>example:</strong>
         * <p>0 2 * * *</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>是否启用同步，默认true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>同步预设：hourly 或 daily_2am</p>
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
