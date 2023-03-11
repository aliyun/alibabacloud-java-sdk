// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateCommonTargetConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateCommonTargetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateCommonTargetConfigResponseBody self = new OperateCommonTargetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateCommonTargetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
