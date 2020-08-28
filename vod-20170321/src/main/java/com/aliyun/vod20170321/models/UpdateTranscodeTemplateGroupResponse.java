// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TranscodeTemplateGroupId")
    @Validation(required = true)
    public String transcodeTemplateGroupId;

    public static UpdateTranscodeTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTranscodeTemplateGroupResponse self = new UpdateTranscodeTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

}
