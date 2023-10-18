// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskRequest extends TeaModel {
    /**
     * <p>The ID of the transcoding task. You can use one of the following methods to obtain the ID:</p>
     * <br>
     * <p>*   Obtain the value of TranscodeTaskId from the response to the [SubmitTranscodeJobs](~~68570~~) operation.</p>
     * <p>*   Obtain the value of TranscodeTaskId from the response to the [ListTranscodeTask](~~109120~~) operation.</p>
     */
    @NameInMap("TranscodeTaskId")
    public String transcodeTaskId;

    public static GetTranscodeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTaskRequest self = new GetTranscodeTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTranscodeTaskRequest setTranscodeTaskId(String transcodeTaskId) {
        this.transcodeTaskId = transcodeTaskId;
        return this;
    }
    public String getTranscodeTaskId() {
        return this.transcodeTaskId;
    }

}
