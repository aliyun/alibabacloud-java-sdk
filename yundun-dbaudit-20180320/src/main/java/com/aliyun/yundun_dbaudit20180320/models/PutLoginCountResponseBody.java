// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class PutLoginCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PutLoginCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutLoginCountResponseBody self = new PutLoginCountResponseBody();
        return TeaModel.build(map, self);
    }

    public PutLoginCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
