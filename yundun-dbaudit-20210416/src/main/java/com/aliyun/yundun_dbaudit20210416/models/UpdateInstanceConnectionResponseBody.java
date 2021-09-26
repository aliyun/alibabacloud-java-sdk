// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class UpdateInstanceConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstanceConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceConnectionResponseBody self = new UpdateInstanceConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
