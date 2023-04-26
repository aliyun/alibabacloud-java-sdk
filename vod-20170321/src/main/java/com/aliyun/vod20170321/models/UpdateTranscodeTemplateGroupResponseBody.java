// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateTranscodeTemplateGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    public static UpdateTranscodeTemplateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTranscodeTemplateGroupResponseBody self = new UpdateTranscodeTemplateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTranscodeTemplateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTranscodeTemplateGroupResponseBody setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
        return this;
    }
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

}
