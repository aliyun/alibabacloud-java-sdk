// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteFeatureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFeatureResponseBody self = new DeleteFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
