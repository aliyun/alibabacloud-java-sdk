// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoDetextJobRequest extends TeaModel {
    /**
     * <p>The user-level idempotency token. The token can be up to 40 characters in length. If the same user submits a request with the same token, the original task is returned.</p>
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
     * <p>{&quot;VideoMediaId&quot;:&quot;media-video-001&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The text erasure parameter JSON string. This parameter can contain EraseAllText, TimeRanges, TextTargets, FullEraseTargets, and Config.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EraseAllText&quot;:false,&quot;TextTargets&quot;:[{&quot;Box&quot;:[0.1,0.8,0.8,0.15],&quot;TimeRanges&quot;:[[0,30]]}]}</p>
     */
    @NameInMap("JobParameters")
    public String jobParameters;

    /**
     * <p>The output configuration JSON string. You can use OssUri to specify the customer\&quot;s OSS bucket. If a directory is specified, the output file is named detext.mp4.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OssUri&quot;:&quot;oss://example-bucket/video-detext/job-001/&quot;}</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The custom user data JSON string. This parameter can contain the asynchronous notification address NotifyAddress.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;mns://account.mns.cn-shanghai.aliyuncs.com/queues/detext-result&quot;}</p>
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
