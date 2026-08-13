// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateScheduledTaskRequest extends TeaModel {
    @NameInMap("description")
    public java.util.List<UpdateScheduledTaskRequestDescription> description;

    /**
     * <p>数字员工名称列表</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("digitalEmployeeName")
    public java.util.List<String> digitalEmployeeName;

    /**
     * <p>是否公开访问</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isOpen")
    public Boolean isOpen;

    /**
     * <p>执行模型档位；不传则不更新</p>
     * 
     * <strong>example:</strong>
     * <p>quick</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>文件名</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称.pdf</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("segments")
    public java.util.List<UpdateScheduledTaskRequestSegments> segments;

    @NameInMap("taskDetail")
    public UpdateScheduledTaskRequestTaskDetail taskDetail;

    /**
     * <p>任务 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleTaskId</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("triggerConfig")
    public UpdateScheduledTaskRequestTriggerConfig triggerConfig;

    public static UpdateScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledTaskRequest self = new UpdateScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledTaskRequest setDescription(java.util.List<UpdateScheduledTaskRequestDescription> description) {
        this.description = description;
        return this;
    }
    public java.util.List<UpdateScheduledTaskRequestDescription> getDescription() {
        return this.description;
    }

    public UpdateScheduledTaskRequest setDigitalEmployeeName(java.util.List<String> digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public java.util.List<String> getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public UpdateScheduledTaskRequest setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }
    public Boolean getIsOpen() {
        return this.isOpen;
    }

    public UpdateScheduledTaskRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdateScheduledTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateScheduledTaskRequest setSegments(java.util.List<UpdateScheduledTaskRequestSegments> segments) {
        this.segments = segments;
        return this;
    }
    public java.util.List<UpdateScheduledTaskRequestSegments> getSegments() {
        return this.segments;
    }

    public UpdateScheduledTaskRequest setTaskDetail(UpdateScheduledTaskRequestTaskDetail taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }
    public UpdateScheduledTaskRequestTaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    public UpdateScheduledTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateScheduledTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateScheduledTaskRequest setTriggerConfig(UpdateScheduledTaskRequestTriggerConfig triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public UpdateScheduledTaskRequestTriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    public static class UpdateScheduledTaskRequestDescription extends TeaModel {
        /**
         * <p>文本内容，type=text 时必填</p>
         * 
         * <strong>example:</strong>
         * <p>示例内容</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>功能开关，type=web_search 时可选</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>对象 ID，type=mention 时有值</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>对象类型如 customer，type=mention 时有值</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectType")
        public String objectType;

        /**
         * <p>技能编码，type=skill 时有值</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("skillCode")
        public String skillCode;

        /**
         * <p>元素类型：text|web_search|mention|skill</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateScheduledTaskRequestDescription build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduledTaskRequestDescription self = new UpdateScheduledTaskRequestDescription();
            return TeaModel.build(map, self);
        }

        public UpdateScheduledTaskRequestDescription setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateScheduledTaskRequestDescription setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateScheduledTaskRequestDescription setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateScheduledTaskRequestDescription setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public UpdateScheduledTaskRequestDescription setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public UpdateScheduledTaskRequestDescription setSkillCode(String skillCode) {
            this.skillCode = skillCode;
            return this;
        }
        public String getSkillCode() {
            return this.skillCode;
        }

        public UpdateScheduledTaskRequestDescription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateScheduledTaskRequestSegments extends TeaModel {
        /**
         * <p>文本内容，type=text 时必填</p>
         * 
         * <strong>example:</strong>
         * <p>示例内容</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>功能开关，type=web_search 时可选</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>对象 ID，type=mention 时有值</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>对象类型如 customer，type=mention 时有值</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectType")
        public String objectType;

        /**
         * <p>技能编码，type=skill 时有值</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("skillCode")
        public String skillCode;

        /**
         * <p>元素类型：text|web_search|mention|skill</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateScheduledTaskRequestSegments build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduledTaskRequestSegments self = new UpdateScheduledTaskRequestSegments();
            return TeaModel.build(map, self);
        }

        public UpdateScheduledTaskRequestSegments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateScheduledTaskRequestSegments setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateScheduledTaskRequestSegments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateScheduledTaskRequestSegments setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public UpdateScheduledTaskRequestSegments setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public UpdateScheduledTaskRequestSegments setSkillCode(String skillCode) {
            this.skillCode = skillCode;
            return this;
        }
        public String getSkillCode() {
            return this.skillCode;
        }

        public UpdateScheduledTaskRequestSegments setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateScheduledTaskRequestTaskDetailRelatedObjects extends TeaModel {
        /**
         * <p>提及类型，如 objects</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("mentionType")
        public String mentionType;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>对象 ID（@指定时有值）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>对象类型，如 customer、company</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectType")
        public String objectType;

        public static UpdateScheduledTaskRequestTaskDetailRelatedObjects build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduledTaskRequestTaskDetailRelatedObjects self = new UpdateScheduledTaskRequestTaskDetailRelatedObjects();
            return TeaModel.build(map, self);
        }

        public UpdateScheduledTaskRequestTaskDetailRelatedObjects setMentionType(String mentionType) {
            this.mentionType = mentionType;
            return this;
        }
        public String getMentionType() {
            return this.mentionType;
        }

        public UpdateScheduledTaskRequestTaskDetailRelatedObjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateScheduledTaskRequestTaskDetailRelatedObjects setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public UpdateScheduledTaskRequestTaskDetailRelatedObjects setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class UpdateScheduledTaskRequestTaskDetailRelatedSemantics extends TeaModel {
        /**
         * <p>语义属性（JSON 字符串），用于语义检索时过滤</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;level&quot;: &quot;VIP&quot;}</p>
         */
        @NameInMap("attributes")
        public String attributes;

        /**
         * <p>语义实体名，如客户/机会</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("entity")
        public String entity;

        public static UpdateScheduledTaskRequestTaskDetailRelatedSemantics build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduledTaskRequestTaskDetailRelatedSemantics self = new UpdateScheduledTaskRequestTaskDetailRelatedSemantics();
            return TeaModel.build(map, self);
        }

        public UpdateScheduledTaskRequestTaskDetailRelatedSemantics setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public UpdateScheduledTaskRequestTaskDetailRelatedSemantics setEntity(String entity) {
            this.entity = entity;
            return this;
        }
        public String getEntity() {
            return this.entity;
        }

    }

    public static class UpdateScheduledTaskRequestTaskDetailRelatedSkills extends TeaModel {
        /**
         * <p>技能展示名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>技能代码</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("skillCode")
        public String skillCode;

        /**
         * <p>sourceIds</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("sourceIds")
        public java.util.List<String> sourceIds;

        public static UpdateScheduledTaskRequestTaskDetailRelatedSkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduledTaskRequestTaskDetailRelatedSkills self = new UpdateScheduledTaskRequestTaskDetailRelatedSkills();
            return TeaModel.build(map, self);
        }

        public UpdateScheduledTaskRequestTaskDetailRelatedSkills setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateScheduledTaskRequestTaskDetailRelatedSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateScheduledTaskRequestTaskDetailRelatedSkills setSkillCode(String skillCode) {
            this.skillCode = skillCode;
            return this;
        }
        public String getSkillCode() {
            return this.skillCode;
        }

        public UpdateScheduledTaskRequestTaskDetailRelatedSkills setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

    }

    public static class UpdateScheduledTaskRequestTaskDetail extends TeaModel {
        @NameInMap("relatedObjects")
        public java.util.List<UpdateScheduledTaskRequestTaskDetailRelatedObjects> relatedObjects;

        @NameInMap("relatedSemantics")
        public java.util.List<UpdateScheduledTaskRequestTaskDetailRelatedSemantics> relatedSemantics;

        @NameInMap("relatedSkills")
        public java.util.List<UpdateScheduledTaskRequestTaskDetailRelatedSkills> relatedSkills;

        /**
         * <p>LLM 润色后的任务理解描述</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("taskUnderstand")
        public String taskUnderstand;

        public static UpdateScheduledTaskRequestTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduledTaskRequestTaskDetail self = new UpdateScheduledTaskRequestTaskDetail();
            return TeaModel.build(map, self);
        }

        public UpdateScheduledTaskRequestTaskDetail setRelatedObjects(java.util.List<UpdateScheduledTaskRequestTaskDetailRelatedObjects> relatedObjects) {
            this.relatedObjects = relatedObjects;
            return this;
        }
        public java.util.List<UpdateScheduledTaskRequestTaskDetailRelatedObjects> getRelatedObjects() {
            return this.relatedObjects;
        }

        public UpdateScheduledTaskRequestTaskDetail setRelatedSemantics(java.util.List<UpdateScheduledTaskRequestTaskDetailRelatedSemantics> relatedSemantics) {
            this.relatedSemantics = relatedSemantics;
            return this;
        }
        public java.util.List<UpdateScheduledTaskRequestTaskDetailRelatedSemantics> getRelatedSemantics() {
            return this.relatedSemantics;
        }

        public UpdateScheduledTaskRequestTaskDetail setRelatedSkills(java.util.List<UpdateScheduledTaskRequestTaskDetailRelatedSkills> relatedSkills) {
            this.relatedSkills = relatedSkills;
            return this;
        }
        public java.util.List<UpdateScheduledTaskRequestTaskDetailRelatedSkills> getRelatedSkills() {
            return this.relatedSkills;
        }

        public UpdateScheduledTaskRequestTaskDetail setTaskUnderstand(String taskUnderstand) {
            this.taskUnderstand = taskUnderstand;
            return this;
        }
        public String getTaskUnderstand() {
            return this.taskUnderstand;
        }

    }

    public static class UpdateScheduledTaskRequestTriggerConfigPushConfig extends TeaModel {
        /**
         * <p>推送渠道</p>
         * 
         * <strong>example:</strong>
         * <p>DINGTALK</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>推送内容范围，默认 all_replies</p>
         * 
         * <strong>example:</strong>
         * <p>all_replies</p>
         */
        @NameInMap("contentScope")
        public String contentScope;

        /**
         * <p>推送方式，默认 channel_bot</p>
         * 
         * <strong>example:</strong>
         * <p>channel_bot</p>
         */
        @NameInMap("deliveryMethod")
        public String deliveryMethod;

        /**
         * <p>是否推送该频道，默认关闭</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>产出文件推送格式，默认 file</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("fileFormat")
        public String fileFormat;

        /**
         * <p>发送机器人所属数字员工，必传且不可为空</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("operatingObjectName")
        public String operatingObjectName;

        /**
         * <p>接收人，当前仅支持 self</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("receiverType")
        public String receiverType;

        public static UpdateScheduledTaskRequestTriggerConfigPushConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduledTaskRequestTriggerConfigPushConfig self = new UpdateScheduledTaskRequestTriggerConfigPushConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScheduledTaskRequestTriggerConfigPushConfig setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public UpdateScheduledTaskRequestTriggerConfigPushConfig setContentScope(String contentScope) {
            this.contentScope = contentScope;
            return this;
        }
        public String getContentScope() {
            return this.contentScope;
        }

        public UpdateScheduledTaskRequestTriggerConfigPushConfig setDeliveryMethod(String deliveryMethod) {
            this.deliveryMethod = deliveryMethod;
            return this;
        }
        public String getDeliveryMethod() {
            return this.deliveryMethod;
        }

        public UpdateScheduledTaskRequestTriggerConfigPushConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateScheduledTaskRequestTriggerConfigPushConfig setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public UpdateScheduledTaskRequestTriggerConfigPushConfig setOperatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }
        public String getOperatingObjectName() {
            return this.operatingObjectName;
        }

        public UpdateScheduledTaskRequestTriggerConfigPushConfig setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

    }

    public static class UpdateScheduledTaskRequestTriggerConfig extends TeaModel {
        /**
         * <p>Cron 表达式，trigger_mode=scheduled 时必填，如 &quot;00 09 * * *&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>语言如 zh-CN|en-US，由服务端自动注入</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <p>任务推送频道列表；为空或无启用频道时不推送</p>
         */
        @NameInMap("pushConfig")
        public java.util.List<UpdateScheduledTaskRequestTriggerConfigPushConfig> pushConfig;

        /**
         * <p>时区如 Asia/Shanghai，由服务端自动注入</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>触发模式：manual|scheduled</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("triggerMode")
        public String triggerMode;

        public static UpdateScheduledTaskRequestTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduledTaskRequestTriggerConfig self = new UpdateScheduledTaskRequestTriggerConfig();
            return TeaModel.build(map, self);
        }

        public UpdateScheduledTaskRequestTriggerConfig setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public UpdateScheduledTaskRequestTriggerConfig setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public UpdateScheduledTaskRequestTriggerConfig setPushConfig(java.util.List<UpdateScheduledTaskRequestTriggerConfigPushConfig> pushConfig) {
            this.pushConfig = pushConfig;
            return this;
        }
        public java.util.List<UpdateScheduledTaskRequestTriggerConfigPushConfig> getPushConfig() {
            return this.pushConfig;
        }

        public UpdateScheduledTaskRequestTriggerConfig setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public UpdateScheduledTaskRequestTriggerConfig setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

    }

}
