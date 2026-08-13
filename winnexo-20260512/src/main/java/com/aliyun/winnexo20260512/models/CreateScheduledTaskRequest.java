// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskRequest extends TeaModel {
    /**
     * <p>所属协作群组 ID（如 cg_101）；传入时创建群空间任务（调用者需为有效群成员），为空创建个人任务</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCollaborationGroupId</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    @NameInMap("description")
    public java.util.List<CreateScheduledTaskRequestDescription> description;

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
     * <p>执行模型档位，不传默认 standard</p>
     * 
     * <strong>example:</strong>
     * <p>quick</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>文件名</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称.pdf</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("segments")
    public java.util.List<CreateScheduledTaskRequestSegments> segments;

    @NameInMap("taskDetail")
    public CreateScheduledTaskRequestTaskDetail taskDetail;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("triggerConfig")
    public CreateScheduledTaskRequestTriggerConfig triggerConfig;

    public static CreateScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskRequest self = new CreateScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateScheduledTaskRequest setDescription(java.util.List<CreateScheduledTaskRequestDescription> description) {
        this.description = description;
        return this;
    }
    public java.util.List<CreateScheduledTaskRequestDescription> getDescription() {
        return this.description;
    }

    public CreateScheduledTaskRequest setDigitalEmployeeName(java.util.List<String> digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public java.util.List<String> getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public CreateScheduledTaskRequest setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }
    public Boolean getIsOpen() {
        return this.isOpen;
    }

    public CreateScheduledTaskRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateScheduledTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateScheduledTaskRequest setSegments(java.util.List<CreateScheduledTaskRequestSegments> segments) {
        this.segments = segments;
        return this;
    }
    public java.util.List<CreateScheduledTaskRequestSegments> getSegments() {
        return this.segments;
    }

    public CreateScheduledTaskRequest setTaskDetail(CreateScheduledTaskRequestTaskDetail taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }
    public CreateScheduledTaskRequestTaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    public CreateScheduledTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateScheduledTaskRequest setTriggerConfig(CreateScheduledTaskRequestTriggerConfig triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public CreateScheduledTaskRequestTriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    public static class CreateScheduledTaskRequestDescription extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateScheduledTaskRequestDescription build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledTaskRequestDescription self = new CreateScheduledTaskRequestDescription();
            return TeaModel.build(map, self);
        }

        public CreateScheduledTaskRequestDescription setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateScheduledTaskRequestDescription setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateScheduledTaskRequestDescription setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateScheduledTaskRequestDescription setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public CreateScheduledTaskRequestDescription setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public CreateScheduledTaskRequestDescription setSkillCode(String skillCode) {
            this.skillCode = skillCode;
            return this;
        }
        public String getSkillCode() {
            return this.skillCode;
        }

        public CreateScheduledTaskRequestDescription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateScheduledTaskRequestSegments extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateScheduledTaskRequestSegments build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledTaskRequestSegments self = new CreateScheduledTaskRequestSegments();
            return TeaModel.build(map, self);
        }

        public CreateScheduledTaskRequestSegments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateScheduledTaskRequestSegments setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateScheduledTaskRequestSegments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateScheduledTaskRequestSegments setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public CreateScheduledTaskRequestSegments setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public CreateScheduledTaskRequestSegments setSkillCode(String skillCode) {
            this.skillCode = skillCode;
            return this;
        }
        public String getSkillCode() {
            return this.skillCode;
        }

        public CreateScheduledTaskRequestSegments setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateScheduledTaskRequestTaskDetailRelatedObjects extends TeaModel {
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

        public static CreateScheduledTaskRequestTaskDetailRelatedObjects build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledTaskRequestTaskDetailRelatedObjects self = new CreateScheduledTaskRequestTaskDetailRelatedObjects();
            return TeaModel.build(map, self);
        }

        public CreateScheduledTaskRequestTaskDetailRelatedObjects setMentionType(String mentionType) {
            this.mentionType = mentionType;
            return this;
        }
        public String getMentionType() {
            return this.mentionType;
        }

        public CreateScheduledTaskRequestTaskDetailRelatedObjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateScheduledTaskRequestTaskDetailRelatedObjects setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public CreateScheduledTaskRequestTaskDetailRelatedObjects setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class CreateScheduledTaskRequestTaskDetailRelatedSemantics extends TeaModel {
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

        public static CreateScheduledTaskRequestTaskDetailRelatedSemantics build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledTaskRequestTaskDetailRelatedSemantics self = new CreateScheduledTaskRequestTaskDetailRelatedSemantics();
            return TeaModel.build(map, self);
        }

        public CreateScheduledTaskRequestTaskDetailRelatedSemantics setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public CreateScheduledTaskRequestTaskDetailRelatedSemantics setEntity(String entity) {
            this.entity = entity;
            return this;
        }
        public String getEntity() {
            return this.entity;
        }

    }

    public static class CreateScheduledTaskRequestTaskDetailRelatedSkills extends TeaModel {
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

        public static CreateScheduledTaskRequestTaskDetailRelatedSkills build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledTaskRequestTaskDetailRelatedSkills self = new CreateScheduledTaskRequestTaskDetailRelatedSkills();
            return TeaModel.build(map, self);
        }

        public CreateScheduledTaskRequestTaskDetailRelatedSkills setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateScheduledTaskRequestTaskDetailRelatedSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateScheduledTaskRequestTaskDetailRelatedSkills setSkillCode(String skillCode) {
            this.skillCode = skillCode;
            return this;
        }
        public String getSkillCode() {
            return this.skillCode;
        }

        public CreateScheduledTaskRequestTaskDetailRelatedSkills setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

    }

    public static class CreateScheduledTaskRequestTaskDetail extends TeaModel {
        @NameInMap("relatedObjects")
        public java.util.List<CreateScheduledTaskRequestTaskDetailRelatedObjects> relatedObjects;

        @NameInMap("relatedSemantics")
        public java.util.List<CreateScheduledTaskRequestTaskDetailRelatedSemantics> relatedSemantics;

        @NameInMap("relatedSkills")
        public java.util.List<CreateScheduledTaskRequestTaskDetailRelatedSkills> relatedSkills;

        /**
         * <p>LLM 润色后的任务理解描述</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("taskUnderstand")
        public String taskUnderstand;

        public static CreateScheduledTaskRequestTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledTaskRequestTaskDetail self = new CreateScheduledTaskRequestTaskDetail();
            return TeaModel.build(map, self);
        }

        public CreateScheduledTaskRequestTaskDetail setRelatedObjects(java.util.List<CreateScheduledTaskRequestTaskDetailRelatedObjects> relatedObjects) {
            this.relatedObjects = relatedObjects;
            return this;
        }
        public java.util.List<CreateScheduledTaskRequestTaskDetailRelatedObjects> getRelatedObjects() {
            return this.relatedObjects;
        }

        public CreateScheduledTaskRequestTaskDetail setRelatedSemantics(java.util.List<CreateScheduledTaskRequestTaskDetailRelatedSemantics> relatedSemantics) {
            this.relatedSemantics = relatedSemantics;
            return this;
        }
        public java.util.List<CreateScheduledTaskRequestTaskDetailRelatedSemantics> getRelatedSemantics() {
            return this.relatedSemantics;
        }

        public CreateScheduledTaskRequestTaskDetail setRelatedSkills(java.util.List<CreateScheduledTaskRequestTaskDetailRelatedSkills> relatedSkills) {
            this.relatedSkills = relatedSkills;
            return this;
        }
        public java.util.List<CreateScheduledTaskRequestTaskDetailRelatedSkills> getRelatedSkills() {
            return this.relatedSkills;
        }

        public CreateScheduledTaskRequestTaskDetail setTaskUnderstand(String taskUnderstand) {
            this.taskUnderstand = taskUnderstand;
            return this;
        }
        public String getTaskUnderstand() {
            return this.taskUnderstand;
        }

    }

    public static class CreateScheduledTaskRequestTriggerConfigPushConfig extends TeaModel {
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

        public static CreateScheduledTaskRequestTriggerConfigPushConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledTaskRequestTriggerConfigPushConfig self = new CreateScheduledTaskRequestTriggerConfigPushConfig();
            return TeaModel.build(map, self);
        }

        public CreateScheduledTaskRequestTriggerConfigPushConfig setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public CreateScheduledTaskRequestTriggerConfigPushConfig setContentScope(String contentScope) {
            this.contentScope = contentScope;
            return this;
        }
        public String getContentScope() {
            return this.contentScope;
        }

        public CreateScheduledTaskRequestTriggerConfigPushConfig setDeliveryMethod(String deliveryMethod) {
            this.deliveryMethod = deliveryMethod;
            return this;
        }
        public String getDeliveryMethod() {
            return this.deliveryMethod;
        }

        public CreateScheduledTaskRequestTriggerConfigPushConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateScheduledTaskRequestTriggerConfigPushConfig setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public CreateScheduledTaskRequestTriggerConfigPushConfig setOperatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }
        public String getOperatingObjectName() {
            return this.operatingObjectName;
        }

        public CreateScheduledTaskRequestTriggerConfigPushConfig setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

    }

    public static class CreateScheduledTaskRequestTriggerConfig extends TeaModel {
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
        public java.util.List<CreateScheduledTaskRequestTriggerConfigPushConfig> pushConfig;

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
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("triggerMode")
        public String triggerMode;

        public static CreateScheduledTaskRequestTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledTaskRequestTriggerConfig self = new CreateScheduledTaskRequestTriggerConfig();
            return TeaModel.build(map, self);
        }

        public CreateScheduledTaskRequestTriggerConfig setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreateScheduledTaskRequestTriggerConfig setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public CreateScheduledTaskRequestTriggerConfig setPushConfig(java.util.List<CreateScheduledTaskRequestTriggerConfigPushConfig> pushConfig) {
            this.pushConfig = pushConfig;
            return this;
        }
        public java.util.List<CreateScheduledTaskRequestTriggerConfigPushConfig> getPushConfig() {
            return this.pushConfig;
        }

        public CreateScheduledTaskRequestTriggerConfig setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public CreateScheduledTaskRequestTriggerConfig setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

    }

}
