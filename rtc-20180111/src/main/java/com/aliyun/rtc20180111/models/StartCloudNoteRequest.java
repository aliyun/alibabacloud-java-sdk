// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCloudNoteRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ws***z3</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The auto chapters feature. When enabled, chapter titles and summaries are generated.</p>
     */
    @NameInMap("AutoChapters")
    public StartCloudNoteRequestAutoChapters autoChapters;

    /**
     * <p>The channel ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The custom prompt control parameter object.</p>
     */
    @NameInMap("CustomPrompt")
    public StartCloudNoteRequestCustomPrompt customPrompt;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify it.</p>
     */
    @NameInMap("LanguageHints")
    public java.util.List<String> languageHints;

    /**
     * <p>The intelligent meeting minutes feature. When enabled, keywords, key content, and to-do items are generated.</p>
     */
    @NameInMap("MeetingAssistance")
    public StartCloudNoteRequestMeetingAssistance meetingAssistance;

    /**
     * <p>The real-time subtitles.</p>
     */
    @NameInMap("RealtimeSubtitle")
    public StartCloudNoteRequestRealtimeSubtitle realtimeSubtitle;

    /**
     * <p>The service inspection feature.</p>
     */
    @NameInMap("ServiceInspection")
    public StartCloudNoteRequestServiceInspection serviceInspection;

    /**
     * <p>The source language model used by the channel. Valid values:</p>
     * <ul>
     * <li>cn: Chinese</li>
     * <li>yue: Cantonese</li>
     * <li>en: English</li>
     * <li>multilingual: Multilingual</li>
     * <li>ja: Japanese</li>
     * <li>ko: Korean</li>
     * <li>de: German</li>
     * <li>fr: French</li>
     * <li>ru: Russian</li>
     * <li>es: Spanish</li>
     * <li>vi: Vietnamese</li>
     * <li>it: Italian</li>
     * <li>sv: Swedish</li>
     * <li>cs: Czech</li>
     * <li>pl: Polish</li>
     * <li>th: Thai</li>
     * <li>fi: Finnish</li>
     * <li>hi: Hindi</li>
     * <li>id: Indonesian</li>
     * <li>pt: Portuguese</li>
     * <li>ar: Arabic</li>
     * <li>fil: Filipino</li>
     * <li>ms: Malay</li>
     * <li>tr: Turkish</li>
     * <li>hu: Hungarian</li>
     * <li>lo: Lao</li>
     * <li>pt-br: Portuguese (Brazil)</li>
     * <li>es-ar: Spanish (Argentina)</li>
     * <li>es-mx: Spanish (Mexico)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The storage configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorageConfig")
    public StartCloudNoteRequestStorageConfig storageConfig;

    /**
     * <p>The summarization feature. When enabled, full-text summaries and speaker summaries are generated.</p>
     */
    @NameInMap("Summarization")
    public StartCloudNoteRequestSummarization summarization;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtc</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The text polishing feature.</p>
     */
    @NameInMap("TextPolish")
    public StartCloudNoteRequestTextPolish textPolish;

    /**
     * <p>The transcription feature. Enabled by default.</p>
     */
    @NameInMap("Transcription")
    public StartCloudNoteRequestTranscription transcription;

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

    public StartCloudNoteRequest setRealtimeSubtitle(StartCloudNoteRequestRealtimeSubtitle realtimeSubtitle) {
        this.realtimeSubtitle = realtimeSubtitle;
        return this;
    }
    public StartCloudNoteRequestRealtimeSubtitle getRealtimeSubtitle() {
        return this.realtimeSubtitle;
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

    public StartCloudNoteRequest setTranscription(StartCloudNoteRequestTranscription transcription) {
        this.transcription = transcription;
        return this;
    }
    public StartCloudNoteRequestTranscription getTranscription() {
        return this.transcription;
    }

    public static class StartCloudNoteRequestAutoChapters extends TeaModel {
        /**
         * <p>Specifies whether to enable the feature.</p>
         */
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
         * <p>The model used for the prompt. Valid values: tingwu-turbo, tingwu-plus, and qwen-max. Default value: tingwu-turbo.</p>
         * 
         * <strong>example:</strong>
         * <p>tingwu-turbo</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The custom name of the prompt, which is used to match the output results.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>split-summary-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The custom content of the prompt. The content must include the {Transcription} tag. The {Transcription} tag is automatically replaced with the speech transcription result as the model input.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Summarize the following conversation by speaker:\n {Transcription}</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The format of the {Transcription} tag. Valid values:</p>
         * <ul>
         * <li>chat: The transcription result includes speaker information.</li>
         * <li>default: The transcription result is in plain text format.</li>
         * </ul>
         * 
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
         * <p>The list of parameters for the custom prompt.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("CustomPromptContents")
        public java.util.List<StartCloudNoteRequestCustomPromptCustomPromptContents> customPromptContents;

        /**
         * <p>Specifies whether to enable the feature.</p>
         */
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
        /**
         * <p>Specifies whether to enable the feature.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The algorithm type for the intelligent meeting minutes feature.</p>
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

    public static class StartCloudNoteRequestRealtimeSubtitleTranslation extends TeaModel {
        /**
         * <p>The output level of the translated text. Default value: 2.</p>
         * <ul>
         * <li>1: Returns results when a complete sentence is recognized.</li>
         * <li>2: Returns results when intermediate results and complete sentences are recognized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TranslateLevel")
        public Integer translateLevel;

        public static StartCloudNoteRequestRealtimeSubtitleTranslation build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteRequestRealtimeSubtitleTranslation self = new StartCloudNoteRequestRealtimeSubtitleTranslation();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteRequestRealtimeSubtitleTranslation setTranslateLevel(Integer translateLevel) {
            this.translateLevel = translateLevel;
            return this;
        }
        public Integer getTranslateLevel() {
            return this.translateLevel;
        }

    }

    public static class StartCloudNoteRequestRealtimeSubtitle extends TeaModel {
        /**
         * <p>Specifies whether to enable server-side callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AsrCallback")
        public Boolean asrCallback;

        /**
         * <p>Specifies whether to enable the feature.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The translation parameters. You can specify the target translation language by using the SDK.</p>
         */
        @NameInMap("Translation")
        public StartCloudNoteRequestRealtimeSubtitleTranslation translation;

        public static StartCloudNoteRequestRealtimeSubtitle build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteRequestRealtimeSubtitle self = new StartCloudNoteRequestRealtimeSubtitle();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteRequestRealtimeSubtitle setAsrCallback(Boolean asrCallback) {
            this.asrCallback = asrCallback;
            return this;
        }
        public Boolean getAsrCallback() {
            return this.asrCallback;
        }

        public StartCloudNoteRequestRealtimeSubtitle setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public StartCloudNoteRequestRealtimeSubtitle setTranslation(StartCloudNoteRequestRealtimeSubtitleTranslation translation) {
            this.translation = translation;
            return this;
        }
        public StartCloudNoteRequestRealtimeSubtitleTranslation getTranslation() {
            return this.translation;
        }

    }

    public static class StartCloudNoteRequestServiceInspectionInspectionContents extends TeaModel {
        /**
         * <p>The definition of the inspection dimension for service inspection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The salesperson proactively greets and welcomes the customer during the opening remarks</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The name of the inspection dimension for service inspection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Store arrival welcome - Welcome greeting</p>
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
        /**
         * <p>Specifies whether to enable the feature.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The list of inspection dimensions for service inspection, including the names and definitions of the dimensions. This specifies the criteria for the large language model to determine whether a dimension is hit.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("InspectionContents")
        public java.util.List<StartCloudNoteRequestServiceInspectionInspectionContents> inspectionContents;

        /**
         * <p>The description of the inspection objectives and focus areas for service inspection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Monitor whether the sales staff in the dialogue are enthusiastic and have a good attitude when receiving customers</p>
         */
        @NameInMap("InspectionIntroduction")
        public String inspectionIntroduction;

        /**
         * <p>The description of the dialogue scene for service inspection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Offline sales scenario at an automobile dealership</p>
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
         * <p>The AccessKey.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAX***</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The bucket name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket-for-recording</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The storage region.</p>
         * <table>
         * <thead>
         * <tr>
         * <th>Region</th>
         * <th>AliYun OSS</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>0</td>
         * <td>CN_Hangzhou</td>
         * </tr>
         * <tr>
         * <td>1</td>
         * <td>CN_Shanghai</td>
         * </tr>
         * <tr>
         * <td>2</td>
         * <td>CN_Qingdao</td>
         * </tr>
         * <tr>
         * <td>3</td>
         * <td>CN_Beijing</td>
         * </tr>
         * <tr>
         * <td>4</td>
         * <td>CN_Zhangjiakou</td>
         * </tr>
         * <tr>
         * <td>5</td>
         * <td>CN_Huhehaote</td>
         * </tr>
         * <tr>
         * <td>6</td>
         * <td>CN_Shenzhen</td>
         * </tr>
         * <tr>
         * <td>7</td>
         * <td>CN_Hongkong</td>
         * </tr>
         * <tr>
         * <td>8</td>
         * <td>US_West_1</td>
         * </tr>
         * <tr>
         * <td>9</td>
         * <td>US_East_1</td>
         * </tr>
         * <tr>
         * <td>10</td>
         * <td>AP_Southeast_1</td>
         * </tr>
         * <tr>
         * <td>11</td>
         * <td>AP_Southeast_2</td>
         * </tr>
         * <tr>
         * <td>12</td>
         * <td>AP_Southeast_3</td>
         * </tr>
         * <tr>
         * <td>13</td>
         * <td>AP_Southeast_5</td>
         * </tr>
         * <tr>
         * <td>14</td>
         * <td>AP_Northeast_1</td>
         * </tr>
         * <tr>
         * <td>15</td>
         * <td>AP_South_1 (Offline. Do not use.)</td>
         * </tr>
         * <tr>
         * <td>16</td>
         * <td>EU_Central_1</td>
         * </tr>
         * <tr>
         * <td>17</td>
         * <td>EU_West_1</td>
         * </tr>
         * <tr>
         * <td>18</td>
         * <td>EU_East_1(ME_East_1)</td>
         * </tr>
         * <tr>
         * <td>19</td>
         * <td>AP_Southeast_6</td>
         * </tr>
         * <tr>
         * <td>20</td>
         * <td>CN_Heyuan</td>
         * </tr>
         * <tr>
         * <td>21</td>
         * <td>CN_Guangzhou</td>
         * </tr>
         * <tr>
         * <td>22</td>
         * <td>CN_Chengdu</td>
         * </tr>
         * <tr>
         * <td>23</td>
         * <td>CN_Nanjing</td>
         * </tr>
         * <tr>
         * <td>24</td>
         * <td>CN_Fuzhou</td>
         * </tr>
         * <tr>
         * <td>25</td>
         * <td>CN_Wulanchabu</td>
         * </tr>
         * <tr>
         * <td>26</td>
         * <td>AP_Northeast_2</td>
         * </tr>
         * <tr>
         * <td>27</td>
         * <td>AP_Southeast_7</td>
         * </tr>
         * </tbody></table>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Region")
        public Integer region;

        /**
         * <p>The AccessKey secret.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APb6qWYEzKtYxE***</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The storage platform. Valid values:</p>
         * <table>
         * <thead>
         * <tr>
         * <th>vendor</th>
         * <th>Object storage service</th>
         * <th>Remarks</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>1</td>
         * <td>AliYun OSS</td>
         * <td>Alibaba Cloud</td>
         * </tr>
         * </tbody></table>
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
        /**
         * <p>Specifies whether to enable the feature.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The specific type.</p>
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
        /**
         * <p>Specifies whether to enable the feature.</p>
         */
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

    public static class StartCloudNoteRequestTranscription extends TeaModel {
        /**
         * <p>Specifies whether to enable speaker diarization.</p>
         */
        @NameInMap("DiarizationEnabled")
        public Boolean diarizationEnabled;

        /**
         * <p>The hotword table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b27cb31b8ca24c5b8e664e0387bac573</p>
         */
        @NameInMap("PhraseId")
        public String phraseId;

        /**
         * <p>The number of speakers for speaker diarization. Default value: 0. Valid values:</p>
         * <ul>
         * <li>0: The number of speakers is unknown.</li>
         * <li>2: The number of speakers is 2.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SpeakerCount")
        public Integer speakerCount;

        /**
         * <p>The return level of speech recognition results. Default value: 2. Valid values:</p>
         * <ul>
         * <li>1: Returns recognition results when a complete sentence is recognized.</li>
         * <li>2: Returns recognition results when intermediate results and complete sentences are recognized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TranscriptionLevel")
        public Integer transcriptionLevel;

        public static StartCloudNoteRequestTranscription build(java.util.Map<String, ?> map) throws Exception {
            StartCloudNoteRequestTranscription self = new StartCloudNoteRequestTranscription();
            return TeaModel.build(map, self);
        }

        public StartCloudNoteRequestTranscription setDiarizationEnabled(Boolean diarizationEnabled) {
            this.diarizationEnabled = diarizationEnabled;
            return this;
        }
        public Boolean getDiarizationEnabled() {
            return this.diarizationEnabled;
        }

        public StartCloudNoteRequestTranscription setPhraseId(String phraseId) {
            this.phraseId = phraseId;
            return this;
        }
        public String getPhraseId() {
            return this.phraseId;
        }

        public StartCloudNoteRequestTranscription setSpeakerCount(Integer speakerCount) {
            this.speakerCount = speakerCount;
            return this;
        }
        public Integer getSpeakerCount() {
            return this.speakerCount;
        }

        public StartCloudNoteRequestTranscription setTranscriptionLevel(Integer transcriptionLevel) {
            this.transcriptionLevel = transcriptionLevel;
            return this;
        }
        public Integer getTranscriptionLevel() {
            return this.transcriptionLevel;
        }

    }

}
