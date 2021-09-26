// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class CreateInstanceConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstanceConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceConnectionResponseBody self = new CreateInstanceConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
