// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoTranslationJobRequest extends TeaModel {
    /**
     * <p>The user-level idempotency token, which can be up to 40 characters in length. If the same user submits the request repeatedly with the same token, the original task is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>vt-client-20260820-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The job description, which is used to record the business purpose or processing requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>Translate the Chinese product introduction video into English</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The input configuration JSON string. You must specify either Video or VideoMediaId, but not both. You can specify at most one of Audio and AudioMediaId. Subtitle is optional.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VideoMediaId&quot;:&quot;media-video-001&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The job parameters JSON string. It must include at least SourceLanguage and TargetLanguage. You can also configure primary subtitle erasure, voice translation, on-screen text translation, and final editing.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SourceLanguage&quot;:&quot;zh&quot;,&quot;TargetLanguage&quot;:&quot;en&quot;,&quot;NeedDetext&quot;:false,&quot;NeedVisualTranslate&quot;:false}</p>
     */
    @NameInMap("JobParameters")
    public String jobParameters;

    /**
     * <p>The job type. SubtitleTranslate indicates subtitle translation, and VoiceTranslate indicates voice translation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VoiceTranslate</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The output configuration JSON string. OssUri is the optional customer OSS output directory. If OssUri is not specified, a signed URL for the service-owned output is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OssUri&quot;:&quot;oss://example-bucket/video-translation/output/&quot;}</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The job title. If not specified, the service generates a default title.</p>
     * 
     * <strong>example:</strong>
     * <p>English translation of product introduction video</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user-defined data JSON string. When specifying an MNS queue to receive asynchronous notifications, set <code>NotifyAddress</code> to the pure queue name starting with <code>yike-callback-</code> instead of the full queue URL. You can optionally set <code>NotifyMnsEndpoint</code> to the MNS endpoint of the task account.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;yike-callback-test&quot;,&quot;NotifyMnsEndpoint&quot;:&quot;<a href="https://1234567890123456.mns.cn-shanghai.aliyuncs.com%22%7D">https://1234567890123456.mns.cn-shanghai.aliyuncs.com&quot;}</a></p>
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
