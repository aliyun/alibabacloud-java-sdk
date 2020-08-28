// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResetAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ResetAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountResponse self = new ResetAccountResponse();
        return TeaModel.build(map, self);
    }

}
