// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCloudNoteShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ws***z3</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AutoChapters")
    public String autoChaptersShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CustomPrompt")
    public String customPromptShrink;

    @NameInMap("LanguageHints")
    public java.util.List<String> languageHints;

    @NameInMap("MeetingAssistance")
    public String meetingAssistanceShrink;

    @NameInMap("ServiceInspection")
    public String serviceInspectionShrink;

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
    public StartCloudNoteShrinkRequestStorageConfig storageConfig;

    @NameInMap("Summarization")
    public String summarizationShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtc</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TextPolish")
    public String textPolishShrink;

    public static StartCloudNoteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCloudNoteShrinkRequest self = new StartCloudNoteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartCloudNoteShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartCloudNoteShrinkRequest setAutoChaptersShrink(String autoChaptersShrink) {
        this.autoChaptersShrink = autoChaptersShrink;
        return this;
    }
    public String getAutoChaptersShrink() {
        return this.autoChaptersShrink;
    }

    public StartCloudNoteShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartCloudNoteShrinkRequest setCustomPromptShrink(String customPromptShrink) {
        this.customPromptShrink = customPromptShrink;
        return this;
    }
    public String getCustomPromptShrink() {
        return this.customPromptShrink;
    }

    public StartCloudNoteShrinkRequest setLanguageHints(java.util.List<String> languageHints) {
        this.languageHints = languageHints;
        return this;
    }
    public java.util.List<String> getLanguageHints() {
        return this.languageHints;
    }

    public StartCloudNoteShrinkRequest setMeetingAssistanceShrink(String meetingAssistanceShrink) {
        this.meetingAssistanceShrink = meetingAssistanceShrink;
        return this;
    }
    public String getMeetingAssistanceShrink() {
        return this.meetingAssistanceShrink;
    }

    public StartCloudNoteShrinkRequest setServiceInspectionShrink(String serviceInspectionShrink) {
        this.serviceInspectionShrink = serviceInspectionShrink;
        return this;
    }
    public String getServiceInspectionShrink() {
        return this.serviceInspectionShrink;
    }

    public StartCloudNoteShrinkRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public StartCloudNoteShrinkRequest setStorageConfig(StartCloudNoteShrinkRequestStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }
    public StartCloudNoteShrinkRequestStorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    public StartCloudNoteShrinkRequest setSummarizationShrink(String summarizationShrink) {
        this.summarizationShrink = summarizationShrink;
        return this;
    }
    public String getSummarizationShrink() {
        return this.summarizationShrink;
    }

    public StartCloudNoteShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartCloudNoteShrinkRequest setTextPolishShrink(String textPolishShrink) {
        this.textPolishShrink = textPolishShrink;
        return this;
    }
    public String getTextPolishShrink() {
        return this.textPolishShrink;
    }

    public static class StartCloudNoteShrinkRequestStorageConfig extends TeaModel {
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

        public static StartCloudNoteShrinkRequestStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteShrinkRequestStorageConfig self = new StartCloudNoteShrinkRequestStorageConfig();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteShrinkRequestStorageConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public StartCloudNoteShrinkRequestStorageConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public StartCloudNoteShrinkRequestStorageConfig setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public StartCloudNoteShrinkRequestStorageConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public StartCloudNoteShrinkRequestStorageConfig setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
