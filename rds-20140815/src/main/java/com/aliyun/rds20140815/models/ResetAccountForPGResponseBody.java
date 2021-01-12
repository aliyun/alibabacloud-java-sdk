// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResetAccountForPGResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAccountForPGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountForPGResponseBody self = new ResetAccountForPGResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAccountForPGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
