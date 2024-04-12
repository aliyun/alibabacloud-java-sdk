// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteDatabaseAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatabaseAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseAccountResponseBody self = new DeleteDatabaseAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
