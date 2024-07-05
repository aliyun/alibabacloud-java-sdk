// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobsRequest extends TeaModel {
    /**
     * <p>The encryption configurations. The value must be a JSON string. This parameter is required only when you use HLS encryption.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You must set <strong>CipherText</strong> in <a href="https://help.aliyun.com/document_detail/86952.html">EncrptConfig</a> to the AES_128 cipher text that is obtained from the response to the <a href="https://help.aliyun.com/document_detail/455051.html">GenerateKMSDataKey</a> operation. Otherwise, the HLS encryption fails. For more information about how to use HLS encryption, see <a href="https://help.aliyun.com/document_detail/68612.html">HLS encryption</a>.</p>
     * </li>
     * <li><p>You must select HLS encryption for the template specified by <strong>TemplateGroupId</strong> no matter you use HLS encryption or Alibaba Cloud proprietary cryptography. Otherwise, the transcoded file is not encrypted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CipherText&quot;:&quot;ZjJmZGViNzUtZWY1Mi00Y2RlLTk3****&quot;, &quot;DecryptKeyUri&quot;:&quot;<a href="http://demo.aliyundoc.com?CipherText=ZjJmZGViNzUtZWY1Mi00Y2RlLTk3****%22,%22KeyServiceType%22:%22KMS%22%7D">http://demo.aliyundoc.com?CipherText=ZjJmZGViNzUtZWY1Mi00Y2RlLTk3****&quot;,&quot;KeyServiceType&quot;:&quot;KMS&quot;}</a></p>
     */
    @NameInMap("EncryptConfig")
    public String encryptConfig;

    /**
     * <p>The override parameter. The value must be a JSON string. You can use this parameter to override the image watermark, text watermark, or subtitle file specified in the transcoding template, or override the encoding format of the subtitle file. For more information about the data structure, see <a href="https://help.aliyun.com/document_detail/98618.html">OverrideParams</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Watermarks&quot;:[{&quot;WatermarkId&quot;:&quot;af2afe4761992c47dae973374****&quot;,&quot;FileUrl&quot;:&quot;<a href="http://developer.aliyundoc.com/image/image.png%22%7D,%7B%22WatermarkId%22:%22e8e5b8038d7ada85b376c2707****%22,%22Content%22:%22watermark">http://developer.aliyundoc.com/image/image.png&quot;},{&quot;WatermarkId&quot;:&quot;e8e5b8038d7ada85b376c2707****&quot;,&quot;Content&quot;:&quot;watermark</a> test&quot;}]}</p>
     */
    @NameInMap("OverrideParams")
    public String overrideParams;

    /**
     * <p>The ID of the queue that you want to use to run the job.</p>
     * 
     * <strong>example:</strong>
     * <p>d3e680e618708erf45fbf2cae7c****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The priority of the transcoding job in all queued jobs.</p>
     * <ul>
     * <li>Valid values: <strong>1</strong> to <strong>10</strong>.</li>
     * <li>A value of <strong>10</strong> indicates the highest priority.</li>
     * <li>Default value: <strong>6</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only on the queued transcoding jobs. The priorities of the in-progress transcoding jobs are not affected.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The ID of the transcoding template group that you want to use. To view the template group ID, perform the following operations: Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Transcoding Template Groups</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0e408c803baf658ee637790c5d9f****</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The custom settings. The value must be a JSON string. You can configure settings such as message callbacks. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
     * <blockquote>
     * <p> To use the callback configurations specified by this parameter, you must configure an HTTP callback URL and specify the types of the callback events in the ApsaraVideo VOD console. Otherwise, the callback configurations do not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Extend&quot;:{&quot;localId&quot;:&quot;****&quot;,&quot;test&quot;:&quot;***&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the video file. You can use one of the following methods to obtain the video ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
     * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you call to upload the video.</li>
     * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation after you upload the video.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>142710f878bd42508932f660d7b1****</p>
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
