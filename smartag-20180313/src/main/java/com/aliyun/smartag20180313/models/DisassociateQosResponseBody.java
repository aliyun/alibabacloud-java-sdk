// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DisassociateQosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisassociateQosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociateQosResponseBody self = new DisassociateQosResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociateQosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
