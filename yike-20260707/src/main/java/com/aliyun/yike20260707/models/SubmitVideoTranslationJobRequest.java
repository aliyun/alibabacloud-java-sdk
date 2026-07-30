// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoTranslationJobRequest extends TeaModel {
    /**
     * <p>The user-level idempotency key.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>3e761e9d11edba640c42a1b7</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The job description.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The input configuration JSON string:</p>
     * <ul>
     * <li>Video</li>
     * <li>Audio</li>
     * <li>Subtitle</li>
     * </ul>
     * <p><notice>Currently, only OSS addresses under the calling account are supported as input.</notice></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Video&quot;:&quot;oss://bucket/path/input.mp4&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The job parameters JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SourceLanguage&quot;:&quot;zh&quot;,&quot;TargetLanguage&quot;:&quot;en&quot;,&quot;NeedDetext&quot;:false,&quot;NeedVisualTranslate&quot;:false}</p>
     */
    @NameInMap("JobParameters")
    public String jobParameters;

    /**
     * <p>The job type. Valid values:</p>
     * <ul>
     * <li>SubtitleTranslate</li>
     * <li>VoiceTranslate</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VoiceTranslate</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The output configuration JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OssUri&quot;:&quot;oss://bucket/output/&quot;}</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>If not specified, the service generates a default title.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom user data JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitVideoTranslationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoTranslationJobRequest self = new SubmitVideoTranslationJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoTranslationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitVideoTranslationJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitVideoTranslationJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitVideoTranslationJobRequest setJobParameters(String jobParameters) {
        this.jobParameters = jobParameters;
        return this;
    }
    public String getJobParameters() {
        return this.jobParameters;
    }

    public SubmitVideoTranslationJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public SubmitVideoTranslationJobRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitVideoTranslationJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitVideoTranslationJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
