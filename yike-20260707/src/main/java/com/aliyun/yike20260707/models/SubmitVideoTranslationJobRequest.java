// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoTranslationJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>3e761e9d11edba640c42a1b7</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Video&quot;:&quot;oss://bucket/path/input.mp4&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SourceLanguage&quot;:&quot;zh&quot;,&quot;TargetLanguage&quot;:&quot;en&quot;,&quot;NeedDetext&quot;:false,&quot;NeedVisualTranslate&quot;:false}</p>
     */
    @NameInMap("JobParameters")
    public String jobParameters;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VoiceTranslate</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OssUri&quot;:&quot;oss://bucket/output/&quot;}</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
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
