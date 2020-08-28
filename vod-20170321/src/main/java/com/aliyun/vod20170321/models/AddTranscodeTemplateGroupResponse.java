// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TranscodeTemplateGroupId")
    @Validation(required = true)
    public String transcodeTemplateGroupId;

    public static AddTranscodeTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTranscodeTemplateGroupResponse self = new AddTranscodeTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

}
