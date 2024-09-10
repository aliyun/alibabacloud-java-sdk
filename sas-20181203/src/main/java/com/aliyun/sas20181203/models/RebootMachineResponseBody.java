// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RebootMachineResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>151F6EB6-D5F3-417A-AF7B-4D84975DB586</p>
     */
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
