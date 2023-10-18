// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultTranscodeTemplateGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultTranscodeTemplateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultTranscodeTemplateGroupResponseBody self = new SetDefaultTranscodeTemplateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultTranscodeTemplateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
