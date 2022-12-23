// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddTranscodeTemplateGroupResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The ID of the transcoding template group.
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    public static AddTranscodeTemplateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTranscodeTemplateGroupResponseBody self = new AddTranscodeTemplateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTranscodeTemplateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddTranscodeTemplateGroupResponseBody setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
        return this;
    }
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

}
