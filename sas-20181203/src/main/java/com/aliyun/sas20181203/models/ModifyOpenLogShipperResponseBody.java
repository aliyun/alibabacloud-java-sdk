// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOpenLogShipperResponseBody extends TeaModel {
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
