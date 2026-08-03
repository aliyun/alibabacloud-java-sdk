// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CancelInspectionTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2BE6E619-A657-42E3-AD2D-18F8428A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelInspectionTaskResponseBody self = new CancelInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
