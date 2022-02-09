// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOmsMigrationProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOmsMigrationProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOmsMigrationProjectResponseBody self = new DeleteOmsMigrationProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOmsMigrationProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
