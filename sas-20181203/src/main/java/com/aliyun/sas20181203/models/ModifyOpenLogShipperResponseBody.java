// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOpenLogShipperResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>25EC270F-5783-4416-AD7C-1EDF063A039C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOpenLogShipperResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOpenLogShipperResponseBody self = new ModifyOpenLogShipperResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOpenLogShipperResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
