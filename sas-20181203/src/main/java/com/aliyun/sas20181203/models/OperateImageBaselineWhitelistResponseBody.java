// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateImageBaselineWhitelistResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>75AD186B-B46A-56CC-BE35-987ADDF6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateImageBaselineWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateImageBaselineWhitelistResponseBody self = new OperateImageBaselineWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateImageBaselineWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
