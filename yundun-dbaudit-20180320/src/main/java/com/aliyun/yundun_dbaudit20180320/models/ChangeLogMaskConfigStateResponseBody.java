// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ChangeLogMaskConfigStateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeLogMaskConfigStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeLogMaskConfigStateResponseBody self = new ChangeLogMaskConfigStateResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeLogMaskConfigStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
