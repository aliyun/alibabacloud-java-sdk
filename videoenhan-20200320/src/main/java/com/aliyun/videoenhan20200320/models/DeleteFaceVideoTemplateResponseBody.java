// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class DeleteFaceVideoTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2337D184-CD63-57B5-96A2-B60AABCB7B58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFaceVideoTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceVideoTemplateResponseBody self = new DeleteFaceVideoTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFaceVideoTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
