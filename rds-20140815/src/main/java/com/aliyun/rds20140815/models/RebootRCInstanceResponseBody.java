// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebootRCInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RebootRCInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootRCInstanceResponseBody self = new RebootRCInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootRCInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
