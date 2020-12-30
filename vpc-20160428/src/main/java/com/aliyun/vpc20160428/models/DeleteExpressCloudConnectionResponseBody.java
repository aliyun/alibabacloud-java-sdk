// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressCloudConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExpressCloudConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressCloudConnectionResponseBody self = new DeleteExpressCloudConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExpressCloudConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
