// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteModelFeatureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteModelFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelFeatureResponseBody self = new DeleteModelFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteModelFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
