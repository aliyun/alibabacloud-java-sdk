// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoDetextJobRequest extends TeaModel {
    /**
     * <p>The user-level idempotency token. The token can be up to 40 characters in length. If the same user submits the request repeatedly with the same token, the original task is returned.</p>
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
     * <p>The text erasure parameters JSON string. TextTargets is used to detect and erase text. FullEraseTargets is used to inpaint entire regions. EraseAllText only controls text filtering and does not expand the region. For parameters, default behaviors, and combination examples, see the supplementary description of request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EraseAllText&quot;:true,&quot;TimeRanges&quot;:[[12,15]],&quot;TextTargets&quot;:[{&quot;Box&quot;:[0.1,0.8,0.8,0.15]}]}</p>
     */
    @NameInMap("JobParameters")
    public String jobParameters;

    /**
     * <p>The output configuration JSON string. You can use OssUri to specify an OSS directory or an MP4 file path. The path cannot contain query parameters or fragments. If a directory is specified, detext.mp4 is automatically appended. If the path ends with .mp4 and has no trailing slash, it is used directly as the destination file. If OssUri is not specified, a signed URL for the processing result is returned in the query result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OssUri&quot;:&quot;oss://example-bucket/video-detext/job-001/&quot;}</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The custom data JSON string used for pass-through in final state notifications. For Message Service (MNS) callbacks, use NotifyAddress to specify the queue name prefixed with yike-callback, and use NotifyMnsEndpoint to specify the MNS endpoint of the same account. For HTTP or HTTPS callbacks, use NotifyAddress to specify the complete URL.</p>
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
