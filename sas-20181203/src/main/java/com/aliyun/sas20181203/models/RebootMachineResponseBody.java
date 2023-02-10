// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RebootMachineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RebootMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootMachineResponseBody self = new RebootMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
