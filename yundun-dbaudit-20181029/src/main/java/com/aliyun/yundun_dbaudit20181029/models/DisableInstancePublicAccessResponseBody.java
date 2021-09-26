// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DisableInstancePublicAccessResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableInstancePublicAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableInstancePublicAccessResponseBody self = new DisableInstancePublicAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableInstancePublicAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
