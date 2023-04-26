// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskRequest extends TeaModel {
    /**
     * <p>The OSS URL of the output file.</p>
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
