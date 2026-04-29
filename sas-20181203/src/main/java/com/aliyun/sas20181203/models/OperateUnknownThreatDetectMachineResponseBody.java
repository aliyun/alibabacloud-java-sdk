// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateUnknownThreatDetectMachineResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>20456DD5-5CBF-5015-9173-12CA4246B***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateUnknownThreatDetectMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateUnknownThreatDetectMachineResponseBody self = new OperateUnknownThreatDetectMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateUnknownThreatDetectMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
