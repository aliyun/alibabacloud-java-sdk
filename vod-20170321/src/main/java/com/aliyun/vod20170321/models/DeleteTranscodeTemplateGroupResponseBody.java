// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteTranscodeTemplateGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistTranscodeTemplateIds")
    public java.util.List<String> nonExistTranscodeTemplateIds;

    public static DeleteTranscodeTemplateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTranscodeTemplateGroupResponseBody self = new DeleteTranscodeTemplateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTranscodeTemplateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTranscodeTemplateGroupResponseBody setNonExistTranscodeTemplateIds(java.util.List<String> nonExistTranscodeTemplateIds) {
        this.nonExistTranscodeTemplateIds = nonExistTranscodeTemplateIds;
        return this;
    }
    public java.util.List<String> getNonExistTranscodeTemplateIds() {
        return this.nonExistTranscodeTemplateIds;
    }

}
