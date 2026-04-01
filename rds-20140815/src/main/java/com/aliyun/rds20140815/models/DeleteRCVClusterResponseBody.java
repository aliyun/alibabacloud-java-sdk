// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCVClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0688F1D2-CDA8-5617-A43C-ADAC61D80D43</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRCVClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCVClusterResponseBody self = new DeleteRCVClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRCVClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
