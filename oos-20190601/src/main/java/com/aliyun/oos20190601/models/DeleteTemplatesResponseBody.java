// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteTemplatesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplatesResponseBody self = new DeleteTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
