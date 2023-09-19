// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateResponseBody self = new DeleteTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
