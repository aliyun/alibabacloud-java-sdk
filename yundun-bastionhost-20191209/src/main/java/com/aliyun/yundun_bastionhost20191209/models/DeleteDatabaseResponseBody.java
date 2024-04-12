// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteDatabaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseResponseBody self = new DeleteDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
