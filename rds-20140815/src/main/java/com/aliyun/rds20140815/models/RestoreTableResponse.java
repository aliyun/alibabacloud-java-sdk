// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestoreTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RestoreTableResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreTableResponse self = new RestoreTableResponse();
        return TeaModel.build(map, self);
    }

}
