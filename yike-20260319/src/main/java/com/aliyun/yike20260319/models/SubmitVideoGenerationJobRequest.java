// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitVideoGenerationJobRequest extends TeaModel {
    /**
     * <p>The aspect ratio. Valid values: 16:9 (default), 9:16, 4:3, 3:4, and 1:1.</p>
     * 
     * <strong>example:</strong>
     * <p>9:16</p>
     */
    @NameInMap("AspectRatio")
    public String aspectRatio;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>3e761e9d11edba640c42a1b7</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The output duration. Valid values: 4 to 15 seconds. Default value: 5s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The task input in JSON string format. The following fields are included:</p>
     * <ul>
     * <li>Prompt: String. Required. The prompt.</li>
     * <li>Medias: The media list.<ul>
     * <li>When JobType is image_to_video, this field is required. Only 1 Media item is needed.</li>
     * <li>When JobType is first_last_frame, this field is required. Only 2 Media items are needed.</li>
     * <li>When JobType is reference_to_video, this field is required. A maximum of 9 Media items are supported.<blockquote>
     * <p>The Media structure contains: Type, the media type (String). Valid values: <code>image</code>, <code>video</code>, or <code>audio</code>. URL, the media download URL (String).</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Prompt&quot;:&quot;图1在篮球场上，用图2来了个灌篮&quot;,&quot;Medias&quot;:[{&quot;Type&quot;:&quot;image&quot;,&quot;Url&quot;:&quot;<a href="https://xxx/xxx.jpg%22%7D,%7B%22Type%22:%22image%22,%22Url%22:%22https://xxx/xxx.jpg%22%7D%5D%7D">https://xxx/xxx.jpg&quot;},{&quot;Type&quot;:&quot;image&quot;,&quot;Url&quot;:&quot;https://xxx/xxx.jpg&quot;}]}</a></p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The task function parameters. No configuration is required at this time.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("JobParameters")
    public String jobParameters;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>text_to_video: text-to-video</li>
     * <li>image_to_video: image-to-video</li>
     * <li>first_last_frame: first and last frame to video</li>
     * <li>reference_to_video: reference to video</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text_to_video</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The model name. Valid values:</p>
     * <ul>
     * <li>happyhorse-1.1</li>
     * <li>happyhorse-1.0</li>
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
     * <p>The resolution. Valid values: 720P (default) and 1080P.</p>
     * 
     * <strong>example:</strong>
     * <p>720P</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <p>The scenario type. Currently only <code>general</code> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>general</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The user business data in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;env&quot;:&quot;prd&quot;}</p>
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
