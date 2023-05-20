// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSecurityEventMarkMissListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSecurityEventMarkMissListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityEventMarkMissListResponseBody self = new DeleteSecurityEventMarkMissListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityEventMarkMissListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
