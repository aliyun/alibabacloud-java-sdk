// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobsRequest extends TeaModel {
    /**
     * <p>The encryption configurations. The value must be a JSON string. This parameter is required only when you use HLS encryption.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You must set **CipherText** in [EncrptConfig](~~86952~~) to the AES\_128 cipher text that is obtained from the response to the [GenerateKMSDataKey](~~455051~~) operation. Otherwise, the HLS encryption fails. For more information about how to use HLS encryption, see [HLS encryption](~~68612~~).</p>
     * <br>
     * <p>*   You must select HLS encryption for the template specified by **TemplateGroupId** no matter you use HLS encryption or Alibaba Cloud proprietary cryptography. Otherwise, the transcoded file is not encrypted.</p>
     */
    @NameInMap("EncryptConfig")
    public String encryptConfig;

    /**
     * <p>The override parameter. The value must be a JSON string. You can use this parameter to override the image watermark, text watermark, or subtitle file specified in the transcoding template, or override the encoding format of the subtitle file. For more information about the data structure, see [OverrideParams](~~98618~~).</p>
     */
    @NameInMap("OverrideParams")
    public String overrideParams;

    /**
     * <p>The ID of the queue that you want to use to run the job.</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The priority of the transcoding job in all queued jobs.</p>
     * <br>
     * <p>*   Valid values: **1** to **10**.</p>
     * <p>*   A value of **10** indicates the highest priority.</p>
     * <p>*   Default value: **6**.</p>
     * <br>
     * <p>>  This parameter takes effect only on the queued transcoding jobs. The priorities of the in-progress transcoding jobs are not affected.</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The ID of the transcoding template group that you want to use. To view the template group ID, perform the following operations: Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Transcoding Template Groups**.</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The custom settings. The value must be a JSON string. You can configure settings such as message callbacks. For more information, see [UserData](~~86952~~).</p>
     * <br>
     * <p>>  To use the callback configurations specified by this parameter, you must configure an HTTP callback URL and specify the types of the callback events in the ApsaraVideo VOD console. Otherwise, the callback configurations do not take effect.</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the video file. You can use one of the following methods to obtain the video ID:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</p>
     * <p>*   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to upload the video.</p>
     * <p>*   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation after you upload the video.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static SubmitTranscodeJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobsRequest self = new SubmitTranscodeJobsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTranscodeJobsRequest setEncryptConfig(String encryptConfig) {
        this.encryptConfig = encryptConfig;
        return this;
    }
    public String getEncryptConfig() {
        return this.encryptConfig;
    }

    public SubmitTranscodeJobsRequest setOverrideParams(String overrideParams) {
        this.overrideParams = overrideParams;
        return this;
    }
    public String getOverrideParams() {
        return this.overrideParams;
    }

    public SubmitTranscodeJobsRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitTranscodeJobsRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public SubmitTranscodeJobsRequest setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    public SubmitTranscodeJobsRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitTranscodeJobsRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
