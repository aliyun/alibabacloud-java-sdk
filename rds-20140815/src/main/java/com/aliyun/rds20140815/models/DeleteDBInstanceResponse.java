// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceResponse self = new DeleteDBInstanceResponse();
        return TeaModel.build(map, self);
    }

}
