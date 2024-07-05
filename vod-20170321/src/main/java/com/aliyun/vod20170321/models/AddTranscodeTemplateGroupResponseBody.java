// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddTranscodeTemplateGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the transcoding template group.</p>
     * 
     * <strong>example:</strong>
     * <p>34e908aa4024af7821c31f93a2a****</p>
     */
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
