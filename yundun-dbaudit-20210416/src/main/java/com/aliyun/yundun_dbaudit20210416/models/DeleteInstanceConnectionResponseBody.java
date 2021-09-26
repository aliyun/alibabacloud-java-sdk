// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class DeleteInstanceConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceConnectionResponseBody self = new DeleteInstanceConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
