// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteDatabasesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabasesResponseBody self = new DeleteDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
