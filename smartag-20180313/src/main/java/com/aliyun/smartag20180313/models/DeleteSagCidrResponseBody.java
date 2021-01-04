// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSagCidrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSagCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSagCidrResponseBody self = new DeleteSagCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSagCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
