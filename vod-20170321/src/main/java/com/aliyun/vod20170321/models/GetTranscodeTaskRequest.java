// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskRequest extends TeaModel {
    /**
     * <p>The transcoding job IDs. You can specify a maximum of 10 IDs. Separate multiple IDs with commas (,). You can obtain the IDs by using the following method:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/68570.html">SubmitTranscodeJobs</a> operation to submit a transcoding task. The value of JobId in the response is the transcoding job ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>86c1925fba0****,7afb201e7fa****,2cc4997378****</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The transcoding task ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/68570.html">SubmitTranscodeJobs</a> operation to submit a transcoding task. The value of TranscodeTaskId in the response is the transcoding task ID.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/109120.html">ListTranscodeTask</a> operation. The value of TranscodeTaskId in the response is the transcoding task ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>b1b65ab107e14*****3dbb900f6c1fe0</p>
     */
    @NameInMap("TranscodeTaskId")
    public String transcodeTaskId;

    public static GetTranscodeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTaskRequest self = new GetTranscodeTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTranscodeTaskRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public GetTranscodeTaskRequest setTranscodeTaskId(String transcodeTaskId) {
        this.transcodeTaskId = transcodeTaskId;
        return this;
    }
    public String getTranscodeTaskId() {
        return this.transcodeTaskId;
    }

}
