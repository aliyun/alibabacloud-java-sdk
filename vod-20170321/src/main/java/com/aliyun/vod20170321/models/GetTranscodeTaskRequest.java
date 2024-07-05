// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskRequest extends TeaModel {
    /**
     * <p>The ID of the transcoding task. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Obtain the value of TranscodeTaskId from the response to the <a href="https://help.aliyun.com/document_detail/68570.html">SubmitTranscodeJobs</a> operation.</li>
     * <li>Obtain the value of TranscodeTaskId from the response to the <a href="https://help.aliyun.com/document_detail/109120.html">ListTranscodeTask</a> operation.</li>
     * </ul>
     * <p>This parameter is required.</p>
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

    public GetTranscodeTaskRequest setTranscodeTaskId(String transcodeTaskId) {
        this.transcodeTaskId = transcodeTaskId;
        return this;
    }
    public String getTranscodeTaskId() {
        return this.transcodeTaskId;
    }

}
