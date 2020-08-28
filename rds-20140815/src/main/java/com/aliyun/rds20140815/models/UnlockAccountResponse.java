// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UnlockAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnlockAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockAccountResponse self = new UnlockAccountResponse();
        return TeaModel.build(map, self);
    }

}
