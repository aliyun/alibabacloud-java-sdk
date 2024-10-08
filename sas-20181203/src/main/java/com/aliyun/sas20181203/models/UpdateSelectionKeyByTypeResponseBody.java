// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateSelectionKeyByTypeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DBABBC2E-26DF-5586-BF7C-4FC846EF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSelectionKeyByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSelectionKeyByTypeResponseBody self = new UpdateSelectionKeyByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSelectionKeyByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
