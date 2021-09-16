// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteDetectionTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDetectionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDetectionTemplateResponseBody self = new DeleteDetectionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDetectionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
