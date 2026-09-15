// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoDetextJobRequest extends TeaModel {
    /**
     * <p>The user-level idempotency token. Maximum length: 40 characters. If the same user submits a request with the same token, the original job is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>detext-client-20260820-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The input configuration JSON string. You must provide exactly one of VideoUrl or VideoMediaId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VideoUrl&quot;:&quot;<a href="https://example.com/input.mp4%22%7D">https://example.com/input.mp4&quot;}</a></p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The text removal parameters JSON string. TextTargets detects and removes text within specified regions. FullEraseTargets repairs entire rectangular regions regardless of text detection. EraseAllText controls only text filtering and does not expand the removal region. For parameter details, default behavior, and combination examples, see the supplementary request parameter description.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EraseAllText&quot;:true,&quot;TimeRanges&quot;:[[12,15]],&quot;TextTargets&quot;:[{&quot;Box&quot;:[0.1,0.8,0.8,0.15]}]}</p>
     */
    @NameInMap("JobParameters")
    public String jobParameters;

    /**
     * <p>The output configuration JSON string. OssUri specifies an OSS directory or MP4 file path in the format oss://bucket/path. It cannot contain query parameters or fragments. A directory path automatically appends detext.mp4. A path ending in .mp4 without a trailing slash is used directly as the target file. If not specified, a signed URL for the result is returned in the query response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OssUri&quot;:&quot;oss://example-bucket/video-detext/job-001/&quot;}</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The custom data JSON string used for pass-through in desired-state notifications. For MNS callbacks, use NotifyAddress to specify a queue name prefixed with yike-callback, and use NotifyMnsEndpoint to specify the MNS endpoint of the same account. For HTTP(S) callbacks, use NotifyAddress to specify the full URL.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;yike-callback-example&quot;,&quot;NotifyMnsEndpoint&quot;:&quot;http://<AccountId>.mns.cn-shanghai.aliyuncs.com/&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitVideoDetextJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoDetextJobRequest self = new SubmitVideoDetextJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoDetextJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitVideoDetextJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitVideoDetextJobRequest setJobParameters(String jobParameters) {
        this.jobParameters = jobParameters;
        return this;
    }
    public String getJobParameters() {
        return this.jobParameters;
    }

    public SubmitVideoDetextJobRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitVideoDetextJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
