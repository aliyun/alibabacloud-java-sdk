// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoDetextJobRequest extends TeaModel {
    /**
     * <p>The user-level idempotency token. Maximum length: 40 characters. If the same user submits a request with the same token, the original task is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>detext-client-20260820-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The input configuration JSON string. You must specify either VideoUrl or VideoMediaId, but not both.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VideoUrl&quot;:&quot;<a href="https://example.com/input.mp4%22%7D">https://example.com/input.mp4&quot;}</a></p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The text erasure parameter JSON string. This string can contain EraseAllText, TimeRanges, TextTargets, FullEraseTargets, and Config.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EraseAllText&quot;:false,&quot;TextTargets&quot;:[{&quot;Box&quot;:[0.1,0.8,0.8,0.15],&quot;TimeRanges&quot;:[[0,30]]}]}</p>
     */
    @NameInMap("JobParameters")
    public String jobParameters;

    /**
     * <p>The output configuration JSON string. OssUri specifies an OSS directory or MP4 file path and cannot contain query parameters or fragments. For directory paths, detext.mp4 is automatically appended. Paths ending with .mp4 without a trailing / are used directly as the target file. If not specified, a signed URL of the processing result is returned in the query result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OssUri&quot;:&quot;oss://example-bucket/video-detext/job-001/&quot;}</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The custom data JSON string for pass-through in desired state notifications. For MNS callbacks, use NotifyAddress to specify a queue name prefixed with yike-callback, and use NotifyMnsEndpoint to specify an MNS endpoint under the same account. For HTTP(S) callbacks, use NotifyAddress to specify the full URL.</p>
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
