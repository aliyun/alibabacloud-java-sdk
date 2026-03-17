// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteQosResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F77B3F0E-CAA2-41CF-A752-4F2893C5F7F0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteQosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQosResponseBody self = new DeleteQosResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
