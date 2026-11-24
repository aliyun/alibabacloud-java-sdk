// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoGenerationJobRequest extends TeaModel {
    /**
     * <p>The aspect ratio. Valid values: 16:9 (default), 9:16, 4:3, 3:4, 1:1, and adaptive (valid only for wan3.0-video and wan3.0-video-prime).</p>
     * 
     * <strong>example:</strong>
     * <p>9:16</p>
     */
    @NameInMap("AspectRatio")
    public String aspectRatio;

    /**
     * <p>The idempotency parameter. A unique, case-sensitive, 32-character random string. This parameter ensures that the request is completed only once and prevents duplicate operations caused by multiple retries.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>3e761e9d11edba640c42a1b7</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The output duration. Valid values: 4 to 15 seconds. Default value: 5 seconds.</p>
     * <ul>
     * <li>For wan3.0-video and wan3.0-video-prime, the maximum duration is 30 seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The task input. This parameter is required. The value is a JSON string that contains the following fields:</p>
     * <ul>
     * <li>Prompt: the prompt. This field is required. Type: String.</li>
     * <li>Medias: the media list.<ul>
     * <li>When JobType is set to image_to_video, this field is required and only one media file is needed.</li>
     * <li>When JobType is set to first_last_frame, this field is required and exactly two media files are needed.</li>
     * <li>When JobType is set to reference_to_video, this field is required and up to 9 media files are allowed. For wan3.0-video and wan3.0-video-prime, up to 20 media files are allowed, including up to 10 images, 5 videos, and 5 audio files. The total duration of audio and video files cannot exceed 15 seconds.<blockquote>
     * <p>The Media structure contains the following fields: Type: the media type. Type: String. Valid values: image, video, and audio. URL: the download URL of the media file. Type: String. MediaId: the media asset ID. Type: String.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Prompt&quot;:&quot;Image 1 is on the basketball court, and Image 2 performs a slam dunk&quot;,&quot;Medias&quot;:[{&quot;Type&quot;:&quot;image&quot;,&quot;Url&quot;:&quot;<a href="https://xxx/xxx.jpg%22%7D,%7B%22Type%22:%22image%22,%22Url%22:%22https://xxx/xxx.jpg%22%7D%5D%7D">https://xxx/xxx.jpg&quot;},{&quot;Type&quot;:&quot;image&quot;,&quot;Url&quot;:&quot;https://xxx/xxx.jpg&quot;}]}</a></p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The task feature parameters. The value is a JSON string that contains the following fields:</p>
     * <ul>
     * <li>EnableAudio: specifies whether to output audio. Type: Boolean. This field is optional.</li>
     * <li>Watermark: specifies whether to include a watermark. Type: Boolean. This field is optional. Valid values: true (the video contains an AI-generated watermark in the lower-right corner) and false (the generated video does not contain a watermark).</li>
     * <li>PromptExtend: specifies whether to enable intelligent prompt rewriting. Type: Boolean. This field is optional. This field is valid only for wan3.0-video and wan3.0-video-prime. Valid values: true (enabled, default value) and false (disabled).</li>
     * <li>PostProcessing: the post-processing feature switch. Type: Object. This field contains EnableSubtitleRemoval, which specifies whether to remove subtitles. Type: Boolean. Valid values: true (enabled) and false (disabled).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("JobParameters")
    public String jobParameters;

    /**
     * <p>The task type. This parameter is required. Valid values:</p>
     * <ul>
     * <li>text_to_video: text-to-video</li>
     * <li>image_to_video: image-to-video</li>
     * <li>first_last_frame: first and last frame to video</li>
     * <li>reference_to_video: reference-to-video</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text_to_video</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The model name. This parameter is required. Valid values:</p>
     * <ul>
     * <li>Wonder-Ultra</li>
     * <li>Wonder-Ultra-Flash</li>
     * <li>Wonder-Pro</li>
     * <li>Wonder-Standard</li>
     * <li>wan3.0-video</li>
     * <li>wan3.0-video-prime</li>
     * <li>happyhorse-1.1</li>
     * <li>happyhorse-1.0</li>
     * <li>wan2.7</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>happyhorse-1.1</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The number of output videos. Valid values: 1 to 4. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("N")
    public Integer n;

    /**
     * <p>The output configuration JSON string. OssUri is the optional customer OSS output directory. If this parameter is not specified, a signed URL for the service-owned artifact is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OssUri&quot;:&quot;oss://example-bucket/video-translation/output/&quot;}</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The resolution. Valid values:</p>
     * <ul>
     * <li>1080P</li>
     * <li>720P: default value</li>
     * <li>480P: valid only for wan3.0-video and wan3.0-video-prime</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>720P</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <p>The scene type. Valid values: general.</p>
     * 
     * <strong>example:</strong>
     * <p>general</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The custom user parameters. The value is a JSON string. The callback result carries this parameter as is. The system reserves the NotifyAddress field, which specifies the callback URL. The system sends a callback to this URL after the task is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitVideoGenerationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoGenerationJobRequest self = new SubmitVideoGenerationJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoGenerationJobRequest setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }
    public String getAspectRatio() {
        return this.aspectRatio;
    }

    public SubmitVideoGenerationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitVideoGenerationJobRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public SubmitVideoGenerationJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitVideoGenerationJobRequest setJobParameters(String jobParameters) {
        this.jobParameters = jobParameters;
        return this;
    }
    public String getJobParameters() {
        return this.jobParameters;
    }

    public SubmitVideoGenerationJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public SubmitVideoGenerationJobRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public SubmitVideoGenerationJobRequest setN(Integer n) {
        this.n = n;
        return this;
    }
    public Integer getN() {
        return this.n;
    }

    public SubmitVideoGenerationJobRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitVideoGenerationJobRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public SubmitVideoGenerationJobRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitVideoGenerationJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
