// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ConfirmNotifyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6919FA39-04CF-571F-A6B0-DCC7AECB4170</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfirmNotifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmNotifyResponseBody self = new ConfirmNotifyResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmNotifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
