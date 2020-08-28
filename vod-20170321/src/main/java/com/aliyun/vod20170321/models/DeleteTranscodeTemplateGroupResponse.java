// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NonExistTranscodeTemplateIds")
    @Validation(required = true)
    public java.util.List<String> nonExistTranscodeTemplateIds;

    public static DeleteTranscodeTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTranscodeTemplateGroupResponse self = new DeleteTranscodeTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

}
