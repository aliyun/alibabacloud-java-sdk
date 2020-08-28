// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDatabaseResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseResponse self = new DeleteDatabaseResponse();
        return TeaModel.build(map, self);
    }

}
