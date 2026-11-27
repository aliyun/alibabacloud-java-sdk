// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCloudNoteShrinkRequest extends TeaModel {
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
    public String autoChaptersShrink;

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
    public String customPromptShrink;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify it.</p>
     */
    @NameInMap("LanguageHints")
    public java.util.List<String> languageHints;

    /**
     * <p>The intelligent meeting minutes feature. When enabled, keywords, key content, and to-do items are generated.</p>
     */
    @NameInMap("MeetingAssistance")
    public String meetingAssistanceShrink;

    /**
     * <p>The real-time subtitles.</p>
     */
    @NameInMap("RealtimeSubtitle")
    public String realtimeSubtitleShrink;

    /**
     * <p>The service inspection feature.</p>
     */
    @NameInMap("ServiceInspection")
    public String serviceInspectionShrink;

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
    public StartCloudNoteShrinkRequestStorageConfig storageConfig;

    /**
     * <p>The summarization feature. When enabled, full-text summaries and speaker summaries are generated.</p>
     */
    @NameInMap("Summarization")
    public String summarizationShrink;

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
    public String textPolishShrink;

    /**
     * <p>The transcription feature. Enabled by default.</p>
     */
    @NameInMap("Transcription")
    public String transcriptionShrink;

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

    public StartCloudNoteShrinkRequest setRealtimeSubtitleShrink(String realtimeSubtitleShrink) {
        this.realtimeSubtitleShrink = realtimeSubtitleShrink;
        return this;
    }
    public String getRealtimeSubtitleShrink() {
        return this.realtimeSubtitleShrink;
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

    public StartCloudNoteShrinkRequest setTranscriptionShrink(String transcriptionShrink) {
        this.transcriptionShrink = transcriptionShrink;
        return this;
    }
    public String getTranscriptionShrink() {
        return this.transcriptionShrink;
    }

    public static class StartCloudNoteShrinkRequestStorageConfig extends TeaModel {
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
