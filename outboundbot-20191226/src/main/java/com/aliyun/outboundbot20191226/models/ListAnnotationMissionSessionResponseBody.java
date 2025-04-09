// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListAnnotationMissionSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListAnnotationMissionSessionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>bp.java.nopowerContact</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAnnotationMissionSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationMissionSessionResponseBody self = new ListAnnotationMissionSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnnotationMissionSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAnnotationMissionSessionResponseBody setData(ListAnnotationMissionSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAnnotationMissionSessionResponseBodyData getData() {
        return this.data;
    }

    public ListAnnotationMissionSessionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAnnotationMissionSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAnnotationMissionSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnnotationMissionSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList extends TeaModel {
        /**
         * <p>id</p>
         */
        @NameInMap("AnnotationMissionChatCustomizationDataInfoId")
        public String annotationMissionChatCustomizationDataInfoId;

        /**
         * <p>chat id</p>
         */
        @NameInMap("AnnotationMissionChatId")
        public String annotationMissionChatId;

        /**
         * <strong>example:</strong>
         * <p>2f03b24a-fda2-4501-90ba-0a9a59f8dd9d</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        @NameInMap("AnnotationMissionSessionId")
        public String annotationMissionSessionId;

        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Create")
        public Boolean create;

        /**
         * <strong>example:</strong>
         * <p>1682216045619</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CustomizationDataDescription")
        public String customizationDataDescription;

        /**
         * <p>id</p>
         */
        @NameInMap("CustomizationDataId")
        public String customizationDataId;

        @NameInMap("CustomizationDataName")
        public String customizationDataName;

        @NameInMap("CustomizationDataWeight")
        public Integer customizationDataWeight;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

        /**
         * <strong>example:</strong>
         * <p>d3fbfca8-4208-4d4b-a53a-c4dba5e43a66</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1679552585384</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        public static ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList self = new ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList();
            return TeaModel.build(map, self);
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setAnnotationMissionChatCustomizationDataInfoId(String annotationMissionChatCustomizationDataInfoId) {
            this.annotationMissionChatCustomizationDataInfoId = annotationMissionChatCustomizationDataInfoId;
            return this;
        }
        public String getAnnotationMissionChatCustomizationDataInfoId() {
            return this.annotationMissionChatCustomizationDataInfoId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setAnnotationMissionChatId(String annotationMissionChatId) {
            this.annotationMissionChatId = annotationMissionChatId;
            return this;
        }
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setAnnotationMissionSessionId(String annotationMissionSessionId) {
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setCreate(Boolean create) {
            this.create = create;
            return this;
        }
        public Boolean getCreate() {
            return this.create;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setCustomizationDataDescription(String customizationDataDescription) {
            this.customizationDataDescription = customizationDataDescription;
            return this;
        }
        public String getCustomizationDataDescription() {
            return this.customizationDataDescription;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setCustomizationDataId(String customizationDataId) {
            this.customizationDataId = customizationDataId;
            return this;
        }
        public String getCustomizationDataId() {
            return this.customizationDataId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setCustomizationDataName(String customizationDataName) {
            this.customizationDataName = customizationDataName;
            return this;
        }
        public String getCustomizationDataName() {
            return this.customizationDataName;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setCustomizationDataWeight(Integer customizationDataWeight) {
            this.customizationDataWeight = customizationDataWeight;
            return this;
        }
        public Integer getCustomizationDataWeight() {
            return this.customizationDataWeight;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList extends TeaModel {
        /**
         * <p>chat id</p>
         * 
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("AnnotationMissionChatId")
        public String annotationMissionChatId;

        /**
         * <p>id</p>
         */
        @NameInMap("AnnotationMissionChatIntentUserSayInfoId")
        public String annotationMissionChatIntentUserSayInfoId;

        /**
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        /**
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("AnnotationMissionSessionId")
        public String annotationMissionSessionId;

        /**
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("BotId")
        public String botId;

        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Create")
        public Boolean create;

        /**
         * <strong>example:</strong>
         * <p>1682216045619</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

        /**
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("DialogId")
        public Long dialogId;

        /**
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <strong>example:</strong>
         * <p>1682216045619</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        public static ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList self = new ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList();
            return TeaModel.build(map, self);
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setAnnotationMissionChatId(String annotationMissionChatId) {
            this.annotationMissionChatId = annotationMissionChatId;
            return this;
        }
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setAnnotationMissionChatIntentUserSayInfoId(String annotationMissionChatIntentUserSayInfoId) {
            this.annotationMissionChatIntentUserSayInfoId = annotationMissionChatIntentUserSayInfoId;
            return this;
        }
        public String getAnnotationMissionChatIntentUserSayInfoId() {
            return this.annotationMissionChatIntentUserSayInfoId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setAnnotationMissionSessionId(String annotationMissionSessionId) {
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setBotId(String botId) {
            this.botId = botId;
            return this;
        }
        public String getBotId() {
            return this.botId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setCreate(Boolean create) {
            this.create = create;
            return this;
        }
        public Boolean getCreate() {
            return this.create;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setDialogId(Long dialogId) {
            this.dialogId = dialogId;
            return this;
        }
        public Long getDialogId() {
            return this.dialogId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList extends TeaModel {
        /**
         * <p>chat id</p>
         */
        @NameInMap("AnnotationMissionChatId")
        public String annotationMissionChatId;

        /**
         * <p>id</p>
         */
        @NameInMap("AnnotationMissionChatTagInfoId")
        public String annotationMissionChatTagInfoId;

        /**
         * <strong>example:</strong>
         * <p>e7272cbb-a60d-4b41-b5c4-8863edc0b8f7</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        @NameInMap("AnnotationMissionSessionId")
        public String annotationMissionSessionId;

        /**
         * <p>tag id</p>
         */
        @NameInMap("AnnotationMissionTagInfoId")
        public String annotationMissionTagInfoId;

        @NameInMap("AnnotationMissionTagInfoName")
        public String annotationMissionTagInfoName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Create")
        public Boolean create;

        /**
         * <strong>example:</strong>
         * <p>1686797050000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

        /**
         * <strong>example:</strong>
         * <p>32be9d94-1346-4c4a-a4d0-ccd379f87013</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1679019660000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        public static ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList self = new ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList();
            return TeaModel.build(map, self);
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setAnnotationMissionChatId(String annotationMissionChatId) {
            this.annotationMissionChatId = annotationMissionChatId;
            return this;
        }
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setAnnotationMissionChatTagInfoId(String annotationMissionChatTagInfoId) {
            this.annotationMissionChatTagInfoId = annotationMissionChatTagInfoId;
            return this;
        }
        public String getAnnotationMissionChatTagInfoId() {
            return this.annotationMissionChatTagInfoId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setAnnotationMissionSessionId(String annotationMissionSessionId) {
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setAnnotationMissionTagInfoId(String annotationMissionTagInfoId) {
            this.annotationMissionTagInfoId = annotationMissionTagInfoId;
            return this;
        }
        public String getAnnotationMissionTagInfoId() {
            return this.annotationMissionTagInfoId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setAnnotationMissionTagInfoName(String annotationMissionTagInfoName) {
            this.annotationMissionTagInfoName = annotationMissionTagInfoName;
            return this;
        }
        public String getAnnotationMissionTagInfoName() {
            return this.annotationMissionTagInfoName;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setCreate(Boolean create) {
            this.create = create;
            return this;
        }
        public Boolean getCreate() {
            return this.create;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList extends TeaModel {
        /**
         * <p>chat id</p>
         * 
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("AnnotationMissionChatId")
        public String annotationMissionChatId;

        /**
         * <p>id</p>
         */
        @NameInMap("AnnotationMissionChatVocabularyInfoId")
        public String annotationMissionChatVocabularyInfoId;

        /**
         * <strong>example:</strong>
         * <p>b3f2c931-5180-43ca-b4aa-2baee2d73c8b</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        /**
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("AnnotationMissionSessionId")
        public String annotationMissionSessionId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Create")
        public Boolean create;

        /**
         * <strong>example:</strong>
         * <p>1675218421941</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

        /**
         * <strong>example:</strong>
         * <p>818961ce-d9ba-4f88-89ca-2a04b24bdf01</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1676272557653</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("Vocabulary")
        public String vocabulary;

        @NameInMap("VocabularyDescription")
        public String vocabularyDescription;

        /**
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("VocabularyId")
        public String vocabularyId;

        @NameInMap("VocabularyName")
        public String vocabularyName;

        @NameInMap("VocabularyWeight")
        public Integer vocabularyWeight;

        public static ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList self = new ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList();
            return TeaModel.build(map, self);
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setAnnotationMissionChatId(String annotationMissionChatId) {
            this.annotationMissionChatId = annotationMissionChatId;
            return this;
        }
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setAnnotationMissionChatVocabularyInfoId(String annotationMissionChatVocabularyInfoId) {
            this.annotationMissionChatVocabularyInfoId = annotationMissionChatVocabularyInfoId;
            return this;
        }
        public String getAnnotationMissionChatVocabularyInfoId() {
            return this.annotationMissionChatVocabularyInfoId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setAnnotationMissionSessionId(String annotationMissionSessionId) {
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setCreate(Boolean create) {
            this.create = create;
            return this;
        }
        public Boolean getCreate() {
            return this.create;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setVocabulary(String vocabulary) {
            this.vocabulary = vocabulary;
            return this;
        }
        public String getVocabulary() {
            return this.vocabulary;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setVocabularyDescription(String vocabularyDescription) {
            this.vocabularyDescription = vocabularyDescription;
            return this;
        }
        public String getVocabularyDescription() {
            return this.vocabularyDescription;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setVocabularyName(String vocabularyName) {
            this.vocabularyName = vocabularyName;
            return this;
        }
        public String getVocabularyName() {
            return this.vocabularyName;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList setVocabularyWeight(Integer vocabularyWeight) {
            this.vocabularyWeight = vocabularyWeight;
            return this;
        }
        public Integer getVocabularyWeight() {
            return this.vocabularyWeight;
        }

    }

    public static class ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList extends TeaModel {
        @NameInMap("AnnotationAsrResult")
        public String annotationAsrResult;

        @NameInMap("AnnotationMissionChatCustomizationDataInfoList")
        public java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList> annotationMissionChatCustomizationDataInfoList;

        /**
         * <p>chat id</p>
         * 
         * <strong>example:</strong>
         * <p>40669e52-c1c8-487f-9593-29749086bdc9</p>
         */
        @NameInMap("AnnotationMissionChatId")
        public String annotationMissionChatId;

        @NameInMap("AnnotationMissionChatIntentUserSayInfoList")
        public java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList> annotationMissionChatIntentUserSayInfoList;

        @NameInMap("AnnotationMissionChatTagInfoList")
        public java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList> annotationMissionChatTagInfoList;

        @NameInMap("AnnotationMissionChatVocabularyInfoList")
        public java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList> annotationMissionChatVocabularyInfoList;

        /**
         * <strong>example:</strong>
         * <p>03f56192-fa8a-40dc-9558-39b357f0618f</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        @NameInMap("AnnotationMissionSessionId")
        public String annotationMissionSessionId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnnotationStatus")
        public Integer annotationStatus;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Answer\&quot;: u\&quot;\u53c2\u8003\u6587\u6863\uff1a<a href="https://help.aliyun.com/document_detail/215402.html%5C%5C">https://help.aliyun.com/document_detail/215402.html\\</a>&quot;, \&quot;QuestionId\&quot;: 371159, \&quot;Uuid\&quot;: \&quot;ac14000116781568127896224d0044\&quot;}</p>
         */
        @NameInMap("Answer")
        public String answer;

        @NameInMap("AsrAnnotationStatus")
        public Integer asrAnnotationStatus;

        /**
         * <strong>example:</strong>
         * <p>1682216045619</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IntentAnnotationStatus")
        public Integer intentAnnotationStatus;

        /**
         * <strong>example:</strong>
         * <p>1571649300000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>1682390676403</p>
         */
        @NameInMap("OccurTime")
        public Long occurTime;

        @NameInMap("OriginalAsrResult")
        public String originalAsrResult;

        /**
         * <strong>example:</strong>
         * <p>380578077</p>
         */
        @NameInMap("SequenceId")
        public String sequenceId;

        @NameInMap("SubStatus")
        public Integer subStatus;

        @NameInMap("TagAnnotationStatus")
        public Integer tagAnnotationStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TranslationError")
        public Integer translationError;

        public static ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList build(java.util.Map<String, ?> map) throws Exception {
            ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList self = new ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList();
            return TeaModel.build(map, self);
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setAnnotationAsrResult(String annotationAsrResult) {
            this.annotationAsrResult = annotationAsrResult;
            return this;
        }
        public String getAnnotationAsrResult() {
            return this.annotationAsrResult;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionChatCustomizationDataInfoList(java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList> annotationMissionChatCustomizationDataInfoList) {
            this.annotationMissionChatCustomizationDataInfoList = annotationMissionChatCustomizationDataInfoList;
            return this;
        }
        public java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatCustomizationDataInfoList> getAnnotationMissionChatCustomizationDataInfoList() {
            return this.annotationMissionChatCustomizationDataInfoList;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionChatId(String annotationMissionChatId) {
            this.annotationMissionChatId = annotationMissionChatId;
            return this;
        }
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionChatIntentUserSayInfoList(java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList> annotationMissionChatIntentUserSayInfoList) {
            this.annotationMissionChatIntentUserSayInfoList = annotationMissionChatIntentUserSayInfoList;
            return this;
        }
        public java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatIntentUserSayInfoList> getAnnotationMissionChatIntentUserSayInfoList() {
            return this.annotationMissionChatIntentUserSayInfoList;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionChatTagInfoList(java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList> annotationMissionChatTagInfoList) {
            this.annotationMissionChatTagInfoList = annotationMissionChatTagInfoList;
            return this;
        }
        public java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatTagInfoList> getAnnotationMissionChatTagInfoList() {
            return this.annotationMissionChatTagInfoList;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionChatVocabularyInfoList(java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList> annotationMissionChatVocabularyInfoList) {
            this.annotationMissionChatVocabularyInfoList = annotationMissionChatVocabularyInfoList;
            return this;
        }
        public java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatListAnnotationMissionChatVocabularyInfoList> getAnnotationMissionChatVocabularyInfoList() {
            return this.annotationMissionChatVocabularyInfoList;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setAnnotationMissionSessionId(String annotationMissionSessionId) {
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setAnnotationStatus(Integer annotationStatus) {
            this.annotationStatus = annotationStatus;
            return this;
        }
        public Integer getAnnotationStatus() {
            return this.annotationStatus;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setAsrAnnotationStatus(Integer asrAnnotationStatus) {
            this.asrAnnotationStatus = asrAnnotationStatus;
            return this;
        }
        public Integer getAsrAnnotationStatus() {
            return this.asrAnnotationStatus;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setIntentAnnotationStatus(Integer intentAnnotationStatus) {
            this.intentAnnotationStatus = intentAnnotationStatus;
            return this;
        }
        public Integer getIntentAnnotationStatus() {
            return this.intentAnnotationStatus;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setOccurTime(Long occurTime) {
            this.occurTime = occurTime;
            return this;
        }
        public Long getOccurTime() {
            return this.occurTime;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setOriginalAsrResult(String originalAsrResult) {
            this.originalAsrResult = originalAsrResult;
            return this;
        }
        public String getOriginalAsrResult() {
            return this.originalAsrResult;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setSequenceId(String sequenceId) {
            this.sequenceId = sequenceId;
            return this;
        }
        public String getSequenceId() {
            return this.sequenceId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setSubStatus(Integer subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public Integer getSubStatus() {
            return this.subStatus;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setTagAnnotationStatus(Integer tagAnnotationStatus) {
            this.tagAnnotationStatus = tagAnnotationStatus;
            return this;
        }
        public Integer getTagAnnotationStatus() {
            return this.tagAnnotationStatus;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList setTranslationError(Integer translationError) {
            this.translationError = translationError;
            return this;
        }
        public Integer getTranslationError() {
            return this.translationError;
        }

    }

    public static class ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList extends TeaModel {
        @NameInMap("AnnotationMissionChatList")
        public java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList> annotationMissionChatList;

        /**
         * <strong>example:</strong>
         * <p>64ba5ac9-a4e1-4333-b03c-9d4a588c9f6c</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>64ba5ac9-a4e1-4333-b03c-9d4a588c9f6c</p>
         */
        @NameInMap("AnnotationMissionSessionId")
        public String annotationMissionSessionId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnnotationStatus")
        public Integer annotationStatus;

        /**
         * <strong>example:</strong>
         * <p>1691117009000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DebugConversation")
        public Boolean debugConversation;

        /**
         * <strong>example:</strong>
         * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>2f642da1-b00b-4dd6-ac7d-dcbeefd13ff3</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <strong>example:</strong>
         * <p>42da7cde-a5e8-45cc-b9d2-828711d95b30</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>1677987898384</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>408d6c4d-23e2-41f6-bbdd-f919a8297aa4</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <strong>example:</strong>
         * <p>40669e52-c1c8-487f-9593-29749086bdc9</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList build(java.util.Map<String, ?> map) throws Exception {
            ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList self = new ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList();
            return TeaModel.build(map, self);
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setAnnotationMissionChatList(java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList> annotationMissionChatList) {
            this.annotationMissionChatList = annotationMissionChatList;
            return this;
        }
        public java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionListAnnotationMissionChatList> getAnnotationMissionChatList() {
            return this.annotationMissionChatList;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setAnnotationMissionSessionId(String annotationMissionSessionId) {
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setAnnotationStatus(Integer annotationStatus) {
            this.annotationStatus = annotationStatus;
            return this;
        }
        public Integer getAnnotationStatus() {
            return this.annotationStatus;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setDebugConversation(Boolean debugConversation) {
            this.debugConversation = debugConversation;
            return this;
        }
        public Boolean getDebugConversation() {
            return this.debugConversation;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListAnnotationMissionSessionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>b3f2c931-5180-43ca-b4aa-2baee2d73c8b</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        @NameInMap("AnnotationMissionSessionList")
        public java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList> annotationMissionSessionList;

        /**
         * <strong>example:</strong>
         * <p>bp.java.nopowerContact</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListAnnotationMissionSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAnnotationMissionSessionResponseBodyData self = new ListAnnotationMissionSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAnnotationMissionSessionResponseBodyData setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public ListAnnotationMissionSessionResponseBodyData setAnnotationMissionSessionList(java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList> annotationMissionSessionList) {
            this.annotationMissionSessionList = annotationMissionSessionList;
            return this;
        }
        public java.util.List<ListAnnotationMissionSessionResponseBodyDataAnnotationMissionSessionList> getAnnotationMissionSessionList() {
            return this.annotationMissionSessionList;
        }

        public ListAnnotationMissionSessionResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAnnotationMissionSessionResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListAnnotationMissionSessionResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
