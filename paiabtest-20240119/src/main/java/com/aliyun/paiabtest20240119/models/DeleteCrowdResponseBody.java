// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteCrowdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCrowdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCrowdResponseBody self = new DeleteCrowdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCrowdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
