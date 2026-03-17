// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteQosPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>551CD836-9E46-4F2C-A167-B4363180A647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteQosPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQosPolicyResponseBody self = new DeleteQosPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQosPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
