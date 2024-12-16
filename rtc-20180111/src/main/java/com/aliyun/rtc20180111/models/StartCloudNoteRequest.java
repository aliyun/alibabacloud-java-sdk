// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCloudNoteRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ws***z3</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AutoChapters")
    public StartCloudNoteRequestAutoChapters autoChapters;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CustomPrompt")
    public StartCloudNoteRequestCustomPrompt customPrompt;

    @NameInMap("LanguageHints")
    public java.util.List<String> languageHints;

    @NameInMap("MeetingAssistance")
    public StartCloudNoteRequestMeetingAssistance meetingAssistance;

    @NameInMap("ServiceInspection")
    public StartCloudNoteRequestServiceInspection serviceInspection;

    /**
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorageConfig")
    public StartCloudNoteRequestStorageConfig storageConfig;

    @NameInMap("Summarization")
    public StartCloudNoteRequestSummarization summarization;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtc</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TextPolish")
    public StartCloudNoteRequestTextPolish textPolish;

    public static StartCloudNoteRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCloudNoteRequest self = new StartCloudNoteRequest();
        return TeaModel.build(map, self);
    }

    public StartCloudNoteRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartCloudNoteRequest setAutoChapters(StartCloudNoteRequestAutoChapters autoChapters) {
        this.autoChapters = autoChapters;
        return this;
    }
    public StartCloudNoteRequestAutoChapters getAutoChapters() {
        return this.autoChapters;
    }

    public StartCloudNoteRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartCloudNoteRequest setCustomPrompt(StartCloudNoteRequestCustomPrompt customPrompt) {
        this.customPrompt = customPrompt;
        return this;
    }
    public StartCloudNoteRequestCustomPrompt getCustomPrompt() {
        return this.customPrompt;
    }

    public StartCloudNoteRequest setLanguageHints(java.util.List<String> languageHints) {
        this.languageHints = languageHints;
        return this;
    }
    public java.util.List<String> getLanguageHints() {
        return this.languageHints;
    }

    public StartCloudNoteRequest setMeetingAssistance(StartCloudNoteRequestMeetingAssistance meetingAssistance) {
        this.meetingAssistance = meetingAssistance;
        return this;
    }
    public StartCloudNoteRequestMeetingAssistance getMeetingAssistance() {
        return this.meetingAssistance;
    }

    public StartCloudNoteRequest setServiceInspection(StartCloudNoteRequestServiceInspection serviceInspection) {
        this.serviceInspection = serviceInspection;
        return this;
    }
    public StartCloudNoteRequestServiceInspection getServiceInspection() {
        return this.serviceInspection;
    }

    public StartCloudNoteRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public StartCloudNoteRequest setStorageConfig(StartCloudNoteRequestStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }
    public StartCloudNoteRequestStorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    public StartCloudNoteRequest setSummarization(StartCloudNoteRequestSummarization summarization) {
        this.summarization = summarization;
        return this;
    }
    public StartCloudNoteRequestSummarization getSummarization() {
        return this.summarization;
    }

    public StartCloudNoteRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartCloudNoteRequest setTextPolish(StartCloudNoteRequestTextPolish textPolish) {
        this.textPolish = textPolish;
        return this;
    }
    public StartCloudNoteRequestTextPolish getTextPolish() {
        return this.textPolish;
    }

    public static class StartCloudNoteRequestAutoChapters extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        public static StartCloudNoteRequestAutoChapters build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteRequestAutoChapters self = new StartCloudNoteRequestAutoChapters();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteRequestAutoChapters setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class StartCloudNoteRequestCustomPromptCustomPromptContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tingwu-turbo</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>split-summary-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>请帮我将下面的对话进行总结，根据发言人来总结:\n {Transcription}</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <strong>example:</strong>
         * <p>chat</p>
         */
        @NameInMap("TransType")
        public String transType;

        public static StartCloudNoteRequestCustomPromptCustomPromptContents build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteRequestCustomPromptCustomPromptContents self = new StartCloudNoteRequestCustomPromptCustomPromptContents();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteRequestCustomPromptCustomPromptContents setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public StartCloudNoteRequestCustomPromptCustomPromptContents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StartCloudNoteRequestCustomPromptCustomPromptContents setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public StartCloudNoteRequestCustomPromptCustomPromptContents setTransType(String transType) {
            this.transType = transType;
            return this;
        }
        public String getTransType() {
            return this.transType;
        }

    }

    public static class StartCloudNoteRequestCustomPrompt extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("CustomPromptContents")
        public java.util.List<StartCloudNoteRequestCustomPromptCustomPromptContents> customPromptContents;

        @NameInMap("Enabled")
        public Boolean enabled;

        public static StartCloudNoteRequestCustomPrompt build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteRequestCustomPrompt self = new StartCloudNoteRequestCustomPrompt();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteRequestCustomPrompt setCustomPromptContents(java.util.List<StartCloudNoteRequestCustomPromptCustomPromptContents> customPromptContents) {
            this.customPromptContents = customPromptContents;
            return this;
        }
        public java.util.List<StartCloudNoteRequestCustomPromptCustomPromptContents> getCustomPromptContents() {
            return this.customPromptContents;
        }

        public StartCloudNoteRequestCustomPrompt setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class StartCloudNoteRequestMeetingAssistance extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("MeetingAssistanceType")
        public java.util.List<String> meetingAssistanceType;

        public static StartCloudNoteRequestMeetingAssistance build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteRequestMeetingAssistance self = new StartCloudNoteRequestMeetingAssistance();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteRequestMeetingAssistance setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public StartCloudNoteRequestMeetingAssistance setMeetingAssistanceType(java.util.List<String> meetingAssistanceType) {
            this.meetingAssistanceType = meetingAssistanceType;
            return this;
        }
        public java.util.List<String> getMeetingAssistanceType() {
            return this.meetingAssistanceType;
        }

    }

    public static class StartCloudNoteRequestServiceInspectionInspectionContents extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>销售在开场白的时候主动向客户打招呼进行欢迎</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>到店欢迎-欢迎语</p>
         */
        @NameInMap("Title")
        public String title;

        public static StartCloudNoteRequestServiceInspectionInspectionContents build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteRequestServiceInspectionInspectionContents self = new StartCloudNoteRequestServiceInspectionInspectionContents();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteRequestServiceInspectionInspectionContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public StartCloudNoteRequestServiceInspectionInspectionContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class StartCloudNoteRequestServiceInspection extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("InspectionContents")
        public java.util.List<StartCloudNoteRequestServiceInspectionInspectionContents> inspectionContents;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>请监测对话中销售人员表现是否接待热情、态度良好</p>
         */
        @NameInMap("InspectionIntroduction")
        public String inspectionIntroduction;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>汽车门店线下销售场景</p>
         */
        @NameInMap("SceneIntroduction")
        public String sceneIntroduction;

        public static StartCloudNoteRequestServiceInspection build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteRequestServiceInspection self = new StartCloudNoteRequestServiceInspection();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteRequestServiceInspection setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public StartCloudNoteRequestServiceInspection setInspectionContents(java.util.List<StartCloudNoteRequestServiceInspectionInspectionContents> inspectionContents) {
            this.inspectionContents = inspectionContents;
            return this;
        }
        public java.util.List<StartCloudNoteRequestServiceInspectionInspectionContents> getInspectionContents() {
            return this.inspectionContents;
        }

        public StartCloudNoteRequestServiceInspection setInspectionIntroduction(String inspectionIntroduction) {
            this.inspectionIntroduction = inspectionIntroduction;
            return this;
        }
        public String getInspectionIntroduction() {
            return this.inspectionIntroduction;
        }

        public StartCloudNoteRequestServiceInspection setSceneIntroduction(String sceneIntroduction) {
            this.sceneIntroduction = sceneIntroduction;
            return this;
        }
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

    }

    public static class StartCloudNoteRequestStorageConfig extends TeaModel {
        /**
         * <p>accessKey。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAX***</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket-for-recording</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Region")
        public Integer region;

        /**
         * <p>secretKey。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APb6qWYEzKtYxE***</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static StartCloudNoteRequestStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteRequestStorageConfig self = new StartCloudNoteRequestStorageConfig();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteRequestStorageConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public StartCloudNoteRequestStorageConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public StartCloudNoteRequestStorageConfig setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public StartCloudNoteRequestStorageConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public StartCloudNoteRequestStorageConfig setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

    public static class StartCloudNoteRequestSummarization extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public java.util.List<String> type;

        public static StartCloudNoteRequestSummarization build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteRequestSummarization self = new StartCloudNoteRequestSummarization();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteRequestSummarization setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public StartCloudNoteRequestSummarization setType(java.util.List<String> type) {
            this.type = type;
            return this;
        }
        public java.util.List<String> getType() {
            return this.type;
        }

    }

    public static class StartCloudNoteRequestTextPolish extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        public static StartCloudNoteRequestTextPolish build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteRequestTextPolish self = new StartCloudNoteRequestTextPolish();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteRequestTextPolish setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

}
