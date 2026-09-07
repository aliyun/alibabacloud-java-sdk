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
     * <p>The idempotency token. A unique, case-sensitive string of up to 32 characters. This token ensures that the request is completed no more than once, preventing duplicate operations caused by multiple retries.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>3e761e9d11edba640c42a1b7</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The output duration. Valid values: 4 to 15 seconds. Default value: 5 seconds.</p>
     * <ul>
     * <li>For wan3.0-video and wan3.0-video-prime, the maximum value is 30 seconds.</li>
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
     * <li>Prompt: string. Required. The prompt.</li>
     * <li>Medias: the list of media items.<ul>
     * <li>If JobType is set to image_to_video, this field is required and only 1 media item is needed.</li>
     * <li>If JobType is set to first_last_frame, this field is required and exactly 2 media items are needed.</li>
     * <li>If JobType is set to reference_to_video, this field is required and up to 9 media items are allowed. For wan3.0-video and wan3.0-video-prime, up to 20 media items are allowed, including up to 10 images, 5 videos, and 5 audio files. The total duration of audio and video files cannot exceed 15 seconds.<blockquote>
     * <p>The Media structure contains the following fields: Type, the media type (string). Valid values: <code>image</code>, <code>video</code>, and <code>audio</code>. URL, the media download URL (string). MediaId, the media asset ID (string).</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Prompt&quot;:&quot;Person 1 dunks a basketball on the court using the move shown in image 2&quot;,&quot;Medias&quot;:[{&quot;Type&quot;:&quot;image&quot;,&quot;Url&quot;:&quot;<a href="https://xxx/xxx.jpg%22%7D,%7B%22Type%22:%22image%22,%22Url%22:%22https://xxx/xxx.jpg%22%7D%5D%7D">https://xxx/xxx.jpg&quot;},{&quot;Type&quot;:&quot;image&quot;,&quot;Url&quot;:&quot;https://xxx/xxx.jpg&quot;}]}</a></p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The task parameters as a JSON string that contains the following fields:</p>
     * <ul>
     * <li>EnableAudio: boolean. Optional. Specifies whether to include audio in the output. Valid values: true and false.</li>
     * <li>Watermark: boolean. Optional. Specifies whether to include a watermark. Valid values: true (an &quot;AI-generated&quot; watermark is added to the lower-right corner of the video) and false (no watermark is added).</li>
     * <li>PromptExtend: boolean. Optional. Specifies whether to enable intelligent prompt rewriting. This parameter is valid only for wan3.0-video and wan3.0-video-prime. Valid values: true (enabled, default) and false (disabled).</li>
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
     * <li>text_to_video: text-to-video.</li>
     * <li>image_to_video: image-to-video.</li>
     * <li>first_last_frame: first and last frame to video.</li>
     * <li>reference_to_video: reference-to-video.</li>
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
     * <p>The number of outputs. Valid values: 1 to 4. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("N")
    public Integer n;

    /**
     * <p>The output configuration as a JSON string. OssUri is an optional OSS output directory. If not specified, a signed URL for the service-generated output is returned.</p>
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
     * <li>720P: default value.</li>
     * <li>480P: valid only for wan3.0-video and wan3.0-video-prime.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>720P</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <p>The scene type. Currently, only <code>general</code> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>general</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The custom user parameters as a JSON string. These parameters are returned as-is in the callback result. The system reserved field NotifyAddress specifies the callback URL. The system sends a callback to this URL when the task is complete.</p>
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
