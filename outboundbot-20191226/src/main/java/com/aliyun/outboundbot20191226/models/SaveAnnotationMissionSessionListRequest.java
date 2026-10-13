// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveAnnotationMissionSessionListRequest extends TeaModel {
    /**
     * <p>The ID of the agent.</p>
     * <blockquote>
     * <p>You can obtain this value by calling the DescribeInstance API operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1198938</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The key of the workspace. If you do not specify this parameter, the default workspace is accessed. You can obtain the key value on the Business Management page of the Alibaba Cloud account.</p>
     * <blockquote>
     * <p>You can obtain this value by calling the DescribeInstance API operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9137ab9c27044921860030adf8590ec4_p_outbound_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The data source of the annotation task. Valid values:</p>
     * <ul>
     * <li>1: outbound call</li>
     * <li>2: voice navigation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AnnotationMissionDataSourceType")
    public Long annotationMissionDataSourceType;

    /**
     * <p>The session list.</p>
     * <blockquote>
     * <p>This parameter serves the same purpose as the AnnotationMissionSessionListJsonString parameter. Specify only one of them.</p>
     * </blockquote>
     */
    @NameInMap("AnnotationMissionSessionList")
    public java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList> annotationMissionSessionList;

    /**
     * <p>The JSON string of the session list.</p>
     * <blockquote>
     * <p>This parameter serves the same purpose as AnnotationMissionSessionList. Specify only one of them.
     * The JSON fields correspond to the parameters of AnnotationMissionSessionList.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;jobGroupId&quot;:&quot;4093e364-57dc-4a89-83e0-a88454642596&quot;,&quot;modifiedTime&quot;:1744971010000,&quot;instanceId&quot;:&quot;00b37342-e759-4fe5-b296-aef775933af0&quot;,&quot;version&quot;:0,&quot;annotationMissionId&quot;:&quot;3d4bfd93-0d16-4873-9d77-e4fb1771e5cf&quot;,&quot;createTime&quot;:1744971010000,&quot;annotationMissionSessionId&quot;:&quot;42032063-8ef2-48e1-bc99-587b51581742&quot;,&quot;scriptId&quot;:&quot;bc50d543-6d52-4df8-8fb0-50f31ee9c1ff&quot;,&quot;sessionId&quot;:&quot;641a2c43-5e2a-4535-8a4d-c66d4b4258d6&quot;,&quot;jobId&quot;:&quot;fa54c5bb-d8a7-40ae-a32e-9a4a0c734ce5&quot;,&quot;annotationStatus&quot;:2,&quot;debugConversation&quot;:false}]</p>
     */
    @NameInMap("AnnotationMissionSessionListJsonString")
    public String annotationMissionSessionListJsonString;

    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li>0: NONE</li>
     * <li>1: private cloud</li>
     * <li>2: public cloud</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Environment")
    public Long environment;

    /**
     * <p>The nickname of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("UserNick")
    public String userNick;

    public static SaveAnnotationMissionSessionListRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAnnotationMissionSessionListRequest self = new SaveAnnotationMissionSessionListRequest();
        return TeaModel.build(map, self);
    }

    public SaveAnnotationMissionSessionListRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public SaveAnnotationMissionSessionListRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SaveAnnotationMissionSessionListRequest setAnnotationMissionDataSourceType(Long annotationMissionDataSourceType) {
        this.annotationMissionDataSourceType = annotationMissionDataSourceType;
        return this;
    }
    public Long getAnnotationMissionDataSourceType() {
        return this.annotationMissionDataSourceType;
    }

    public SaveAnnotationMissionSessionListRequest setAnnotationMissionSessionList(java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList> annotationMissionSessionList) {
        this.annotationMissionSessionList = annotationMissionSessionList;
        return this;
    }
    public java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList> getAnnotationMissionSessionList() {
        return this.annotationMissionSessionList;
    }

    public SaveAnnotationMissionSessionListRequest setAnnotationMissionSessionListJsonString(String annotationMissionSessionListJsonString) {
        this.annotationMissionSessionListJsonString = annotationMissionSessionListJsonString;
        return this;
    }
    public String getAnnotationMissionSessionListJsonString() {
        return this.annotationMissionSessionListJsonString;
    }

    public SaveAnnotationMissionSessionListRequest setEnvironment(Long environment) {
        this.environment = environment;
        return this;
    }
    public Long getEnvironment() {
        return this.environment;
    }

    public SaveAnnotationMissionSessionListRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

    public static class SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList extends TeaModel {
        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>b598a47a-7c03-45fb-af6b-343950dd9512</p>
         */
        @NameInMap("AnnotationMissionChatCustomizationDataInfoId")
        public String annotationMissionChatCustomizationDataInfoId;

        /**
         * <p>chat ID</p>
         * 
         * <strong>example:</strong>
         * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
         */
        @NameInMap("AnnotationMissionChatId")
        public String annotationMissionChatId;

        /**
         * <p>The annotation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>03f56192-fa8a-40dc-9558-39b357f0618f</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
         */
        @NameInMap("AnnotationMissionSessionId")
        public String annotationMissionSessionId;

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>You are now proactively invited to apply. This is a rare opportunity. The credit limit is free of charge if left unused and can be used as your reserve fund. The funds can be credited to your account in as fast as 5 minutes. We recommend that you claim the credit limit for free first</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Specifies whether to create the item.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Create")
        public Boolean create;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1682316909210</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Default data description</p>
         */
        @NameInMap("CustomizationDataDescription")
        public String customizationDataDescription;

        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
         */
        @NameInMap("CustomizationDataId")
        public String customizationDataId;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default data</p>
         */
        @NameInMap("CustomizationDataName")
        public String customizationDataName;

        /**
         * <p>The language model data weight.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomizationDataWeight")
        public Integer customizationDataWeight;

        /**
         * <p>Specifies whether to delete the item.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b598a47a-7c03-45fb-af6b-343950dd9512</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1673438100000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        public static SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList build(java.util.Map<String, ?> map) throws Exception {
            SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList self = new SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList();
            return TeaModel.build(map, self);
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setAnnotationMissionChatCustomizationDataInfoId(String annotationMissionChatCustomizationDataInfoId) {
            this.annotationMissionChatCustomizationDataInfoId = annotationMissionChatCustomizationDataInfoId;
            return this;
        }
        public String getAnnotationMissionChatCustomizationDataInfoId() {
            return this.annotationMissionChatCustomizationDataInfoId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setAnnotationMissionChatId(String annotationMissionChatId) {
            this.annotationMissionChatId = annotationMissionChatId;
            return this;
        }
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setAnnotationMissionSessionId(String annotationMissionSessionId) {
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setCreate(Boolean create) {
            this.create = create;
            return this;
        }
        public Boolean getCreate() {
            return this.create;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setCustomizationDataDescription(String customizationDataDescription) {
            this.customizationDataDescription = customizationDataDescription;
            return this;
        }
        public String getCustomizationDataDescription() {
            return this.customizationDataDescription;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setCustomizationDataId(String customizationDataId) {
            this.customizationDataId = customizationDataId;
            return this;
        }
        public String getCustomizationDataId() {
            return this.customizationDataId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setCustomizationDataName(String customizationDataName) {
            this.customizationDataName = customizationDataName;
            return this;
        }
        public String getCustomizationDataName() {
            return this.customizationDataName;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setCustomizationDataWeight(Integer customizationDataWeight) {
            this.customizationDataWeight = customizationDataWeight;
            return this;
        }
        public Integer getCustomizationDataWeight() {
            return this.customizationDataWeight;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList extends TeaModel {
        /**
         * <p>chat ID</p>
         * 
         * <strong>example:</strong>
         * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
         */
        @NameInMap("AnnotationMissionChatId")
        public String annotationMissionChatId;

        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
         */
        @NameInMap("AnnotationMissionChatIntentUserSayInfoId")
        public String annotationMissionChatIntentUserSayInfoId;

        /**
         * <p>The annotation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
         */
        @NameInMap("AnnotationMissionSessionId")
        public String annotationMissionSessionId;

        /**
         * <p>The robot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
         */
        @NameInMap("BotId")
        public String botId;

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Specifies whether to create the item.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Create")
        public Boolean create;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683858248778</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Specifies whether to delete the item.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

        /**
         * <p>The dialog ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2991201</p>
         */
        @NameInMap("DialogId")
        public Long dialogId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The intent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>119839</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683858248778</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        public static SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList build(java.util.Map<String, ?> map) throws Exception {
            SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList self = new SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList();
            return TeaModel.build(map, self);
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setAnnotationMissionChatId(String annotationMissionChatId) {
            this.annotationMissionChatId = annotationMissionChatId;
            return this;
        }
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setAnnotationMissionChatIntentUserSayInfoId(String annotationMissionChatIntentUserSayInfoId) {
            this.annotationMissionChatIntentUserSayInfoId = annotationMissionChatIntentUserSayInfoId;
            return this;
        }
        public String getAnnotationMissionChatIntentUserSayInfoId() {
            return this.annotationMissionChatIntentUserSayInfoId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setAnnotationMissionSessionId(String annotationMissionSessionId) {
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setCreate(Boolean create) {
            this.create = create;
            return this;
        }
        public Boolean getCreate() {
            return this.create;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setDialogId(Long dialogId) {
            this.dialogId = dialogId;
            return this;
        }
        public Long getDialogId() {
            return this.dialogId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList extends TeaModel {
        /**
         * <p>chat ID</p>
         * 
         * <strong>example:</strong>
         * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
         */
        @NameInMap("AnnotationMissionChatId")
        public String annotationMissionChatId;

        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("AnnotationMissionChatTagInfoId")
        public String annotationMissionChatTagInfoId;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
         */
        @NameInMap("AnnotationMissionSessionId")
        public String annotationMissionSessionId;

        /**
         * <p>tag ID</p>
         * 
         * <strong>example:</strong>
         * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
         */
        @NameInMap("AnnotationMissionTagInfoId")
        public String annotationMissionTagInfoId;

        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AnnotationMissionTagInfoName")
        public String annotationMissionTagInfoName;

        /**
         * <p>Specifies whether to create the item.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Create")
        public Boolean create;

        /**
         * <p>The end time of the annotation mission group.</p>
         * 
         * <strong>example:</strong>
         * <p>1679710866060</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Specifies whether to delete the item.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32be9d94-1346-4c4a-a4d0-ccd379f87013</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1679710866060</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        public static SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList build(java.util.Map<String, ?> map) throws Exception {
            SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList self = new SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList();
            return TeaModel.build(map, self);
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setAnnotationMissionChatId(String annotationMissionChatId) {
            this.annotationMissionChatId = annotationMissionChatId;
            return this;
        }
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setAnnotationMissionChatTagInfoId(String annotationMissionChatTagInfoId) {
            this.annotationMissionChatTagInfoId = annotationMissionChatTagInfoId;
            return this;
        }
        public String getAnnotationMissionChatTagInfoId() {
            return this.annotationMissionChatTagInfoId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setAnnotationMissionSessionId(String annotationMissionSessionId) {
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setAnnotationMissionTagInfoId(String annotationMissionTagInfoId) {
            this.annotationMissionTagInfoId = annotationMissionTagInfoId;
            return this;
        }
        public String getAnnotationMissionTagInfoId() {
            return this.annotationMissionTagInfoId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setAnnotationMissionTagInfoName(String annotationMissionTagInfoName) {
            this.annotationMissionTagInfoName = annotationMissionTagInfoName;
            return this;
        }
        public String getAnnotationMissionTagInfoName() {
            return this.annotationMissionTagInfoName;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setCreate(Boolean create) {
            this.create = create;
            return this;
        }
        public Boolean getCreate() {
            return this.create;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList extends TeaModel {
        /**
         * <p>chat ID</p>
         * 
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("AnnotationMissionChatId")
        public String annotationMissionChatId;

        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("AnnotationMissionChatVocabularyInfoId")
        public String annotationMissionChatVocabularyInfoId;

        /**
         * <p>The annotation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("AnnotationMissionSessionId")
        public String annotationMissionSessionId;

        /**
         * <p>Specifies whether to create the item.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Create")
        public Boolean create;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1677552860720</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Specifies whether to delete the item.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1679283408230</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The hot word annotation content.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Vocabulary")
        public String vocabulary;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>After-sales consultation</p>
         */
        @NameInMap("VocabularyDescription")
        public String vocabularyDescription;

        /**
         * <p>The hot word ID.</p>
         * 
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("VocabularyId")
        public String vocabularyId;

        /**
         * <p>The processing scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>Consultation</p>
         */
        @NameInMap("VocabularyName")
        public String vocabularyName;

        /**
         * <p>The hot word weight. Valid values: -6 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VocabularyWeight")
        public Integer vocabularyWeight;

        public static SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList build(java.util.Map<String, ?> map) throws Exception {
            SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList self = new SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList();
            return TeaModel.build(map, self);
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setAnnotationMissionChatId(String annotationMissionChatId) {
            this.annotationMissionChatId = annotationMissionChatId;
            return this;
        }
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setAnnotationMissionChatVocabularyInfoId(String annotationMissionChatVocabularyInfoId) {
            this.annotationMissionChatVocabularyInfoId = annotationMissionChatVocabularyInfoId;
            return this;
        }
        public String getAnnotationMissionChatVocabularyInfoId() {
            return this.annotationMissionChatVocabularyInfoId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setAnnotationMissionSessionId(String annotationMissionSessionId) {
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setCreate(Boolean create) {
            this.create = create;
            return this;
        }
        public Boolean getCreate() {
            return this.create;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setVocabulary(String vocabulary) {
            this.vocabulary = vocabulary;
            return this;
        }
        public String getVocabulary() {
            return this.vocabulary;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setVocabularyDescription(String vocabularyDescription) {
            this.vocabularyDescription = vocabularyDescription;
            return this;
        }
        public String getVocabularyDescription() {
            return this.vocabularyDescription;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setVocabularyName(String vocabularyName) {
            this.vocabularyName = vocabularyName;
            return this;
        }
        public String getVocabularyName() {
            return this.vocabularyName;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setVocabularyWeight(Integer vocabularyWeight) {
            this.vocabularyWeight = vocabularyWeight;
            return this;
        }
        public Integer getVocabularyWeight() {
            return this.vocabularyWeight;
        }

    }

    public static class SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList extends TeaModel {
        /**
         * <p>The manual ASR annotation text result, which is used to calculate the character accuracy rate.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("AnnotationAsrResult")
        public String annotationAsrResult;

        /**
         * <p>The language model annotation information table for the annotation task chat.</p>
         */
        @NameInMap("AnnotationMissionChatCustomizationDataInfoList")
        public java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList> annotationMissionChatCustomizationDataInfoList;

        /**
         * <p>chat ID</p>
         * 
         * <strong>example:</strong>
         * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
         */
        @NameInMap("AnnotationMissionChatId")
        public String annotationMissionChatId;

        /**
         * <p>The list.</p>
         */
        @NameInMap("AnnotationMissionChatIntentUserSayInfoList")
        public java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList> annotationMissionChatIntentUserSayInfoList;

        /**
         * <p>The mapping list of bound tags for the annotation information chat.</p>
         */
        @NameInMap("AnnotationMissionChatTagInfoList")
        public java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList> annotationMissionChatTagInfoList;

        /**
         * <p>The hot word annotation information table for the annotation task chat.</p>
         */
        @NameInMap("AnnotationMissionChatVocabularyInfoList")
        public java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList> annotationMissionChatVocabularyInfoList;

        /**
         * <p>The annotation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c88cc004-de69-4eee-aa5f-2efed533a54e</p>
         */
        @NameInMap("AnnotationMissionSessionId")
        public String annotationMissionSessionId;

        /**
         * <p>The annotation status. Valid values:</p>
         * <ul>
         * <li>0: Not completed (UNDO).</li>
         * <li>1: In progress (DOING).</li>
         * <li>2: Completed (DONE).</li>
         * <li>3: Canceled (CLOSED).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnnotationStatus")
        public Integer annotationStatus;

        /**
         * <p>The reply content of the robot.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Answer\&quot;: u\&quot;\u53c2\u8003\u6587\u6863\uff1a<a href="https://help.aliyun.com/document_detail/181325.html%5C%5C">https://help.aliyun.com/document_detail/181325.html\\</a>&quot;, \&quot;QuestionId\&quot;: 372858, \&quot;Uuid\&quot;: \&quot;ac14000516762684770197536d0044\&quot;}</p>
         */
        @NameInMap("Answer")
        public String answer;

        /**
         * <p>The ASR annotation status. Valid values:</p>
         * <ul>
         * <li>0: Not completed (UNDO).</li>
         * <li>1: In progress (DOING).</li>
         * <li>2: Completed (DONE).</li>
         * <li>3: Canceled (CLOSED).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AsrAnnotationStatus")
        public Integer asrAnnotationStatus;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1679629770336</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5ec263fa-c8de-46f4-b844-6fb8275bb645</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The intent annotation status. Valid values:</p>
         * <ul>
         * <li>0: Not completed (UNDO).</li>
         * <li>1: In progress (DOING).</li>
         * <li>2: Completed (DONE).</li>
         * <li>3: Canceled (CLOSED).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IntentAnnotationStatus")
        public Integer intentAnnotationStatus;

        /**
         * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1629360780000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The trigger time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1682493047418</p>
         */
        @NameInMap("OccurTime")
        public Long occurTime;

        /**
         * <p>The ASR recognition result.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("OriginalAsrResult")
        public String originalAsrResult;

        /**
         * <p>The sequence number of the current session interaction round.</p>
         * 
         * <strong>example:</strong>
         * <p>1475140522</p>
         */
        @NameInMap("SequenceId")
        public String sequenceId;

        /**
         * <p>The annotation action. Valid values:</p>
         * <ul>
         * <li>1: Correct.</li>
         * <li>20: Match error, not optimized.</li>
         * <li>21: Match error, optimized.</li>
         * <li>3: Not covered.</li>
         * <li>4: Invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubStatus")
        public Integer subStatus;

        /**
         * <p>The tag annotation status. Valid values:</p>
         * <ul>
         * <li>0: Not completed (UNDO).</li>
         * <li>1: In progress (DOING).</li>
         * <li>2: Completed (DONE).</li>
         * <li>3: Canceled (CLOSED).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TagAnnotationStatus")
        public Integer tagAnnotationStatus;

        /**
         * <p>Indicates whether a translation error occurred. Valid values:</p>
         * <ul>
         * <li>0: No.</li>
         * <li>1: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TranslationError")
        public Integer translationError;

        public static SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList build(java.util.Map<String, ?> map) throws Exception {
            SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList self = new SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList();
            return TeaModel.build(map, self);
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setAnnotationAsrResult(String annotationAsrResult) {
            this.annotationAsrResult = annotationAsrResult;
            return this;
        }
        public String getAnnotationAsrResult() {
            return this.annotationAsrResult;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionChatCustomizationDataInfoList(java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList> annotationMissionChatCustomizationDataInfoList) {
            this.annotationMissionChatCustomizationDataInfoList = annotationMissionChatCustomizationDataInfoList;
            return this;
        }
        public java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList> getAnnotationMissionChatCustomizationDataInfoList() {
            return this.annotationMissionChatCustomizationDataInfoList;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionChatId(String annotationMissionChatId) {
            this.annotationMissionChatId = annotationMissionChatId;
            return this;
        }
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionChatIntentUserSayInfoList(java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList> annotationMissionChatIntentUserSayInfoList) {
            this.annotationMissionChatIntentUserSayInfoList = annotationMissionChatIntentUserSayInfoList;
            return this;
        }
        public java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList> getAnnotationMissionChatIntentUserSayInfoList() {
            return this.annotationMissionChatIntentUserSayInfoList;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionChatTagInfoList(java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList> annotationMissionChatTagInfoList) {
            this.annotationMissionChatTagInfoList = annotationMissionChatTagInfoList;
            return this;
        }
        public java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList> getAnnotationMissionChatTagInfoList() {
            return this.annotationMissionChatTagInfoList;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionChatVocabularyInfoList(java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList> annotationMissionChatVocabularyInfoList) {
            this.annotationMissionChatVocabularyInfoList = annotationMissionChatVocabularyInfoList;
            return this;
        }
        public java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList> getAnnotationMissionChatVocabularyInfoList() {
            return this.annotationMissionChatVocabularyInfoList;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionSessionId(String annotationMissionSessionId) {
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setAnnotationStatus(Integer annotationStatus) {
            this.annotationStatus = annotationStatus;
            return this;
        }
        public Integer getAnnotationStatus() {
            return this.annotationStatus;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setAsrAnnotationStatus(Integer asrAnnotationStatus) {
            this.asrAnnotationStatus = asrAnnotationStatus;
            return this;
        }
        public Integer getAsrAnnotationStatus() {
            return this.asrAnnotationStatus;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setIntentAnnotationStatus(Integer intentAnnotationStatus) {
            this.intentAnnotationStatus = intentAnnotationStatus;
            return this;
        }
        public Integer getIntentAnnotationStatus() {
            return this.intentAnnotationStatus;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setOccurTime(Long occurTime) {
            this.occurTime = occurTime;
            return this;
        }
        public Long getOccurTime() {
            return this.occurTime;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setOriginalAsrResult(String originalAsrResult) {
            this.originalAsrResult = originalAsrResult;
            return this;
        }
        public String getOriginalAsrResult() {
            return this.originalAsrResult;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setSequenceId(String sequenceId) {
            this.sequenceId = sequenceId;
            return this;
        }
        public String getSequenceId() {
            return this.sequenceId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setSubStatus(Integer subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public Integer getSubStatus() {
            return this.subStatus;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setTagAnnotationStatus(Integer tagAnnotationStatus) {
            this.tagAnnotationStatus = tagAnnotationStatus;
            return this;
        }
        public Integer getTagAnnotationStatus() {
            return this.tagAnnotationStatus;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList setTranslationError(Integer translationError) {
            this.translationError = translationError;
            return this;
        }
        public Integer getTranslationError() {
            return this.translationError;
        }

    }

    public static class SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList extends TeaModel {
        /**
         * <p>The chat list.</p>
         */
        @NameInMap("AnnotationMissionChatList")
        public java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList> annotationMissionChatList;

        /**
         * <p>The annotation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c88cc004-de69-4eee-aa5f-2efed533a54e</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c88cc004-de69-4eee-aa5f-2efed533a54e</p>
         */
        @NameInMap("AnnotationMissionSessionId")
        public String annotationMissionSessionId;

        /**
         * <p>The annotation status. Valid values:</p>
         * <ul>
         * <li>0: Not completed (UNDO).</li>
         * <li>1: In progress (DOING).</li>
         * <li>2: Completed (DONE).</li>
         * <li>3: Canceled (CLOSED).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnnotationStatus")
        public Integer annotationStatus;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-14T02:01:23Z</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The job group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>29e669bd-a9d1-4529-98cd-c2b0549bcf53</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>593aaf5e-1275-4add-9990-22696385dc6e</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683858248778</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e4f32632-2e56-4399-9fec-47bdbaeefdf6</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The session ID. The value is taskId for outbound robots and conversationId for voice navigator robots.</p>
         * 
         * <strong>example:</strong>
         * <p>e6271044-b4b2-4ad8-ade4-c720be023538</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList build(java.util.Map<String, ?> map) throws Exception {
            SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList self = new SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList();
            return TeaModel.build(map, self);
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList setAnnotationMissionChatList(java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList> annotationMissionChatList) {
            this.annotationMissionChatList = annotationMissionChatList;
            return this;
        }
        public java.util.List<SaveAnnotationMissionSessionListRequestAnnotationMissionSessionListAnnotationMissionChatList> getAnnotationMissionChatList() {
            return this.annotationMissionChatList;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList setAnnotationMissionSessionId(String annotationMissionSessionId) {
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList setAnnotationStatus(Integer annotationStatus) {
            this.annotationStatus = annotationStatus;
            return this;
        }
        public Integer getAnnotationStatus() {
            return this.annotationStatus;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public SaveAnnotationMissionSessionListRequestAnnotationMissionSessionList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
