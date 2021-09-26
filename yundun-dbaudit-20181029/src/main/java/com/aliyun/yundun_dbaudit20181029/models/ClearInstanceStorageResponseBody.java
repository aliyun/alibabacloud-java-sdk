// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class ClearInstanceStorageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ClearInstanceStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearInstanceStorageResponseBody self = new ClearInstanceStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearInstanceStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
