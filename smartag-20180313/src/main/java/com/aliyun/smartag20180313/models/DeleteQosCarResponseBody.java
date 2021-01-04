// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteQosCarResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteQosCarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQosCarResponseBody self = new DeleteQosCarResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQosCarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
