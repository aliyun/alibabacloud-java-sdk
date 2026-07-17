// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitImageGenerationJobRequest extends TeaModel {
    /**
     * <p>The aspect ratio. Valid values: 16:9 (default), 9:16, 4:3, 3:4, and 1:1.</p>
     * 
     * <strong>example:</strong>
     * <p>4:3</p>
     */
    @NameInMap("AspectRatio")
    public String aspectRatio;

    /**
     * <p>The idempotency parameter.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>3e761e9d11edba640c42a1b7</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The task input, in JSON string format. The following fields are included:</p>
     * <ul>
     * <li>Prompt: String. Required. The prompt text.</li>
     * <li>Medias: a list of media items. Required when the task type is <code>image_to_image</code>. A maximum of 9 items are supported.<blockquote>
     * <p>The Media structure contains: Type, the media type, String, valid value: image; URL, the media download URL, String.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Bucket\&quot;:\&quot;dbj-app-prod\&quot;,\&quot;Location\&quot;:\&quot;oss-cn-hangzhou\&quot;,\&quot;Object\&quot;:\&quot;classpal/1767838045280pzmgnvwe.mp4\&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The task function parameters, in JSON string format. No configuration is required at this time.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("JobParameters")
    public String jobParameters;

    /**
     * <p>The type of the generation task. Valid values:</p>
     * <ul>
     * <li>text_to_image: text-to-image generation.</li>
     * <li>image_to_image: image-to-image generation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text_to_image</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>wan2.7-image</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The number of images. Valid values: 1 to 4. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("N")
    public String n;

    /**
     * <p>The resolution. Valid values: 1K (default), 2K, and 4K.</p>
     * 
     * <strong>example:</strong>
     * <p>720P</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <p>The scenario. This is an enumeration type. Currently, only <code>general</code> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>general</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The user business data, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;env&quot;:&quot;prd&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitImageGenerationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageGenerationJobRequest self = new SubmitImageGenerationJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImageGenerationJobRequest setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }
    public String getAspectRatio() {
        return this.aspectRatio;
    }

    public SubmitImageGenerationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitImageGenerationJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitImageGenerationJobRequest setJobParameters(String jobParameters) {
        this.jobParameters = jobParameters;
        return this;
    }
    public String getJobParameters() {
        return this.jobParameters;
    }

    public SubmitImageGenerationJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public SubmitImageGenerationJobRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public SubmitImageGenerationJobRequest setN(String n) {
        this.n = n;
        return this;
    }
    public String getN() {
        return this.n;
    }

    public SubmitImageGenerationJobRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public SubmitImageGenerationJobRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitImageGenerationJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
