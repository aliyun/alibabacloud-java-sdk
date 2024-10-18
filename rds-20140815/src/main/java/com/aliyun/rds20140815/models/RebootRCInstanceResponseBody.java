// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebootRCInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3E36DB6E-AE3B-53B6-A703-85F883FD1B2C</p>
     */
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
