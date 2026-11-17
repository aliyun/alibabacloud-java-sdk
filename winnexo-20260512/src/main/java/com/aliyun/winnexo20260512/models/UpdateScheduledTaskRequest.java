// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateScheduledTaskRequest extends TeaModel {
    /**
     * <p>The description.</p>
     */
    @NameInMap("description")
    public java.util.List<UpdateScheduledTaskRequestDescription> description;

    /**
     * <p>The list of digital employee names.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;test&quot;]</p>
     */
    @NameInMap("digitalEmployeeName")
    public java.util.List<String> digitalEmployeeName;

    /**
     * <p>Specifies whether public access is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isOpen")
    public Boolean isOpen;

    /**
     * <p>The execution model tier. If this parameter is not specified, the model tier is not updated.</p>
     * 
     * <strong>example:</strong>
     * <p>quick</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>The file name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The output conversation mode. If this parameter is omitted, the current configuration is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>SAME_CONVERSATION</p>
     */
    @NameInMap("outputMode")
    public String outputMode;

    /**
     * <p>The segments.</p>
     */
    @NameInMap("segments")
    public java.util.List<UpdateScheduledTaskRequestSegments> segments;

    /**
     * <p>The task details.</p>
     */
    @NameInMap("taskDetail")
    public UpdateScheduledTaskRequestTaskDetail taskDetail;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleTaskId</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The trigger configuration. The configuration varies based on the trigger type.</p>
     */
    @NameInMap("triggerConfig")
    public UpdateScheduledTaskRequestTriggerConfig triggerConfig;

    /**
     * <p>The visibility scope adjustment for group tasks. Valid values: PRIVATE (visible only to the creator and group owner), COLLABORATIVE (visible to specified collaborators), and PUBLIC (visible to all group members). If this parameter is not specified, the visibility scope is not updated. This field is ignored for personal tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>COLLABORATIVE</p>
     */
    @NameInMap("visibility")
    public String visibility;

    /**
     * <p>The full replacement list of collaborators. This parameter takes effect only when visibility is set to COLLABORATIVE. When the visibility is changed from COLLABORATIVE to another value, the list is cleared. A maximum of 1,000 members are supported. If this parameter is not specified, the members are not updated. You do not need to specify the task creator and group creator because they are covered by the authentication layer. This field is ignored for personal tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;10001&quot;]</p>
     */
    @NameInMap("visibleMemberUserIds")
    public java.util.List<String> visibleMemberUserIds;

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

    public UpdateScheduledTaskRequest setOutputMode(String outputMode) {
        this.outputMode = outputMode;
        return this;
    }
    public String getOutputMode() {
        return this.outputMode;
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

    public UpdateScheduledTaskRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public UpdateScheduledTaskRequest setVisibleMemberUserIds(java.util.List<String> visibleMemberUserIds) {
        this.visibleMemberUserIds = visibleMemberUserIds;
        return this;
    }
    public java.util.List<String> getVisibleMemberUserIds() {
        return this.visibleMemberUserIds;
    }

    public static class UpdateScheduledTaskRequestDescription extends TeaModel {
        /**
         * <p>The text content. This parameter is required when type is set to text.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample content</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Specifies whether the feature is enabled. This parameter is optional when type is set to web_search.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The object ID. This parameter has a value when type is set to mention.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The object type, such as customer. This parameter has a value when type is set to mention.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectType")
        public String objectType;

        /**
         * <p>The skill code. This parameter has a value when type is set to skill.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("skillCode")
        public String skillCode;

        /**
         * <p>The element type. Valid values: text, web_search, mention, and skill.</p>
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
         * <p>The text content. This parameter is required when type is set to text.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample content</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Specifies whether the feature is enabled. This parameter is optional when type is set to web_search.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The object ID. This parameter has a value when type is set to mention.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The object type, such as customer. This parameter has a value when type is set to mention.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("objectType")
        public String objectType;

        /**
         * <p>The skill code. This parameter has a value when type is set to skill.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("skillCode")
        public String skillCode;

        /**
         * <p>The element type. Valid values: text, web_search, mention, and skill.</p>
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
         * <p>The mention type, such as objects.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("mentionType")
        public String mentionType;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The object ID. This parameter has a value when the object is specified by using the @ symbol.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The object type, such as customer or company.</p>
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
         * <p>The semantic attributes in JSON string format. This parameter is used for filtering during semantic retrieval.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;level&quot;: &quot;VIP&quot;}</p>
         */
        @NameInMap("attributes")
        public String attributes;

        /**
         * <p>The semantic entity name, such as customer or opportunity.</p>
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
         * <p>The display name of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The skill code.</p>
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
         * <p>[&quot;sourceIds&quot;]</p>
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
        /**
         * <p>The related objects.</p>
         */
        @NameInMap("relatedObjects")
        public java.util.List<UpdateScheduledTaskRequestTaskDetailRelatedObjects> relatedObjects;

        /**
         * <p>The related semantics.</p>
         */
        @NameInMap("relatedSemantics")
        public java.util.List<UpdateScheduledTaskRequestTaskDetailRelatedSemantics> relatedSemantics;

        /**
         * <p>The related skills.</p>
         */
        @NameInMap("relatedSkills")
        public java.util.List<UpdateScheduledTaskRequestTaskDetailRelatedSkills> relatedSkills;

        /**
         * <p>The task understanding description refined by the large language model (LLM).</p>
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
         * <p>The push channel.</p>
         * 
         * <strong>example:</strong>
         * <p>DINGTALK</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>The scope of the push content. Default value: all_replies.</p>
         * 
         * <strong>example:</strong>
         * <p>all_replies</p>
         */
        @NameInMap("contentScope")
        public String contentScope;

        /**
         * <p>The delivery method. Default value: channel_bot.</p>
         * 
         * <strong>example:</strong>
         * <p>channel_bot</p>
         */
        @NameInMap("deliveryMethod")
        public String deliveryMethod;

        /**
         * <p>Specifies whether to push notifications to the channel. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The push format for output files. Default value: file.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("fileFormat")
        public String fileFormat;

        /**
         * <p>The digital employee to which the sending bot belongs. This parameter is required and cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("operatingObjectName")
        public String operatingObjectName;

        /**
         * <p>The recipient. Only self is supported.</p>
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
         * <p>The cron expression. This parameter is required when trigger_mode is set to scheduled. Example: 00 09 * * *.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>The language, such as zh-CN or en-US. This parameter is automatically injected by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <p>The list of task push channels. If the list is empty or no channel is enabled, no push notification is sent.</p>
         */
        @NameInMap("pushConfig")
        public java.util.List<UpdateScheduledTaskRequestTriggerConfigPushConfig> pushConfig;

        /**
         * <p>The time zone, such as Asia/Shanghai. This parameter is automatically injected by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The trigger mode. Valid values: manual and scheduled.</p>
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
