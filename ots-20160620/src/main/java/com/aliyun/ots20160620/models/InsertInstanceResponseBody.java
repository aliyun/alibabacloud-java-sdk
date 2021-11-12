// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class InsertInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static InsertInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertInstanceResponseBody self = new InsertInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
