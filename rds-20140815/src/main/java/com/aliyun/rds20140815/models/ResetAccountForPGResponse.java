// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResetAccountForPGResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ResetAccountForPGResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountForPGResponse self = new ResetAccountForPGResponse();
        return TeaModel.build(map, self);
    }

}
