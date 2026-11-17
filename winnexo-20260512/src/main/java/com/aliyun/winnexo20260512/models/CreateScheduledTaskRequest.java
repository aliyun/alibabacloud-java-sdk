// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskRequest extends TeaModel {
    /**
     * <p>The ID of the associated collaboration group (such as cg_101). If this parameter is passed, a group space task is created, and the caller must be a valid group member. If this parameter is empty, a personal task is created.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCollaborationGroupId</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The description of the to-do card type.</p>
     */
    @NameInMap("description")
    public java.util.List<CreateScheduledTaskRequestDescription> description;

    /**
     * <p>The name of the currently effective digital employee. This parameter is empty if it is not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;pcitc-magent&quot;]</p>
     */
    @NameInMap("digitalEmployeeName")
    public java.util.List<String> digitalEmployeeName;

    /**
     * <p>Specifies whether public access is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isOpen")
    public Boolean isOpen;

    /**
     * <p>The large model used by the assistant. The default value is empty, which indicates that DingTalk automatically selects the model.</p>
     * 
     * <strong>example:</strong>
     * <p>quick</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample name.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The output conversation mode. Default value: NEW_CONVERSATION.</p>
     * 
     * <strong>example:</strong>
     * <p>NEW_CONVERSATION</p>
     */
    @NameInMap("outputMode")
    public String outputMode;

    /**
     * <p>The site ID.</p>
     */
    @NameInMap("segments")
    public java.util.List<CreateScheduledTaskRequestSegments> segments;

    /**
     * <p>The task details.</p>
     */
    @NameInMap("taskDetail")
    public CreateScheduledTaskRequestTaskDetail taskDetail;

    /**
     * <p>The ID of the effective tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The trigger configuration of the scheduled task. triggerMode supports manual (manual trigger) and scheduled (scheduled trigger). If scheduled is used, cron must be specified. timezone and language are injected by the server, and the client does not need to pass them. pushConfig is the list of task push channels. If it is empty or no channel is enabled, no push is performed.</p>
     */
    @NameInMap("triggerConfig")
    public CreateScheduledTaskRequestTriggerConfig triggerConfig;

    /**
     * <p>The visibility scope of the group task. Valid values: PRIVATE (visible only to the creator and group owner), COLLABORATIVE (visible to specified collaboration members), and PUBLIC (visible to all group members). If this parameter is not passed for a group task, the default value is PRIVATE. This field is ignored for personal tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("visibility")
    public String visibility;

    /**
     * <p>The list of user IDs of collaboration members. This parameter takes effect only when visibility is set to COLLABORATIVE and is ignored for other values. A maximum of 1,000 user IDs can be specified. You do not need to pass the IDs of the task creator and group creator because they are covered by the authentication layer. This field is ignored for personal tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1002&quot;]</p>
     */
    @NameInMap("visibleMemberUserIds")
    public java.util.List<String> visibleMemberUserIds;

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

    public CreateScheduledTaskRequest setOutputMode(String outputMode) {
        this.outputMode = outputMode;
        return this;
    }
    public String getOutputMode() {
        return this.outputMode;
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

    public CreateScheduledTaskRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public CreateScheduledTaskRequest setVisibleMemberUserIds(java.util.List<String> visibleMemberUserIds) {
        this.visibleMemberUserIds = visibleMemberUserIds;
        return this;
    }
    public java.util.List<String> getVisibleMemberUserIds() {
        return this.visibleMemberUserIds;
    }

    public static class CreateScheduledTaskRequestDescription extends TeaModel {
        /**
         * <p>The streaming output message.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample content</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Specifies whether the throttling rule is enabled. A value of true indicates that the rule is enabled, and a value of false indicates that the rule is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample name.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The object ID. Pass the project task ID.</p>
         * <ul>
         * <li>For internal enterprise applications, call the <a href="https://open.dingtalk.com/document/orgapp-server/create-a-project-task">Create a project task</a> API to obtain the taskId.</li>
         * <li>For third-party enterprise applications, call the <a href="https://open.dingtalk.com/document/isvapp-server/create-a-project-task">Create a project task</a> API to obtain the taskId.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The object type. Set the value to task, which indicates a project task.</p>
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
         * <p>The HTTP API type. Valid values: Http (common HTTP API), Rest (RESTful API), WebSocket (WebSocket API), HttpIngress (HTTP API accessed through Ingress), LLM (large language model API), and Agent (agent API).</p>
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
         * <p>The card callback content.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample content</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Specifies whether to enable the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample name.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the recommended item. The value can be a <strong>feedId</strong> or a mini-app ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The saved customer type.</p>
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
         * <p>The billing type. Currently, only fixed is supported.</p>
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
         * <p>The mention type, such as objects.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("mentionType")
        public String mentionType;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample name.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The object ID. Pass the project task ID.</p>
         * <ul>
         * <li>For internal enterprise applications, call the <a href="https://open.dingtalk.com/document/orgapp-server/create-a-project-task">Create a project task</a> API to obtain the taskId.</li>
         * <li>For third-party enterprise applications, call the <a href="https://open.dingtalk.com/document/isvapp-server/create-a-project-task">Create a project task</a> API to obtain the taskId.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The relationship type. Valid values:</p>
         * <ul>
         * <li>crm_customer: Enterprise customer.</li>
         * <li>crm_customer_personal: Individual customer.</li>
         * </ul>
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
         * <p>The file extension information.</p>
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
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample name.pdf</p>
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
         * <p>[&quot;113424&quot;]</p>
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
        /**
         * <p>The associated objects.</p>
         */
        @NameInMap("relatedObjects")
        public java.util.List<CreateScheduledTaskRequestTaskDetailRelatedObjects> relatedObjects;

        /**
         * <p>The associated semantics.</p>
         */
        @NameInMap("relatedSemantics")
        public java.util.List<CreateScheduledTaskRequestTaskDetailRelatedSemantics> relatedSemantics;

        /**
         * <p>The associated skills.</p>
         */
        @NameInMap("relatedSkills")
        public java.util.List<CreateScheduledTaskRequestTaskDetailRelatedSkills> relatedSkills;

        /**
         * <p>The task understanding description polished by the LLM.</p>
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
         * <p>The notification method. Valid values:</p>
         * <ul>
         * <li><strong>hdm_alarm_sms</strong>: Text message.</li>
         * <li><strong>dingtalk</strong>: DingTalk chatbot.</li>
         * <li><strong>hdm_alarm_sms_and_email</strong>: Text message and email.</li>
         * <li><strong>hdm_alarm_sms,dingtalk</strong>: Text message and DingTalk chatbot.</li>
         * </ul>
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
         * <p>The push method. Default value: channel_bot.</p>
         * 
         * <strong>example:</strong>
         * <p>channel_bot</p>
         */
        @NameInMap("deliveryMethod")
        public String deliveryMethod;

        /**
         * <p>Specifies whether the credential is enabled. Valid values:</p>
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
         * <p>The file format, such as Excel or CSV.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("fileFormat")
        public String fileFormat;

        /**
         * <p>The name of the digital employee (the name of the operating object, optional).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("operatingObjectName")
        public String operatingObjectName;

        /**
         * <p>The type of the file receiver. Valid values:</p>
         * <ul>
         * <li>0: Private chat.</li>
         * <li>1: Group chat.</li>
         * <li>2: DingTalk Drive.</li>
         * <li>3: Document.</li>
         * </ul>
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
         * <p>The periodic training information. The cron syntax is used (Minutes Hours DayofMonth Month DayofWeek). If this parameter is empty, periodic training is not performed, which is the default value. In DayofWeek, 0 indicates Sunday.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>The language. Valid values:</p>
         * <ul>
         * <li>zh_CN: Chinese. This is the default value.</li>
         * <li>en_US: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <p>The list of task push channels. If this parameter is empty or no channel is enabled, no push is performed.</p>
         */
        @NameInMap("pushConfig")
        public java.util.List<CreateScheduledTaskRequestTriggerConfigPushConfig> pushConfig;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The trigger mode. Valid values:</p>
         * <ul>
         * <li>1: Manual trigger.</li>
         * <li>2: Scheduled trigger.</li>
         * <li>3: Code commit trigger.</li>
         * <li>5: Pipeline trigger.</li>
         * <li>6: WEBHOOK trigger.</li>
         * </ul>
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
