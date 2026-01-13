// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DeleteVCUInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>39871ED2-62C0-578F-A32E-B88072D5582F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVCUInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVCUInstanceResponseBody self = new DeleteVCUInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVCUInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
